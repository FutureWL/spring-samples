package io.github.futurewl.web.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * 过滤器设置 跨域
 */
@Configuration
public class FilterConfig {

    @Bean
    public CorsFilter corsFilter() {
        final String path = "/**";
        final UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.setAllowCredentials(true);
        config.setMaxAge(3600L);
        configSource.registerCorsConfiguration(path, config);
        return new CorsFilter(configSource);
    }
}
