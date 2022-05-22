package com.user.controller;

import com.user.beans.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long id)
    {
        User user= this.userService.getUser(id);
//      gets data from contact, the url is of contact micorservice
//        List list=this.restTemplate.getForObject("http://localhost:8070/contact/user/"+user.getUserID(),List.class);
        List list=this.restTemplate.getForObject("http://contact-service/contact/user/"+user.getUserID(),List.class);
        user.setContact(list);
        return user;
    }
}
