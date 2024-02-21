package week5_curricullum_activities.class_activity_2A_1.model;

import week5_curricullum_activities.class_activity_2A_1.enums.MealType;

public class Cafeteria {
    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
