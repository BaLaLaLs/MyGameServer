package cn.balalals.game_gate.router;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

public abstract class BaseRouterImpl implements IRouter {
    private final Router router;
    private final String prefix;
    private final Vertx vertx;

    public Vertx getVertx() {
        return vertx;
    }

    public BaseRouterImpl(Vertx vertx, Router router) {
        this(vertx, router ,"");
    }
    public BaseRouterImpl(Vertx vertx, Router router, String prefix) {
        this.vertx = vertx;
        this.router = router;
        this.prefix = prefix;
        this.initRouter();
    }
    public Route get(String path) {
        return this.router.get(this.prefix + path);
    }
    public Route post(String path) {
        return this.router.post(this.prefix + path);
    }
    @Override
    abstract public void initRouter();
}
