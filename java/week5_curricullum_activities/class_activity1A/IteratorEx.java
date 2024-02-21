package week5_curricullum_activities.class_activity1A;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Benin");
        cities.add("Uyo");
        cities.add("Akwa");
        cities.add("Asaba");
        cities.add("Kaduna");

        Iterator<String> iterator = cities.iterator();
        while(iterator.hasNext()){
            String cityNames = iterator.next();
            System.out.println(cityNames);

        }
        cities.remove("Akwa");
        System.out.println(cities);
    }
}
