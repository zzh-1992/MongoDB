package com.grapefruit.mongo.operation;

import com.mongodb.client.MongoClients;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * 官网示例 https://docs.spring.io/spring-data/mongodb/docs/3.2.4/reference/html/#reference
 */
public class MongoApp {
    public static void main(String[] args) {

        MongoOperations mongoOps = new MongoTemplate(MongoClients.create(), "grape");
        mongoOps.insert(new Person("sc2", 27));

        Person one = mongoOps.findOne(new Query(where("name").is("sc2")), Person.class);

        System.out.println(one);

        //mongoOps.dropCollection("person");
    }
}