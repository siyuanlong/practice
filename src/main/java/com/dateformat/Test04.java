package com.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String dateStr = sdf.format(date);
        System.out.println(dateStr);
        Date mydate = sdf.parse(dateStr);
        System.out.println(mydate);
    }
}
