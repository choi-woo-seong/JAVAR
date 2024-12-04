package basic.exam;

public class Class4 {
    public static void main(String[] args) {
//        문제4. 임의의 값 n이 주어지면
//        예를들어 n=5이면
//        1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
//        의 결과를 출력하세요.
        int n = 5;
        int totalsum = 0;

        for(int i = 1 ; i <= n; i++){
            int result = 0; //두번째 for문에서 누적 출력된 결과를 초기화
            for(int j = 1 ; j <= i; j++){
                result += j;
            }
            totalsum += result ;// 누적된 결과를 저장.
        }

        System.out.println(totalsum);
    }
}
