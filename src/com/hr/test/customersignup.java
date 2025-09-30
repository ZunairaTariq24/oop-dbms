package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.hr.dao.Receiver_Dao;
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

public class customersignup extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel textArea_password;
	private String role;
	private JTextField textArea_name;
	private JTextField textArea_email;
	private JTextField textArea_Address;
	private JTextField textArea_city;
	private JTextField textArea_phoneno;
	private JTextField textArea_password_1;
		public customersignup(String selectedRole) {
		 this.role = selectedRole;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		textArea_password = new JPanel();
		textArea_password.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(textArea_password);
		textArea_password.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setBounds(52, 72, 46, 14);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textArea_password.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Sign Up");
		lblNewLabel.setBounds(267, 24, 102, 35);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		textArea_password.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setBounds(52, 101, 46, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textArea_password.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Address:");
		lblNewLabel_3.setBounds(46, 132, 72, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textArea_password.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("City:");
		lblNewLabel_4.setBounds(52, 165, 46, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textArea_password.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phone no:");
		lblNewLabel_5.setBounds(52, 196, 66, 18);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		textArea_password.add(lblNewLabel_5);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			
			roleselection frame = new roleselection();
			frame.setVisible(true);
			
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(9, 277, 89, 23);
		textArea_password.add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(52, 242, 89, 14);
		textArea_password.add(lblNewLabel_6);
		
		textArea_name = new JTextField();
		textArea_name.setBounds(128, 70, 175, 20);
		textArea_password.add(textArea_name);
		textArea_name.setColumns(10);
		
		textArea_email = new JTextField();
		textArea_email.setBounds(128, 99, 175, 20);
		textArea_password.add(textArea_email);
		textArea_email.setColumns(10);
		
		textArea_Address = new JTextField();
		textArea_Address.setBounds(128, 130, 175, 20);
		textArea_password.add(textArea_Address);
		textArea_Address.setColumns(10);
		
		textArea_city = new JTextField();
		textArea_city.setBounds(128, 163, 175, 20);
		textArea_password.add(textArea_city);
		textArea_city.setColumns(10);
		
		textArea_phoneno = new JTextField();
		textArea_phoneno.setBounds(128, 196, 175, 20);
		textArea_password.add(textArea_phoneno);
		textArea_phoneno.setColumns(10);
		
		textArea_password_1 = new JTextField();
		textArea_password_1.setBounds(128, 240, 175, 20);
		textArea_password.add(textArea_password_1);
		textArea_password_1.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(-11, 0, 685, 397);
		textArea_password.add(desktopPane);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(customersignup.class.getResource("/images/new.jpg")));
		lblNewLabel_7.setBounds(387, 116, 507, 307);
		desktopPane.add(lblNewLabel_7);
		
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(290, 280, 89, 23);
		desktopPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				
				 if (role.equals("Sender")) {
	                    senderhomepage senderSignup = new senderhomepage();
	                    senderSignup.setVisible(true);
	                    try {
	               User_enter_dao.insert_user(role,textArea_email.getText(),textArea_password_1.getText());
	                SenderDao.insert_user( textArea_phoneno.getText() ,  textArea_email.getText(), textArea_name.getText() ,textArea_Address.getText(), textArea_city.getText());
	                    }
	                    catch (Exception e1) {
	                    	e1.printStackTrace();
	                    }
	                } else if (role.equals("Receiver")) {
	                    receiverhomepage receiverSignup = new receiverhomepage();
	                    receiverSignup.setVisible(true);
	                    try {
	     	               User_enter_dao.insert_user(role,textArea_email.getText(),textArea_password_1.getText());
	     	              Receiver_Dao.insert_user(  textArea_phoneno.getText() ,  textArea_email.getText(), textArea_name.getText() ,textArea_Address.getText(), textArea_city.getText());
	     	     }
	     	                    catch (Exception e1) {
	     	                    	e1.printStackTrace();
	     	                    }
	                    
	                    
	                } else if (role.equals("Branch Manager")) {
	                	Branch_manager frame = new Branch_manager();
						frame.setVisible(true);
			}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		}
}


