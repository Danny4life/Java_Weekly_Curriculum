package week_3.class_activity_5A.class_exercise_5_1;

public class Student extends Person{

    public Student(String fullName, int age) {
        super(fullName, age);
    }

    @Override
    void display() {
        System.out.println("Student Details: " + getFullName() + " " + getAge());
    }
}
