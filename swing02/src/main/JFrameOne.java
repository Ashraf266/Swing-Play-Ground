package main;

import javax.swing.JFrame;

public class JFrameOne extends JFrame {
	
	public JFrameOne() {
		initialize();
	}
	
	private void initialize() {
		setTitle("JFrameOne");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//what to do on clicking the X button
		setSize(500,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}

}
