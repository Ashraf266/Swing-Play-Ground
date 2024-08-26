package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Nimbus Look & Feel Demo");
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		
		
		
//		panel = new JPanel(new MigLayout("wrap, insets 10, fill, debug", "[]25[]50[]", "[]10[]10[]"));
//
//		for(int i =1; i<=9; i++)
//		{
//			
////			if(i==3 || i==6)
////				panel.add(new JButton("Button "+i), "wrap"); 
////			else
//				panel.add(new JButton("Button "+i));
//		}
		
		
		panel = new JPanel(new MigLayout());

		JLabel firstNameLabel = new JLabel("First Name"),
				lastNameLabel = new JLabel("Last Name"),
				addressLabel = new JLabel("Address");

		JTextField firstNameTextField = new JTextField(15),
				lastNameTextField = new JTextField(15),
				addressTextField = new JTextField(15);
		
		
	    panel.add(firstNameLabel);
	    panel.add(firstNameTextField);
	    panel.add(lastNameLabel,       "gap unrelated");
	    panel.add(lastNameTextField,   "wrap");
	    panel.add(addressLabel);
	    panel.add(addressTextField,    "span, grow");

		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.pack();
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	
}