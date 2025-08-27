package w0827;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = { 41, 25, 33, 4, 5, 16, 70, 8, 29 };
        String[] strArr = {"인공지능", "소프트웨어", "폴리텍", "대학", "1학년", "하이테크", "2학년"};

        //오름차순 정렬
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();

        //내림차순 정렬
        Arrays.sort(strArr, Collections.reverseOrder());

        for (String str : strArr) {
            System.out.print(str + "\t");
        }

    }
}
