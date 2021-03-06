package cn.balalals.game_server.netty.handler.message;

import cn.balalals.game_server.protobuf.LogoutMsg;
import cn.balalals.game_server.protobuf.MsgType;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.stereotype.Component;

@Component
public class LogoutHandler implements MessageHandler<LogoutMsg> {
    @Override
    public void exec(LogoutMsg data) {
        System.out.println("处理推出登录请求！");
    }

    @Override
    public MsgType getMsgType() {
        return MsgType.LOGOUT;
    }

    @Override
    public LogoutMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return LogoutMsg.parseFrom(byteString);
    }
}
