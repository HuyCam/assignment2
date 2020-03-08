package com.meritamerica.assignment2;

public class SavingsAccount {
	SavingsAccount(double balance){
        this.balance = balance;    }
    private double balance;
    final private static double interestRate = 0.01;

    public double getBalance(){
        return balance;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public boolean withdraw (double amount) {
        if(amount > balance) {
            System.out.println("Not enough money in the account.");
            return false;}
        else {
            balance -=amount;
            System.out.println("Transaction Complete.");
            return true;
        }
    }
    public boolean deposit (double amount) {
        if( amount <= 0) {
            System.out.println("Please deposit sufficient amount");
            return false;}
        else {
            balance +=amount;
            System.out.println("Transation Complete");
            return true;}
    }
    public double futureValue(int years) {

        // Calculate future value base on the formula: FV = PV(1 + i)^n

        double futureVal = this.balance * Math.pow(1 + getInterestRate(), years);



        return futureVal;
    }
    @Override
    public String toString() {
        String output = "\n"+ "1. Savings account balance: $" + getBalance() + "\n"
                +	"2. Savings account interest rate: " + String.format("%.4f", getInterestRate1()) + "\n"
                +	"3. Savings account balance in 3 years: $" + String.format("%.2f", futureValue(3));
        return output;
    }

    public void setBalance(double openingBalance) {
        this.balance = openingBalance;
    }

    public static double getInterestRate1() {
        return interestRate;
    }

}