package week_4.class_activity_3A;

import java.io.FileInputStream;

public class FileInputStreamEx {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        try{
            FileInputStream fs = new FileInputStream(desktopPath + "/output.csv");
            int data;

            while((data = fs.read()) != -1){
                System.out.println((char) data);
            }

            fs.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
