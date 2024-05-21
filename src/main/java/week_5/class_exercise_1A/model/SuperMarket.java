package week_5.class_exercise_1A.model;

import week_5.class_exercise_1A.enums.Item;

public class SuperMarket {
    private Item item;

    public SuperMarket(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
