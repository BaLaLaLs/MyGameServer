package cn.balalals.game_server.netty.handler.message;

import cn.balalals.game_server.protobuf.LogoutMsg;
import cn.balalals.game_server.protobuf.MsgType;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.stereotype.Component;

@Component
public class RegisterHandler implements MessageHandler<LogoutMsg> {
    @Override
    public void exec(LogoutMsg data) {

    }

    @Override
    public MsgType getMsgType() {
        return null;
    }

    @Override
    public LogoutMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return null;
    }
}
