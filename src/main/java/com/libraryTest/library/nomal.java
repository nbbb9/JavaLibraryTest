package com.libraryTest.library;

import java.util.Random;
import java.util.Scanner;

public class nomal {

    private static final RspResult rsp = new RspResult();

    public void nomalRSP() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("|----------------------------------|");
        System.out.println("           <일반 가위바위보>");
        System.out.println("'가위' '바위' '보' 중에 하나를 입력하세요");

        String userInput;

        while (true) {
            userInput = sc.nextLine();
            if (userInput.equals("가위") || userInput.equals("바위") || userInput.equals("보")) {
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

        System.out.println("|----------------------------------|");

        // PC의 선택 (랜덤)
        String[] pcChoices = {"가위", "바위", "보"};
        String pcChoice = pcChoices[random.nextInt(pcChoices.length)];

        int result = rsp.result(userInput, pcChoice);

        // 결과 출력
        System.out.println("PC의 선택: " + pcChoice);
        System.out.println("사용자의 선택: " + userInput);

        System.out.println("|----------------<결과>---------------|");
        if (result == 1) {
            System.out.println("승리!");
        } else if (result == 2) {
            System.out.println("무승부");
        } else {
            System.out.println("패배");
        }
    }
}