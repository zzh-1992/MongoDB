/*
 *Copyright @2021 Grapefruit. All rights reserved.
 */

package com.grapefruit.mongo.operation;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;

import java.util.List;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * 初次尝试MongoDB
 *
 * @author zhihuangzhang
 * @version 1.0
 * @date 2021-08-14 5:57 下午
 */
@Controller
public class MongoInsert implements BeanNameAware {
    @Autowired
    MongoOperations mongoOps;

    @Autowired
    MongoTemplate template;

    public void init() {

        String name = "mongo01";
        Grapefruit grapefruit = new Grapefruit("66", name);

        template.insert(grapefruit);

        List<Grapefruit> grapefruits = template.find(new Query(where("name").is(name)), Grapefruit.class);

        System.out.println(grapefruits);
    }

    @Override
    public void setBeanName(String s) {
        init();
    }
}
