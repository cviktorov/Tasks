package com.Mutithreading.Synchronized;

public class Consumer implements Runnable{

	public Buffer buffer;
	
	 
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
	}


	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
				sum += buffer.get();
				System.out.println("Sum: " + sum);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
