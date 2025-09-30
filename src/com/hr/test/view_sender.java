package com.hr.test;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.hr.dao.SenderDao;
import com.hr.bean.Sender;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class view_sender extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;
    private JButton btnNewButton;

    public view_sender() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(25, 11, 591, 239);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Sender ID");
        model.addColumn("Phone");
        model.addColumn("Email");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("City");
        table.setModel(model);
        
        btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Branch_manager frame = new Branch_manager();
				frame.setVisible(true);
				dispose();
        	}
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(55, 342, 89, 23);
        contentPane.add(btnNewButton);

        try {
            ArrayList<Sender> senders = SenderDao.getAllSenders();
            for (Sender sender : senders) {
                model.addRow(new Object[]{
                        sender.getSend_id(),
                        sender.getSend_Phone(),
                        sender.getSend_email(),
                        sender.getSend_Name(),
                        sender.getSend_Address(),
                        sender.getSend_city()
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
