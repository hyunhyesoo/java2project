package w0827;
import java.util.Scanner;
import java.util.Arrays;

public class LAB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] score = new int[5];
        int sum = 0;
        double avg = 0;

        System.out.println("피겨스케이팅 연기를 마쳤습니다");

        for (int i = 0; i < score.length; i++) {
            System.out.print("심사위원" + (i + 1) + "평가 점수: ");
            score[i] = sc.nextInt();
            sum += score[i];
        }

        avg = sum / score.length;

        System.out.println("심사위원 개별 점수: " + Arrays.toString(score));
        System.out.printf("심사위원 평균 점수: %.1f \n", avg);
        sc.close();
    }
}
