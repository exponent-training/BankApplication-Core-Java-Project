package com.exponent.bankapplication.service;

public interface RBI {

	// All the method that a particular bank will have

	public void registerAccount();

	public void showAccountDetails();

	public void showAccountBalance();

	public void depositMoney();

	public int withdrawMoney();

	public void updateAccountDetails();

}
