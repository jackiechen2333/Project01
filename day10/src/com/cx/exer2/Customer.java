package com.cx.exer2;

/**
 * @author cx
 * @date 2023/01/22/21:53
 */
public class Customer {
    private String firstName;//名
    private String lastName;//姓
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
