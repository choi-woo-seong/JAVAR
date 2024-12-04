package basic;

public class OperationEx03 {
    public static void main(String[] args) {
        // 대입 (뒤에 값을 앞의 변수에 넣어주세요)
        int a = 3;
        System.out.println(1 == 1);
        System.out.println(1 != 1);
        System.out.println(2 >= 1);
        //논리연산자
        //and : &&, or : || ,not : !
        //3 < 4 < 5
        System.out.println(3<4 && 4<5);

        String pass = "합격";
        String fail = "불합격";

        System.out.println(pass + " / " + fail);


        //성적을 국어점수(kor)라는 변수에 담고 --> 51
        int kor = 51;
        //영어점수(eng) -- 80
        int eng = 70;
        //삼항연산자 조건 ? 참:거짓;

        String equals = 3 == 4 ? "같아" : "틀려";
        int aa = 3 == 4? 0 : 1;

        //국어점수가 60점 이상이면 합격 그렇지 않으면 불합격 출력하기
        //1.바로 출력하기
        System.out.println(kor >= 60 ? pass : fail);
        //2.결과를 다른곳에 저장하고 결과 출력하기
        String xxx = kor >= 60 ? pass : fail;
        System.out.println(xxx);

        //조건1 . 두 점수 중 한가지만 60이상이면 합격
        String str = kor >= 60 || eng >= 60 ? pass : fail;
        str =  "조건 1 결과 : " + str ;

        int i = 1;
        i = i + 1;
        i += 1;
        i ++;
        ++ i;
        System.out.println("i = " + i);

        System.out.println( str );


        //조건2 . 두 점수 모두 60점 넘으면 합격
        String str2 = kor >= 60 && eng >= 60 ? pass : fail;

        System.out.println( "조건 2 결과 : " + str2 );

//        if(kor > 60 || eng > 60){
//            System.out.println("합격");
//        }else {
//            System.out.println("불합격");
//        }
//
//        if(kor > 60 && eng > 60){
//            System.out.println("합격");
//        }else{
//            System.out.println("불합격");
//        }
    }
}
