package com.liqihua.demo.seata.springboot.order.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {


    @Insert("insert into t_order (user_id,num,amount) values( #{userId}, #{num}, #{amount} )")
    void insert(@Param("userId") Long userId, @Param("num") Integer num, @Param("amount") Long amount);


}
