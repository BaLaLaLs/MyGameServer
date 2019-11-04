package cn.balalals.game_server.netty.handler.message;

import cn.balalals.game_server.protobuf.MsgType;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public interface MessageHandler<T> {
    void exec(T data);
    MsgType getMsgType();
    T parseFrom(ByteString byteString) throws InvalidProtocolBufferException;
}
