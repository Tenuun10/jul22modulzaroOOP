package bank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    String accountName;
    double balance;
    final String accountNumber;

    int accountA = 0;

    public BankAccount(String accountName, double balance, String accountNumber) {
        this.accountName = accountName;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(int deposit){
        balance += deposit;
    }

    public void withdraw(int withdraw){
        if(balance<withdraw){
            System.out.println("not sufficient money my bro/sis");
        }else balance-=withdraw;
    }

    public void transfer(int trans){
        if(trans>balance){
            System.out.println("not enough money");
        }else accountA+=trans;

    }


    public static void isValidAccountNumber(List<String> accountNumber){

        }
    }
