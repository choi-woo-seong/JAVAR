package basic.condition;

public class CompareNumber {
    public static void main(String[] args) {

        int A = 4;
        int B = 7;
        String testString = "";
        String nullString = null;
        int temp = 0;

        System.out.println("A = " + A + "," + "B = " + B);

        if(A < B){
            temp = A;
            A = B;
            B = temp;
        }

        System.out.println("A = " + A + "," + "B = " + B);
    }
}
