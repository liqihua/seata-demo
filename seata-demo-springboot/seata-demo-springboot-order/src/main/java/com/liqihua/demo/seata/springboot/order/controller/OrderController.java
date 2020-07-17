package com.liqihua.demo.seata.springboot.order.controller;

import com.liqihua.demo.seata.springboot.order.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @RequestMapping("/testCommit")
    public String testCommit(Long userId,Integer num,Long amount) {
        LOGGER.info("order testCommit ...");
        orderService.testCommit(userId,num,amount);
        return "order ok";
    }

    @RequestMapping("/testRollback")
    public String testRollback(Long userId,Integer num,Long amount) {
        LOGGER.info("order testRollback ...");
        orderService.testRollback(userId,num,amount);
        return "order ok";
    }
}
