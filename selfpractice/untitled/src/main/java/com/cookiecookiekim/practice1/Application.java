package com.cookiecookiekim.practice1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        BookRental bookRental = new BookRental();

        UserDTO user = bookRental.userManagement();
        BookDTO book = bookRental.bookManagement();
        bookRental.showBookProperty(user, book);

    }
}
