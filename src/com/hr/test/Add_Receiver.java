package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hr.dao.SenderDao;
import com.hr.dao.User_enter_dao;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class Add_Receiver extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textArea_name;
	private JTextField textArea_address;
	private JTextField textArea_city;
	private JTextField textArea_email;
	private JTextField textArea_phoneno;
	private JTextField textArea_receiverid;
	private JTextField textArea_password_1;
	public Add_Receiver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(37, 69, 57, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(37, 121, 84, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(37, 178, 64, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone No");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(37, 222, 84, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(37, 153, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_5 = new JLabel("Receiver Id");
		lblNewLabel_5.setBounds(38, 254, 113, 14);
		desktopPane.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		

		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setBounds(38, 288, 84, 14);
		desktopPane.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.setBounds(524, 349, 89, 23);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
                try {
           User_enter_dao.insert_user("sender",textArea_email.getText(),textArea_password_1.getText());
           SenderDao.insert_user( textArea_phoneno.getText() ,  textArea_email.getText(), textArea_name.getText() ,textArea_address.getText(), textArea_city.getText());
                }
                catch (Exception e1) {
                	e1.printStackTrace();
                }

				senderhomepage senderSignup = new senderhomepage();
                senderSignup.setVisible(true);
            	dispose();
			
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(33, 349, 89, 23);
		desktopPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Branch_manager frame = new Branch_manager();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel = new JLabel("Add a new Sender");
		lblNewLabel.setBounds(208, 0, 266, 75);
		desktopPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		textArea_name = new JTextField();
		textArea_name.setBounds(208, 79, 188, 20);
		desktopPane.add(textArea_name);
		textArea_name.setColumns(10);
		
		textArea_address = new JTextField();
		textArea_address.setBounds(208, 110, 188, 20);
		desktopPane.add(textArea_address);
		textArea_address.setColumns(10);
		
		textArea_city = new JTextField();
		textArea_city.setBounds(208, 151, 188, 20);
		desktopPane.add(textArea_city);
		textArea_city.setColumns(10);
		
		textArea_email = new JTextField();
		textArea_email.setBounds(208, 182, 188, 20);
		desktopPane.add(textArea_email);
		textArea_email.setColumns(10);
		
		textArea_phoneno = new JTextField();
		textArea_phoneno.setBounds(208, 213, 188, 20);
		desktopPane.add(textArea_phoneno);
		textArea_phoneno.setColumns(10);
		
		textArea_receiverid = new JTextField();
		textArea_receiverid.setBounds(208, 252, 188, 20);
		desktopPane.add(textArea_receiverid);
		textArea_receiverid.setColumns(10);
		
		textArea_password_1 = new JTextField();
		textArea_password_1.setBounds(208, 286, 188, 20);
		desktopPane.add(textArea_password_1);
		textArea_password_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Add_Receiver.class.getResource("/images/branch_2.png")));
		lblNewLabel_8.setBounds(321, 50, 343, 347);
		desktopPane.add(lblNewLabel_8);
		
	}
}

