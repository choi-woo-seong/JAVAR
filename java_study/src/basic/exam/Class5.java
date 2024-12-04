package basic.exam;

import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
//        문제5. money 변수 3780원의 금액이 있습니다.
//                이를 다음과 같은 결과가 나오도록 출력합니다.
//
//
//        1000원 : 3개
//        남은금액 : 780원
//        500원 : 1개
//        남은금액 : 280원
//        100원 : 2개
//        남은금액 : 80원
//        10원 : 8개
//        남은금액 : 0원
        int totalAmount = 3780;  // 시작 금액 (총 3780원)
        int remainingAmount;

        // 1000원짜리 지폐 3개
        remainingAmount = totalAmount - 1000 * 3;
        System.out.println("1000원: 3개");
        System.out.println("남은 금액: " + remainingAmount + "원");

        // 500원짜리 동전 1개
        remainingAmount = remainingAmount - 500;
        System.out.println("500원: 1개");
        System.out.println("남은 금액: " + remainingAmount + "원");

        // 100원짜리 동전 2개
        remainingAmount = remainingAmount - (100 * 2);
        System.out.println("100원: 2개");
        System.out.println("남은 금액: " + remainingAmount + "원");

        // 10원짜리 동전 8개
        remainingAmount = remainingAmount - (10 * 8);
        System.out.println("10원: 8개");
        System.out.println("남은 금액: " + remainingAmount + "원");





    }
}
