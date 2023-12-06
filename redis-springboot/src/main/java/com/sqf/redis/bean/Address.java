package com.sqf.redis.bean;

import org.springframework.data.redis.core.index.Indexed;

/**
 * @Description: 地址实体类
 * @Author: shaoqingfeng
 * @CREATE: 2023/12/6 9:16
 */
public class Address {
    @Indexed
    private String country; //国家
    @Indexed
    private String city; //城市

    public Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
