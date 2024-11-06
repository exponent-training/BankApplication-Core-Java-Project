package com.exponent.bankapplication.controller;

import java.util.Scanner;
import com.exponent.bankapplication.service.RBI;
import com.exponent.bankapplication.serviceimpl.SBI;

public class BankAdminController {

	// All the choices

	public static void main(String[] args) {

		System.out.println("*********WELCOME TO SBI BANK***********");

		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		RBI s = new SBI();

		while (flag) {
			System.out.println();
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println("1: CREATE BANK ACCOUNT                    |");
			System.out.println("2: SHOW ACCOUNT DETAILS                   |");
			System.out.println("3: SHOW ACCOUNT BALANCE                   |");
			System.out.println("4: DEPOSIT MONEY                          |");
			System.out.println("5: WITHDRAW MONEY                         |");
			System.out.println("6: UPDATE ACCOUNT DETAILS                 |");
			System.out.println("7: EXIT                                   |");
			System.out.println("------------------------------------------");
			System.out.println("------------------------------------------");
			System.out.println();

			
			System.out.println("Enter your  choice  between 1 to  7 :");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
			
				s.registerAccount();
				break;

			case 2:
			
				s.showAccountDetails();
				break;

			case 3:
				
				s.showAccountBalance();
				break;

			case 4:
			
				s.depositMoney();
				break;

			case 5:
				
				s.withdrawMoney();
				break;

			case 6:
				
				s.updateAccountDetails();
				break;

			case 7:
				flag = false;
				break;

			default:
				System.out.println("++++++Choose a  valid choice++++++");
			}

		}
		System.out.println("********THANK YOU*********");

	}


}
