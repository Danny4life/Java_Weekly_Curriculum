package week_5.class_activity_3A.model;

import week_5.class_activity_3A.enums.MealType;

public class Cafeteria {
    private MealType mealType;

    public Cafeteria(MealType mealType) {
        this.mealType = mealType;
    }

    public MealType getMealType() {
        return mealType;
    }
}
