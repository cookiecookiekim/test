package com.ohgiraffers.homework01;

public class Walk {

    Attack attack = new Attack();

    private int hp;
    private int mp;

    public void Recover () {

        attack.poison();
        if (hp < 100) {
            hp += 10;
            mp -= 10;

            System.out.println("해파리 공원에 도착하였습니다. 산책을 즐기세요,");
            System.out.println("HP가 10 상승했고, MP가 10 하락했습니다.");
            System.out.println("현재 HP = " + this.hp + " MP = " + this.mp);
        } else {
            System.out.println("풀 컨디션입니다!");
        }


    }

}
