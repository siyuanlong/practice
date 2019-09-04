package com.calendar;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    @Test
    public void test01(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR_OF_DAY,12);
        Date time = calendar.getTime();
        System.out.println(time);
    }
}
