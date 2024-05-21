package week_5.class_activity_3A.service.impl;

import week_5.class_activity_3A.model.Cafeteria;
import week_5.class_activity_3A.model.DecaDevs;
import week_5.class_activity_3A.model.DecadevComparator;
import week_5.class_activity_3A.service.CafeteriaService;

import java.util.PriorityQueue;

public class CafeteriaServiceImpl implements CafeteriaService {
    PriorityQueue<DecaDevs> devsOnQueue = new PriorityQueue<>();

    public CafeteriaServiceImpl() {
        devsOnQueue = new PriorityQueue<>(new DecadevComparator());
    }

    @Override
    public void addDevsToQueue(DecaDevs devs) {
        devsOnQueue.add(devs);

    }

    @Override
    public String collectMeal(Cafeteria meal) {
        if (devsOnQueue.isEmpty()){
            return "No devs is on the queue";
        }

       DecaDevs decaDevs = devsOnQueue.poll();


        return decaDevs.getName() + " has taken " + meal.getMealType() + ".";

    }
}
