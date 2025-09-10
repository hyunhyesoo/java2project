package w0910.LAB;
import java.util.Arrays;
import java.util.Random;

public class LottoNum {
    public int lottery() {
        Random random = new Random();
        int ltnum = (int)(Math.random() * 45 + 1);
        return ltnum;
    }
}
