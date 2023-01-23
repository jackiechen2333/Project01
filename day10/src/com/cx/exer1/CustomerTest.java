package com.cx.exer1;

/**
 * @author cx
 * @date 2023/01/22/21:25
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,0.0123);
        customer.setAccount(account);

        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
    }
}
