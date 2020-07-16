package com.liqihua.demo.seata.springboot.storage.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface StorageMapper {

    @Update("update t_storage set num=#{num} where id=#{id}")
    void updateStorage(@Param("id") Long id, @Param("num") Integer num);

}
