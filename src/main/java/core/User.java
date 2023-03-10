package core;

import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class User {
    private long userId;

    private Account account;

    public User() {
        this.userId = Math.abs(new Random().nextLong());
    }

    public void register() {
        this.account = new Account();
    }

}
