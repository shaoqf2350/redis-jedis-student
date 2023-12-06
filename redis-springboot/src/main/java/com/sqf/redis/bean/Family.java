package com.sqf.redis.bean;

import org.springframework.data.redis.core.index.Indexed;

/**
 * @Description: 家庭实体类
 * @Author: shaoqingfeng
 * @CREATE: 2023/12/6 9:21
 */
public class Family {
    @Indexed
    private String type; //成员类型
    @Indexed
    private String name; //成员名

    public Family(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Family{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
