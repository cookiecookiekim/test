package com.ohgiraffers.homework01;

import java.util.Random;

public class Attack extends Walk {

    Random random = new Random();
    int ran = random.nextInt(3);

    public void poison () {

        switch (ran) {
            case 1 :
                System.out.println("해파리에게 공격 당했습니다. HP가 10 감소합니다.");
                hp -= 10;
                System.out.println("현재 HP = " + hp + " MP = " + mp);
                break;
            default :
                System.out.println("다행히 해파리는 당신을 인식하지 못했습니다.");
        }
        // 이제 뭘 할까요 창으로 넘어가야..

    }
}
