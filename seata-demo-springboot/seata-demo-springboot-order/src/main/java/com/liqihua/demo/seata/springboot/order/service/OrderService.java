package com.liqihua.demo.seata.springboot.order.service;

public interface OrderService {

    void testCommit(Long userId, Integer num, Long amount);

    void testRollback(Long userId, Integer num, Long amount);

}
