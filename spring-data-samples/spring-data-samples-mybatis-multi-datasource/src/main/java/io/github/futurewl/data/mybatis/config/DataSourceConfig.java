package io.github.futurewl.data.mybatis.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.master")
    public DataSource masterDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.slave")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean
    public JdbcTemplate masterJdbcTemplate(@Qualifier("masterDataSource") DataSource masterDataSource) {
        return new JdbcTemplate(masterDataSource);
    }

    @Bean
    public JdbcTemplate slaveJdbcTemplate(@Qualifier("slaveDataSource") DataSource slaveDataSource) {
        return new JdbcTemplate(slaveDataSource);
    }

}
