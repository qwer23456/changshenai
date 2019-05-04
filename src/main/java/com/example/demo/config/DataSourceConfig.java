package com.example.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.beans.ConstructorProperties;

//@Component
//@Configuration
public class DataSourceConfig {
    @Bean(name = "db1")
    @ConfigurationProperties(prefix = "spring.datasource.db1") // application.properteis中对应属性的前缀
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }
//    @Bean(name = "db2")
//    @ConfigurationProperties(prefix = "spring.datasource.db2") // application.properteis中对应属性的前缀
//    public DataSource dataSource2() {
//        return DataSourceBuilder.create().build();
//    }
}
