package cn.balalals.gserver.netty.handler.message;

import cn.balalals.gserver.protobuf.LoginMsg;
import cn.balalals.gserver.protobuf.MsgType;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;

public interface MessageHandler<T> {
    void exec(T data);
    MsgType getMsgType();
    T parseFrom(ByteString byteString) throws InvalidProtocolBufferException;
}
