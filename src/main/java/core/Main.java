package core;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.register();

        user1.getAccount().getPaymentAccount().deposit(11000);
        user1.getAccount().getDepositAccount().deposit(1000);
        System.out.println(user1.getAccount());
        System.out.println(user1.getAccount().getDepositAccount());
        System.out.println(user1.getAccount().getPaymentAccount());

    }
}