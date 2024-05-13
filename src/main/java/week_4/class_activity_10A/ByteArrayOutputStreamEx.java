package week_4.class_activity_10A;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws Exception {
        String deskPath = System.getProperty("user.home") + "/Desktop";


        FileOutputStream file1 = new FileOutputStream(deskPath + "/output1.txt");
        FileOutputStream file2 = new FileOutputStream(deskPath + "/output2.txt");

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        b.write('A');
        b.writeTo(file1);
        b.writeTo(file2);

        b.close();

        System.out.println("Success....");
    }
}
