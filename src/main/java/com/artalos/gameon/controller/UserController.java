package com.artalos.gameon.controller;

import com.artalos.gameon.domain.User;
import com.artalos.gameon.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/api/")
public class UserController {

    @Autowired
    private UserModel userModel;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        System.out.println("User: " + user);
        return userModel.createUser(user);
    }

    @RequestMapping(value = "/user/{userId}", method = RequestMethod.GET)
    public User findUserById(@PathVariable("userId") String userId) {
        return userModel.findUserById(userId);
    }


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findUserByUsername(@RequestParam(value = "q") String userName) {
        System.out.println("User: " + userName);
        return userModel.findUserByUsername(userName);
    }


    @RequestMapping(value = "/user/{userId}", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user) {
        return userModel.updateUser(user);
    }
    //app.put("/api/user/:userId",updateUser);

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userModel.getAllUsers();
    }


    /*@RequestMapping(value = "/logout", method = RequestMethod.GET)
    public User logout(@PathVariable("userId") String userId) {
        return userModel.logout(userId);
    }
    app.get("/api/logout",logout);

    @RequestMapping(value = "/checkLogin", method = RequestMethod.GET)
    public User checkLogin(@PathVariable("userId") String userId) {
        return userModel.checkLogin(userId);
    }
    app.get("/api/checkLogin",checkLogin);*/


    @RequestMapping(value = "/searchUsers", method = RequestMethod.GET)
    public List<User> searchUsers(@RequestParam(value = "q") String searchTerm) {
        return userModel.searchUsers(searchTerm);
    }
    //app.get("/api/searchUsers",searchUsers);


    @RequestMapping(value = "/user/{userId}", method = RequestMethod.DELETE)
    public Boolean deleteUser(@PathVariable("userId") String userId) {
        return userModel.deleteUser(userId);
    }
}