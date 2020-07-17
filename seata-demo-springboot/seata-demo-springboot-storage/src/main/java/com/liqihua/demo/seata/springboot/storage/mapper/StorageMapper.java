package com.liqihua.demo.seata.springboot.storage.mapper;

import com.liqihua.demo.seata.springboot.storage.entity.StorageEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StorageMapper {

    @Select("select * from t_storage where id=#{id}")
    StorageEntity selectStorage(@Param("id") Long id);

    @Update("update t_storage set num=#{num} where id=#{id}")
    void updateStorage(@Param("id") Long id, @Param("num") Integer num);

}
