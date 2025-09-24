package w0924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DecordingSecureFileTest {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        String line = "";
        String secureOutStr = "";
        try {
            fr = new FileReader("D:/FileTest/Secure.txt");
            br = new BufferedReader(fr);
            fw = new FileWriter("D:/FileTest/SecureDecorded.txt");

            while ((line = br.readLine()) != null) {
                secureOutStr = "";
                for(int i = 0; i < line.length(); i++) {
                    int code = line.charAt(i);
                    code -= 100;
                    secureOutStr += (char) code;
                }
                fw.write(secureOutStr + "\n");
            }
        } catch (IOException e) {
            System.out.println("File Reading Error");
        }

        try {
            fr.close();
            br.close();
            fw.close();
            System.out.println("Decorded Secure File");
        } catch (IOException e) {
            System.out.println("File Closing Error");
        }
    }
}
