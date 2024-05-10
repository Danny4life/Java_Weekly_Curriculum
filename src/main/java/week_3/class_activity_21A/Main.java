package week_3.class_activity_21A;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book b1 = new Book(1, "Things fall apart", "Chinua Achebe", 20);
        Book b2 = new Book(2, "The man died", "Wole Soyinka", 10);
        Book b3 = new Book(3, "Animal Farm", "George Orwell", 5);
        Book b4 = new Book(4, "Oliver Twist", "Charles Dickens", 30);
        Book b5 = new Book(5, "Half of a yellow sun", "Chimamanda Adichie", 100);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        for(Book b : books){
            b.display();
        }

    }
}
