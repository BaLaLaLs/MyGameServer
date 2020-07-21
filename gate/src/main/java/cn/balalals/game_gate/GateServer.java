package cn.balalals.game_gate;

import cn.balalals.game_gate.router.ApiRouter;
import cn.balalals.game_gate.router.PageRouter;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class GateServer extends AbstractVerticle {
    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new GateServer());
    }

    @Override
    public void start(Promise<Void> startPromise) throws Exception {
        HttpServer server = vertx.createHttpServer();
        Router router = Router.router(vertx);
        // 初始化路由
        router.route("/static/*").handler(StaticHandler.create());
        new ApiRouter(vertx, router, "/api");
        new PageRouter(vertx, router, "/page");
        server.requestHandler(router).listen(8686,result -> {
            if (result.succeeded()) {
                System.out.println("Web服务开启成功!!");
            } else {
                result.cause().printStackTrace();
            }
        });

    }
}
