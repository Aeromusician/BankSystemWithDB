package core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

public class DepositAccountImpl implements DepositAccount {
    private float amountOfMoney;
    private long id;

    @Override
    public void deposit(float amount) {
        this.amountOfMoney += amount;
    }

    @Override
    public float checkDeposit(long id) {
        return amountOfMoney;
    }
}
