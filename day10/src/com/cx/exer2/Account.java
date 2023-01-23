package com.cx.exer2;

/**
 * @author cx
 * @date 2023/01/22/21:52
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("余额不足");
        }
        balance -= amount;
        System.out.println("成功取出" + amount);

    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入" + amount);
        }

    }
}
