package com.hr.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.hr.dao.BranchManager_Dao;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class branch_signup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField_City;
	private JTextField textField_Distance;
	private JTextField textField_Charges;
	public branch_signup() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH SIGN UP");
		lblNewLabel_3.setBounds(142, 11, 448, 66);
		desktopPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 31));
		
		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(57, 83, 46, 14);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Distance");
		lblNewLabel_1.setBounds(57, 136, 75, 14);
		desktopPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Charges");
		lblNewLabel_2.setBounds(57, 189, 75, 14);
		desktopPane.add(lblNewLabel_2);
		
		textField_City = new JTextField();
		textField_City.setBounds(188, 80, 158, 20);
		desktopPane.add(textField_City);
		textField_City.setColumns(10);
		
		textField_Distance = new JTextField();
		textField_Distance.setBounds(188, 133, 158, 20);
		desktopPane.add(textField_Distance);
		textField_Distance.setColumns(10);
		
		textField_Charges = new JTextField();
		textField_Charges.setBounds(188, 200, 158, 20);
		desktopPane.add(textField_Charges);
		textField_Charges.setColumns(10);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.setBounds(257, 322, 89, 23);
		desktopPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(branch_signup.class.getResource("/images/123.png")));
		lblNewLabel_4.setBounds(365, 147, 319, 267);
		desktopPane.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(57, 322, 89, 23);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				roleselection frame = new roleselection();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BranchManager_Dao.insert_user(textField_City.getText(),textField_Distance.getText(),textField_Charges.getText());
					 branch_signup frame = new branch_signup();
                     frame.setVisible(true);
                     dispose();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
	}
}
