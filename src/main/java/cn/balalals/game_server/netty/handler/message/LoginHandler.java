package cn.balalals.game_server.netty.handler.message;

import cn.balalals.game_server.domain.MyUserRepository;
import cn.balalals.game_server.protobuf.LoginMsg;
import cn.balalals.game_server.protobuf.MsgType;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class LoginHandler implements MessageHandler<LoginMsg> {
    @Resource
    MyUserRepository myUserRepository;
    @Override
    public void exec(LoginMsg data) {
        System.out.println(myUserRepository.findAll().size());
        System.out.println("开始处理登录数据");
    }

    @Override
    public MsgType getMsgType() {
        return MsgType.LOGIN;
    }

    @Override
    public LoginMsg parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return LoginMsg.parseFrom(byteString);
    }
}
