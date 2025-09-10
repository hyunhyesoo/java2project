package w0910.Parameta;

public class ParametaReturnTest2 {
    public static void main(String[] args) {
        Calc1 calc1 = new Calc1(); //Calc1은 static이 없어서 먼저 객체 생성을 해줘야 함
        int result = calc1.plus(10, 20, 30);
        System.out.println("세 정수의 덧셈 결과: " + result);
    }
}
