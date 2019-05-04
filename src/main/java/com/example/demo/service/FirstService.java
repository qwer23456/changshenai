package com.example.demo.service;

import com.example.demo.dao.FirstDao;
import com.example.demo.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FirstService {
    @Autowired
    FirstDao firstDao;
   public User finduserbyId(int id){
       return firstDao.finduserbyId(id);
   };

}
