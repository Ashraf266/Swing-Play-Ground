package main;

import javax.swing.JFrame;

public class MainWindow {
	
	private JFrame window;//JFrame reference
	
	public MainWindow() {
		window = new JFrame();
		window.setTitle("Hello World!");//program title
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//close the program on exit
		window.setSize(800, 500);//width and height
		window.setLocationRelativeTo(null);//center the window in the screen
	}

	public void show() {
		window.setVisible(true);
	}
}
