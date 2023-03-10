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
        this.amountOfMoney += amount;
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
