package w0910.multymethod;

import java.util.Scanner;

public class InputMethod {
    public int[] input() {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("정수" +  + (i+1) + " 입력");
            nums[i] = sc.nextInt();
        }
        sc.close();
        return nums;
    }
}
