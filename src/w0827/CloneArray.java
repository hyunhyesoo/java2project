package w0827;

import java.util.Arrays;

public class CloneArray {
    public static void main(String[] args) {
        //복제가 아닌 경우
        String[] originArr1 = {"김치찌개", "감자탕", "떡볶이", "제육볶음"};
        String[] originArr2 = originArr1;

        originArr1[1] = "라구파스타";
        originArr2[0] = "치즈돈까스";

        System.out.println(Arrays.toString(originArr1));
        System.out.println(Arrays.toString(originArr2));

        //복제되는 경우
        String[] originArr = {"카리나", "윈터", "닝닝", "지젤"};
        String[] cloneArr = originArr.clone();

        System.out.println(Arrays.toString(originArr));
        System.out.println(Arrays.toString(cloneArr));
    }
}
