package w0917;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTest01 {
    public static void main(String[] args) {
        BufferedReader br = null;
        String line = null;
        try{
            //파일 열기
            br = new BufferedReader(new FileReader("D:/FileTest/MyData.txt"));

            while(true) {
                line = br.readLine();
                if(line == null)
                    break;
                System.out.println(line); //읽어온 값이 null이 아니면 출력하기
            }
            //throws, try~catch는 메소드를 호출한 곳으로 예외를 던질 때 사용
        } catch (FileNotFoundException e) {
            System.out.println("현재 경로에서 파일을 찾을 수 없습니다");
            return;
            //return 사용하면 오류메시지 안 뜨고 바로 메서드 빠져나가서 프로그램 종료됨
        } catch (IOException e) {
            System.out.println("한 줄씩 읽는 동안 문제가 발생했습니다");
        }//IOException은 항상 맨 끝에 있어야 함(부모클래스일수록 아래쪽으로 내려가야함)

        try{
            br.close();
        } catch (IOException e) {
            System.out.println("BufferReader를 닫는데 문제가 발생했습니다");
        }//IOException은 항상 맨 끝에 있어야 함(부모클래스일수록 아래쪽으로 내려가야함)
    }
}
