package main;

import javax.swing.SwingUtilities;

public class Launcher {
	
	public static void main(String[] args) {
		
		/* to make the program run on the same thread cause swing is not thread safe */
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				MainWindow main = new MainWindow();
				main.show();
				
				
			}
		});
		
	}

}
