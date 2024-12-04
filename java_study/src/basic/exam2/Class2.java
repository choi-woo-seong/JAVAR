package basic.exam2;

import java.util.Arrays;
import java.util.Random;

public class Class2 {
    public static void main(String[] args) {
//        주사위 두 개를 36,000번 던져서 나오는 모든 경우의 수를 계산하는 프로그램을 작성하세요.
//                주사위 각각은 1부터 6까지의 정수값을 표시할 수 있으므로 합계는 2부터 12까지입니다.
        //2 : 1026 (0.028500)
        Random rendom = new Random();
        int[] TotalSumDice = new int[13];

        for(int i=0; i <= 36000; i++){
            int Dice = rendom.nextInt(6)+1;
            int Dice2 = rendom.nextInt(6)+1;
            int SumDice = Dice + Dice2;

            TotalSumDice[SumDice]++;
        }

        for(int i = 2; i <= 12; i++){
            System.out.println(i + " : " + TotalSumDice[i] + " (" + ((double)36000 / TotalSumDice[i]) / 1000  + ")");
        }
    }
}
