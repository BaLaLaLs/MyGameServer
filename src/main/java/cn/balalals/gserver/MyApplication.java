package cn.balalals.gserver;
import cn.balalals.gserver.netty.NettyServer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class MyApplication implements CommandLineRunner {
    public MyApplication(NettyServer nettyServer) {
        this.nettyServer = nettyServer;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
    @Value("${netty.port}")
    private int nettyPort;
    @Value("${netty.host}")
    private String nettyHost;
    private final NettyServer nettyServer;
    @Override
    public void run(String... args) {
        this.nettyServer.start(nettyHost, nettyPort);
        Runtime.getRuntime().addShutdownHook(new Thread(nettyServer::destroy));
    }
}
