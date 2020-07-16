package com.liqihua.demo.seata.springboot.user.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

    @Update("update t_user set money=#{money} where id=#{id}")
    void updateMoney(@Param("id") Long id, @Param("money") Long money);

}
