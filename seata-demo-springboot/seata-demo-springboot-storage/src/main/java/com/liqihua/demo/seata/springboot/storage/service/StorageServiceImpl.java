package com.liqihua.demo.seata.springboot.storage.service;

import com.liqihua.demo.seata.springboot.storage.controller.StorageController;
import com.liqihua.demo.seata.springboot.storage.entity.StorageEntity;
import com.liqihua.demo.seata.springboot.storage.mapper.StorageMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);


    @Autowired
    private StorageMapper storageMapper;


    public void testCommit(Long id, Integer num) {
        LOGGER.info("testCommit 准备更新库存 ...");
        StorageEntity entity = storageMapper.selectStorage(id);
        storageMapper.updateStorage(id,entity.getNum() - num);
        LOGGER.info("库存更新成功 .");
    }


    public void testRollback(Long id, Integer num) {
        LOGGER.info("testRollback 准备更新库存 ...");
        StorageEntity entity = storageMapper.selectStorage(id);
        storageMapper.updateStorage(id,entity.getNum() - num);
        LOGGER.info("库存更新成功 .");
        String aa = null;
        if(aa.equals("123")) {
            System.out.println("123");
        }
    }
}
