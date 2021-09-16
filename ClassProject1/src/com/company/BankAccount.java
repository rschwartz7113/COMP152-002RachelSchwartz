package com.company;

public class BankAccount {
    private double balance;
    private float interestRate;

    public void deposit(double amount){
        balance += amount;
    }
    public boolean withdraw(double amount){
        if (amount>balance){
            return false;
        }
            balance = balance - amount;
            return true;
    }
    public double checkBalance(){
        return balance;
    }
    public double addInterest(){
        balance = balance + interestRate*balance;
        return balance;
    }
}
