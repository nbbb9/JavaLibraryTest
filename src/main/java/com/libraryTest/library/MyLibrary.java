package com.libraryTest.library;

import com.libraryTest.library.minusOne.MinusOne;
import com.libraryTest.library.mokzipa.Mokzipa;
import com.libraryTest.library.nomal.Nomal;
import java.util.Scanner;

public class MyLibrary {

    private static final Nomal nomal = new Nomal();
    private static final Mokzipa mokzipa = new Mokzipa();
    private static final MinusOne minusOne = new MinusOne();

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

        if (input.equals("1")) {
            nomal.nomalRSP();
        } else if (input.equals("2")) {
            mokzipa.mokzipaRSP();
        } else {
            minusOne.minusOneRSP();
        }

        sc.close();
    }
}