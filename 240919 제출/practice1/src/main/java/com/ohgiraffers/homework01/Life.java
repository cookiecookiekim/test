package com.ohgiraffers.homework01;

import java.util.Scanner;

public class Life {

    private String name;
    private int hp;
    private int mp;

    Walk walk = new Walk();
    Eat eat = new Eat();
    Sleep sleep = new Sleep();
    Scanner scr = new Scanner(System.in);

    public void Sponge () {

        this.name = "스폰지밥";
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        this.hp = 50;
        this.mp = 50;
        back(this.name, this.hp, this.mp);
    }
    public void Squid () {

        this.name = "징징이";
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        this.hp = 40;
        this.mp = 60;
        back(this.name, this.hp, this.mp);
    }
    public void ddoong () {

        this.name = "뚱이";
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        this.hp = 80;
        this.mp = 20;
        back(this.name, this.hp, this.mp);
    }
    public void ping () {

        this.name = "핑핑이";
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        this.hp = 30;
        this.mp = 70;
        back(this.name, this.hp, this.mp);
    }
    public void ming () {

        this.name = "밍밍이";
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        this.hp = 30;
        this.mp = 70;
        back(this.name, this.hp, this.mp);

    }

    public void back (String name, int hp, int mp) {

        System.out.println(this.name + "의 HP = " + this.hp + " MP = " + this.mp);
        System.out.print("이제 뭘 할까요? : ");
        int sc = scr.nextInt();
        switch (sc) {
            case 2 :
                walk.Recover();
                break;
            case 3 :
                System.out.print("게살버거 먹기(1번) / 콜라 마시기(2번) : ");
                int scr2 = scr.nextInt();
                if (scr2 == 1) {
                    eat.bugger();
                } else if (scr2 == 2) {
                    eat.coke();
                } else {
                    System.out.println("으아 뭘 넣을ㄹ까");
                }
                break;
            case 4 :
                sleep.deepSleep();
                break;
            default :


        }
    }

}
