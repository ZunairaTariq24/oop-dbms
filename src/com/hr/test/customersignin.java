package com.hr.test;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.hr.dao.User_enter_dao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class customersignin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String role;
    private JTextField textArea_email;
    private JTextField textArea_password_1;

    public customersignin(String selectedRole) {
        this.role = selectedRole;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Sign in");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setBounds(168, 27, 112, 35);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Email:");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_1.setBounds(51, 82, 82, 24);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("Password:");
        lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        lblNewLabel_2.setBounds(51, 123, 92, 14);
        contentPane.add(lblNewLabel_2);

        JButton btnNewButton_1 = new JButton("Back");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                roleselection frame = new roleselection();
                frame.setVisible(true);
            }
        });
        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton_1.setBounds(102, 204, 89, 23);
        contentPane.add(btnNewButton_1);

        JButton btnNewButton = new JButton("Next");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	{
            			try {
            			    if (User_enter_dao.sign_in(textArea_email.getText(), textArea_password_1.getText())) {            			        
            			        if (role.equals("Sender")) {
            			            senderhomepage senderSignup = new senderhomepage();
            			            senderSignup.setVisible(true);
            			            dispose();
            			        } else if (role.equals("Receiver")) {
            			            receiverhomepage receiverSignup = new receiverhomepage();
            			            receiverSignup.setVisible(true);
            			            dispose();
            			        } else if (role.equals("Branch Manager")) {
            			            Branch_manager frame = new Branch_manager();
            			            frame.setVisible(true);
            			            dispose();
            			        } else {
            			            JOptionPane.showMessageDialog(null, "Invalid role for the user.");
            			        }
            			    } else {
            			        JOptionPane.showMessageDialog(null, "Email or password is incorrect.");
            			    }
            			} catch (Exception ex) {
            			    ex.printStackTrace();
            			}

            	}
            }
        }
        );
        
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(225, 206, 89, 23);
        contentPane.add(btnNewButton);
        
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(0, 0, 674, 397);
        contentPane.add(desktopPane);
        
        textArea_email = new JTextField();
        textArea_email.setBounds(152, 85, 202, 20);
        desktopPane.add(textArea_email);
        textArea_email.setColumns(10);
        
        textArea_password_1 = new JTextField();
        textArea_password_1.setBounds(152, 116, 203, 20);
        desktopPane.add(textArea_password_1);
        textArea_password_1.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("");
        lblNewLabel_3.setIcon(new ImageIcon(customersignin.class.getResource("/images/courier1.png")));
        lblNewLabel_3.setBounds(364, 51, 310, 346);
        desktopPane.add(lblNewLabel_3);
        
      
    }
}

