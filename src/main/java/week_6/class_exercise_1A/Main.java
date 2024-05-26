package week_6.class_exercise_1A;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 18));
        students.add(new Student("Ben", 20));
        students.add(new Student("Alicia", 17));

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        students.forEach(
                (s) -> System.out.println(s)
        );

    }
}
