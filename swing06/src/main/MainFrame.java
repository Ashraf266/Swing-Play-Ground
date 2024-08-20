package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("GridLayout Demo");
		
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
//		panel = new JPanel(new GridLayout());
		//								rows, columns, gaps
		panel = new JPanel(new GridLayout(5, 0, 10 ,10));
//		panel = new JPanel(new GridLayout());
		
		for(int i=1; i<=23; i++)
		{
			JButton button = new JButton("Button "+Integer.toString(i));
			panel.add(button);
		}
		
		frame.add(panel);
		frame.pack();
		
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	
}