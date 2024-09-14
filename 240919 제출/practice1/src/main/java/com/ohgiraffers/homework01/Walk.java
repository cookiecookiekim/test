package com.ohgiraffers.homework01;

public class Walk {

    private int hp;
    private int mp;

    public void Recover () {

        if (hp < 100) {
            hp += 10;
            mp -= 10;

            System.out.println("HP가 10 상승했고, MP가 10 하락했습니다.");
            System.out.println("현재 HP = " + this.hp + " MP = " + this.mp);
        } else {
            System.out.println("풀 컨디션입니다!");
        }


    }

}
