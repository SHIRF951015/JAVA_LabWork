package com.company;

public class Lab8_1 {
    public static final int NACCOUNTS = 10;
    public static final double INITIAL_BALANCE = 1000;
    public static void main(String[] args) {
        Bank b = new Bank(NACCOUNTS, INITIAL_BALANCE);
        int i;
        for (i = 0; i < NACCOUNTS; i++) {
            TransferRunnable r = new TransferRunnable(b, i, INITIAL_BALANCE);
            Thread t = new Thread(r);
            t.start();
        }
    }

}
class Bank{
    private final double[] accounts;
    public Bank(int n,double initialBalance) {
        accounts = new double[n];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initialBalance;
        }
    }
    public synchronized void transfer(int from ,int to ,double amount){
        if(accounts[from] < amount){
            System.out.println("Insufficient balance");
            return ;
        }
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f from %d to %d%n",amount,from,to);
        accounts[to] += amount;
        System.out.printf("account %d balance: %10.2f,account %d balance:%10.2f%n",from,accounts[from],to,accounts[to]);
    }
    public int size(){
        return accounts.length;
    }
}

class TransferRunnable implements Runnable{
    private Bank bank;
    private int fromAccount;
    private double maxAmount;//
    private int DELAY =10;

    public TransferRunnable(Bank b, int from, double max) {
        bank = b;
        fromAccount = from;
        maxAmount = max;
    }
    public void run() {
        int toAccount = (int)(bank.size() * Math.random());
        double amount = maxAmount * Math.random();
        bank.transfer(fromAccount, toAccount, amount);
        try {
            Thread.sleep((int)(DELAY * Math.random()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
