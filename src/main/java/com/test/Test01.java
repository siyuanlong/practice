package com.test;

import com.domain.Book;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

    @Test
    public void test01(){
        String name = "syl";

        if (name == null) {

        }


        if (name == null) {

        }
        if (name != null) {

        }
        if (name != null) {

        }
        List<String> list = Arrays.asList("a", "b", "c");
        for (String s : list) {

        }

        for (String s : list) {

        }

        for (int i = 0; i < list.size(); i++) {

        }

        Boolean b = true;

        if (!b){

        }

        if (!b) {

        }

        //return name;
    }

    @Test
    public void test02(){
        try {
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println("有异常");
        }
    }

    @Test
    public void test03() throws Exception{
            System.out.println(1/0);
    }

    @Test
    public void test04(){
        Book book = new Book("剑来", "1");
        Book book1 = Book.builder().name("雪中悍刀行").number("1").build();
        System.out.println(book);
        System.out.println(book1);
    }

}
