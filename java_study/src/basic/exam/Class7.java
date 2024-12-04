package basic.exam;

import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
//        문제7. 두 정수 A와 B를 입력받은 다음, 두 수 A와 B 사이의 모든 정수값을 더해
//        출력하는 프로그램을 작성하시오.
//
//                - 입력(intA, intB) (A > 0, B < 10)
//
//        - 예제 입력 1(input_2.txt)
//                2 7
//
//                - 예제 입력 1(input_2.txt)
//                7 2
//
//                - 출력
//        27
        Scanner scanner = new Scanner(System.in);

        int intA = scanner.nextInt();
        int intB = scanner.nextInt();
        int result = 0;

        if(intA < intB) {
            for (int i = intA; i <= intB; i++) {
                result += i;
            }
        }else{
            for (int i = intB; i <= intA; i++) {
                result += i;
            }
        }
        System.out.println(result);


    }
}
