package com.libraryTest.library.nomal;

public class RspResult {

    public int result(String userInput, String pcChoice) {
        int result; // 0 = 패배, 1 = 승리, 2 = 무승부

        if (userInput.equals(pcChoice)) {
            result = 2;
        } else {
            if (userInput.equals("가위") && pcChoice.equals("보")) {
                result = 1;
            } else if (userInput.equals("바위") && pcChoice.equals("가위")) {
                result = 1;
            } else if (userInput.equals("보") && pcChoice.equals("바위")) {
                result = 1;
            } else {
                result = 0;
            }
        }

        return result;
    }
}