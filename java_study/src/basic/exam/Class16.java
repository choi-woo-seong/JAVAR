package basic.exam;

import java.util.Scanner;

public class Class16 {
    public static void main(String[] args) {
        String id = "admin";
        String pw = "1111";
        String cfid = "";
        String cfpw = "";
        boolean init = true;
        boolean init2 = true;

        Scanner scanner = new Scanner(System.in);

        while(init) {
            System.out.println("아이디와 비밀번호를 입력해주세요.");
            System.out.println("아이디 :");
            cfid = scanner.nextLine();
            if (!id.equals(cfid)) {
                System.out.println("아이디를 확인해주세요.");
                System.out.println("아이디 :");
                cfid = scanner.nextLine();
            }else{
                System.out.println("비밀번호 :");
                cfpw = scanner.nextLine();
                if (!pw.equals(cfpw)) {
                    System.out.println("비밀번호를 확인해주세요.");
                    System.out.println("비밀번호 :");
                    cfpw = scanner.nextLine();
                }
            }
            if(id.equals(cfid) && pw.equals(cfpw)){
                init = false;
            }else {
                System.out.println("계정정보를 확인해주세요. 아이디부터 다시 입력합니다.");
                init = true;
            }

        }

        while (init2) {
                System.out.println("=======================");
                System.out.println("메뉴를 선택하세요.");
                System.out.println("=======================");
                System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기");

                int num = scanner.nextInt();

                switch (num) {
                    case 1:
                        System.out.println("안녕하세요.");
                        init2 = true;
                        break;
                    case 2:
                        System.out.println("삐끼삐끼 춤입니다.");
                        init2 = true;
                        break;
                    case 3:
                        System.out.println("맛나게 먹었습니다.");
                        init2 = true;
                        break;
                    case 4:
                        System.out.println("프로그램을 종료합니다.");
                        init2 = false;
                        break;
                    default:
                        System.out.println("잘못 입력하셨습니다. 메뉴를 확인해주세요.");
                        init2 = true;
                        break;
            }
        }

    }
}
