package com.ohgiraffers.homework01;

public class Eat extends Life { // 체력, 기력 보충 클래스

    public String bugger () {

        if (hp < 100) {
            this.hp += 10;
            System.out.println("게살버거를 섭취합니다 (HP 10 상승)");
        } else {
            System.out.println("이미 체력이 100입니다.");
        }

        return "현재 HP는" + this.hp + "이고, MP는" + this.mp + "입니다.";
    }

    public String coke () {

        if (mp < 100) {
            this.mp += 10;
            System.out.println("콜라를 마십니다 (MP 10 상승)");
        } else {
            System.out.println("이미 기력이 100입니다.");
        }

        return "현재 HP는" + this.hp + "이고, MP는" + this.mp + "입니다.";
    }
}
