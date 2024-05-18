package week_5.class_exercise_1A.model;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customers> {
    @Override
    public int compare(Customers c1, Customers c2) {
        if(c1.isCustomerOld() && !c2.isCustomerOld()){
            return -1;
        } else if (!c1.isCustomerOld() && c2.isCustomerOld()) {
            return 1;

        } else if (c1.isCustomerYoung() && !c2.isCustomerYoung()) {
            return -1;

        } else if (!c1.isCustomerYoung() && c2.isCustomerYoung()) {
            return 1;

        }else {
            return 0;
        }
    }
}
