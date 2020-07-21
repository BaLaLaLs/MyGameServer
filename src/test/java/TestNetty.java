import cn.balalals.game_server.netty.handler.MessageDispatchChannel;
import cn.balalals.game_server.protobuf.LoginMsg;
import cn.balalals.game_server.protobuf.Msg;
import cn.balalals.game_server.protobuf.MsgType;
import cn.balalals.game_server.protobuf.Register;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.Test;

public class TestNetty {
    @Test
    public void testLogin() {
        EmbeddedChannel channel = new EmbeddedChannel(new MessageDispatchChannel());
        Msg.Builder msg = Msg.newBuilder();
        LoginMsg.Builder builder = LoginMsg.newBuilder();
        builder.setAccount("liushun");
        builder.setPassword("p123");
        msg.setMsgType(MsgType.LOGIN);
        msg.setContent(builder.build().toByteString());
        channel.writeInbound(msg.build());
    }
    @Test
    public void testRegister() {
        EmbeddedChannel channel = new EmbeddedChannel(new MessageDispatchChannel());
        Msg.Builder msg = Msg.newBuilder();
        Register.Builder builder = Register.newBuilder();
        builder.setAccount("liushun");
        builder.setPassword("p123");
        msg.setMsgType(MsgType.REGISTER);
        msg.setContent(builder.build().toByteString());
        channel.writeInbound(msg.build());
    }
}
