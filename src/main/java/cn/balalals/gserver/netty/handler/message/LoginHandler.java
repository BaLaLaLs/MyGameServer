package cn.balalals.gserver.netty.handler.message;

import cn.balalals.gserver.domain.MyUserRepository;
import cn.balalals.gserver.protobuf.LoginMsg;
import cn.balalals.gserver.protobuf.MsgType;
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
