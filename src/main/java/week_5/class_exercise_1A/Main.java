package week_5.class_exercise_1A;

import week_5.class_exercise_1A.enums.Item;
import week_5.class_exercise_1A.model.Customers;
import week_5.class_exercise_1A.model.SuperMarket;
import week_5.class_exercise_1A.service.impl.SuperMarketServiceImpl;

public class Main {
    public static void main(String[] args) {

        // Create some customer (young and old)

        Customers youngCustomer = new Customers("jane young", false, true);
        Customers oldCustomer = new Customers("john old", true, false);


        // do this for the young customers on FIFO basis
//        Customers youngCustomer1 = new Customers("jane young", false, true);
//        Customers youngCustomer2 = new Customers("john young", false, true);


        // Create a sample item
        SuperMarket itemBought1 = new SuperMarket(Item.MILK);
        //SuperMarket itemBought2 = new SuperMarket(Item.SUGAR);


        // Create a super market impl instance
        SuperMarketServiceImpl superMarketService = new SuperMarketServiceImpl();

        // Add young and old customer to the supermarket queue to pay for item bought
        superMarketService.addCustomersToQueue(youngCustomer);
        superMarketService.addCustomersToQueue(oldCustomer);


        // Add young and young customer to the supermarket queue to pay for item bought
//        superMarketService.addCustomersToQueue(youngCustomer1);
//        superMarketService.addCustomersToQueue(youngCustomer2);


        // attend to customers
        System.out.println(superMarketService.attendToCustomer(itemBought1));
        // System.out.println(superMarketService.attendToCustomer(itemBought1));


    }
}
