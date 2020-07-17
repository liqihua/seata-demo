package com.liqihua.demo.seata.springboot.storage.service;

public interface StorageService {

    void testCommit(Long id, Integer num);

    void testRollback(Long id, Integer num);
}
