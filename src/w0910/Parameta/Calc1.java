package w0910.Parameta;
import java.util.List;

public class Calc1 {

    public int plus(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int plus(int n1, int n2, int n3) { // 자바는 매개변수가 달라지면 이름이 같아도 사용 가능함
        int result = n1 + n2 + n3;
        return result;
    }

    public int plus(int[] nums) {
        int result = 0;
        for (int num: nums) {
            result += num;
        }
        return result;
    }
    public int plus(List<Integer> nums) {
        int result = 0;
        for (int num: nums) {
            result += num;
        }
        return result;
    }
}
