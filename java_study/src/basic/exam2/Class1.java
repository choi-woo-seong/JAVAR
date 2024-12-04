package basic.exam2;

public class Class1 {
    public static void main(String[] args) {
//        문제 1. 최댓값과 인덱스찾기
//
//        9개의 서로 다른 자연수
//        3, 29, 38, 12, 57, 74, 40, 85, 61
//        가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째
//        수인지를 구하는 프로그램을 작성하시오.
//
//        이 주어지면, 이들 중
//        최댓값은 85이고, 이 값은 8번째 수이다.
//        최솟값은 3이고, 이 값은 1번째 수이다.
        int[] nums = {3 ,29, 38, 12, 57, 74, 40, 85, 61};
        int MaxNum = nums[0];
        int MinNum = nums[0];
        int MaxIndexNum = 0;
        int MinIndexNum = 0;

        for(int i = 0 ; i < nums.length; i++){
//            if(i == 8){
//                continue;
//            }
            if(nums[i] > MaxNum) {
                MaxNum = nums[i];
                MaxIndexNum = i;
            }

            if(nums[i] < MinNum){
                MinNum = nums[i] ;
                MinIndexNum = i;
            }
        }
        System.out.println("최댓값은 " + MaxNum + ", 이 값은 " + (MaxIndexNum+1) +"번째 수이다.");
        System.out.println("최솟값은 " + MinNum + ", 이 값은 " + (MinIndexNum+1) +"번째 수이다.");

    }
}
