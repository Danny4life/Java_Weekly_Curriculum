package week_4.class_activity_8A;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileWriter wr = new FileWriter(desktopPath + "/output.csv");
        BufferedWriter bf = new BufferedWriter(wr);
        bf.write("i am learning how to write to a file");
        bf.close();

        System.out.println("write successfully");


    }
}
