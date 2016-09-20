package com.linkbit.controller.user;

/**
 * Created by HuangBin on 2016/9/20.
 */

import com.linkbit.domain.user.User;
import com.linkbit.service.user.UserService;
import com.linkbit.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public String home() {

        return "Hello World!";
    }


    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        return userService.findAll();
    }

}