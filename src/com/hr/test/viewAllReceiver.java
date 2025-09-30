package com.hr.test;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.hr.dao.Receiver_Dao;
import com.hr.bean.Receiver;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class viewAllReceiver extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTable table;

    public viewAllReceiver() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(25, 11, 573, 239);
        contentPane.add(scrollPane);

        table = new JTable();
        scrollPane.setViewportView(table);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Receiver ID");
        model.addColumn("Name");
        model.addColumn("Address");
        model.addColumn("Phone");
        model.addColumn("Email");
        model.addColumn("City");
        table.setModel(model);

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Branch_manager frame = new Branch_manager();
                frame.setVisible(true);
                dispose();  // Close the current frame
            }
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(54, 344, 89, 23);
        contentPane.add(btnNewButton);

        try {
            ArrayList<Receiver> receivers = Receiver_Dao.getAllReceivers();
            for (Receiver receiver : receivers) {
                model.addRow(new Object[]{
                        receiver.getRec_id(),
                        receiver.getRec_name(),  // Instance method call on receiver object
                        receiver.getRec_address(),  // Instance method call on receiver object
                        receiver.getRec_phone(),  // Instance method call on receiver object
                        receiver.getRec_email(),  // Instance method call on receiver object
                        receiver.getRec_city()  // Instance method call on receiver object
                });
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
