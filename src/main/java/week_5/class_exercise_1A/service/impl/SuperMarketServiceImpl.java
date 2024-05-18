package week_5.class_exercise_1A.service.impl;

import week_5.class_exercise_1A.model.CustomerComparator;
import week_5.class_exercise_1A.model.Customers;
import week_5.class_exercise_1A.model.SuperMarket;
import week_5.class_exercise_1A.service.SuperMarketService;

import java.util.PriorityQueue;

public class SuperMarketServiceImpl implements SuperMarketService {
    PriorityQueue<Customers> customersPriorityQueue;

    public SuperMarketServiceImpl() {
        customersPriorityQueue = new PriorityQueue<>(new CustomerComparator());
    }

    @Override
    public void addCustomersToQueue(Customers customers) {
        customersPriorityQueue.add(customers);

    }

    @Override
    public String attendToCustomer(SuperMarket itemBought) {
        if(customersPriorityQueue.isEmpty()){
            return "No customer on queue";
        }

        Customers customers = customersPriorityQueue.poll();

        return customers.getName() + " has bought " + itemBought.getItem() + ".";
    }
}
