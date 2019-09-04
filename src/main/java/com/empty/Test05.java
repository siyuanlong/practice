package com.empty;

import org.springframework.util.StringUtils;

public class Test05 {
    public static void main(String[] args) {
        boolean b = StringUtils.isEmpty(null);
        System.out.println(b);
    }
}
