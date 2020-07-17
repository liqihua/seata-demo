package com.liqihua.demo.seata.springboot.user.service;

public interface UserService {



    void testGlobalTrasactionCommit(Long userId,Integer num,Long amount);

    void testGlobalTrasactionRollback(Long userId,Integer num,Long amount);

}
