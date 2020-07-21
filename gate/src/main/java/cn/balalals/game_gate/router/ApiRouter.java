package cn.balalals.game_gate.router;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class ApiRouter extends BaseRouterImpl {
    public ApiRouter(Vertx vertx, Router router) {
        super(vertx, router);
    }

    public ApiRouter(Vertx vertx, Router router, String prefix) {
        super(vertx, router, prefix);
    }

    @Override
    public void initRouter() {
        this.get("/fuck").handler(routingContext -> {
            routingContext.response().end("fuck!!");
        });
    }
}
