package basic.exam;

import java.util.Scanner;

public class Class13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hh = scanner.nextInt();
        int mm = scanner.nextInt();
        int chh = scanner.nextInt();

        int mfhh;
        int mfmm = 0;

        mfhh = hh;


        if(mm+chh > 60){
           mfhh += (mm+chh) / 60;
           mfmm += (mm+chh) % 60;
        }else{
            mfmm += mm+chh;
        }

        if(mfhh == 24){
            mfhh = 0;
        }

        System.out.print(mfhh + " " + mfmm);
    }
}
