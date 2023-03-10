package core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
    private long id;

    private String login;
    private String password;

    private DepositAccountImpl depositAccount;
    private PaymentAccount paymentAccount;

    public Account() {
        this.depositAccount = new DepositAccountImpl();
        this.paymentAccount = new PaymentAccountImpl();

    }

}
