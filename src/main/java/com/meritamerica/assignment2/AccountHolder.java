package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	 private String firstName;
	    private String middleName;
	    private String lastName;
	    private String ssn;
	    private CheckingAccount[] checkingAccount;
	    private SavingsAccount[] savingsAccount;
	    
	    // keep track of numbers of checking and saving accounts
	    private int numberOfChecking = 0;
	    private int numberOfSavings = 0;

	    AccountHolder (){}
	    AccountHolder(String firstName, String middleName, String lastName, String ssn,
	                  double checkingAccountOpeningBalance, double savingsAccountOpeningBalance ){
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.ssn = ssn;
	        
	        // instantiate array of Checking
	        checkingAccount = new CheckingAccount[10];
	        savingsAccount = new SavingsAccount[10];
	        // checkingQuantity 
	        this.checkingAccount[numberOfChecking] = new CheckingAccount(checkingAccountOpeningBalance);
	        this.savingsAccount[numberOfSavings] = new SavingsAccount(savingsAccountOpeningBalance);
	        
	        // increment number of checking and savings index;
	        numberOfChecking++;
	        numberOfSavings++;
	    }
	    
	    
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getMiddleName() {
	        return middleName;
	    }
	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }
	    public String getLastname() {
	        return lastName;
	    }
	    public void setLastname(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getSSN() {
	        return ssn;
	    }
	    public void setSSN(String ssn) {
	        this.ssn = ssn;
	    }
	    public CheckingAccount[] getCheckingAccount() {
	        return checkingAccount;
	    }

	    public SavingsAccount[] getSavingsAccount() {
	        return savingsAccount;
	    }

	    @Override
	    public String toString() {
	        return "First Name:" + this.firstName + "\n"  + "Middle Name:" + this.middleName +  "\n"  + "Last Name:" + this.lastName
	                +  "\n" + "SSN:" + this.ssn +  "\n"  +"Checking Account Balance:" + this.checkingAccount.getBalance() +
	                "\n" + "Savings Account Balance:" + this.savingsAccount.getBalance(); //Error around these two, get invoke get balance, asking to get lenght. Why?
	    }
	    
	    CheckingAccount addCheckingAccount(double openingBalance) {
	    	this.checkingAccount[this.numberOfChecking] = new CheckingAccount(openingBalance);
	    	
	    	// increment number of checking
	    	this.numberOfChecking++;
	    	
	    	return checkingAccount[this.numberOfChecking - 1];
	    }

}