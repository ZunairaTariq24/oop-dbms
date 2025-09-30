package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class Update_Receiver extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane; 
	private JTextField textArea_Id;Update_Receiver() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Receiver");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(210, 26, 312, 39);
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
		btnNewButton.setBounds(34, 231, 89, 23);
		contentPane.add(btnNewButton);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JButton btnNewButton_1 = new JButton("Next");
		btnNewButton_1.setBounds(278, 231, 89, 23);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Updatd_Receiver_form frame = new Updatd_Receiver_form (textArea_Id.getText());
                frame.setVisible(true);
            	dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		textArea_Id = new JTextField();
		textArea_Id.setBounds(159, 108, 257, 20);
		desktopPane.add(textArea_Id);
		textArea_Id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a Receiver id to update");
		lblNewLabel_1.setBounds(20, 70, 237, 27);
		desktopPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Update_Receiver.class.getResource("/images/new.jpg")));
		lblNewLabel_2.setBounds(384, 139, 343, 258);
		desktopPane.add(lblNewLabel_2);
	
	}
}
