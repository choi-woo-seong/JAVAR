package basic.exam;

import java.util.Scanner;

public class Class14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1 == num2 && num2 == num3){
            int equalnum;
            if(num1 == num2){
                equalnum = num1;
            }else if(num1 == num3){
                equalnum = num3;
            }else{
                equalnum = num3;
            }
            System.out.println(10000 + equalnum * 1000);
        }else if(num1 == num2 || num1 == num3 || num2 == num3){
            int equalnum;
            if(num1 == num2){
                equalnum = num1;
            }else if(num1 == num3){
                equalnum = num3;
            }else{
                equalnum = num3;
            }
            System.out.println(1000 + equalnum * 100);
        }else{
            int maxnum;
            if(num1 >= num2 && num1 >= num3) {
                maxnum = num1;
            }else if(num2 >= num1 && num2 >= num3){
                maxnum = num2;
            }else{
                maxnum = num3;
            }
            System.out.println(maxnum * 100);
        }


    }
}
