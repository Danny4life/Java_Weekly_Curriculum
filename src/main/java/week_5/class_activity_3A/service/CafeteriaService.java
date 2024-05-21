package week_5.class_activity_3A.service;

import week_5.class_activity_3A.model.Cafeteria;
import week_5.class_activity_3A.model.DecaDevs;

public interface CafeteriaService {
    public void addDevsToQueue(DecaDevs devs);

    public String collectMeal(Cafeteria meal);
}
