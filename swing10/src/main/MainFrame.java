package main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame implements ActionListener{
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	
	public MainFrame(){
		
		initialize();
		
	}
	
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Action Listener Demo");
		frame.setSize(800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		frame.setLayout(new BorderLayout(10, 10));
		
		panel = new JPanel();
		label = new JLabel("Enter your Name: ");
		textField = new JTextField(20);
		button = new JButton("Save");
//		button.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(textField.getText());				
//			}
//		});
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		
		
		
		
		
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(textField.getText());
	}

}
