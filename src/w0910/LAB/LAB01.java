package w0910.LAB;

import java.util.Arrays;

public class LAB01 {

    public static void main(String[] args) {
        int[] ltArray = {};
        int num = 0;
        LottoNum lottoNum = new LottoNum();
        lottoNum.lottery();

        System.out.println("--로또 추첨 시작--");
        int count = 0;
        my_loop:
        while (true) {
            num = lottoNum.lottery();
            for (int v : ltArray) {
                if (num == v)
                    continue my_loop;
            }
            count++;
            System.out.println(count + "번째 번호: " + num);

            ltArray = Arrays.copyOf(ltArray, ltArray.length + 1);
            ltArray[ltArray.length - 1] = num;
            if (ltArray.length == 6)
                break;
        }
        Arrays.sort(ltArray);
        System.out.println("오늘의 로또 번호=> " + Arrays.toString(ltArray));
    }
}
