package io.github.futurewl.repository;

import io.github.futurewl.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository 拓展详解
 *
 * 1. JpaRepository 介绍
 * 2. QueryByExampleExecutor 的使用
 *
 *  QBE 按示例查询
 *
 *  Probe：这是具有填充字段的域对象的实际实体类，即查询条件的封装类。必填
 *  ExampleMatcher:有关于如果匹配特定字段的匹配规则，它可以重复使用在多个实例
 *  Example 由探针 和 ExampleMatcher 组成。它用于创建查询
 *
 *  QueryByExampleExecutor 详细配置
 *  QueryByExampleExecutor 的使用示例
 *  QueryByExampleExecutor 的特点及约束 支持动态查询 不支持过滤条件分组
 *  仅支持字符串的开始/包含/结束/正则表达式匹配和其他属性类型的精确匹配
 *  ExampleMatcher 详解
 *  QueryByExampleExecutor 的使用场景和实际使用
 *  QueryByExampleExecutor 的原理
 *
 * 3. JpaSpecificationExecutor 的详细使用
 * 4. 自定义 Repository
 *
 */
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
