package com.toDel.Controller;

import com.toDel.Entity.User;
import com.toDel.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public void saveUser(@RequestBody User user){
        this.userService.saveUser(user);
    }

    @RequestMapping(value = "/{id}" , method = RequestMethod.DELETE)
    public void deleteUserById(@PathVariable ("id") int id){
        this.userService.deleteById(id);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.PUT)
    public void updateUSer(@RequestBody User user){
        this.userService.updateUSer(user);
    }






}
