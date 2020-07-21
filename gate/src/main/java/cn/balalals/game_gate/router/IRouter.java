package cn.balalals.game_gate.router;

import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

public interface IRouter {
    void initRouter();
    Route get(String path);
}
