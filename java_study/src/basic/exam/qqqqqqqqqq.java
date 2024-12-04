package basic.exam;

import java.util.Arrays;

public class qqqqqqqqqq {
    public static void main(String[] args) {
        String[] str = new String[6];
        String[] str2 = new String[6];
        boolean n = true;
        while(n) {
            int idx = 0;
            for(int j = 0; j <= 5; j++) {
                str[j] = Arrays.toString(new String[]{Integer.toString((int)(Math.random()*46))});

                if(str[j].indexOf("[0]") >= -1) {
                    idx = str[j].indexOf("[0]");
                    System.out.println(str[j].indexOf("[0]"));
                }


//                if(str[j].equals("[0]")) {
//                    continue;
//                }

                if(idx > 0) {
                    for (int e = 0; e <= idx; e++) {
                        str[idx] = Arrays.toString(new String[]{Integer.toString((int) (Math.random() * 46))});
                    }
                }

                str2[j] = str[j];

            }

            if(Arrays.stream(str).count() == 6) n = false;

        }
        for(int i = 0 ; i <= 5; i++){
            System.out.println(str2[i]);
        }
    }
}
