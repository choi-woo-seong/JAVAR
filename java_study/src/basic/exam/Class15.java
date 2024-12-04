package basic.exam;

import java.util.Scanner;

public class Class15 {
    public static void main(String[] args) {

        boolean init = true;

        while (init) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=======================");
            System.out.println("메뉴를 선택하세요.");
            System.out.println("=======================");
            System.out.println("1. 인사하기 2. 춤추기 3. 밥먹기  4. 종료하기");

            int num = scanner.nextInt();

            switch (num) {
                case 1:
                    System.out.println("안녕하세요.");
                    init = true;
                    break;
                case 2:
                    System.out.println("삐끼삐끼 춤입니다.");
                    init = true;
                    break;
                case 3:
                    System.out.println("맛나게 먹었습니다.");
                    init = true;
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    init = false;
                    break;

            }
        }

    }
}
