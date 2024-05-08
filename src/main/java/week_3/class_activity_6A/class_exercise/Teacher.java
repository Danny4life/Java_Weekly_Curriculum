package week_3.class_activity_6A.class_exercise;

public class Teacher implements Teachable{
    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);
    }
}
