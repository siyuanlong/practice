package com.web;

import com.domain.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateFormatController {
    @RequestMapping("/dateFormatTest")
    public Student dateFormatTest() {
        Student student = new Student();
        student.setCreateTime(new Date());
        System.out.println(student.getCreateTime());
        System.out.println(student);
        return student;
    }
}
