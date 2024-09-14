package com.ohgiraffers.homework01;

import java.util.Random;

public class Attack {

    private int hp;
    private int mp;

    Random random = new Random();
    int ran = random.nextInt(3);

    public void poison () {

        switch (ran) {
            case 1 :
                System.out.println("해파리에게 공격 당했습니다. HP가 10 감소합니다.");
                System.out.println("현재 HP = " + hp + " MP = " + mp);
                break;

        }

    }
}
