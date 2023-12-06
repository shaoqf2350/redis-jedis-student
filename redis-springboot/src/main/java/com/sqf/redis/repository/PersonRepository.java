package com.sqf.redis.repository;

/**
 * @Description: 个人仓库接口
 * @Author: shaoqingfeng
 * @CREATE: 2023/12/6 9:25
 */
import com.sqf.redis.bean.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
public interface PersonRepository extends CrudRepository<Person, String> {
    //自定义个性化查询，方法名需要符合特定的规范
    List<Person> findByLastName(String lastName);
    Page<Person> findPersonByLastName(String lastName, Pageable pageable);
    List<Person> findPersonByLastNameAndFirstName(String lastName, String firstName);
    List<Person> findByAddress_City(String city);
    List<Person> findByFamilyList_Name(String name);
}

