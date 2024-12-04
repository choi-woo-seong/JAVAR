package basic;

// Class = beans = 콩껍데기
class ChoiWooSeong{
    static String address = "안양";
    String name = "최우성";
    int age = 20;
    boolean smart = false;
}

public class VariableScope {

    // static 변수 및 함수는 프로그램 전체에서 사용 가능하다.
    static int b = 4;

    public static void main(String[] args) {
        int a= 3;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
//        System.out.println(ChoiWooSeong.name);
//        System.out.println(ChoiWooSeong.age);
//        System.out.println(ChoiWooSeong.smart);

        ChoiWooSeong choiWooSeong = new ChoiWooSeong();//인스턴스

        System.out.println(choiWooSeong.age);// 인스턴스로 클래스 생성자를 선언해두면 스태틱에 따로 선언됨.
        System.out.println(ChoiWooSeong.address); // 그래서 클래스안에 스태틱 변수로 선언해두면 인스턴스로 호출 불가, 클래스로 따로 호출해야함.
    }
}
