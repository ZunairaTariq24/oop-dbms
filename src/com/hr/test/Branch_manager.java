package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;


public class Branch_manager extends JFrame {
private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Branch_manager() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Branch Manager:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(73, 11, 513, 81);
		contentPane.add(lblNewLabel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JButton btnNewButton = new JButton("Add a new Sender");
		btnNewButton.setBounds(42, 104, 226, 29);
		desktopPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_Receiver frame = new Add_Receiver();
				frame.setVisible(true);
				dispose();
			}
			});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_1 = new JButton("Add a new Receiver");
		btnNewButton_1.setBounds(42, 144, 226, 29);
		desktopPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			Add_sender frame = new Add_sender();
			frame.setVisible(true);
			dispose();
			
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_2 = new JButton("Add a new Parcel");
		btnNewButton_2.setBounds(42, 184, 226, 29);
		desktopPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Add_parcel frame = new Add_parcel();
                frame.setVisible(true);
            	dispose();
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_3 = new JButton("Update a Sender");
		btnNewButton_3.setBounds(42, 248, 226, 29);
		desktopPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Sender frame = new Update_Sender();
				frame.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_4 = new JButton("Update a Receiver");
		btnNewButton_4.setBounds(42, 288, 226, 29);
		desktopPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update_Receiver frame = new Update_Receiver();
				frame.setVisible(true);
				dispose();	
			}
		});
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_7 = new JButton("Delete a Receiver");
		btnNewButton_7.setBounds(370, 104, 226, 29);
		desktopPane.add(btnNewButton_7);
		btnNewButton_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_6 = new JButton("Delete a Sender");
		btnNewButton_6.setBounds(370, 144, 226, 29);
		desktopPane.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Deletesender frame = new Deletesender();
				frame.setVisible(true);
			}
		});
		btnNewButton_6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_5 = new JButton("Track a Parcel");
		btnNewButton_5.setBounds(370, 199, 226, 29);
		desktopPane.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Customer_Detail frame = null;
				try {
					parcelreceived frame1 = new parcelreceived();
					frame1.setVisible(true);
					dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(true);
			}
		});
		btnNewButton_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		JButton btnNewButton_9 = new JButton("View All Receiver");
		btnNewButton_9.setBounds(370, 248, 226, 29);
		desktopPane.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				viewAllReceiver frame = new viewAllReceiver();
                frame.setVisible(true);
            	dispose();
			}
		});
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
		JButton btnNewButton_8 = new JButton("View all Sender");
		btnNewButton_8.setBounds(370, 288, 226, 29);
		desktopPane.add(btnNewButton_8);
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 view_sender frame = new view_sender();
                 frame.setVisible(true);
			}
		});
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				delete_receiver frame = new delete_receiver();
				frame.setVisible(true);
			}
		});
	}
}






