package cn.balalals.game_server.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Calendar;

@MappedSuperclass
class BaseEntity {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36)
    private String Id;
    @Column(name = "created_at",  nullable = false, updatable = false)
    private Calendar createdAt = Calendar.getInstance();
    @Column(name = "updated_at",  nullable = false, updatable = false)
    private Calendar updatedAt = Calendar.getInstance();;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Calendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Calendar createdAt) {
        this.createdAt = createdAt;
    }

    public Calendar getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Calendar updatedAt) {
        this.updatedAt = updatedAt;
    }
}
