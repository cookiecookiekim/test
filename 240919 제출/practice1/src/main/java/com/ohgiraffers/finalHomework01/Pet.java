package com.ohgiraffers.finalHomework01;

import java.util.Random;
import java.util.Scanner;

public class Pet { // Pet 클래스를 (어미), 나머지 캐릭터 클래스를 상속함.

    public int hp;
    public int mp;
    public String name;

    public void selected() { // 처음 캐릭터 선택 시 호출 구문
        System.out.println(this.name + "을(를) 선택하셨습니다.");
        System.out.println(this.name + "의 HP는 " + hp + "이고, MP는 " + mp + " 입니다.");
    }


    public void walk () { // 산책

        if (hp < 100) {
            hp += 10;
            mp -= 10;

            System.out.println("산책으로 인해 HP가 10 상승했고, MP가 10 하락했습니다.");
            System.out.println("현재 HP = " + this.hp + " MP = " + this.mp);
        } else {
            System.out.println("풀 컨디션입니다!");
        }

        poison();

    }

    public void deepSleep () { // 수면

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

        if (hp > 99) { // 총 HP 100으로 제한
            hp = 100;
        }
        if (mp > 99) { // 총 MP 100으로 제한
            mp = 100;
        }
        System.out.println("현재 HP = " + this.hp + " MP = " + this.mp);
    }


     public String eat (int menu) {

        String menuName = "";
         if (menu == 1) {
             menuName = "게살버거";
             if (hp < 100) {
                 this.hp += 10;
                 System.out.println(menuName + "를 섭취합니다 (HP 10 상승)");
             } else {
                 System.out.println("이미 체력이 100입니다.");
             }
         } else if (menu == 2) {
             menuName = "콜라";
             if (mp < 100) {
                 this.mp += 10;
                 System.out.println(menuName + "를 마십니다 (MP 10 상승)");
             } else {
                 System.out.println("이미 기력이 100입니다.");
             }
         }

        return menuName + "를 섭취했습니다. 현재 HP는" + this.hp + "이고, MP는" + this.mp + "입니다."; // void 형이 아니기 때문에 String 값 return;
     }

    public void poison () { // 해파리 공격
        Random random = new Random();
        int ran = random.nextInt(2); // 산책 시 50퍼센트 확률로 해파리 공격 당함.

        switch (ran) {
            case 1 :
                System.out.println("해파리에게 공격 당했습니다. HP가 30 감소합니다.");
                hp -= 30;
                System.out.println("현재 HP = " + hp + " MP = " + mp);
                break;
            default :
                System.out.println("다행히 해파리는 당신을 인식하지 못했습니다.");
        }

    }

}
