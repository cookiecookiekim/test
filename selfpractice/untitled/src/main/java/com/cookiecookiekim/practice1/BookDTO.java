package com.cookiecookiekim.practice1;

public class BookDTO {


    String bookName; // 책 이름
    int bookPrice; // 책 가격
    int bookNumber; // 책 번호

    public BookDTO () {}

    public void bookDTO () {
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookNumber = bookNumber;
    }


    public String getBookName() {
        return bookName;
    }


    public int getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

}
