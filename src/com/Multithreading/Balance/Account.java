package com.Multithreading.Balance;

public class Account implements Runnable{

	private int balance;
	
	

	public Account() {
		balance = 0;
	}

	private synchronized int getBalance() { // returns the current balance value, which is 0 by
						// default
		return balance;
	}

	private synchronized void  deposit(int amount) {// makes the current thread sleep for 5ms and adds
								// amount to balance
		balance += amount;
	}

	@Override
	public void run() {
		deposit(1);
		System.out.println(getBalance());
		
	}

}
