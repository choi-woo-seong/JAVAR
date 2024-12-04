package basic.condition;

public class BreakCondition {
    public static void main(String[] args) {
        int sum = 0;

        for(int i = 1; i <= 10; i++){
            if( i == 5 ){
                return;//break = for문 멈추기, continue = 건너뛰기, return = 현재 프로그램을 종료
            }
            sum = sum + i;
        }
        System.out.println("sum : " + sum);
    }
}
