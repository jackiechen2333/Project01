package com.cx.exer2;

/**
 * @author cx
 * @date 2023/01/22/22:04
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addcustomer("Jane","Smith");

        bank.getCustomer(0).setAccount(new Account(2000));

        bank.getCustomer(0).getAccount().withdraw(500);

        System.out.println("客户余额" + bank.getCustomer(0).getAccount().getBalance());
    }
}
