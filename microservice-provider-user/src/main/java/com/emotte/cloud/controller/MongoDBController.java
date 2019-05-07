package com.emotte.cloud.controller;

import com.alibaba.fastjson.JSONObject;
import com.emotte.cloud.app.mongodb.MongoPojo;
import com.emotte.cloud.service.MongoDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mongodb")
public class MongoDBController {

    @Autowired
    private MongoDBService mongoDBService;

    @RequestMapping("/find")
    public String find(MongoPojo pojo) {
        return mongoDBService.find(pojo);
    }

    @RequestMapping("/save")
    public String save(MongoPojo pojo) {
        return mongoDBService.save(pojo);
    }
}
