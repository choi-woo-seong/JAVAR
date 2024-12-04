package basic.exam;

import java.util.Scanner;

public class Class8 {
    public static void main(String[] args) {
//        문제 8. 별찍기
//
//                - 문제
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//                - 입력
//        정수로 출력할 줄 수를 입력받는다.
//
//                - 출력
//        첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//                - 예제입력
//        5
//
//                - 예제출력
//                *
//                **
//                ***
//                ****
//                *****
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = 1 ; i <= num ; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
