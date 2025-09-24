package w0924;

import java.io.*;

//이미지파일은 1바이트씩 입력받아서 1바이트씩 출력해야한다
public class ImageFileCopy {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:/Users/AI-510-172/Pictures/Screenshots/hehe.png");
            fos = new FileOutputStream("C:/Users/AI-510-172/Pictures/Screenshots/hehehehe.png");
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Reading Character Error");
        }

        try {
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("I/O Error");
        }

    }
}
