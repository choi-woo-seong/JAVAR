package basic.arrayTest;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 4;
        nums[1] = 5;
        //nums[2] = ;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        //advased for구문
        for (int x : nums) {
            System.out.println(x);
        }
    }
}
