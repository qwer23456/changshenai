package com.example.demo.entry;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "spring.datasource.db2")
public class User {
    private  String userid ;
    private  String username ;
    private  String userpassword ;
}
