package week5_curricullum_activities.class_activity2A;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("one");
        hashSet.add("two");
        hashSet.add("three");
        hashSet.add("three");
        hashSet.add("four");
        hashSet.add("five");
        hashSet.remove("one");

        Iterator<String> iterator = hashSet.iterator();
       while (iterator.hasNext()){

           String newIterator = iterator.next();
           System.out.println(newIterator);
       }

       hashSet.remove("one");
       System.out.println(hashSet);

       HashSet<String> hashSet1 = new HashSet<>();

       hashSet.add("one");
       hashSet.add("six");
       hashSet.add("seven");
       hashSet.add("eight");

       hashSet.addAll(hashSet1);
       System.out.println(hashSet);

       Iterator<String> iterator1 = hashSet.iterator();

       while (iterator1.hasNext()){
           String newIterator = iterator1.next();
           System.out.println(newIterator);
       }


    }
}
