package com.string;

import org.junit.Test;

public class StringTest {

    //intern
    @Test
    public void test01(){

        String s1 = "syl";
        System.out.println(s1.intern());

        String s2 = "syl";
        System.out.println(s2.intern());

        System.out.println(s1.intern()==s2);

        String s3 = new String("syl");
        System.out.println(s3);
        System.out.println(s3.intern()==s2);

        String s4 = new String("syl");
        System.out.println(s4);
        System.out.println(s4.intern()==s3);

    }
}
