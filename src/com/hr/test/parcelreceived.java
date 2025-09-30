package com.hr.test;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class parcelreceived extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JTextField textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parcelreceived frame = new parcelreceived();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public parcelreceived() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				roleselection frame = new roleselection();
                frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(39, 198, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Enter a Parcel ID:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(30, 82, 179, 33);
		contentPane.add(lblNewLabel_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(192, 226, 239));
		desktopPane.setBounds(0, 0, 674, 397);
		contentPane.add(desktopPane);
		
		JLabel lblNewLabel = new JLabel("Track a Parcel");
		lblNewLabel.setBounds(106, 22, 203, 39);
		desktopPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		
		textArea = new JTextField();
		textArea.setBounds(106, 122, 206, 20);
		desktopPane.add(textArea);
		textArea.setColumns(10);
		
		JButton btnNewButton_2_1 = new JButton("Next");
		btnNewButton_2_1.setBounds(224, 197, 89, 23);
		desktopPane.add(btnNewButton_2_1);
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try {
			Customer_Detail frame1 = new Customer_Detail(textArea.getText());
					frame1.setVisible(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\zunai\\OneDrive\\Desktop\\Project images\\track.png"));
		lblNewLabel_2.setBounds(418, 85, 444, 375);
		desktopPane.add(lblNewLabel_2);
	}
}


