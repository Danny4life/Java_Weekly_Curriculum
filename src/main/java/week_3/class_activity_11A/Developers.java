package week_3.class_activity_11A;

public class Developers {
    int id;
    String name;
    static String institute = "Decagon";

    // change institute to non-static to show the difference
    //String institute = "Decagon";

    public Developers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " " + name + " " + institute);
    }
}
