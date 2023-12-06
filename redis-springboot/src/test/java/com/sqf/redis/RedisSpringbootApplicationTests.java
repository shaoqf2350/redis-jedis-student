package com.sqf.redis;

import com.sqf.redis.bean.Address;
import com.sqf.redis.bean.Family;
import com.sqf.redis.bean.Person;
import com.sqf.redis.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class RedisSpringbootApplicationTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void contextLoads() {
    }

//    @Test
    public void testAddPerson() {
        // 添加第一个人
        Address address = new Address("中国", "泸州");
        Family family1 = new Family("儿子", "张晓刚");
        Family family2 = new Family("女儿", "张晓霞");
        List<Family> familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        Person person = new Person("1", "无忌", "张", address, familyList);
        personRepository.save(person);

        // 添加第二个人
        address = new Address("中国", "上海");
        family1 = new Family("儿子", "李功晨");
        family2 = new Family("女儿", "李晓丽");
        familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        person = new Person("2", "承鹏", "李", address, familyList);
        personRepository.save(person);

        // 添加第三个人
        address = new Address("中国", "北京");
        family1 = new Family("儿子", "唐玉海");
        family2 = new Family("女儿", "唐雨涵");
        familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        person = new Person("3", "大明", "唐", address, familyList);
        personRepository.save(person);

        // 添加第四个人
        address = new Address("中国", "北京");
        family1 = new Family("儿子", "张大明");
        family2 = new Family("女儿", "张丽丽");
        familyList = new ArrayList<Family>();
        familyList.add(family1);
        familyList.add(family2);
        person = new Person("4", "文勇", "张", address, familyList);
        personRepository.save(person);

        System.out.println("成功地添加了4条记录~");
    }

    @Test
    public void testFindAll() {
        Iterable<Person> persons = personRepository.findAll();
        persons.forEach(person -> System.out.println(person));
    }

//    @Test
    public void testFindById() {
        Optional<Person> person = personRepository.findById("2");
        System.out.println(person);
    }

//    @Test
//    public void testFindPersonByLastName() {
//        // 降序排序
//        Sort.Direction sort = Sort.Direction.DESC;
//        // 创建分页器
//        Pageable pageable = PageRequest.of(0, 2, sort, "id");
//        // 获取页面
//        Page<Person> page = personRepository.findPersonByLastName("张", pageable);
//        // 输出页面内容
//        for (Person person : page.getContent()) {
//            System.out.println(person);
//        }
//    }


}
