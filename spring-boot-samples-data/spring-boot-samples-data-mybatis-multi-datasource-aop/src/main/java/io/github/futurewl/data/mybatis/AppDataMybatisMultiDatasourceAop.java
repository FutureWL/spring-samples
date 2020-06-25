package io.github.futurewl.data.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class AppDataMybatisMultiDatasourceAop {

    public static void main(String[] args) {
        SpringApplication.run(AppDataMybatisMultiDatasourceAop.class, args);
    }

}
