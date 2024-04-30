package week_3.class_activity_1A;

public class Main {
    public static void main(String[] args) {
        InternshipForm obj1 = new InternshipForm("John Doe", 21, "MALE");
        InternshipForm obj2 = new InternshipForm("Jane Day", 19, "FEMALE");

        System.out.println("Name : " + obj1.name);
        System.out.println("Age : " + obj1.age);
        System.out.println("Gender : " + obj1.gender);
        System.out.println("Name : " + obj2.name);
        System.out.println("Age : " + obj2.age);
        System.out.println("Gender : " + obj2.gender);

    }
}
