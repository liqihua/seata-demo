package com.liqihua.demo.seata.springboot.user.controller;

import com.liqihua.demo.seata.springboot.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 测试访问通不通
     * http://localhost:9101/user/test
     * @return
     */
    @RequestMapping("/test")
    public String test() {
        return "i am ok";
    }


    /**
     * 初始化id为1的用户余额为2000
     * @return
     */
    @RequestMapping("/init")
    public String init() {
        userService.updateMoney(1L,2000L);
        return "init success";
    }



    @RequestMapping("/update")
    public String update() {
        userService.updateMoney(1L,1500L);
        return "ok";
    }


}
