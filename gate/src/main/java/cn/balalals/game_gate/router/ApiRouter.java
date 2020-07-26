package cn.balalals.game_gate.router;

import cn.balalals.game_gate.SqlUtil;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.Router;
import io.vertx.sqlclient.Row;
import io.vertx.sqlclient.RowSet;

public class ApiRouter extends BaseRouterImpl {
    public ApiRouter(Vertx vertx, Router router) {
        super(vertx, router);
    }

    public ApiRouter(Vertx vertx, Router router, String prefix) {
        super(vertx, router, prefix);
    }

    @Override
    public void initRouter() {
        this.post("/register").handler(routingContext -> {
            JsonObject jsonObject = routingContext.getBody().toJsonObject();
            String username = jsonObject.getString("username");
            String password = jsonObject.getString("password");
            SqlUtil.getInstance().getPgPool().getConnection(ar -> {
                if (ar.succeeded()) {
                    System.out.println("数据库连接成功");
                }else {
                    ar.cause().printStackTrace();
                }
            });
//            SqlUtil.register(username, password, ar -> {
//                if (ar.succeeded()) {
//                    RowSet<Row> rows = ar.result();
//                    System.out.println(rows.rowCount());
//                    routingContext.response().end("注册成功！");
//                } else {
//                    System.out.println("Failure: " + ar.cause().getMessage());
//                }
//            });
        });
    }
}
