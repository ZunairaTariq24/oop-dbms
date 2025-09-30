package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hr.dao.Receiver_Dao;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class Updatd_Receiver_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textArea_Name;
	private JTextField textArea_email;
	private JTextField textArea_phoneno;
	private JTextField textArea_address;
	private JTextField textArea_city;
	public Updatd_Receiver_form(final String i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update a Receiver:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 522, 49);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Branch_manager frame = new Branch_manager();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(30, 276, 87, 41);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(30, 56, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Email");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(30, 91, 75, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone Number");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_3.setBounds(30, 128, 113, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(30, 160, 87, 24);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("City");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(30, 197, 87, 24);
		contentPane.add(lblNewLabel_1_5);
		
		textArea_Name = new JTextField();
		textArea_Name.setBounds(166, 60, 192, 20);
		contentPane.add(textArea_Name);
		textArea_Name.setColumns(10);
		
		textArea_email = new JTextField();
		textArea_email.setBounds(166, 89, 192, 20);
		contentPane.add(textArea_email);
		textArea_email.setColumns(10);
		
		textArea_phoneno = new JTextField();
		textArea_phoneno.setBounds(166, 126, 192, 20);
		contentPane.add(textArea_phoneno);
		textArea_phoneno.setColumns(10);
		
		textArea_address = new JTextField();
		textArea_address.setBounds(166, 163, 192, 20);
		contentPane.add(textArea_address);
		textArea_address.setColumns(10);
		
		textArea_city = new JTextField();
		textArea_city.setBounds(166, 200, 192, 20);
		contentPane.add(textArea_city);
		textArea_city.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Updatd_Receiver_form.class.getResource("/images/123.png")));
		lblNewLabel_2.setBounds(363, 187, 333, 229);
		desktopPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(258, 275, 91, 41);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				try {
				    Receiver_Dao.updateReceiver(i,textArea_phoneno.getText(), textArea_Name.getText(), textArea_city.getText(), textArea_email.getText());
				} catch (Exception e1) {
				    e1.printStackTrace();
				}

			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
	}
}
