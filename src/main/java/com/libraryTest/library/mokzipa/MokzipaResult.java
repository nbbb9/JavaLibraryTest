package com.libraryTest.library.mokzipa;

public class MokzipaResult {

    /**
     * 묵찌빠 결과 계산
     * @param userInput
     * @param pcChoice
     * @return
     */
    public int mokzipaResult(String userInput, String pcChoice){
        int result; // 0 = 패배, 1 = 승리, 2 = 무승부

        if (userInput.equals(pcChoice)){
            result = 2;
        } else {
            if (userInput.equals("묵") && pcChoice.equals("찌")){
                result = 1;
            } else if (userInput.equals("빠") && pcChoice.equals("묵")){
                result = 1;
            } else if (userInput.equals("찌") && pcChoice.equals("빠")){
                result = 1;
            } else {
                result = 0;
            }
        }

        return result;
    }

}