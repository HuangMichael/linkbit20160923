package com.linkbit.controller.user;

/**
 * Created by HuangBin on 2016/9/20.
 */

import com.linkbit.domain.user.User;
import com.linkbit.service.user.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/user")
public class UserController {

    Logger logger = Logger.getLogger("log");

    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String home() {

        return "/index.html";
    }


    @RequestMapping("/create")
    public String create() {

        return "/create.html";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public User save(@RequestParam("userName") String userName) {

        User user =  new User();
        user.setUserName(userName);
        user.setPassword("123456");
        user.setStatus("1");
        logger.info("保存用户-------");
        return userService.save(user);
    }


    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        logger.info("查询用户-------");
        return userService.findAll();
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public boolean delete(@PathVariable("id") Long id) {
        logger.info("删除用户---" + id);
        return userService.delete(id);
    }

}