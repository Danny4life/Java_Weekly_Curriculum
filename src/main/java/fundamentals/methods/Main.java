package fundamentals.methods;

public class Main {
    public static void main(String[] args) {
        IsEvenOrOdd res = new IsEvenOrOdd();

        String name = res.myName("Segun");

        System.out.println(name);

        MagicBox box = new MagicBox();

        System.out.println(box.getSecretNumber());

       box.setSecretNumber(20);
    }
}
