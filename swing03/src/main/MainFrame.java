package main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		
		frame= new JFrame();
		frame.setLayout(new BorderLayout(10, 5));
		frame.setTitle("Main Frame");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
//		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
		panel.setBackground(Color.red);
		
		Button button1 = new Button("Button 1");
		panel.add(button1);
		
		Button button2 = new Button("Button 2");
		panel.add(button2);
		
		Button button3 = new Button("Button 3");
		panel.add(button3);
		
		panel.setPreferredSize(new Dimension(250, 100));
		
		frame.add(panel, BorderLayout.NORTH);
		
		
		
		
		
		
		
		
		
		frame.setVisible(true);
		
	}

}
