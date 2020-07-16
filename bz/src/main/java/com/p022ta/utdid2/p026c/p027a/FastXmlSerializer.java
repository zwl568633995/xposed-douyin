package com.p022ta.utdid2.p026c.p027a;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import kotlin.text.Typography;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.ta.utdid2.c.a.a */
class FastXmlSerializer implements XmlSerializer {

    /* renamed from: a */
    private static final String[] f827a;

    /* renamed from: a */
    private OutputStream f828a;

    /* renamed from: a */
    private Writer f829a;

    /* renamed from: a */
    private ByteBuffer f830a = ByteBuffer.allocate(8192);

    /* renamed from: a */
    private CharsetEncoder f831a;

    /* renamed from: a */
    private final char[] f832a = new char[8192];

    /* renamed from: f */
    private boolean f833f;
    private int mPos;

    FastXmlSerializer() {
    }

    static {
        String[] strArr = new String[64];
        strArr[34] = "&quot;";
        strArr[38] = "&amp;";
        strArr[60] = "&lt;";
        strArr[62] = "&gt;";
        f827a = strArr;
    }

    private void append(char c) throws IOException {
        int i = this.mPos;
        if (i >= 8191) {
            flush();
            i = this.mPos;
        }
        this.f832a[i] = c;
        this.mPos = i + 1;
    }

    /* renamed from: a */
    private void m680a(String str, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                m680a(str, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.mPos;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.mPos;
        }
        str.getChars(i, i + i2, this.f832a, i5);
        this.mPos = i5 + i2;
    }

    private void append(char[] cArr, int i, int i2) throws IOException {
        if (i2 > 8192) {
            int i3 = i + i2;
            while (i < i3) {
                int i4 = i + 8192;
                append(cArr, i, i4 < i3 ? 8192 : i3 - i);
                i = i4;
            }
            return;
        }
        int i5 = this.mPos;
        if (i5 + i2 > 8192) {
            flush();
            i5 = this.mPos;
        }
        System.arraycopy(cArr, i, this.f832a, i5, i2);
        this.mPos = i5 + i2;
    }

    private void append(String str) throws IOException {
        m680a(str, 0, str.length());
    }

    /* renamed from: a */
    private void m679a(String str) throws IOException {
        String str2;
        int length = str.length();
        String[] strArr = f827a;
        char length2 = (char) strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < length2 && (str2 = strArr[charAt]) != null) {
                if (i2 < i) {
                    m680a(str, i2, i - i2);
                }
                i2 = i + 1;
                append(str2);
            }
            i++;
        }
        if (i2 < i) {
            m680a(str, i2, i - i2);
        }
    }

    /* renamed from: a */
    private void m681a(char[] cArr, int i, int i2) throws IOException {
        String str;
        String[] strArr = f827a;
        char length = (char) strArr.length;
        int i3 = i2 + i;
        int i4 = i;
        while (i < i3) {
            char c = cArr[i];
            if (c < length && (str = strArr[c]) != null) {
                if (i4 < i) {
                    append(cArr, i4, i - i4);
                }
                i4 = i + 1;
                append(str);
            }
            i++;
        }
        if (i4 < i) {
            append(cArr, i4, i - i4);
        }
    }

    public XmlSerializer attribute(String str, String str2, String str3) throws IOException, IllegalArgumentException, IllegalStateException {
        append(' ');
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        append("=\"");
        m679a(str3);
        append((char) Typography.quote);
        return this;
    }

    public void cdsect(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void comment(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void docdecl(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void endDocument() throws IOException, IllegalArgumentException, IllegalStateException {
        flush();
    }

    public XmlSerializer endTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f833f) {
            append(" />\n");
        } else {
            append("</");
            if (str != null) {
                append(str);
                append(':');
            }
            append(str2);
            append(">\n");
        }
        this.f833f = false;
        return this;
    }

    public void entityRef(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private void m682b() throws IOException {
        int position = this.f830a.position();
        if (position > 0) {
            this.f830a.flip();
            this.f828a.write(this.f830a.array(), 0, position);
            this.f830a.clear();
        }
    }

    public void flush() throws IOException {
        int i = this.mPos;
        if (i > 0) {
            if (this.f828a != null) {
                CharBuffer wrap = CharBuffer.wrap(this.f832a, 0, i);
                CoderResult encode = this.f831a.encode(wrap, this.f830a, true);
                while (!encode.isError()) {
                    if (encode.isOverflow()) {
                        m682b();
                        encode = this.f831a.encode(wrap, this.f830a, true);
                    } else {
                        m682b();
                        this.f828a.flush();
                    }
                }
                throw new IOException(encode.toString());
            }
            this.f829a.write(this.f832a, 0, i);
            this.f829a.flush();
            this.mPos = 0;
        }
    }

    public int getDepth() {
        throw new UnsupportedOperationException();
    }

    public boolean getFeature(String str) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getNamespace() {
        throw new UnsupportedOperationException();
    }

    public String getPrefix(String str, boolean z) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    public Object getProperty(String str) {
        throw new UnsupportedOperationException();
    }

    public void ignorableWhitespace(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void processingInstruction(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setFeature(String str, boolean z) throws IllegalArgumentException, IllegalStateException {
        if (!str.equals("http://xmlpull.org/v1/doc/features.html#indent-output")) {
            throw new UnsupportedOperationException();
        }
    }

    public void setOutput(OutputStream outputStream, String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (outputStream != null) {
            try {
                this.f831a = Charset.forName(str).newEncoder();
                this.f828a = outputStream;
            } catch (IllegalCharsetNameException e) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e));
            } catch (UnsupportedCharsetException e2) {
                throw ((UnsupportedEncodingException) new UnsupportedEncodingException(str).initCause(e2));
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void setOutput(Writer writer) throws IOException, IllegalArgumentException, IllegalStateException {
        this.f829a = writer;
    }

    public void setPrefix(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void setProperty(String str, Object obj) throws IllegalArgumentException, IllegalStateException {
        throw new UnsupportedOperationException();
    }

    public void startDocument(String str, Boolean bool) throws IOException, IllegalArgumentException, IllegalStateException {
        StringBuilder sb = new StringBuilder("<?xml version='1.0' encoding='utf-8' standalone='");
        sb.append(bool.booleanValue() ? "yes" : "no");
        sb.append("' ?>\n");
        append(sb.toString());
    }

    public XmlSerializer startTag(String str, String str2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f833f) {
            append(">\n");
        }
        append((char) Typography.less);
        if (str != null) {
            append(str);
            append(':');
        }
        append(str2);
        this.f833f = true;
        return this;
    }

    public XmlSerializer text(char[] cArr, int i, int i2) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f833f) {
            append(">");
            this.f833f = false;
        }
        m681a(cArr, i, i2);
        return this;
    }

    public XmlSerializer text(String str) throws IOException, IllegalArgumentException, IllegalStateException {
        if (this.f833f) {
            append(">");
            this.f833f = false;
        }
        m679a(str);
        return this;
    }
}
