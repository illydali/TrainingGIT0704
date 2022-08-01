package com.demo.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogEx {
	public static void main(String[] args) {
		JFrame windowFrame = new JFrame();
		JButton button = new JButton();
		button.setText("Show dialog?");
		windowFrame.add(button);
		windowFrame.pack();
		windowFrame.setVisible(true);

		MyActionListener myActionListener = new MyActionListener(windowFrame);
		button.addActionListener(myActionListener);

	}
}

class MyActionListener implements ActionListener {
	JFrame windowFrame = null;
	public MyActionListener(JFrame windowFrame){
		this.windowFrame = windowFrame;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String messageString = JOptionPane.showInputDialog(windowFrame, "Enter message", null);
		System.err.println(messageString);
	}
}