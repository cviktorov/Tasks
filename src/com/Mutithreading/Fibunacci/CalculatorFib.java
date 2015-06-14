package com.Mutithreading.Fibunacci;

import java.awt.image.SinglePixelPackedSampleModel;

import javax.swing.SwingWorker;

public class CalculatorFib extends SwingWorker<String, Object>{
	
	
	public CalculatorFib(int n) {
		this.n = n;
	}
	private int n;
	@Override
	protected String doInBackground() throws Exception {
		long nthFib = fibonacci( n );
		return String.valueOf( nthFib );
	}
	private long fibonacci(int n2) {
		if(n2 <= 1){
			return n2;
		} else {
			return fibonacci(n2 - 1) + fibonacci(n2 - 2);
		}
	}
	

}
