package week5_curricullum_activities.class_activity_2A_1.service.impl;

import week5_curricullum_activities.class_activity_2A_1.model.Cafeteria;
import week5_curricullum_activities.class_activity_2A_1.model.DecadevComparator;
import week5_curricullum_activities.class_activity_2A_1.model.Decadevs;
import week5_curricullum_activities.class_activity_2A_1.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {
    PriorityQueue<Decadevs> devsOnQueue;

    public CafeteriaServiceImpl() {
        devsOnQueue = new PriorityQueue<>(new DecadevComparator());
    }

    @Override
    public void addDevToQueue(Decadevs devs) {
        devsOnQueue.add(devs);
    }

    @Override
    public String collectMeal(Cafeteria meal) {
        if(devsOnQueue.isEmpty()){
            return "No devs in on the queue";
        }
        Decadevs devs = devsOnQueue.poll();

        return devs.getName() + " has taken " + meal.getMealType() + ".";
    }
}
