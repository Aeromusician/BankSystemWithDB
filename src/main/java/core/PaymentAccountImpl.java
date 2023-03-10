package core;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class PaymentAccountImpl implements PaymentAccount {
    private long id;
    private float amountOfMoney;

    public PaymentAccountImpl() {

        this.id = (long) Math.random();


    }

    @Override
    public void deposit(float amount) {
        this.amountOfMoney += amount;
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
}
