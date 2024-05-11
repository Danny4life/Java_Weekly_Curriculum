package week_3.class_activity_11A;

public class Main {
    public static void main(String[] args) {
        Developers d1 = new Developers(1, "Emmanuel");
        Developers d2 = new Developers(2, "Vivian");


        //do this to show the power of using static
        // we can change the institute of all devs by just one line of code

        //Developers.institute = "semi-colon";

        // do this example to show why static is better in this scenerio
        // supposed we want to change the name of the institutes for all devs,
        // we will have to change for every one of them, instead of just doing it once when we use static
//        d1.institute = "semi-colon";
//        d2.institute = "semi-colon";

        d1.display();
        d2.display();
    }
}
