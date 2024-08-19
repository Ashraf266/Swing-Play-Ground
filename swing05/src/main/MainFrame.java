package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

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
		frame.setTitle("FlowLayout Demo");
		
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.PINK);
		panel.setPreferredSize(new Dimension(100, 100));
		
		for(int i=1; i<=5; i++)
		{
			JButton button = new JButton("Button "+ Integer.toString(i));
			panel.add(button);
			
		}
		
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		frame.add(panel, BorderLayout.NORTH);
		//NOTE: NORTH and SOUTH do not change their height once they are constructed
		//		WEST and EAST	do not change their width once they are constructed
		
		
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	
}