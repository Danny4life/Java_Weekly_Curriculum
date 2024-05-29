package fundamentals.oops.exercise;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(2070323109,"John",10000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();
    }
}
