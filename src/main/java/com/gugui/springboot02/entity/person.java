package com.gugui.springboot02.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @outhor 伦
 * @create 2020-08-23-12:30
 */


/**
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties:告诉SpringBoot将本类中的所有属性和配置文件相关的配置进行绑定
 *                          prefix = "person"配置文件中哪个下面的属性一一映射
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 * @ConfigurationProperties(perfix = "peson")默认从全局配置文件中获取值
 *
 */
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class person {


    private String listName;
    private Integer age;
    private boolean boss;
    private Date birth;

    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog Dog;

    @Override
    public String toString() {
        return "person{" +
                "listName='" + listName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", Dog=" + Dog +
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

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Object getDog() {
        return Dog;
    }

    public void setDog(Dog dog) {
        Dog = dog;
    }
}
