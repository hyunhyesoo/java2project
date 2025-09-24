package w0924;

public class ArrayArithmeticExceptionTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        //try에는 예외발생 가능성이 있는 문장을 넣어준다 (예외 발생 시 try 안에 있는 문장은 실행 되지 않음)
        try{
            arr[0] = arr[2] / 0;
            arr[3] = 40;

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열의 인덱스 번호가 범위를 벗어난 것 같습니다");
        } catch (ArithmeticException e) {
            System.out.println("나누는 수는 0일 수 없습니다");
        } catch (Exception e) {
            System.out.println("임의의 예외가 발생했습니다");
        }
        //finally는 무조건 실행
        finally {
            System.out.println("프로그램이 종료됩니다");
        }

    }
}
