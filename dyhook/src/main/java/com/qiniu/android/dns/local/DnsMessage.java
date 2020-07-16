package com.qiniu.android.dns.local;

import com.qiniu.android.dns.DnsException;
import com.qiniu.android.dns.Record;
import com.qiniu.android.dns.util.BitSet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import kotlin.UByte;

public final class DnsMessage {
    public static byte[] buildQuery(String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        BitSet bitSet = new BitSet();
        bitSet.set(8);
        try {
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeShort((short) bitSet.value());
            dataOutputStream.writeShort(1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            writeQuestion(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    private static void writeDomain(OutputStream outputStream, String str) throws IOException {
        for (String ascii : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(ascii).getBytes();
            outputStream.write(bytes.length);
            outputStream.write(bytes, 0, bytes.length);
        }
        outputStream.write(0);
    }

    private static void writeQuestion(OutputStream outputStream, String str) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        writeDomain(outputStream, str);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
    }

    public static Record[] parseResponse(byte[] bArr, int i, String str) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        if (readUnsignedShort == i) {
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            boolean z = true;
            boolean z2 = ((readUnsignedShort2 >> 8) & 1) == 1;
            if (((readUnsignedShort2 >> 7) & 1) != 1) {
                z = false;
            }
            if (!z || !z2) {
                throw new DnsException(str, "the dns server cant support recursion ");
            }
            int readUnsignedShort3 = dataInputStream.readUnsignedShort();
            int readUnsignedShort4 = dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            readQuestions(dataInputStream, bArr, readUnsignedShort3);
            return readAnswers(dataInputStream, bArr, readUnsignedShort4);
        }
        throw new DnsException(str, "the answer id " + readUnsignedShort + " is not match " + i);
    }

    private static String readName(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 192) == 192) {
            int readUnsignedByte2 = ((readUnsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(readUnsignedByte2));
            return readName(bArr, readUnsignedByte2, hashSet);
        } else if (readUnsignedByte == 0) {
            return "";
        } else {
            byte[] bArr2 = new byte[readUnsignedByte];
            dataInputStream.readFully(bArr2);
            String unicode = IDN.toUnicode(new String(bArr2));
            String readName = readName(dataInputStream, bArr);
            if (readName.length() <= 0) {
                return unicode;
            }
            return unicode + "." + readName;
        }
    }

    private static String readName(byte[] bArr, int i, HashSet<Integer> hashSet) throws IOException {
        byte b = bArr[i] & UByte.MAX_VALUE;
        if ((b & 192) == 192) {
            int i2 = ((b & 63) << 8) + (bArr[i + 1] & UByte.MAX_VALUE);
            if (!hashSet.contains(Integer.valueOf(i2))) {
                hashSet.add(Integer.valueOf(i2));
                return readName(bArr, i2, hashSet);
            }
            throw new DnsException("", "Cyclic offsets detected.");
        } else if (b == 0) {
            return "";
        } else {
            int i3 = i + 1;
            String str = new String(bArr, i3, b);
            String readName = readName(bArr, i3 + b, hashSet);
            if (readName.length() <= 0) {
                return str;
            }
            return str + "." + readName;
        }
    }

    private static void readQuestions(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                readName(dataInputStream, bArr);
                dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                i = i2;
            } else {
                return;
            }
        }
    }

    private static Record[] readAnswers(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        Record[] recordArr = new Record[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return recordArr;
            }
            recordArr[i2] = readRecord(dataInputStream, bArr);
            i2++;
            i = i3;
        }
    }

    private static Record readRecord(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        String str;
        readName(dataInputStream, bArr);
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        long readUnsignedShort2 = (((long) dataInputStream.readUnsignedShort()) << 16) + ((long) dataInputStream.readUnsignedShort());
        int readUnsignedShort3 = dataInputStream.readUnsignedShort();
        if (readUnsignedShort == 1) {
            byte[] bArr2 = new byte[4];
            dataInputStream.readFully(bArr2);
            str = InetAddress.getByAddress(bArr2).getHostAddress();
        } else if (readUnsignedShort != 5) {
            for (int i = 0; i < readUnsignedShort3; i++) {
                dataInputStream.readByte();
            }
            str = null;
        } else {
            str = readName(dataInputStream, bArr);
        }
        if (str != null) {
            return new Record(str, readUnsignedShort, (int) readUnsignedShort2, System.currentTimeMillis() / 1000);
        }
        throw new UnknownHostException("no record");
    }
}
