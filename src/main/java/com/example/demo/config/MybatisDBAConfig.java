package com.example.demo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

//@Configuration
//@MapperScan(basePackages = {"com.example.demo.mapper"},sqlSessionFactoryRef = "sqlSessionFactory1")
    public class MybatisDBAConfig {

        @Autowired
        @Qualifier("db1")
        private DataSource db1;

        @Bean
        public SqlSessionFactory sqlSessionFactory1() throws Exception {
            SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
            factoryBean.setDataSource(db1); // 使用db1数据源, 连接hibernate库
            return factoryBean.getObject();
        }

        @Bean
        public SqlSessionTemplate sqlSessionTemplate1() throws Exception {
            SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory1()); // 使用上面配置的Factory
            return template;
        }
    }

