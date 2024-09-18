package com.ohgiraffers.homework01;

public class Sleep extends Life { // 푹 쉬는 클래스

    public void deepSleep () {

        if (hp < 100 && mp < 100) {
            hp += 100;
            mp += 100;
            System.out.println(name + "의 체력과 기력이 모두 회복 되었습니다.");

        } else if (hp >= 100) {
            System.out.println("이미 체력이 100입니다. 기력만 회복합니다.");
            mp += 100;
        } else {
            System.out.println("이미 기력이 100입니다. 체력만 회복합니다.");
            hp += 100;
        }

        System.out.println("현재 HP = " + this.hp + " MP = " + this.mp);
        // 이제 뭘 할까요 창으로 넘어가야..
    }
}
