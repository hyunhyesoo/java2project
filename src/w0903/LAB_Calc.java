package w0903;

import java.util.Scanner;

public class LAB_Calc {
    public static int calc(int a, int b, char c) {
        int result = 0;
        if (c == ('+'))
            result = a + b;
        else if (c == ('-'))
            result = a - b;
        else if (c == ('*'))
            result = a * b;
        else if (c == ('/'))
            result = a / b;

//            switch (c) {
//                case '+': result = a + b;
//                break;
//                case '-': result = a - b;
//                break;
//                case '*': result = a * b;
//                break;
//                case '/': result = a / b;
//                break;
//                default: result = 0;
//            }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char cal = 0;

        while (true) {
            System.out.println("프로그램 종료를 원하면 연산자에 'e'를 입력하세요");
            System.out.println("연산자 입력(+, -, *, /): ");

            while (true) {
                cal = sc.next().charAt(0);
                if (cal == 'e') {
                    sc.close();
                    return;
                }
                if (cal == '+' || cal == '-' || cal == '*' || cal == '/') {
                    break;
                }
                System.out.println("연산자를 다시 입력하세요");
            }

            System.out.println("첫번째 숫자 입력: ");
            int num1 = sc.nextInt();

            System.out.println("두번째 숫자 입력: ");
            int num2 = sc.nextInt();

            System.out.printf("계산 결과: %d %c %d = %d\n", num1, cal, num2, calc(num1, num2, cal));
        }
    }
}