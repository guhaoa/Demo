package com.alibaba.client;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author MSI
 * @date 2017/08/03
 */
public class Bank {
    private final double[] accounts;
    private final Lock blankLock;
    private Condition sufficientFunds;




    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts,initialBalance);
        blankLock = new ReentrantLock();
        sufficientFunds = blankLock.newCondition();
    }



    public void transfer(int from,int to,double amount) {
        blankLock.lock();
        try {
            while (accounts[from]<amount) sufficientFunds.await();
            System.out.println(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf("%10.2f from %d to %d",amount,from,to);
            accounts[to] += amount;
            System.out.printf(" Total Blance: %10.2f%n",getTotalBalance());
            sufficientFunds.signalAll();
        } catch (Exception e) {

        }finally {
            blankLock.unlock();
        }
    }

    private double getTotalBalance() {
        double sum = 0;
        for (double account : accounts) {
            sum += account;
        }
        return sum;
    }

    public int size() {
        return accounts.length;
    }

    public static void main(String[] args) {
        System.out.println(Math.random());
    }
}
