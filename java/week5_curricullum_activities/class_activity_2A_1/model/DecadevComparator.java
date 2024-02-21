package week5_curricullum_activities.class_activity_2A_1.model;

import java.util.Comparator;

public class DecadevComparator implements Comparator<Decadevs> {

    @Override
    public int compare(Decadevs d1, Decadevs d2) {
        if(d1.isFemale() && !d2.isFemale()){
            return -1; // d1 is a female, prioritize over d2
        } else if (!d1.isFemale() && d2.isFemale()) {
            return 1;

        } else if (d1.isMale() && !d2.isMale()) {
            return -1;

        } else if(!d1.isMale() && d2.isMale()){
            return 1;
        }
        return 0;
    }
}
