import cn.balalals.game_server.netty.handler.MessageDispatchChannel;
import cn.balalals.game_server.protobuf.LoginMsg;
import cn.balalals.game_server.protobuf.Msg;
import cn.balalals.game_server.protobuf.MsgType;
import io.netty.channel.embedded.EmbeddedChannel;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class TestNetty {
    @Test
    public void testSpringbootJpa() {
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
    void testCalendar() {
        Calendar.getInstance();
        System.out.println(Calendar.getInstance().getTimeInMillis());
    }
}
