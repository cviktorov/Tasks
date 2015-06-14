package com.Mutithreading.Synchronized;

public class Producer implements Runnable {

	public Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(3000);
				buffer.set(i);
				System.out.println("Sum producer: " + i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
