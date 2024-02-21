package week5_curricullum_activities.class_activity_4A.class_exercise_1;

import java.util.ArrayList;
import java.util.List;

public class List1Ex {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Guava");

        System.out.println(fruits);

//        System.out.println(fruits.isEmpty());
        fruits.add("Mango");
        System.out.println(fruits.indexOf("Mango"));
        System.out.println(fruits.size());

//        System.out.println(fruits.get(0));

//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }
    }
}
