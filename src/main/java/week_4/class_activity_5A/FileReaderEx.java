package week_4.class_activity_5A;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileReader fr = new FileReader(desktopPath + "/output.csv");

        int i;
        while ((i = fr.read()) !=- 1){
            System.out.println((char) i);
        }
        fr.close();
    }
}
