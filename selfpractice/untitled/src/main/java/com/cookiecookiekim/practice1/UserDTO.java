package com.cookiecookiekim.practice1;

public class UserDTO {
    String userName; // 회원 이름
    int userNumber; // 회원 번호
    int userAge; // 회원 나이

    public UserDTO () {

    }

    public void userDTO () {

        this.userName = userName;
        this.userNumber = userNumber;
        this.userAge = userAge;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

}
