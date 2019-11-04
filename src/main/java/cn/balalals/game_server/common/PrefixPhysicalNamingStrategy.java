package cn.balalals.game_server.common;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PrefixPhysicalNamingStrategy extends PhysicalNamingStrategyStandardImpl {
    @Value("spring.datasource.table-prefix")
    private String prefix;
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment context) {
        Identifier newIdentifier = new Identifier("game_" + name.getText(), name.isQuoted());
        return super.toPhysicalTableName(newIdentifier, context);
    }
}
