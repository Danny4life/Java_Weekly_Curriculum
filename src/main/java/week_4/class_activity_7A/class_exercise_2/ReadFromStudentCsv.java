package week_4.class_activity_7A.class_exercise_2;

import week_4.class_activity_4A.class_exercise_1.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromStudentCsv {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        String filePath = desktopPath + "/students.csv";

        List<Student> students = readStudentFromCsv(filePath);
        for(Student student : students){
            System.out.println(student);
        }
    }

    private static List<Student> readStudentFromCsv(String filePath) {
        List<Student> students = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            // to skip the header
            String headerRow = br.readLine();

            String line;
            while ((line = br.readLine()) != null){
                String[] data = line.split(",");
                int  admissionId = Integer.parseInt(data[0]);
                String firstName = data[1];
                String lastName = data[2];
                String dob = data[3];
                String gender = data[4];
                int age = Integer.parseInt(data[5]);
                Student student = new Student(admissionId, firstName, lastName, dob, gender, age);
                students.add(student);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return students;
    }
}
