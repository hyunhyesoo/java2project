package w0827;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {
    public static void main(String[] args) {
        String[] mbarr = {"해린", "혜인", "민지", "하니", "다니엘"};
        System.out.println("처음배열: " + Arrays.toString(mbarr));

        Collections.reverse(Arrays.asList(mbarr));
        System.out.println("역순배열: " + Arrays.toString(mbarr));
    }
}
