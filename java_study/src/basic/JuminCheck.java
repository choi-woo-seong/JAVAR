package basic;

import java.util.Arrays;

public class JuminCheck {
    public static void main(String[] args) {
        int[] jumin = {9,3,0,4,1,5,1,1,7,9,2,1,6};
        //int[] jumin = {7,0,0,9,2,0,2,2,3,1,0,1,2};
        //int[] jumin = {6,7,0,7,1,2,1,5,4,2,9,1,2};

        int[] nums = new int[13];
        int num = 2;
        int num2 = 10;
        int num3 = 11;

        for(int i = 0 ; i <= 7; i++){ // 주민번호 앞 7자리
            nums[i] =  jumin[i] * (num+i);
        }

        for(int i = 8 ; i < 12; i++){ // 주민번호 뒷 5자리
            nums[i] =  jumin[i] * num++;
        }

        int SumNums = Arrays.stream(nums).sum();

        int result = (num3 - ( SumNums % num3)) % num2;

        System.out.println("식별값 :" + result + " 주민번호 끝자리 : " + jumin[12]);
        System.out.println();

        if(result == jumin[12]){
            System.out.println("주민번호 확인이 완료되었습니다.");
        }else{
            System.out.println("알맞지 않은 주민번호 입니다. 주민번호를 확인해주세요.");
        }
    }
}
