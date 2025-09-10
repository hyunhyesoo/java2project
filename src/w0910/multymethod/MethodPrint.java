package w0910.multymethod;

import w0910.Parameta.Calc1;

public class MethodPrint {
    public static void main(String[] args) {
        InputMethod inputMethod = new InputMethod();
        int[] nums = inputMethod.input();
        Calc1 calc = new Calc1();
        int result = calc.plus(nums);

        System.out.println(nums.length + "개 정수의 합계: " + result);
    }
}
