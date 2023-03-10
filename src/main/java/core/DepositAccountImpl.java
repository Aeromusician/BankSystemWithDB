package core;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter

public class DepositAccountImpl implements DepositAccount {
    private float amountOfMoney;
    private long id;

    public DepositAccountImpl() {
        this.id = Math.abs(new Random().nextLong());
    }

    @Override
    public void deposit(float amount) {
        if (amount > 0) {
            this.amountOfMoney += amount;
            System.out.println("Вы внесли " + amount + " на ваш депозитный счёт.");
        } else {
            System.out.println("Ошибка, введенная сумма недопустима.");
        }

    }

    @Override
    public float checkDeposit(long id) {
        return amountOfMoney;
    }

    @Override
    public String toString() {
        return "Депозитный счет. Состояние: " + amountOfMoney + " руб.";
    }
}
