package basic.exam;

import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
//        문제 11. 문제 3. 조건문 문제 : 시험성적문제
//
//                - 문제
//        시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B,
//        70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는
//        프로그램을 작성하시오.
//
//        - 입력(input_4.txt)
//        점수는 score 변수로 받는다.
//        시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        score = score / 10;

        switch (score){
            case 10 :
                System.out.println("A");
                break;
            case 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}
