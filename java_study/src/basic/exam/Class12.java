package basic.exam;

import java.util.Scanner;

public class Class12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        final int num2 = 60;
        final int num3 = 24;

        int num = 45;

        int hh = scanner.nextInt();
        int mm = scanner.nextInt();


        int mfhh;
        int mfmm = num2 + mm - num;

        if(hh == 0) {
            mfhh = num3 - 1;
        }else{
            mfhh = hh - 1;
        }

        System.out.print(mfhh + ":" + mfmm);
    }
}
