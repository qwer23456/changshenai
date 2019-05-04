package com.example.demo.congtroller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entry.User;
@RestController

@RequestMapping("/getUser")
public class firstCon {
    @Autowired
    private FirstService firstService;
    @RequestMapping("/getUuser/{id}")
    public  User findUserByid(@PathVariable("id") String id){
    System.out.print("1111111111");
    int  id1 = Integer.parseInt(id);
     return firstService.finduserbyId(id1);
    }
}
