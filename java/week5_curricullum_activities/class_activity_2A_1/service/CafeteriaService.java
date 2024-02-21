package week5_curricullum_activities.class_activity_2A_1.service;

import week5_curricullum_activities.class_activity_2A_1.model.Cafeteria;
import week5_curricullum_activities.class_activity_2A_1.model.Decadevs;

public interface CafeteriaService {
    public void addDevToQueue(Decadevs devs);

    public String collectMeal(Cafeteria meal);
}
