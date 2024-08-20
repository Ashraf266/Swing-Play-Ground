package main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
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
		
		panel = new JPanel();
		
		button = createButton("Print", "print.png");
		panel.add(button);		
		
		
		
		

		frame.add(panel, BorderLayout.CENTER);
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
	public JButton createButton(String name, String icon) {
		
		JButton button = new JButton(name);
		button.setFocusable(false);
		ImageIcon imageIcon = new ImageIcon(icon);
		button.setIcon(imageIcon);
		button.setIconTextGap(10);
		button.setMnemonic(KeyEvent.VK_P);
		button.setToolTipText(name +" Button");
		button.setFont(new Font("Arial", Font.PLAIN, 24));
		button.setMargin(new Insets(10, 10, 10, 10));//like padding in CSS
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(name+" Button has been clicked");
			}
		});
		
//		button.setEnabled(false);
		
		button.doClick();
		
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		
		button.setVerticalTextPosition(SwingConstants.CENTER);
		button.setHorizontalTextPosition(SwingConstants.LEFT);
		
		
		button.setPreferredSize(new Dimension(200, 75));
		
		return button;
	}
	
	
}