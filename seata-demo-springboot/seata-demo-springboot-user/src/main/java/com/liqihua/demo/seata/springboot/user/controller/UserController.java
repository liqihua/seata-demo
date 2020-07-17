package com.liqihua.demo.seata.springboot.user.controller;

import com.liqihua.demo.seata.springboot.user.service.UserService;
import com.liqihua.demo.seata.springboot.user.service.UserServiceImpl;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserService userService;


    @RequestMapping("/testCommit")
    @GlobalTransactional(rollbackFor = Exception.class)
    public String testCommit() {
        LOGGER.info("即将开启全局事务，获得的 XID 为：{}", RootContext.getXID());
        userService.testGlobalTrasactionCommit(1L,5,200L);
        return "user ok";
    }

    @RequestMapping("/testRollBack")
    @GlobalTransactional(rollbackFor = Exception.class)
    public String testRollBack() {
        LOGGER.info("即将开启全局事务，获得的 XID 为：{}", RootContext.getXID());
        userService.testGlobalTrasactionRollback(1L,5,200L);
        return "user ok";
    }

}
