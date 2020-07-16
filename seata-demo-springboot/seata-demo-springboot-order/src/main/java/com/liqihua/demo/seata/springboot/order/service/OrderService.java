package com.liqihua.demo.seata.springboot.order.service;

public interface OrderService {

    void insert(Long userId, Integer num, Long amount);

}
