package com.evan.socket.netty.protocol;

import java.util.List;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class SocketNatMessageDecoder extends ByteToMessageDecoder {

    private static final byte HEADER_SIZE = 4;

    private static final int TYPE_SIZE = 1;

    private static final int SERIAL_NUMBER_SIZE = 8;

    private static final int URI_LENGTH_SIZE = 1;


    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        while (true) {
            if (in.readableBytes() < HEADER_SIZE) {
                return;
            }

            int frameLength = in.getInt(0);
            if (in.readableBytes() < frameLength) {
                return;
            }
            in.readInt();
            SocketNatMessage socketNatMessage = new SocketNatMessage();
            byte type = in.readByte();
            long sn = in.readLong();

            socketNatMessage.setSerialNumber(sn);

            socketNatMessage.setType(type);

            byte uriLength = in.readByte();
            byte[] uriBytes = new byte[uriLength];
            in.readBytes(uriBytes);
            socketNatMessage.setExtra(new String(uriBytes));

            byte[] data = new byte[frameLength - TYPE_SIZE - SERIAL_NUMBER_SIZE - URI_LENGTH_SIZE - uriLength];
            in.readBytes(data);
            socketNatMessage.setData(data);

            out.add(socketNatMessage);
            // in.release();

        }
    }
}