package com.ljy.learn.iterator;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 夕
 * @date 2019/5/17
 */

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBooks(new Book("test1"));
        bookShelf.appendBooks(new Book("test2"));
        bookShelf.appendBooks(new Book("test3"));
        bookShelf.appendBooks(new Book("test4"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
