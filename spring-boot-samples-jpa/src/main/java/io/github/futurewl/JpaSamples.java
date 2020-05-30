package io.github.futurewl;

import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.internal.EntityManagerImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
//import org.springframework.data.jpa.repository.support.QuerydslJpaRepository;
import org.springframework.data.jpa.repository.support.QueryDslJpaRepository;
//import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import javax.persistence.EntityManager;

/**
 *
 * Auditing 审核，审计
 *
 * @ CreatedBy 创建的用户
 * @ CreatedDate 创建的时间
 * @ LastModifiedBy 修改实体的用户
 * @ LastModifiedDate 最后一次修改时间
 * @ MappedSuperclass
 *
 *
 * Version
 * MvcWeb
 * @ EnableJpaRepositories 详解
 * 默认日志简单介绍
 * Spring Boot JPA 版本 问题
 *
 *
 * 默认数据源的讲解
 * AliDruidDataSource 的配置
 * 事务的处理及其讲解
 * 如何配置多数据源
 * Naming 命名策略详解及其实践
 * 完整的传统 XML 的配置方法
 *
 *
 *
 */
@SpringBootApplication
public class JpaSamples {
    public static void main(String[] args) {

        // 七个 接口
        // Repository
        // CrudRepository
        // PagingAndSortingRepository
        // QueryByExampleExecutor
        // JpaRepository
        // JpaSpecificationExecutor
        // QueryDslPredicateExecutor
        // 两个 实现类
        // SimpleJpaRepository
        // QueryDslJpaRepository
        // 需要了解的类 真正的 JPA 的底层封装类
        // EntityManager
        // EntityManagerImpl
        // EntityManagerFactoryBuilderImpl

        SpringApplication.run(JpaSamples.class, args);
    }
}
