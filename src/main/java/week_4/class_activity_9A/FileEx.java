package week_4.class_activity_9A;

import java.io.File;
import java.io.IOException;

public class FileEx {

    public static void main(String[] args) {
        String deskPath = System.getProperty("user.home") + "/Desktop";

        try{
            File file = new File(deskPath + "/output.csv");
            if(file.createNewFile()){
                System.out.println("New file created");
            }else {
                System.out.println("file already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }



}
