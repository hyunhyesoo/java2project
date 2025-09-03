package w0903;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class RockGame {
    public static void main(String[] args) {
        String[] result = new String[10000];

        //a와 b가 선택한 가위,바위,보를 저장할 수 있는 변수
        String comA, comB;

        //이기거나 비긴 횟수를 저장하는 변수
        int aWin, bWin, noWin;
        String[] strArr = {"가위", "바위", "보"};

        for(int i = 0; i < result.length; i++) {
            Random random = new Random();
            comA = strArr[random.nextInt(strArr.length)];
            comB = strArr[random.nextInt(strArr.length)];

            if (comA.equals("가위")) {
                if (comB.equals("가위"))
                    result[i] = "비김";
                else if (comB.equals("바위"))
                    result[i] = "B";

                else if (comB.equals("보"))
                    result[i] = "A";
            } else if (comA.equals("바위")) {
                if (comB.equals("바위"))
                    result[i] = "비김";
                else if (comB.equals("보"))
                    result[i] = "B";

                else if (comB.equals("가위"))
                    result[i] = "A";
            }else if (comA.equals("보")) {
                if (comB.equals("보"))
                    result[i] = "비김";
                else if (comB.equals("가위"))
                    result[i] = "B";

                else if (comB.equals("바위"))
                    result[i] = "A";
            }
        }

        aWin = Collections.frequency(Arrays.asList(result), "A");
        bWin = Collections.frequency(Arrays.asList(result), "B");
        noWin = Collections.frequency(Arrays.asList(result), "비김");

        System.out.println("10000번 중 A의 승리: " + aWin);
        System.out.println("10000번 중 B의 승리: " + bWin);
        System.out.println("10000번 중 비긴 횟수: " + noWin);
//        System.out.printf("%d번 중 A의 승리 횟수: %d번\n", result.length, aWin);
//        System.out.printf("%d번 중 B의 승리 횟수: %d번\n", result.length, bWin);
//        System.out.printf("%d번 중 비긴 경기 횟수: %d번", result.length, noWin);
    }
}
