package com.slf4j;

import com.domain.Book;
import com.domain.Student;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class Slf4jTest {

    @Test
    public void test01(){
        log.info("slf4j测试");
        log.info("student:{}",new Book("剑来","1"));
    }

}
