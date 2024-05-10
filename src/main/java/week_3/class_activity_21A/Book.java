package week_3.class_activity_21A;

public class Book {
    int id;
    String name;
    String author;
    int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    void display(){
        System.out.println(id + " " + name + " " + author + " " + quantity);
    }
}
