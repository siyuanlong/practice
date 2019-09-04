package com.lombok;

import com.domain.Book;

public class Test02 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setName("剑来");
        book.setNumber("001");
        System.out.println(book);
    }
}
