package core;


import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Setter
@Getter

public class PaymentAccountImpl implements PaymentAccount {
    private long id;
    private float amountOfMoney;

    public PaymentAccountImpl() {
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
    public float take(float amount) {
        if (amountOfMoney >= amount) {
            System.out.println("Вы взяли " + amount + ", теперь на вашем платежном счету: " + amountOfMoney);
            return amount;
        } else {
            System.out.println("Недостаточно средств.");
            return -1;
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
