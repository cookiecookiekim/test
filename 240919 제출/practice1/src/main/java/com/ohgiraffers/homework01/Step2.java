package com.ohgiraffers.homework01;

public class Step2 extends Life {

    public void nextStep (String name, int hp, int mp) {

        Walk walk = new Walk();
        Eat eat = new Eat();
        Sleep sleep = new Sleep();

        System.out.println(this.name + "의 HP = " + this.hp + " MP = " + this.mp);
        System.out.println();

        System.out.print("이제 뭘 할까요? : ");
        int sc = scr.nextInt();
        switch (sc) {
            case 2 :
                walk.Recover();
                break;
            case 3 :
                while (true) {
                    System.out.print("게살버거 먹기(1번) / 콜라 마시기(2번) : ");
                    int scr2 = scr.nextInt();

                    if (scr2 == 1) {
                        eat.bugger();
                    } else if (scr2 == 2) {
                        eat.coke();
                    } else {
                        System.out.println("1번과 2번중 골라주세요.");
                        break; // (이제 뭘 할까요? 로 무한 루프 돌게 하려면...)
                    }
                } break;
            case 4 :
                sleep.deepSleep();
                break;
            default :
                System.out.println("2 ~ 4 번 중 골라주세요.");
        }
    }

}
