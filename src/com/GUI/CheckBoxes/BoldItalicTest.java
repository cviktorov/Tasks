package com.GUI.CheckBoxes;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class BoldItalicTest extends JPanel {
	private JTextField textField;
	private JCheckBox chckbxItalic;
	private JCheckBox chckbxBold;
	private int value = 0;

	/**
	 * Create the panel.
	 */
	public BoldItalicTest() {
		setLayout(null);

		chckbxItalic = new JCheckBox("Italic");
		chckbxItalic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxItalic.isSelected()) {
					value += Font.ITALIC;
					textField.setFont(new Font("Serif", value, 14));
				} else {
					value -= Font.ITALIC;
					textField.setFont(new Font("Serif", value, 14));
				}
			}
		});
		chckbxItalic.setBounds(108, 163, 97, 23);
		add(chckbxItalic);

		chckbxBold = new JCheckBox("Bold");
		chckbxBold.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxBold.isSelected()) {
					value += Font.BOLD;
					textField.setFont(new Font("Serif", value, 14));
					
				} else {
					value -= Font.BOLD;
					textField.setFont(new Font("Serif", value, 14));
				}
			}
		});
		chckbxBold.setBounds(310, 163, 97, 23);
		add(chckbxBold);

		textField = new JTextField();
		textField.setBounds(175, 89, 107, 20);
		add(textField);
		textField.setColumns(10);

	}
}
