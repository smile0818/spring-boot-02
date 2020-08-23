package com.gugui.springboot02.entity;

/**
 * @outhor 伦
 * @create 2020-08-23-12:43
 */
public class Dog {

    private String listName;
    private Integer age;

    @Override
    public String toString() {
        return "Dog{" +
                "listName='" + listName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
