package basic.exam2;

public class Class3 {
    public static void main(String[] args) {
//        제 3. 선택(Selection) 정렬
//
//                - 선택정렬은 매 단계에서 가장 작은 원소를 선택해서 앞으로 보냄
//        - 앞으로 보내진 원소는 더 이상 위치가 변하지 않는다.
//                - 시간복잡도 O(N^2)로 비효율적 정렬 알고리즘 중 하나.
//
//※ 동작방식
//ⓐ 각 단계에서 가장 작은 원소를 선택
//ⓑ 현재까지 처리되지 않은 원소들 중 가장 앞의 원소와 교체
//
//        예> 4 1 2 5 3
//        1단계 : 1 4 2 5 3
//        2단계 : 1 2 4 5 3
//        3단계 : 1 2 3 5 4
//        4단계 : 1 2 3 4 5
        int[] nums = {4,1,2,5,3};
        int num;

//        num = nums[0];
//        nums[0] = nums[1];
//        nums[1] = num;

        for(int i = 0; i < nums.length; i++){
            num = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = num;
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        num = 0;

        num = nums[1];
        nums[1] = nums[2];
        nums[2] = num;

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        num = 0;

        num = nums[2];
        nums[2] = nums[3];
        nums[3] = num;

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        num = 0;

        num = nums[3];
        nums[3] = nums[4];
        nums[4] = num;

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        num = 0;

        num = nums[2];
        nums[2] = nums[3];
        nums[3] = num;

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        num = 0;

        num = nums[3];
        nums[3] = nums[4];
        nums[4] = num;

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
