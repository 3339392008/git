package com.lpy.controller;

import com.lpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
     private UserService userService;

    /**
     *
     * @param name
     * @param password
     * @return
     */
    @RequestMapping("/logIn")
    public Map<String,Object> select(String name,String password){
        Map<String,Object> map = new HashMap<String,Object>();
        String show=userService.selectUser(name, password);
        map.put("show",show);
        return map;
    }
}
