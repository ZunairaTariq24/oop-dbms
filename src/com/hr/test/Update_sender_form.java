package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.hr.dao.SenderDao;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class Update_sender_form extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textArea;
	private JTextField textArea_email;
	private JTextField textArea_PhoneNo;
	private JTextField textArea_Address;
	private JTextField textArea_City;
	public Update_sender_form(final String i) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update a Sender:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(100, -3, 522, 48);
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
		btnNewButton.setBounds(30, 276, 113, 41);
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
		lblNewLabel_1_3.setBounds(30, 128, 108, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Address");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_4.setBounds(30, 160, 87, 24);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("City");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1_5.setBounds(30, 197, 87, 24);
		contentPane.add(lblNewLabel_1_5);
		
		textArea = new JTextField();
		textArea.setBounds(150, 48, 198, 20);
		contentPane.add(textArea);
		textArea.setColumns(10);
		
		textArea_email = new JTextField();
		textArea_email.setBounds(148, 89, 200, 20);
		contentPane.add(textArea_email);
		textArea_email.setColumns(10);
		
		textArea_PhoneNo = new JTextField();
		textArea_PhoneNo.setBounds(148, 126, 200, 20);
		contentPane.add(textArea_PhoneNo);
		textArea_PhoneNo.setColumns(10);
		
		textArea_Address = new JTextField();
		textArea_Address.setBounds(148, 163, 200, 20);
		contentPane.add(textArea_Address);
		textArea_Address.setColumns(10);
		
		textArea_City = new JTextField();
		textArea_City.setBounds(150, 200, 198, 20);
		contentPane.add(textArea_City);
		textArea_City.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, -3, 674, 400);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Update_sender_form.class.getResource("/images/123.png")));
		lblNewLabel_2.setBounds(368, 186, 332, 228);
		desktopPane.add(lblNewLabel_2);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(250, 274, 113, 41);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				SenderDao.updateSender(i,textArea_PhoneNo.getText(),textArea.getText(),textArea_City.getText(),textArea_email.getText());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
	}
}

