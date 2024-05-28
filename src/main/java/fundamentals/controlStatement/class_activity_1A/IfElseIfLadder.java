package fundamentals.controlStatement.class_activity_1A;

public class IfElseIfLadder {
    public static void main(String[] args) {
        String city = "Lagos";

        if(city == "Ibadan") {
            System.out.println("city is Ibadan");
        }else if (city == "Benin") {
            System.out.println("city is Benin");
        }else if(city == "Enugu") {
            System.out.println("city is Enugu");
        }else {
            System.out.println(city);
        }
    }
}
