package fundamentals.methods;

public class MagicBox {
    private int secretNumber = 10;

    public int getSecretNumber() {
        return secretNumber;
    }

    public void setSecretNumber(int newNumber) {
        if(newNumber > 0){
            secretNumber = newNumber;
            System.out.println(secretNumber);
        }
    }
}
