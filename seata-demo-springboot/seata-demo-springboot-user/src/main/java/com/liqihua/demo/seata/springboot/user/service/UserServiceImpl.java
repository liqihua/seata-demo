package com.liqihua.demo.seata.springboot.user.service;

import com.liqihua.demo.seata.springboot.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    public void updateMoney(Long id, Long money) {
        userMapper.updateMoney(id, money);
    }
}
