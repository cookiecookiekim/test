package com.ohgiraffers.homework01;

import java.time.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Life life = new Life();
        Scanner scr = new Scanner(System.in);
        Walk walk = new Walk();

        System.out.println("다마고치 키우기 게임을 시작합니다.");
        System.out.println("1. 캐릭터 선택 (1. 스폰지밥 2. 징징이 3. 뚱이 4. 핑핑이 5. 밍밍이)");
        System.out.println("2. 산책하기");
        System.out.println("3. 먹기");
        System.out.println("4. 잠자기");
        System.out.println("9. 프로그램 종료");
        System.out.println("===========================================\"");

        while (true) {
            System.out.print("캐릭터를 선택해 주세요 : ");
            int chose = scr.nextInt();

            if (chose == 1) {
                System.out.print("1. 스폰지밥 2. 징징이 3. 뚱이 4. 핑핑이 5. 밍밍이 : ");
                int chose2 = scr.nextInt();
                switch (chose2) {
                    case 1:
                        life.Sponge();
                        break;
                    case 2:
                        life.Squid();
                        walk.Recover();
                        break;
                    case 3:
                        life.ddoong();
                        walk.Recover();
                        break;
                    case 4:
                        life.ping();
                        walk.Recover();
                        break;
                    case 5:
                        life.ming();
                        walk.Recover();
                        break;
                    default:
                        System.out.println("잘못 누르셨습니다. 1~5번 중에 선택해 주세요.");
                        break;
                }
            } else if (chose == 9) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.println("캐릭터 선택(1)부터 해주세요.");
            }
        }
    }
}
