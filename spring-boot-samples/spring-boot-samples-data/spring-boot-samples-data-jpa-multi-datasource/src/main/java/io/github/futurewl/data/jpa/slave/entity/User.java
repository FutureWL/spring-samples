package io.github.futurewl.data.jpa.slave.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
@org.hibernate.annotations.Table(appliesTo = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
