package basic.myPagage;

public class OperationEx02 {
    public static void main(String[] args) {
        //상수선언(final = 마지막으로 선언해서 아무도 바꾸지 못하는 수, 상수라서 변수명을 대문자로 표기함.)
//        final double PI = 3.14;
//        PI = 4;

        int a = 10;
        long b = 20;

        System.out.println(a + b);

        //b의 값을 5로 바꾸고 a와b를 곱해서 출력하라

        b = 5;

        long x = a * b;

        System.out.println("a * b = " + x);

        //a 나누기 b 결과를 result에 담아서 출력

        long result = a / b;

        System.out.println("a / b = " + result);

        //numberA = 3 , numberB = 7 3을 7로 나눈 나머지를 구합니다. 결과를 answer에 담아서 "3을 7로 나눈 나머지는? 3 입니다."
        int numberA = 3;
        int numberB = 7;

        int answer = numberA % numberB;

        System.out.println("3을 7로 나눈 나머지는? " + answer + "입니다.");

//        int q =100;
//        int w = 3;
//        int num; //몫
//        int num2; //나머지
//
//        num = q / w;
//
//        if(num * q == w){ //나머지가 0일경우
//            num2 = 0;
//        }else if(num != 0 && num * q < w){// 몫이 0이 아니고
//            num2 = (num * q) - w;
//        }else if(num != 0 && num * w < q){// 몫이 0이 아니고
//            num2 =  q - (num * w) ;
//        }else if(num == 0 ){
//            num2 = q;
//        }else{
//            num2 = 0;
//        }
//
//        System.out.println(q);
//        System.out.println(w);
//        System.out.println(num);
//        System.out.println(num2);
    }
}
