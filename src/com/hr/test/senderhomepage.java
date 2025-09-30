package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class senderhomepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public senderhomepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SENDER HOMEPAGE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(65, 10, 301, 48);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Track a Parcel");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				parcelreceived frame = new parcelreceived();
				frame.setVisible(true);
				dispose();
			
		}});
		btnNewButton.setBounds(137, 114, 173, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				roleselection frame = new roleselection();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(35, 218, 89, 34);
		contentPane.add(btnNewButton_2);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\zunai\\OneDrive\\Desktop\\Project images\\courier_1.png"));
		lblNewLabel_1.setBounds(356, 205, 376, 181);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\zunai\\Downloads\\Your paragraph text (4).png"));
		lblNewLabel_2.setBounds(0, 0, 674, 397);
		desktopPane.add(lblNewLabel_2);
	}
}

