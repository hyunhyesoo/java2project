package w0903;

import java.util.Scanner;

public class Plus {
    public static int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("프로그램 종료를 원할 시 숫자 1에 '-1'을 입력하시오");

            System.out.println("숫자 1 입력:");
            int a = sc.nextInt();
            if (a == -1)
                break;

            System.out.println("숫자 2 입력:");
            int b = sc.nextInt();

            int hap = plus(a, b);
            System.out.printf("%d + %d 의 plus()메서드 결과 = %d\n", a, b, hap);
        }

        sc.close();
    }
}
