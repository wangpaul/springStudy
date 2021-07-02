package com.atguigu;

/**
 * @author wzz
 * @version V1.0
 * @date 2021/7/1 10:51
 */
public class Book {
    private String author;
    private String bookName;

    public Book(String author, String bookName) {
        this.author = author;
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
