package com.liqihua.demo.seata.springboot.order.service;

import com.liqihua.demo.seata.springboot.order.mapper.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private RestTemplate restTemplate;


    public void testCommit(Long userId, Integer num, Long amount) {
        LOGGER.info("testCommit 准备插入订单 ... ");
        orderMapper.insert(userId,num,amount);
        LOGGER.info("订单插入成功 . ");
        restTemplate.getForObject("http://127.0.0.1:9102/storage/testCommit?id=1&num="+num,String.class);
    }

    public void testRollback(Long userId, Integer num, Long amount) {
        LOGGER.info("testRollback 准备插入订单 ... ");
        orderMapper.insert(userId,num,amount);
        LOGGER.info("订单插入成功 . ");
        restTemplate.getForObject("http://127.0.0.1:9102/storage/testRollback?id=1&num="+num,String.class);
    }
}
