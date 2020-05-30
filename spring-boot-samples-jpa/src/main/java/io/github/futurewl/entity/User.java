package io.github.futurewl.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * 基本注解
 *
 * @ Entity
 * @ Table
 * @ Id
 * @ IdClass 利用外部类的联合主键
 * @ GeneratedValue 为主键生成策略
 * @ Basic 表示属性到数据库表字段的映射
 * @ Transient 表示属性不到数据库表字段的映射
 * @ Column 对应数据库中的列名
 * @ Temporal 设置 Date 类型的属性 映射到对应精度的字段
 * @ Enumerated 直接映射枚举类型字段
 * @ Lob 支持大对象类型
 * <p>
 * 关联关系注解
 * @ JoinColumn 定义外健关联的字段名称 需要配合 OneToOne OneToMany ManyToOne 一起使用，单独使用没有意义
 * @ OneToOne 关联关系
 * @ OneToMany 与 @ ManyToOne 关联关系
 * @ OrderBy 关联查询时排序
 * @ JoinTable 关联关系表
 * @ ManyToMany 关联关系
 * <p>
 * CascadeType.PERSIST 级联新建
 * CascadeType.REMOVE 级联删除
 * CascadeType.REFRESH 级联刷新
 * CascadeType.MERGE 级联更新
 * CascadeType.ALL 四项全选
 * <p>
 * 关联关系被 谁维护，只有关系维护方，才能操作两者的关系
 * <p>
 * 1. mappedBy 不能与 @ JoinColumn 或者 @ JoinTable 同时使用
 * 2. mappedBy 的值是指另一方的实体里面属性的字段，而不是数据库字段，也不是实体对象的名字。
 * 即另一方配置了 @JoinColumn或者 @JoinTable 注解的属性的字段名称
 * <p>
 * orphanRemoval 是否级联删除 与 CascadeType.REMOVE 效果一样
 * <p>
 * <p>
 * Left join Inner join JQPL 语法实现、Criteria API 实现
 * @ EntityGraph
 */
@Entity
@NamedEntityGraphs({
        @NamedEntityGraph(name = "User", attributeNodes = {
                @NamedAttributeNode("projects")
        })
})
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user")
    private List<Project> projects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", projects=" + projects +
                '}';
    }
}
