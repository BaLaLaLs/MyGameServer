package cn.balalals.game_server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class MyUser extends BaseEntity {
    @Column(name = "account", length = 100, nullable = false)
    private String account;
    @Column(name = "password", nullable = false)
    private String password;
}
