package week5_curricullum_activities.class_activity_5A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] stack = {"Java", ".net"};

        System.out.println("Arrays: " + Arrays.toString(stack));

        System.out.println("******************");
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(stack));
        System.out.println(arr);

        System.out.println("******************");
        List<String> list = new ArrayList<>();
        list.add(Arrays.toString(stack));
        for (String li : list){
            System.out.println(li);
        }
    }
}
