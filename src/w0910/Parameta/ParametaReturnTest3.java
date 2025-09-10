package w0910.Parameta;

import java.util.ArrayList;

public class ParametaReturnTest3 {
    public static void main(String[] args) {
        Calc1 calc1 = new Calc1(); //Calc1은 static이 없어서 먼저 객체 생성을 해줘야 함
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int result = calc1.plus(nums);
        System.out.println("배열에 저장된 정수들의 덧셈 결과: " + result);

        ArrayList<Integer> list = new ArrayList<Integer>(); //배열은 길이가 고정되어 있지만 리스트는 유동적으로 입력되는 값에 따라 사용할 때 유용함
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(13);

        result = calc1.plus(list);
        System.out.println("리스트에 추가된 정수들의 덧셈 결과: " + result);
    }
}
