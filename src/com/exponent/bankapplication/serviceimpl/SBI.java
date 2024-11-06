package com.exponent.bankapplication.serviceimpl;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.exponent.bankapplication.model.Account;
import com.exponent.bankapplication.service.RBI;

public class SBI implements RBI {
	// Implements the interface

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void registerAccount() {

		ac.setAccountNo(getValidAccountNo());

		System.out.println();
		ac.setAccountName(getValidAccountName());
		System.out.println();

		System.out.println();
		System.out.println("Enter address of Account Holder:");
		ac.setAddress(sc.next());

		sc.nextLine();
		ac.setAadharCard(getValidAadharCardNo());
		System.out.println();

		ac.setPanCard(getValidPanCardNo());
		System.out.println();

		ac.setMobileNO(getValidMobileNo());
		System.out.println();

		ac.setMailId(getMailId());
		System.out.println();

		System.out.println("Enter your account opening balance :");

		long balance = sc.nextLong();
		ac.setAccountBalance(balance);

		System.out.println("******Account register Succesfully*******");

	}

	
	// validations
	private long getValidAccountNo() {
		System.out.println("Enter Your Account Number: ");
		long accNo = sc.nextLong();
		

		// convert accno to String
		String accNostring = String.valueOf(accNo);

		if (accNostring.length() == 12 && Pattern.matches("[0-9]{12}", accNostring)) {
			System.out.println("Valid  account no added");
		} else {
			System.out.println("Invalid account  no  , Account  no  should be  of  12 digit");
			return getValidAccountNo();
		}

		return accNo;

	}

	private String getValidAccountName() {
		System.out.println("Enter your  account name:");
		String name = sc.next();
		if (Pattern.matches("[a-zA-Z ]+", name) && name.length() <= 15) {
			System.out.println("Valid name added");
		} else {
			System.out.println("Invalid account name ,only 15 characters allowed");
			return getValidAccountName();
		}
		return name;

	}

	private String getValidAadharCardNo() {
		System.out.println("Enter your AadharCard no:");
		String aadharNo = sc.nextLine();
		if (Pattern.matches("^[2-9]{1}[0-9]{3}[ -]?[0-9]{4}[ -]?[0-9]{4}$", aadharNo) && aadharNo.length() == 14
				&& aadharNo != null) {
			System.out.println("Valid Aadhar card no added");
		} else {
			System.out.println("Invalid Aadhar no , only 12 numbers allowed ");
			return getValidAadharCardNo();
		}
		return aadharNo;
	}

	private String getValidPanCardNo() {
		System.out.println("Enter your PanCard no:");
		String panNo = sc.next();
		if (Pattern.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}", panNo) && panNo.length() == 10 && panNo != null) {
			System.out.println("Valid Pan card no added");
		} else {
			System.out.println("Invalid Pan card no ,only 10 alphanumeric  are allowed");
			return getValidPanCardNo();
		}
		return panNo;

	}

	private long getValidMobileNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your new mobile no:");
		long mobileNo = 0;

		try {
			mobileNo = sc.nextLong();
		} catch (Exception e) {
			System.out.println("Enter the mobileno in digits");
			return getValidMobileNo();
		}

		// convert mobileNo to String
		String convert = String.valueOf(mobileNo);

		if (Pattern.matches("[0-9]{10}", convert) && convert.length() == 10) {
			System.out.println("Valid  Mobile no added");
		} else {
			System.out.println("Invalid Mobile no , only 10 numbers allowed");
			return getValidMobileNo();
		}

		return mobileNo;

	}

	private String getMailId() {
		System.out.println("Enter your mailId :");
		String mailId = sc.next();

		if (Pattern.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}", mailId)) {
			System.out.println("Valid emailid added");
		} else {
			System.out.println("Invalid email id");
			return getMailId();
		}
		return mailId;
	}

	@Override
	public void showAccountDetails() {

		System.out.println("Enter Account No.:");
		long accNo = sc.nextLong();

		System.out.println();

		if (accNo == ac.getAccountNo()) {
			System.out.println("Your details are as follows : " + ac);
		} else {
			System.out.println("---------Account not  found---------- ");
		}

	}

	@Override
	public void showAccountBalance() {

		System.out.println("Enter Account No.:");
		long accNo = sc.nextLong();

		if (accNo == ac.getAccountNo()) {
			System.out.println("Your account balance is : " + ac.getAccountBalance());
		} else {
			System.out.println("---------Account not  found---------- ");
		}

	}

	@Override
	public void depositMoney() {

		System.out.println("Enter Account No.:");
		long accNo = sc.nextLong();

		if (accNo == ac.getAccountNo()) {
			System.out.println("Enter the amount  you want  to deposit :");
			int deposit = sc.nextInt();
			double update = (ac.getAccountBalance() + deposit);

			ac.setAccountBalance(update);

			System.out.println("Your deposit  amount is :" + deposit);
			System.out.println("Total balance is :" + ac.getAccountBalance());

			System.out.println("*****Deposit Successful*******");
		} else {
			System.out.println("---------Account not  found---------- ");
		}

	}

	@Override
	public int withdrawMoney() {

		System.out.println("Enter Account No.:");
		long accNo = sc.nextLong();

		int withdraw = 0;

		if (accNo == ac.getAccountNo()) {
			System.out.println("Enter the amount  you want  to withdraw :");
			withdraw = sc.nextInt();
			if (withdraw < ac.getAccountBalance()) {
				double update = (ac.getAccountBalance() - withdraw);
				ac.setAccountBalance(update);
				System.out.println("Your withdraw  amount is :" + withdraw);
				System.out.println("Total balance is :" + ac.getAccountBalance());
				System.out.println("*****Withdraw Successful*******");

			} else {
				System.out.println("#######Limit exceed########");
				System.out.println("Amount  should be  less than " + ac.getAccountBalance());
				return withdrawMoney();
			}
		} else {
			System.out.println("---------Account not  found---------- ");
		}
		return withdraw;

	}

	@Override
	public void updateAccountDetails() {

		System.out.println("Enter Account No.:");
		long accNo = sc.nextLong();

		if (accNo == ac.getAccountNo()) {

			boolean flag = true;

			while (flag) {
				System.out.println();
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println("1: UPDATE MOBILE NO                       |");
				System.out.println("2: UPDATE EMAIL ID                        |");
				System.out.println("3: UPDATE ADDRESS                         |");
				System.out.println("4: EXIT                                   |");
				System.out.println("------------------------------------------");
				System.out.println("------------------------------------------");
				System.out.println();

				System.out.println("Enter your  choice  between 1 to  4 :");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					updateMobileNo();
					break;

				case 2:
					updateEmailId();
					break;

				case 3:
					updateAddress();
					break;

				case 4:
					flag = false;
					break;

				default:
					System.out.println("+++++Invalid choice++++++");
				}
			}
			System.out.println("***** Update Successful********");

		} else {
			System.out.println("---------Account not  found---------- ");
		}

	}

	
	// update code

	public void updateMobileNo() {

		long mobileNo = getValidMobileNo();
		ac.setMobileNO(mobileNo);
		System.out.println("Your updated mobileno is : " + ac.getMobileNO());

	}

	public void updateEmailId() {

		String email = getMailId();
		ac.setMailId(email);
		System.out.println("Your updated emailId is : " + ac.getMailId());

	}

	public void updateAddress() {

		System.out.println("Enter updated address:");
		String address = sc.next();
		ac.setAddress(address);
		System.out.println("Your updated address is : " + ac.getAddress());

	}

}
