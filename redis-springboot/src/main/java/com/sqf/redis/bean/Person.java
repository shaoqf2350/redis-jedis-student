package com.sqf.redis.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

/**
 * @Description: 个人实体类
 * @Author: shaoqingfeng
 * @CREATE: 2023/12/6 9:22
 */
@RedisHash("persons")
public class Person {
    @Id  //主键
    private String id;
    //生成二级索引，方便查询
    @Indexed
    private String firstName; //名
    @Indexed
    private String lastName; //姓
    private Address address; //家庭地址
    private List<Family> familyList; //家庭成员

    public Person(String id, String firstName, String lastName, Address address, List<Family> familyList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.familyList = familyList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", familyList=" + familyList +
                '}';
    }
}
