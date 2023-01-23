package com.cx.exer2;

/**
 * @author cx
 * @date 2023/01/22/21:53
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
    }

    //添加客户
    public void addcustomer(String f,String l){
        Customer customer = new Customer(f,l);
        customers[numberOfCustomers++] = customer;

    }

    //获取客户的个数
    public int getNumOfCustomens(){
        return numberOfCustomers;
    }

    //获取指定位置上的客户
    public Customer getCustomer(int index){
        if( index >= 0 && index < numberOfCustomers){
            return customers[index];
        }
        return null;
    }
}
