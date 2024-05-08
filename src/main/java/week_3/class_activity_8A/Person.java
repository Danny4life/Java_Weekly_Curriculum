package week_3.class_activity_8A;

public class Person {
    String firstName;
    String lastName;

    // remove the this keyword

    public Person(String firstName, String lastName) {
        firstName = firstName;
        lastName = lastName;
    }


    // if local variable and instance variable are different the program works
//    public Person(String f, String l) {
//        firstName = f;
//        lastName = l;
//    }


    void display(){
        System.out.println(firstName + " " + lastName);
    }
}
