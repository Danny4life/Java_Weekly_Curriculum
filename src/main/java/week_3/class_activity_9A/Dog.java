package week_3.class_activity_9A;

public class Dog extends Animal{
    String color = "Black";


    // do just this first
    void printColor(){
        System.out.println(color);
    }

    // to access the color white do this with the super
    void printColorWhite(){
        System.out.println(super.color);
    }


    // invoke parent class method example
//    @Override
//    void bark() {
//
//    }
}
