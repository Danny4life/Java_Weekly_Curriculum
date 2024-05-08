package week_3.class_activity_3A.class_exercise;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println("woof woof");
    }
}
