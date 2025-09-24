package w0924;

import java.io.*;
import java.sql.SQLOutput;

public class FileCopyTest2 {

    public static void copyFile() throws FileNotFoundException, IOException {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        fr = new FileReader("D:/FileTest/MyData.txt");
        br = new BufferedReader(fr);
        fw = new FileWriter("D:/FileTest/MyDataCopy.txt");
        String line;

        while ((line = br.readLine()) != null) {
            fw.write(line + "\n");
        }

        br.close();
        fw.close();
        System.out.println("File copied");
    }

    public static void main(String[] args) {
        try {
            copyFile();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
