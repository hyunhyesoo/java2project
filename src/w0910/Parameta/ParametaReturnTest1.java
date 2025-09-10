package w0910.Parameta;

import java.util.Scanner;

public class ParametaReturnTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1 입력:");
        int a = sc.nextInt();
        System.out.println("정수 2 입력:");
        int b = sc.nextInt();
        Calc1 calc1 = new Calc1(); //Calc1은 static이 없어서 먼저 객체 생성을 해줘야 함
        int result = calc1.plus(a, b);
        System.out.println("덧셈 결과: " + result);

        sc.close();
    }
}
