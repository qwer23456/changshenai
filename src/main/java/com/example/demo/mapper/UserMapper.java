package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.example.demo.entry.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Mapper

public  interface UserMapper {
    @Select("select * from user where id =#{id}")
    User finduserbyId(@Param(value = "id") Integer id);
}