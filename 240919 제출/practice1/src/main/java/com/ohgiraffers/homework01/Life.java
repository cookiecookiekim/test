package com.ohgiraffers.homework01;

import java.util.Scanner;

public class Life {

    public String name;
    public int hp;
    public int mp;

    // Step2 step2 = new Step2();

    public void Sponge () {
        this.name = "스폰지밥";
        this.hp = 50;
        this.mp = 50;
        selectLog();
    }
    public void Squid () {
        this.name = "징징이";
        this.hp = 40;
        this.mp = 60;
        selectLog();
    }
    public void ddoong () {
        this.name = "뚱이";
        this.hp = 80;
        this.mp = 20;
        selectLog();
    }
    public void ping () {
        this.name = "핑핑이";
        this.hp = 30;
        this.mp = 70;
        selectLog();
    }
    public void ming () {
        this.name = "밍밍이";
        this.hp = 30;
        this.mp = 70;
        selectLog();

    }
    private void selectLog() {
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        // step2.nextStep(this.name, this.hp, this.mp);
    }

}
