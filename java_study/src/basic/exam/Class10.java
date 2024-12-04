package basic.exam;

import java.util.Scanner;

public class Class10 {
    public static void main(String[] args) {
//        문제 10. 입력받은 구구단 출력하기
//
//                - 문제
//        파일에서 입력받은 수의 구구단 출력.
//
//                - 입력
//        구하고자 하는 구구단의 수를 입력받는다.
//                N(2 ≤ N ≤ 9)이 주어진다.
//
//        - 출력
//        차례대로 구구단을 출력한다.
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for(int i = num; i <= 9 ; i++){
            for(int j = 1 ; j <= 9; j++){
                if( i != num){
                    return;
                }
                System.out.println(i + "*" + j + "=" + i * j);

            }
        }
    }
}
