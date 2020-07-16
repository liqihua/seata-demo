package com.liqihua.demo.seata.springboot.storage.service;

import com.liqihua.demo.seata.springboot.storage.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    private StorageMapper storageMapper;

    public void updateStorage(Long id, Integer num) {
        storageMapper.updateStorage(id,num);
    }
}
