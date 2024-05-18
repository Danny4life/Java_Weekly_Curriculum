package week_5.class_activity_3A.model;

public class DecaDevs {
    private String name;

    private boolean isFemale;

    private boolean isMale;



    public DecaDevs(String name, boolean isMale, boolean isFemale) {
        this.name = name;
        this.isMale = isMale;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public boolean isFemale() {
        return isFemale;
    }
}
