package com.hr.test;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class Update_Sender extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textArea_id;


    public Update_Sender() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Update Sender");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setBounds(212, 26, 312, 39);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Enter a Sender id to update");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_1.setBounds(31, 72, 261, 39);
        contentPane.add(lblNewLabel_1);

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Branch_manager frame = new Branch_manager();
                frame.setVisible(true);    
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(34, 182, 89, 23);
        contentPane.add(btnNewButton);
        
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(0, 0, 674, 397);
        contentPane.add(desktopPane);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(Update_Sender.class.getResource("/images/new.jpg")));
        lblNewLabel_2.setBounds(387, 107, 287, 320);
        desktopPane.add(lblNewLabel_2);
        
        textArea_id = new JTextField();
        textArea_id.setBounds(121, 124, 231, 20);
        desktopPane.add(textArea_id);
        textArea_id.setColumns(10);
        
                JButton btnNewButton_1 = new JButton("Next");
                btnNewButton_1.setBounds(265, 180, 89, 23);
                desktopPane.add(btnNewButton_1);
                btnNewButton_1.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Update_sender_form frame = new Update_sender_form(textArea_id.getText());
                        frame.setVisible(true);
                    	dispose();
                    }
                });
                btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
    }
}












