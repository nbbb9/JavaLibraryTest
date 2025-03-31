package com.libraryTest.library;

import java.util.Scanner;

public class MyLibrary {

    private static final nomal nomal = new nomal(); // 정적 필드로 선언

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 안내 문구 출력
        System.out.println("|------------------------------|");
        System.out.println("   <가위바위보 라이브러리 테스트>");
        System.out.println("    1. 일반");
        System.out.println("    2. 묵찌빠");
        System.out.println("    3. 하나 빼기");

        String input;

        while (true) {
            input = sc.nextLine();
            if (input.equals("1") || input.equals("2") || input.equals("3")) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        System.out.println("|------------------------------|");

        if (input.equals("1")) {
            nomal.nomalRSP();
        } else if (input.equals("2")) {
            System.out.println("묵찌빠 실행 (구현 필요)");
        } else if (input.equals("3")) {
            System.out.println("하나 빼기 실행 (구현 필요)");
        }

        sc.close();
    }
}