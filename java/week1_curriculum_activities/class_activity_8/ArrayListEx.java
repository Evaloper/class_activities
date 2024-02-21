package week1_curriculum_activities.class_activity_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");
        list1.add("three");
        list1.add("four");
        list1.add("five");
        list1.remove(3);
        Collections.sort(list1);
        System.out.println(list1);

        for (String i : list1){
            System.out.println(i);
        }
    }
}
