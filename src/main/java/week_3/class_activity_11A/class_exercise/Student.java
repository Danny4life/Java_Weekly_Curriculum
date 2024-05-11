package week_3.class_activity_11A.class_exercise;

public class Student {
    int matricNum;
    String studentName;
    static String university = "Uniben";

    public Student(int matricNum, String studentName) {
        this.matricNum = matricNum;
        this.studentName = studentName;
    }



    static void changeUniversity(){
        university = "Covenant";
    }

    void display(){
        System.out.println(matricNum + " " + studentName + " " + university + " University");
    }
}
