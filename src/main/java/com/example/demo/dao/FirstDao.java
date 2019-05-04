package com.example.demo.dao;

import com.example.demo.entry.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.mapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class FirstDao {
    @Autowired
    private mapper1 userMapper1 ;

    public User finduserbyId(int id){
        return userMapper1.finduserbyId(id);
    };

}
