package core;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
public class Account {
    private long id;

    private String login;
    private String password;
    private DepositAccountImpl depositAccount;
    private PaymentAccount paymentAccount;

    public Account() {
        System.out.println("Для регистрации введите логин: ");
        Scanner scanner = new Scanner(System.in);
        this.login = scanner.nextLine();
        System.out.println("Введите пароль, который будете использовать для входа в систему: ");
        this.password = scanner.nextLine();
        this.depositAccount = new DepositAccountImpl();
        this.paymentAccount = new PaymentAccountImpl();
        this.id = Math.abs(new Random().nextLong());
    }

    @Override
    public String toString() {
        return "Account " +
                "id = " + id +
                "\n login = " + login +
                "\npassword = " + password +
                "\ndepositAccount = " + depositAccount +
                "\npaymentAccount = " + paymentAccount;
    }
}
