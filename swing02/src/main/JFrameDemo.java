package main;
import javax.swing.SwingUtilities;


public class JFrameDemo {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				/* First way to create a JFrame by inheritance .. NOT BEST PRACTICE */
				JFrameOne frame1 = new JFrameOne();
				// frame1.method exposes all JFrame methods as it extends JFrame
				
				
				/* Second way to create a JFrame by composition .. BEST PRACTICE */
				JFrameTwo frame2 = new JFrameTwo();
				
				
			}
		});
		
	}

}
