package com.hr.test;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JDesktopPane;
public class Courier_Management_System {
private JFrame frame;
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courier_Management_System window = new Courier_Management_System();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Courier_Management_System() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.setBounds(100, 100, 690, 436);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		frame.getContentPane().add(desktopPane);
		
			JLabel lblNewLabel = new JLabel("Courier Management System");
			lblNewLabel.setBounds(111, 40, 414, 69);
			desktopPane.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
			
			JButton btnNewButton = new JButton("Next");
			btnNewButton.setBounds(496, 282, 101, 36);
			desktopPane.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					roleselection frame = new roleselection();
					frame.setVisible(true);
				
				}
			});
			btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Courier_Management_System.class.getResource("/images/image.png")));
			lblNewLabel_1.setBounds(0, 135, 486, 294);
			desktopPane.add(lblNewLabel_1);
	}
}
