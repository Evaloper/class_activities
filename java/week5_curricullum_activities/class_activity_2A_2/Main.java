package week5_curricullum_activities.class_activity_2A_2;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(101, "Java Collections", "Segun Osiki", 3);
        Book book2 = new Book(102, "Java Generics", "Emma Onaive", 2);
        Book book3 = new Book(103, "Java OOP", "Favour Ameh", 1);
        Book book4 = new Book(104, "Java StringBolt", "Vivian Abner", 7);
        Book book5 = new Book(105, "Java 101", "RoseMary Uroko", 5);

        HashSet<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book: bookSet){
            System.out.println(book);
        }
    }



}
