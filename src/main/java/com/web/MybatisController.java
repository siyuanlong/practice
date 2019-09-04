package com.web;

import com.domain.User;
import com.mybatis.mapper.MapperTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisController {

    @Autowired
    private MapperTest mapperTest;

    @RequestMapping("/mybatistest")
    public void mybatistest(){
        User user = User.builder()
                .username("陈平安")
                .password("123")
                .build();
        mapperTest.save(user);
    }

}
