package com.ohgiraffers.finalHomework01;

import java.util.Scanner;

public class Application {

    static Pet pet = new Pet();

    public static void main(String[] args) {

        System.out.println("다마고치 키우기 게임을 시작합니다.");

        System.out.println("===========================================\"");
        int result = selectCharacter();
        if (result == 9) {
            return;
        }

        while (true) {
            System.out.println();
            if (pet.hp < 1) {
                System.out.println(pet.name+ "가 사망했습니다.");
                return;
            } else {
                System.out.println("이제 뭘 할까요? : ");
                System.out.println("2. 해파리 공원 산책하기");
                System.out.println("3. 먹기 (게살버거 : HP 10 상승 / 콜라 : MP 10 상승)");
                System.out.println("4. 잠자기");
                System.out.println("9. 프로그램 종료");
                Scanner scr = new Scanner(System.in);
                int select = scr.nextInt();
                if (select == 9) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                    action(select);
            }
        }
    }


    public static int selectCharacter() {
        Scanner scr = new Scanner(System.in);

        while (true) {
            System.out.print("캐릭터를 선택해 주세요 (1. 스폰지밥 2. 징징이 3. 뚱이 4. 핑핑이 5. 밍밍이) : ");
            int chose = scr.nextInt();

            switch (chose) {
                case 1:
                    SpongeBob spongeBob = new SpongeBob();
                    spongeBob.Introduce();
                    pet = spongeBob;
                    break;
                case 2:
                    Squid squid = new Squid();
                    squid.Introduce();
                    pet = squid;
                    break;
                case 3:
                    Ddoong ddoong = new Ddoong();
                    ddoong.Introduce();
                    pet = ddoong;
                    break;
                case 4:
                    Pingping ping = new Pingping();
                    ping.Introduce();
                    pet = ping;
                    break;
                case 5:
                    Mingming ming = new Mingming();
                    ming.Introduce();
                    pet = ming;
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return 9;
                default:
                    System.out.println("잘못 누르셨습니다. 1~5번 중에 선택해 주세요.");
                    break;
            }
            return 0;
        }
    }


    public static void action(int select) {



        switch (select) {
            case 2:
                pet.walk();
                break;
            case 3 :
                while (true) {
                    System.out.print("게살버거 먹기(1번) / 콜라 마시기(2번) : ");
                    Scanner scr2 = new Scanner(System.in);
                    int menu = scr2.nextInt();

                    if (menu == 1 || menu == 2) {
                        String abc = pet.eat(menu);
                        System.out.println(abc);
                        return;
                    } else {
                        System.out.println("1번과 2번중 골라주세요.");
                    }
                }
            case 4 :
                pet.deepSleep();
                break;
            case 9 :

            default:
                System.out.println();
        }
    }
}
