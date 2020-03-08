package com.meritamerica.assignment2;

import java.util.Arrays;

public class AccountHolder {
	 private String firstName;
	    private String middleName;
	    private String lastName;
	    private String ssn;
	    private CheckingAccount[] checkingAccount;
	    private SavingsAccount[] savingsAccount;
	    
	    // keep track of numbers of checkings and saving accounts
	    private int numberOfCheckings = 0;
	    private int numberOfSavings = 0;

	    AccountHolder (){}
	    AccountHolder(String firstName, String middleName, String lastName, String ssn,
	                  double checkingAccountOpeningBalance, double savingsAccountOpeningBalance ){
	        this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	        this.ssn = ssn;
	        
	        // instantiate array of Checkings
	        checkingAccount = new CheckingAccount[10];
	        savingsAccount = new SavingsAccount[10];
	        // checkingQuantity 
	        this.checkingAccount[numberOfCheckings] = new CheckingAccount(checkingAccountOpeningBalance);
	        this.savingsAccount[numberOfSaving] = new SavingsAccount(savingsAccountOpeningBalance);
	        
	        // increment number of checkings and savings index;
	        numberOfCheckings++;
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
	    public CheckingAccount getCheckingAccount() {
	        return checkingAccount;
	    }

	    public SavingsAccount getSavingsAccount() {
	        return savingsAccount;
	    }

	    @Override
	    public String toString() {
	        return "First Name:" + this.firstName + "\n"  + "Middle Name:" + this.middleName +  "\n"  + "Last Name:" + this.lastName
	                +  "\n" + "SSN:" + this.ssn +  "\n"  +"Checking Account Balance:" + this.checkingAccount.getBalance() +
	                "\n" + "Savings Account Balance:" + this.savingsAccount.getBalance();
	    }
	    
	    CheckingAccount addCheckingAccount(double openingBalance) {
	    	this.checkingAccount[this.numberOfCheckings] = new CheckingAccount(openingBalance);
	    	
	    	// increment number of checkings
	    	this.numberOfCheckings++;
	    	
	    	return checkingAccount[this.numberOfCheckings - 1];
	    }

}