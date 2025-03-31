package com.libraryTest.library;

public class RspResult {

    public int result(String userInput, String pcChoice) {
        int result; // 0 = 패배, 1 = 승리, 2 = 무승부

        if (userInput.equals("가위")) {
            if (pcChoice.equals("가위")) {
                result = 2;
            } else if (pcChoice.equals("보")) {
                result = 1;
            } else {
                result = 0;
            }
        } else if (userInput.equals("바위")) {
            if (pcChoice.equals("바위")) {
                result = 2;
            } else if (pcChoice.equals("가위")) {
                result = 1;
            } else {
                result = 0;
            }
        } else {
            if (pcChoice.equals("보")) {
                result = 2;
            } else if (pcChoice.equals("바위")) {
                result = 1;
            } else {
                result = 0;
            }
        }

        return result;
    }
}