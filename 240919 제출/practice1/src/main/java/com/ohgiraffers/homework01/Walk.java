package com.ohgiraffers.homework01;

public class Walk { // 해파리 동산 산책하는 클래스 (hp +10 , mp -10)(해파리의 공격을 받을 수 있다.)

    Attack attack = new Attack();
    public int hp;
    public int mp;

    public void Recover () {

        attack.poison();
        if (hp < 100) {
            hp += 10;
            mp -= 10;

            System.out.println("산책으로 인해 HP가 10 상승했고, MP가 10 하락했습니다.");
            System.out.println("현재 HP = " + this.hp + " MP = " + this.mp);
        } else {
            System.out.println("풀 컨디션입니다!");
        }
        // 이제 뭘 할까요 창으로 넘어가야..

    }

}
