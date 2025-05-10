package com.libraryTest.library.minusOne;

import com.libraryTest.library.nomal.RspResult;

import java.util.*;

public class MinusOne {

    private static final RspResult rsp = new RspResult();
    private static final List<String> RSP_CHOICES = Arrays.asList("가위", "바위", "보");

    public void minusOneRSP() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("|------------------------------|");
        System.out.println("          <하나빼기>");
        System.out.println("         <첫번째 선택>");
        System.out.println("'가위' '바위' '보' 중에 첫번째를 입력하세요");

        String userInput1 = getUserChoice(sc, RSP_CHOICES);

        // 첫 번째 선택을 뺀 나머지
        List<String> secondChoices = new ArrayList<>(RSP_CHOICES);
        secondChoices.remove(userInput1);

        System.out.println("         <두번째 선택>");
        System.out.printf("%s 중에 두번째를 입력하세요%n", secondChoices);

        String userInput2 = getUserChoice(sc, secondChoices);

        System.out.println("|------------------------------|");

        // PC 선택: 서로 다른 2개
        String pcChoice1 = RSP_CHOICES.get(random.nextInt(RSP_CHOICES.size()));
        List<String> pcRemaining = new ArrayList<>(RSP_CHOICES);
        pcRemaining.remove(pcChoice1);
        String pcChoice2 = pcRemaining.get(random.nextInt(pcRemaining.size()));
        String pcFinal = random.nextBoolean() ? pcChoice1 : pcChoice2;

        // 1차 결과 출력
        System.out.printf("PC의 선택: %s , %s%n", pcChoice1, pcChoice2);
        System.out.printf("사용자의 선택: %s , %s%n", userInput1, userInput2);

        System.out.println("|------------------------------|");
        System.out.printf("%s , %s 중 하나를 선택하세요%n", userInput1, userInput2);

        String userFinalInput = getUserChoice(sc, Arrays.asList(userInput1, userInput2));

        int result = rsp.result(userFinalInput, pcFinal);

        // 최종 결과 출력
        System.out.println("PC의 선택: " + pcFinal);
        System.out.println("사용자의 선택: " + userFinalInput);
        System.out.println("|----------------<결과>---------------|");

        switch (result) {
            case 1 -> System.out.println("승리!");
            case 2 -> System.out.println("무승부");
            default -> System.out.println("패배");
        }
    }

    // 입력 유효성 검사 및 반복 처리 메서드
    private String getUserChoice(Scanner sc, List<String> validChoices) {
        while (true) {
            String input = sc.nextLine().trim();
            if (validChoices.contains(input)) {
                return input;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
    }
}
