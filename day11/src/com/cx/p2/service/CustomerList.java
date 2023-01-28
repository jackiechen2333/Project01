package com.cx.p2.service;

import com.cx.p2.bean.Customer;

/**
 * @Author cx
 * @Date 2023/01/23/20:16
 */
public class CustomerList {
    private Customer[] customers;//用于保存客户对象的数组
    private int total = 0;//用于记录数组中有多少个客户对象

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }else {
            customers[total++] = customer;
            return true;
        }
    }

    public boolean replaceCustomer(int index,Customer customer){
        if(index < 0 && index >= total){
            return false;
        }else {
            customers[index] = customer;
            return true;
        }
    }

    public boolean deleteCustomer(int index){
        if(index < 0 && index >= total){
            return false;
        }else {
            for(int i = index;i < total - 1;i--){
                customers[i] = customers[i + 1];
            }
            //customers[total - 1] = null;
            //total--;
            customers[--total] = null;
            return true;
        }
    }

    public Customer[] getAllCustomers(){
        
        Customer[] customers = new Customer[total];
        for (int i = 0; i < total; i++) {
            customers[i] = this.customers[i];
        }
        return customers;
    }

    public Customer getCustomer(int index){
        if(index < 0 && index >= total){
            return null;
        }else {
            return customers[index];
        }

    }

    public int getTotal(){
        return total;
    }
}
