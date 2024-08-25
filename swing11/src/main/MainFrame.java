package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Nimbus Look & Feel Demo");
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		
		
		panel = new JPanel();
		panel.setBackground(Color.pink);
		label = new JLabel("Label 1");
		textField = new JTextField(20);
		
		
		panel.add(label);
		panel.add(textField);
		panel.add(new JButton("Button"));
		panel.add(new JButton("Button"));
		panel.add(new JButton("Button"));
		panel.add(new JButton("Button"));
		

		
		
		frame.add(panel, BorderLayout.CENTER);
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	
}