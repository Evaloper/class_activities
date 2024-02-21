package week5_curricullum_activities.class_activity2B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Person person1 = new Person("Eva", 25);
        Person person2 = new Person("Dave", 22);
        Person person3 = new Person("Sani", 20);
        Person person4 = new Person("Rose", 18);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

//        Iterator<Person> iterator = people.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator().getName() + " "+ iterator.next().getAge());
//        }

        Collections.sort(people, new AgeComparator());

        for (Person person : people){
            System.out.println(person.getName() + "-" + person.getAge() );
        }
    }
}
