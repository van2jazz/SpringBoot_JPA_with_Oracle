package com.toDel.Service;

import com.toDel.DAO.UserDao;
import com.toDel.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    public List<User> getAllUser(){
        return userDao.findAll();
    }


    public void saveUser(User user){
        this.userDao.save(user);
    }

    public void deleteById(Integer id){
        this.userDao.deleteById(id);
    }


    public void updateUSer(User user){
        this.userDao.save(user);
    }
}
