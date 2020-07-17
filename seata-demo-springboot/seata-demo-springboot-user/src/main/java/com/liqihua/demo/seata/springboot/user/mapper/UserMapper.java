package com.liqihua.demo.seata.springboot.user.mapper;

import com.liqihua.demo.seata.springboot.user.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {

    @Select("select * from t_user where id=#{id}")
    UserEntity selectUser(@Param("id") Long id);


    @Update("update t_user set money=#{money} where id=#{id}")
    void updateMoney(@Param("id") Long id, @Param("money") Long money);

}
