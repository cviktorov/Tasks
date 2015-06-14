package com.Mutithreading.Synchronized;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

	public static void main(String[] args) {
		ExecutorService app = Executors.newCachedThreadPool();
		
		Buffer buffer = new SynchronizedBuffer();
		
		app.execute(new Producer(buffer));
		app.execute(new Consumer(buffer));
		
		app.shutdown();

	}

}
