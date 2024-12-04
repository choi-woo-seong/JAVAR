package basic.condition;

public class DoLoopTest {
    public static void main(String[] args) {
        //While - ~하는동안
        //Do(해라) ~ While (~하는동안)
        //While 구문
        int i = 1;
        int sum = 0;
        while (i <= 10){
            sum = sum + i;
            i = i + 1;
            System.out.println(i + "출력");
        }

        i = 1;
        sum = 0;
        do {
            sum = sum + i;
            i = i + 1;
        } while (i <= 10);

        System.out.println(sum);

    }
}
