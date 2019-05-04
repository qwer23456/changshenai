package com.example.demo.mapper;

import com.example.demo.entry.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface mapper1 {
    @Select("select * from user where userid =#{id}")
    User finduserbyId(@Param(value = "id") Integer id);
}
