package com.web;

import com.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class JsonController {
    @RequestMapping("/jsontest")
    public String jsontest(){
        ArrayList<String> list = new ArrayList();
        list.add("陈平安");
        list.add("裴钱");
        list.add("宁姚");
        return list.toString();
    }
}
