package main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {
	
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("BorderLayout Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		//					horizontal gap, vertical gap
		frame.setLayout(new BorderLayout(5, 5));
		
		//OR
		
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setHgap(0);
		borderLayout.setVgap(0);
		frame.setLayout(borderLayout);

		frame.add(new JButton("NORTH"), BorderLayout.NORTH);
		frame.add(new JButton("CENTER"), BorderLayout.CENTER);
		frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frame.add(new JButton("WEST"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	
}