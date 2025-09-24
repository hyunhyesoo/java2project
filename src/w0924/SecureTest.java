package w0924;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecureTest {
    //콘솔(키보드)에서 입력 받은 메시지를 암호화시켜 파일로 저장
    public static void main(String[] args) {
        FileWriter fw = null;
        Scanner sc = new Scanner(System.in);
        String line = "";
        String secureOutStr = "";
        try {
            fw = new FileWriter("D:/FileTest/Secure.txt");
            while (true) {
                System.out.print("Enter Message\n");
                line = sc.nextLine();
                if(line.equals("")) {
                    break;
                }

                for(int i = 0; i < line.length(); i++) {
                    int code = line.charAt(i);
                    code += 100;
                    secureOutStr += (char) code;
                }
                fw.write(secureOutStr);
            }
        } catch (IOException e) {
            System.out.println("File Writing Error");
        }

        try {
            fw.close();
            System.out.println("Generated Secure File");
            sc.close();
        } catch (IOException e) {
            System.out.println("File Closing Error");
        }
    }
}
