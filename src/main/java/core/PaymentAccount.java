package core;

public interface PaymentAccount {
    public void deposit(float amount);

    public float take(float amount);


    public float checkDeposit(long id);
}
