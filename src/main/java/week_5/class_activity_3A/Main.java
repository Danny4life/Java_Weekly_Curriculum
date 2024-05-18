package week_5.class_activity_3A;

import week_5.class_activity_3A.enums.MealType;
import week_5.class_activity_3A.model.Cafeteria;
import week_5.class_activity_3A.model.DecaDevs;
import week_5.class_activity_3A.service.impl.CafeteriaServiceImpl;

public class Main {
    public static void main(String[] args) {
        // Create some sample devs (male and female)
        DecaDevs male1 = new DecaDevs("Philip Efeonah", true, false);
        DecaDevs female1 = new DecaDevs("Janefraces Ibeh", false, true);
        DecaDevs male2 = new DecaDevs("Henry Chisom", true, false);


        // Create some sample devs (male and male)
//        DecaDevs male3 = new DecaDevs("Henry Ame", true, false);
//        DecaDevs male4 = new DecaDevs("Sany Dogo", true, false);

        // Create a sample meal
        Cafeteria cafeteria = new Cafeteria(MealType.FRIED_RICE);

        // Create a cafeteria impl instance
        CafeteriaServiceImpl cafeteriaService1 = new CafeteriaServiceImpl();


        // Add male and female devs to the cafeteria queue to request for meal
        cafeteriaService1.addDevsToQueue(male1);
        cafeteriaService1.addDevsToQueue(female1);
        cafeteriaService1.addDevsToQueue(male2);


        // Run this after to show philip come first with no priority
        // Add male devs to the cafeteria queue to request for meal

//        CafeteriaServiceImpl cafeteriaService2 = new CafeteriaServiceImpl();
//
//        cafeteriaService2.addDevsToQueue(male1);
//        cafeteriaService2.addDevsToQueue(male2);

        // Give out meal
        System.out.println(cafeteriaService1.collectMeal(cafeteria));

//        System.out.println("******Both Males on the queue*******");
//        System.out.println(cafeteriaService2.collectMeal(cafeteria));
    }
}
