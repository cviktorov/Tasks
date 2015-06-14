package com.Multithreading.Balance;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountDeposit {

	private static Account user = new Account();

	public void execute() {

		ExecutorService app = Executors.newCachedThreadPool();
		for (int i = 0; i < 10000; i++) {
			app.execute(user);
		}
		app.shutdown();
	}
}
