package com.exponent.bankapplication.model;

public class Account {

	// All the components an account has

	private long accountNo;

	private String accountName;
	
	private String address;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String aadharCard;

	private String PanCard;

	private long mobileNo;

	private String mailId;

	private double accountBalance;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long l) {
		this.accountNo = l;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAadharCard() {
		return aadharCard;
	}

	public void setAadharCard(String aadharCard) {
		this.aadharCard = aadharCard;
	}

	public String getPanCard() {
		return PanCard;
	}

	public void setPanCard(String panCard) {
		PanCard = panCard;
	}

	public long getMobileNO() {
		return mobileNo;
	}

	public void setMobileNO(long mobileNO) {
		this.mobileNo = mobileNO;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountName=" + accountName + ", address=" + address
				+ ", aadharCard=" + aadharCard + ", PanCard=" + PanCard + ", mobileNo=" + mobileNo + ", mailId="
				+ mailId + ", accountBalance=" + accountBalance + "]";
	}

	

}
