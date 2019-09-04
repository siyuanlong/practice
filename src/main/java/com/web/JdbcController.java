package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/jdbctest")
    public void jdbctest(Integer id){
        String sql = "update user set username = 'hehe' where id = ?";
        int i = jdbcTemplate.update(sql, id);
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from user");
        System.out.println(i);
        System.out.println(list);
    }
}
