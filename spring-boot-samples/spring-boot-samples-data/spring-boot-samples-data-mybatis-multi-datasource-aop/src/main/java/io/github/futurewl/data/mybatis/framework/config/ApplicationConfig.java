package io.github.futurewl.data.mybatis.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 程序注解配置
 *
 * @author ruoyi
 */
@Configuration
@EnableAspectJAutoProxy(exposeProxy = true) // 表示通过aop框架暴露该代理对象,AopContext能够访问
@MapperScan("io.github.futurewl.data.mybatis.**.mapper") // 指定要扫描的Mapper类的包的路径
public class ApplicationConfig {

}
