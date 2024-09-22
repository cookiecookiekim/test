package com.cookiecookiekim.practice1;

import java.awt.print.Book;
import java.util.Scanner;

public class BookRental {

    Scanner scr = new Scanner(System.in);

    public UserDTO userManagement () { // 회원 관리 메서드

        System.out.print("회원 번호를 입력해 주세요 : ");
        int num = scr.nextInt();
        System.out.print("회원 나이를 입력해 주세요 : ");
        int age = scr.nextInt();
        scr.nextLine();
        System.out.print("회원 이름을 입력해 주세요 : ");
        String name = scr.nextLine();
        UserDTO user = userSetting(num, age, name);
        return user;
    }

    public BookDTO bookManagement () {

        System.out.print("책 번호를 입력해 주세요 : ");
        int num = scr.nextInt();
        System.out.print("책 가격을 입력해 주세요 : ");
        int price = scr.nextInt();
        scr.nextLine();
        System.out.print("책 이름을 입력해 주세요 : ");
        String bookName = scr.nextLine();

        BookDTO book = bookSetting(num, price, bookName);
        return book;
    }

    public UserDTO userSetting (int num, int age, String name) {
        UserDTO user = new UserDTO();
        user.setUserAge(age);
        user.setUserNumber(num);
        user.setUserName(name);

        return user;
    }

    public BookDTO bookSetting (int num, int price, String bookName) {
        BookDTO book = new BookDTO();
        book.setBookNumber(num);
        book.setBookPrice(price);
        book.setBookName(bookName);

        return book;
    }

    public void showBookProperty (UserDTO user, BookDTO book) { // 마지막 출력 구문
        System.out.println("번호 : " + user.getUserNumber()+ " 의 이름은 : " + user.getUserName() + " 이고, 나이는 " + user.getUserAge() +
                " 이며, 책 번호는 " + book.getBookNumber() + " 이며, 책 이름은 " + book.getBookName() +
                " 이고, 책의 가격은 " + book.getBookPrice() + " 입니다.");

    }

}