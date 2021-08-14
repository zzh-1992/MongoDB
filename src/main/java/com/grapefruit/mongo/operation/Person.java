package com.grapefruit.mongo.operation;

import lombok.Data;

@Data
public class Person {

  private String id;
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}