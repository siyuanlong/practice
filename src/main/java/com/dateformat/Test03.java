package com.dateformat;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {
    /*public static void main(String[] args) {
        Date date = getNowDate();
        System.out.println(date);
    }*/

    public static void main(String[] args) {
        Date nowDate = getNowDate();
        System.out.println(nowDate);
    }

    public static String getStringDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        return dateString;
    }

    public static Date getNowDate() {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        ParsePosition pos = new ParsePosition(8);
        Date currentTime_2 = formatter.parse(dateString, pos);
        return currentTime_2;
    }
}
