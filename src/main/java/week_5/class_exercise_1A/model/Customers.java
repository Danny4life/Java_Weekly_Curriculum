package week_5.class_exercise_1A.model;

public class Customers {
    private String name;
    private boolean isCustomerOld;

    private boolean isCustomerYoung;

    public Customers(String name, boolean isCustomerOld, boolean isCustomerYoung) {
        this.name = name;
        this.isCustomerOld = isCustomerOld;
        this.isCustomerYoung = isCustomerYoung;
    }

    public String getName() {
        return name;
    }

    public boolean isCustomerOld() {
        return isCustomerOld;
    }

    public boolean isCustomerYoung() {
        return isCustomerYoung;
    }
}
