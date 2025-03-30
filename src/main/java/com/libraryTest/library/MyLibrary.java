    package com.libraryTest.library;

    import java.util.Scanner;

    public class MyLibrary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 안내 문구 출력
            System.out.println("|--------------------------------|");
            System.out.println("   <가위바위보 라이브러리 테스트>");
            System.out.println("1. 일반 가위바위보");
            System.out.println("2. 묵찌빠");
            System.out.println("3. ");

            // 입력 받기
            String input = sc.nextLine();

            // 입력값 출력
            System.out.println("입력한 값: " + input);

            sc.close(); // Scanner 닫기
        }
    }