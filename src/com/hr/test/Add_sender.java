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
public class Add_sender extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textArea_name;
	private JTextField textArea_address;
	private JTextField textArea_city;
	private JTextField textArea_email;
	private JTextField textArea_phoneno;
	private JTextField textArea_ID;
	private JTextField textArea_password_1;

	public Add_sender() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add a new Receiver");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(187, 0, 339, 75);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(30, 69, 60, 41);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(30, 121, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(30, 188, 64, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Phone No");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(30, 222, 84, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Sender Id");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_5.setBounds(30, 254, 103, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("City");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_6.setBounds(30, 155, 64, 14);
		contentPane.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Branch_manager frame = new Branch_manager();
				frame.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(30, 331, 89, 23);
		contentPane.add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
                try {
           User_enter_dao.insert_user("sender",textArea_email.getText(),textArea_password_1.getText());
           SenderDao.insert_user(textArea_phoneno.getText() ,  textArea_email.getText(), textArea_name.getText() ,textArea_address.getText(), textArea_city.getText());
                }
                catch (Exception e1) {
                	e1.printStackTrace();
                }
                receiverhomepage senderSignup = new receiverhomepage();
                senderSignup.setVisible(true);
                dispose();
			}
			
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(528, 331, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Password");
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_7.setBounds(30, 291, 70, 14);
		contentPane.add(lblNewLabel_7);
		
		textArea_name = new JTextField();
		textArea_name.setBounds(117, 80, 245, 20);
		contentPane.add(textArea_name);
		textArea_name.setColumns(10);
		
		textArea_address = new JTextField();
		textArea_address.setBounds(117, 119, 245, 20);
		contentPane.add(textArea_address);
		textArea_address.setColumns(10);
		
		textArea_city = new JTextField();
		textArea_city.setBounds(117, 153, 245, 20);
		contentPane.add(textArea_city);
		textArea_city.setColumns(10);
		
		textArea_email = new JTextField();
		textArea_email.setBounds(117, 186, 245, 20);
		contentPane.add(textArea_email);
		textArea_email.setColumns(10);
		
		textArea_phoneno = new JTextField();
		textArea_phoneno.setBounds(117, 220, 245, 20);
		contentPane.add(textArea_phoneno);
		textArea_phoneno.setColumns(10);
		
		textArea_ID = new JTextField();
		textArea_ID.setBounds(117, 252, 245, 20);
		contentPane.add(textArea_ID);
		textArea_ID.setColumns(10);
		
		textArea_password_1 = new JTextField();
		textArea_password_1.setBounds(117, 289, 245, 20);
		contentPane.add(textArea_password_1);
		textArea_password_1.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Add_sender.class.getResource("/images/receiver1.png")));
		lblNewLabel_8.setBounds(388, 11, 313, 396);
		desktopPane.add(lblNewLabel_8);
	

	}

}