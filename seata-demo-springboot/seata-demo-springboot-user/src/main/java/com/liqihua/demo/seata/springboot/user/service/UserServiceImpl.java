package com.liqihua.demo.seata.springboot.user.service;

import com.liqihua.demo.seata.springboot.user.entity.UserEntity;
import com.liqihua.demo.seata.springboot.user.mapper.UserMapper;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RestTemplate restTemplate;



    public void testGlobalTrasactionCommit(Long userId,Integer num,Long amount) {
        LOGGER.info("准备更新用户余额 ...");
        UserEntity entity = userMapper.selectUser(userId);
        userMapper.updateMoney(userId, entity.getMoney() - amount);
        LOGGER.info("用户余额更新成功 .");
        restTemplate.getForObject("http://127.0.0.1:9103/order/testCommit?userId="+userId+"&num="+num+"&amount="+amount,String.class);
    }

    public void testGlobalTrasactionRollback(Long userId,Integer num,Long amount) {
        LOGGER.info("准备更新用户余额 ...");
        UserEntity entity = userMapper.selectUser(userId);
        userMapper.updateMoney(userId, entity.getMoney() - amount);
        LOGGER.info("用户余额更新成功 .");
        restTemplate.getForObject("http://127.0.0.1:9103/order/testRollback?userId="+userId+"&num="+num+"&amount="+amount,String.class);
    }

}
