package week5_curricullum_activities.class_activity_4A.class_exercise_3A;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Collections", "Segun Osiki", 3);
        Book book2 = new Book(102, "Java Generics", "Segun Osiki", 2);
        Book book3 = new Book(103, "Java HashMap", "Segun Osiki", 7);
        Book book4 = new Book(104, "Java Set", "Segun Osiki", 1);
        Book book5 = new Book(105, "Java List", "Segun Osiki", 9);

        HashMap<Integer, Book> books = new HashMap<>();
        books.put(1, book1);
        books.put(2, book2);
        books.put(3, book3);
        books.put(4, book4);
        books.put(5, book5);

        for (Map.Entry key : books.entrySet()){
            System.out.println(key.getKey() + " " + key.getValue());
        }
    }
}
