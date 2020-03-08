package com.meritamerica.assignment2;

import java.util.Arrays;
import java.util.Random;

public class MeritBank {
	private static int accIndex = 1;
	
	private int acctNumber; 
	private static AccountHolder[] accountHolder = new AccountHolder[10];
	private static CDOffering[] CDOfferings = new CDOffering[5];
	static void addAccountHolder(AccountHolder accountHolder) {
		
	}
	
	public static AccountHolder[] getAccountHolders() {
		return accountHolder;
	}
	
	public static CDOffering[] getCDOfferings() {
		return CDOfferings;
	}
	
	public static void getBestCDOffering(double depositAmount) {
		// not sure
		
	}
	
	public void getSecondBestCDOffering(double depositAmount) {
		// not sure
	}
	
	public static void clearCDOfferings() {
		for (CDOffering offering: CDOfferings) {
			offering = null;
		}
	}
	
	public static void setCDOfferings(CDOffering[] offerings) {
		// note sure but assuming that we putting 5 offerings in the array
		CDOfferings = offerings; 
	}
	
	public static long getNextAccountNumber() {
		// get back later
		return accIndex;
	}
	
	public static double totalBalances() {
		double total = 0.0;
		
		// total all balances (checking and saving) in every account
		for (AccountHolder a: accountHolder) {
			total += a.getCheckingAccount().getBalance() + a.getSavingsAccount().getBalance();
		}		//Similar error, system is wanting a .length instead of .getbalance(), do you know why?
		
		return total;
	}
	
	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureVal = presentValue * Math.pow(1 + interestRate, term);
		
		return futureVal;
	}

	public int getAcctNumber() {
		return acctNumber;
	}

	public void setAcctNumber(int acctNumber) {
		this.acctNumber = acctNumber;
	}
}
