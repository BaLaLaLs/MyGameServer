package game_db;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Vertx;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.PoolOptions;

public class GameDbVerticle extends AbstractVerticle {
    public static void main(String[] args) {
        Vertx.vertx().deployVerticle(new GameDbVerticle());
    }
    @Override
    public void init(Vertx vertx, Context context) {
        super.init(vertx, context);
        System.out.println("开始连接数据库");
        PgConnectOptions connectOptions = new PgConnectOptions()
                .setPort(5432)
                .setHost("localhost")
                .setDatabase("game_server")
                .setUser("postgres")
                .setPassword("game_server");
        // Pool options
        PoolOptions poolOptions = new PoolOptions()
                .setMaxSize(5);
        PgPool pool = PgPool.pool(vertx, connectOptions, poolOptions);
        pool.getConnection(ar -> {
            if (ar.succeeded()) {
                System.out.println("连接成功");
//                vertx.eventBus().consumer();
            }
        });
    }
}
