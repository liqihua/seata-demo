package com.liqihua.demo.seata.springboot.order.controller;

import com.liqihua.demo.seata.springboot.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/insert")
    public String insert(Long userId,Integer num,Long amount) {
        orderService.insert(userId,num,amount);
        return "ok";
    }


}
