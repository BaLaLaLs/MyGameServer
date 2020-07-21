package cn.balalals.game_gate.router;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.common.template.TemplateEngine;
import io.vertx.ext.web.handler.TemplateHandler;
import io.vertx.ext.web.templ.freemarker.FreeMarkerTemplateEngine;

public class PageRouter extends BaseRouterImpl {
    public PageRouter(Vertx vertx, Router router) {
        super(vertx, router);
    }

    public PageRouter(Vertx vertx, Router router, String prefix) {
        super(vertx, router, prefix);
    }

    @Override
    public void initRouter() {
        TemplateEngine engine = FreeMarkerTemplateEngine.create(this.getVertx());
        TemplateHandler renderHandler = TemplateHandler.create(engine);
        get("/register").handler(routingContext -> {
            routingContext.put("title", "注册");
//            renderHandler.setIndexTemplate("register.ftl");
            routingContext.next();
        });
        get("/login").handler(routingContext -> {
//            renderHandler.setIndexTemplate("login.ftl");
            routingContext.put("title", "登录");
            routingContext.next();
        });
        get("/*").handler(renderHandler).failureHandler(frc -> {
            System.out.println("渲染出错！");
        });

    }
}
