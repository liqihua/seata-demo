package com.liqihua.demo.seata.springboot.storage.controller;

import com.liqihua.demo.seata.springboot.storage.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StorageController.class);

    @Autowired
    private StorageService storageService;


    @RequestMapping("/testCommit")
    public String testCommit(Long id, Integer num) {
        LOGGER.info("storage testCommit ... ");
        storageService.testCommit(id,num);
        return "storage ok";
    }

    @RequestMapping("/testRollback")
    public String testRollback(Long id, Integer num) {
        LOGGER.info("storage testRollback ... ");
        storageService.testRollback(id,num);
        return "storage ok";
    }

}
