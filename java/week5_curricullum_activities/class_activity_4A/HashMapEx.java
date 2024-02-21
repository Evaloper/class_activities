package week5_curricullum_activities.class_activity_4A;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();

        fruits.put(1, "Banana");
        fruits.put(2, "Apple");
        fruits.put(3, "Orange");
        fruits.put(4, "Guava");
        fruits.put(5, "Cherry");

        System.out.println(fruits);

//        fruits.remove(2);
        fruits.replace(2, "Dates");
//        fruits.containsKey(1);

        System.out.println(fruits.containsKey(1));
        for (Map.Entry key: fruits.entrySet()){
            System.out.println(key.getKey() + " " + key.getValue());
        }
    }
}
