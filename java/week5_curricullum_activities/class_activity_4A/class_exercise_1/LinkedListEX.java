package week5_curricullum_activities.class_activity_4A.class_exercise_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEX {
    public static void main(String[] args) {
        List<String> vege = new LinkedList<>();

        vege.add("Pumpkin");
        vege.add("Tomatoes");
        vege.add("Okro");
        vege.add("Cabbage");

        System.out.println(vege);
        vege.addLast("Carrot");
        vege.addFirst("Cucumber");

        for(String fruit: vege){
            System.out.println(fruit);
        }
    }
}
