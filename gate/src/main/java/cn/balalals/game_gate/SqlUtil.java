package cn.balalals.game_gate;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.pgclient.PgConnectOptions;
import io.vertx.pgclient.PgPool;
import io.vertx.sqlclient.*;

public class SqlUtil {
    public PgPool getPgPool() {
        return pgPool;
    }

    PgPool pgPool;
    static SqlUtil instance;
    public static SqlUtil getInstance() {
        if(instance == null) {
            instance = new SqlUtil();
        }
        return instance;
    }
    SqlUtil() {

    }
}
