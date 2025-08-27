package w0827;

public class gugudan {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", j, i, i * j);
                //줄바꿈 말고 tab 해줘야 가로 출력됨
            }
            System.out.println();
        }
    }
}
