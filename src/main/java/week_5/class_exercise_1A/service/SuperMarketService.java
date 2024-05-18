package week_5.class_exercise_1A.service;

import week_5.class_exercise_1A.model.Customers;
import week_5.class_exercise_1A.model.SuperMarket;

public interface SuperMarketService {
    public void addCustomersToQueue(Customers customers);

    public String attendToCustomer(SuperMarket itemBought);
}
