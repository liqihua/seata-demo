package com.liqihua.demo.seata.springboot.storage.controller;

import com.liqihua.demo.seata.springboot.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/storage")
public class StorageController {
    @Autowired
    private StorageService storageService;


    @RequestMapping("/init")
    public String init() {
        storageService.updateStorage(1L,5000);
        return "init success";
    }

    @RequestMapping("/update")
    public String update() {
        storageService.updateStorage(1L,4995);
        return "ok";
    }

}
