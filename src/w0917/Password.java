package w0917;

import java.util.Scanner;

public class Password {

    public static boolean checkPassword(String password) {
        if(password.length() < 8)
            return false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if(!Character.isAlphabetic(c))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("비밀번호는 영문 또는 한글만 입력 가능합니다");
        System.out.println("(최소 8자리 이상 입력) (숫자 또는 기호 불가능)");

        while(true) {
            System.out.println("비밀번호를 입력하세요: ");
            String password = sc.nextLine();

            if (checkPassword(password)) {
                System.out.println("비밀번호가 생성되었습니다");
                break;
            }
            else
                System.out.println("비밀번호 규칙이 올바르지 않습니다");
        }
        sc.close();
    }
}
