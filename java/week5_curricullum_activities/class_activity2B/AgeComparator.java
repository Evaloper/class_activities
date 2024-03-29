package week5_curricullum_activities.class_activity2B;

import java.util.Comparator;
import java.util.stream.Collector;

public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getAge() > p2.getAge()){
            return 1;
        } else if (p1.getAge() < p2.getAge()) {
            return -1;
        }
        return 0;
    }
}
