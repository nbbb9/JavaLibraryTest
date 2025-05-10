package com.libraryTest.library.mokzipa;

import java.util.Random;
import java.util.Scanner;

public class Mokzipa {

    private static final MokzipaResult rsp = new MokzipaResult();

    public void mokzipaRSP() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("|------------------------------|");
        System.out.println("           <묵찌빠>");
        System.out.println("'묵' '찌' '빠' 중에 하나를 입력하세요");

        String userInput;

        while (true) {
            userInput = sc.nextLine();
            if (userInput.equals("묵") || userInput.equals("찌") || userInput.equals("빠")) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        System.out.println("|------------------------------|");

        // PC의 선택 (랜덤)
        String[] pcChoices = {"묵", "찌", "빠"};
        String pcChoice = pcChoices[random.nextInt(pcChoices.length)];

        int result = rsp.mokzipaResult(userInput, pcChoice);

        // 결과 출력
        System.out.println("PC의 선택: " + pcChoice);
        System.out.println("사용자의 선택: " + userInput);

        System.out.println("|----------------<결과>---------------|");

        if (result == 1) {
            System.out.println("승리!");
        } else if (result == 2) {
            System.out.println("무승부. 다시 시작");
            mokzipaRSP();
        } else {
            System.out.println("패배");
        }


    }


}