package com.hr.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class roleselection extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private String selectedRole = "Select your Role:";

    public roleselection() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBackground(new Color(255, 255, 255));
        desktopPane.setBounds(0, 0, 690, 397);
        contentPane.add(desktopPane);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(roleselection.class.getResource("/images/courier_m1.png")));
        lblNewLabel.setBounds(236, 188, 664, 209);
        desktopPane.add(lblNewLabel);
        
                final JComboBox<String> comboBox = new JComboBox<String>();
                comboBox.setBounds(207, 38, 182, 30);
                desktopPane.add(comboBox);
                comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Select your Role:", "Sender", "Receiver", "Branch Manager"}));
                comboBox.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        selectedRole = (String) comboBox.getSelectedItem();
                    }
                });
                comboBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
                
                        JButton btnNewButton_1 = new JButton("Sign in");
                        btnNewButton_1.setBounds(73, 92, 125, 35);
                        desktopPane.add(btnNewButton_1);
                        btnNewButton_1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                customersignin frame = new customersignin(selectedRole);
                                frame.setVisible(true);
                            	dispose();
                            }
                        });
                        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
                        
                                JButton btnNewButton_2 = new JButton("Sign up");
                                btnNewButton_2.setBounds(73, 169, 125, 35);
                                desktopPane.add(btnNewButton_2);
                                btnNewButton_2.addActionListener(new ActionListener() {
                                    public void actionPerformed(ActionEvent e) {
                                        if ("Branch Manager".equals(selectedRole)) {
                                            branch_signup frame = new branch_signup();
                                            frame.setVisible(true);
                                        	dispose();
                                        } else {
                                            customersignup frame = new customersignup(selectedRole);
                                            frame.setVisible(true);
                                        	dispose();
                                        }
                                    }
                                });
                                btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
    }

 
}
