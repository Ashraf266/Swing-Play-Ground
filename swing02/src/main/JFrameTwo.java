package main;

import javax.swing.JFrame;

public class JFrameTwo extends JFrame {
	
	private JFrame frame;
	
	public JFrameTwo() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JFrameTwo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
