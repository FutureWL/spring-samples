package io.github.futurewl.web.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 功能描述：WebMVC 配置
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        String pathPattern = "/**";
        registry.addMapping(pathPattern)
                // 允许的来源列表。响应信息会放在HTTP协议Header的Access-Control-Allow-Origin中 如果未定义，-*- 所有的来源都被允许 则允许所有来源
                .allowedOrigins("*")
                // 实际请求期间可以使用的请求头列表。该值用于预检的响应Header中的Access-Control-Allow-Headers信息。
                .allowedHeaders("*")
                // 服务器端支持的HTTP请求方法列表。"GET", "POST", "PUT", "DELETE", "HEAD"
                .allowedMethods("*")
                // 浏览器允许客户端访问的响应头列表。 在实际响应报头Access-Control-Expose-Headers中设置值。
                .exposedHeaders("*")
                // 它确定浏览器是否应该包含与请求相关的任何cookie。
                .allowCredentials(true)
                .maxAge(3600);
    }

}
