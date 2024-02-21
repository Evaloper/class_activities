package week5_curricullum_activities.class_activity_2A_1;

import week5_curricullum_activities.class_activity_2A_1.enums.MealType;
import week5_curricullum_activities.class_activity_2A_1.model.Cafeteria;
import week5_curricullum_activities.class_activity_2A_1.model.Decadevs;
import week5_curricullum_activities.class_activity_2A_1.service.CafeteriaService;
import week5_curricullum_activities.class_activity_2A_1.service.impl.CafeteriaServiceImpl;


public class Main {
    public static void main(String[] args) {
        Decadevs male1 = new Decadevs("Henry Ane", false, true);
        Decadevs female1 = new Decadevs("Rosemary Uroko", true, false);
        Decadevs male2 = new Decadevs("Praise Abu", false, true);

        Cafeteria cafe = new Cafeteria(MealType.FRIED_RICE_AND_COLD_SLAW);

        CafeteriaServiceImpl cafeteriaService = new CafeteriaServiceImpl();
        cafeteriaService.addDevToQueue(male1);
        cafeteriaService.addDevToQueue(female1);
        cafeteriaService.addDevToQueue(male2);

        System.out.println(cafeteriaService.collectMeal(cafe));
        System.out.println(cafeteriaService.collectMeal(cafe));
        System.out.println(cafeteriaService.collectMeal(cafe));
    }
}
