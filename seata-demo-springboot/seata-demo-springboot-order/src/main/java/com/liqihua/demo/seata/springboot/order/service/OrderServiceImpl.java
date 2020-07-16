package com.liqihua.demo.seata.springboot.order.service;

import com.liqihua.demo.seata.springboot.order.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;


    public void insert(Long userId, Integer num, Long amount) {
        orderMapper.insert(userId,num,amount);
    }
}
