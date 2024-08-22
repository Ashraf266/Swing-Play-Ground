package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		
		frame = new JFrame();
		frame.setLayout(new BorderLayout());
		
		frame.setTitle("JTextField Demo");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLocationRelativeTo(null);
		frame.setResizable(true);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.gray);
		
		
		textField = createNewTextField();
		label = new JLabel("Name: ");
		label.setForeground(Color.white);
		label.setFont(new Font("Sans-serif", Font.BOLD, 24));
		
		
		
		panel.add(label);
		panel.add(textField);
		frame.add(panel, BorderLayout.CENTER);
	}
	
	public void show()
	{
		frame.setVisible(true);
	}
	
	private JTextField createNewTextField() {
		
		JTextField textField = new JTextField();
		textField.setColumns(30);
		textField.setFont(new Font("Arial", Font.BOLD, 24));
		textField.setForeground(new Color(0, 0, 255));
		textField.setBackground(Color.yellow);
		textField.setToolTipText("Enter Your Name");
		textField.setMargin(new Insets(5, 10, 5, 10));
		textField.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText(textField.getText());
				textField.setText("");
			}
		});
		
		
		
		
		
		return textField;
	}

}
