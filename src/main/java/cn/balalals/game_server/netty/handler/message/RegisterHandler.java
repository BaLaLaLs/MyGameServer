package cn.balalals.game_server.netty.handler.message;

import cn.balalals.game_server.protobuf.LogoutMsg;
import cn.balalals.game_server.protobuf.MsgType;
import cn.balalals.game_server.service.UserService;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.stereotype.Component;

@Component
public class RegisterHandler implements MessageHandler<LogoutMsg> {
    private final UserService userService;

    RegisterHandler(UserService userService) {
        this.userService = userService;
    }
    @Override
    public void exec(LogoutMsg data) {
        this.userService.registerUser();
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
