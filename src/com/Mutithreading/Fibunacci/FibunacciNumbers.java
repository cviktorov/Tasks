package com.Mutithreading.Fibunacci;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.concurrent.ExecutionException;

public class FibunacciNumbers extends JPanel {
	private JTextField textField;
	private JButton btnCalculate;
	private JButton btnNext;
	private JLabel lblCalculate;
	private JLabel lblNext;
	private int n1 = 0;
	private int n2 = 1;
	private int count = 1;

	/**
	 * Create the panel.
	 */
	public FibunacciNumbers() {
		setLayout(null);

		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = Integer.parseInt(textField.getText());
				lblCalculate.setText("Calculating...");
				try {
					
					CalculatorFib calc = new CalculatorFib(n);
					calc.execute();
					lblCalculate.setText(calc.get());
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		btnCalculate.setBounds(105, 109, 89, 23);
		add(btnCalculate);

		btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int temp = n1 + n2;
				n1 = n2;
				n2 = temp;

				count++;

				lblNext.setText(String.format("Number: %d, FibNumber: %d",
						count, n2));
			}
		});
		btnNext.setBounds(105, 196, 89, 23);
		add(btnNext);

		textField = new JTextField();
		textField.setBounds(269, 72, 134, 23);
		add(textField);
		textField.setColumns(10);

		lblCalculate = new JLabel("");
		lblCalculate.setBounds(279, 109, 89, 31);
		add(lblCalculate);

		lblNext = new JLabel("");
		lblNext.setBounds(296, 200, 89, 19);
		add(lblNext);

	}
}
