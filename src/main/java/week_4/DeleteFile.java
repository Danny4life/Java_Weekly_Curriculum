package week_4;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        String deskPath = System.getProperty("user.home") + "/Desktop";


        File file = new File(deskPath + "/output.csv");
        if(file.delete()){
            System.out.println("file deleted");
        }else {
            System.out.println("fail to delete file");
        }
    }
}
