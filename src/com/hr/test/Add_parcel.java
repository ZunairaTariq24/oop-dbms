package com.hr.test;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import com.hr.dao.parcel_dao;
import com.hr.dao.shipment_dao;
import com.toedter.calendar.JDateChooser;

public class Add_parcel extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textArea_ServiceCharges;
    private JTextField textArea_Destination;
    private JTextField textArea_Dispatch;
    private JTextField textArea_Description;
    private JTextField textArea_Weight;
    private JTextField textArea_RId;
    private JTextField textArea_SId;
    private JDateChooser textArea_DD;
    private JDateChooser dateChooser;

    public Add_parcel() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("Sender Id");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_1.setBounds(10, 38, 92, 22);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_5 = new JLabel("Receiver Id");
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_5.setBounds(10, 71, 97, 14);
        contentPane.add(lblNewLabel_5);

        JButton btnNewButton = new JButton("Back");
        btnNewButton.addActionListener(e -> {
            Branch_manager frame = new Branch_manager();
            frame.setVisible(true);
            dispose();
        });
        btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton.setBounds(26, 331, 89, 23);
        contentPane.add(btnNewButton);

        JLabel lblNewLabel_8 = new JLabel("Service Charges");
        lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_8.setBounds(10, 302, 123, 18);
        contentPane.add(lblNewLabel_8);

        JLabel lblNewLabel_7 = new JLabel("Dispatch Date");
        lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_7.setBounds(10, 239, 101, 18);
        contentPane.add(lblNewLabel_7);

        JLabel lblNewLabel_7_1 = new JLabel("Arrival Date");
        lblNewLabel_7_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_7_1.setBounds(10, 271, 101, 18);
        contentPane.add(lblNewLabel_7_1);

        JLabel lblNewLabel_2_1 = new JLabel("Dispatch City");
        lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_2_1.setBounds(10, 174, 119, 14);
        contentPane.add(lblNewLabel_2_1);

        textArea_SId = new JTextField();
        textArea_SId.setBounds(188, 40, 208, 20);
        contentPane.add(textArea_SId);
        textArea_SId.setColumns(10);

        textArea_RId = new JTextField();
        textArea_RId.setBounds(188, 69, 208, 20);
        contentPane.add(textArea_RId);
        textArea_RId.setColumns(10);

        textArea_Weight = new JTextField();
        textArea_Weight.setBounds(188, 100, 208, 20);
        contentPane.add(textArea_Weight);
        textArea_Weight.setColumns(10);

        textArea_Description = new JTextField();
        textArea_Description.setBounds(188, 141, 208, 20);
        contentPane.add(textArea_Description);
        textArea_Description.setColumns(10);

        textArea_Dispatch = new JTextField();
        textArea_Dispatch.setBounds(188, 172, 208, 20);
        contentPane.add(textArea_Dispatch);
        textArea_Dispatch.setColumns(10);

        JLabel lblNewLabel_3 = new JLabel("Weight");
        lblNewLabel_3.setBounds(10, 97, 63, 22);
        contentPane.add(lblNewLabel_3);
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));

        JLabel lblNewLabel_3_1 = new JLabel("Description");
        lblNewLabel_3_1.setBounds(10, 130, 80, 14);
        contentPane.add(lblNewLabel_3_1);
        lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));

        textArea_Destination = new JTextField();
        textArea_Destination.setBounds(188, 204, 208, 20);
        contentPane.add(textArea_Destination);
        textArea_Destination.setColumns(10);

        textArea_DD = new JDateChooser();
        textArea_DD.setBounds(188, 238, 208, 20);
        contentPane.add(textArea_DD);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(188, 269, 208, 20);
        contentPane.add(dateChooser);

        textArea_ServiceCharges = new JTextField();
        textArea_ServiceCharges.setBounds(188, 300, 208, 20);
        contentPane.add(textArea_ServiceCharges);
        textArea_ServiceCharges.setColumns(10);

        JButton btnNewButton_1 = new JButton("Enter");
        btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
       
            try {
                // Check if dates are selected
                if (textArea_DD.getDate() == null || dateChooser.getDate() == null) {
                    JOptionPane.showMessageDialog(contentPane, "Please select both Dispatch Date and Arrival Date.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Exit method
                }

                // Convert java.util.Date to java.sql.Date
                Date dispatchDate = new Date(textArea_DD.getDate().getTime());
                Date arrivalDate = new Date(dateChooser.getDate().getTime());

                // Other variables retrieval
                String city = textArea_Destination.getText();
                String dispatch = textArea_Dispatch.getText();
                String description = textArea_Description.getText();
                String weight = textArea_Weight.getText();
                String receiver = textArea_RId.getText();
                String sender = textArea_SId.getText();

                // Insert into PACKAGE and get the generated PACK_ID
                int packId = parcel_dao.insert(receiver, sender, weight, description);

                // Use the generated PACK_ID to insert into SHIPMENT
                shipment_dao.insertShipment(packId, dispatchDate, dispatch, city, arrivalDate);

                // Success message and navigation
                senderhomepage senderSignup = new senderhomepage();
                senderSignup.setVisible(true);
                dispose();
                JOptionPane.showMessageDialog(null, "Data entered successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (ParseException | NumberFormatException e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(contentPane, "Error: Invalid date format. Please enter the date in dd-MMM-yy format (e.g., 22-JUN-24)." + e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e1) {
                e1.printStackTrace();
                JOptionPane.showMessageDialog(contentPane, "Error occurred while entering data:\n" + e1.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
			}
        });
        btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        btnNewButton_1.setBounds(555, 328, 89, 23);
        contentPane.add(btnNewButton_1);

        JLabel lblNewLabel = new JLabel("Add a new Parcel");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setBounds(199, 0, 251, 41);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_6 = new JLabel("");
        lblNewLabel_6.setIcon(new ImageIcon(Add_parcel.class.getResource("/images/images.jpeg")));
        lblNewLabel_6.setBounds(418, 45, 276, 327);
        contentPane.add(lblNewLabel_6);
    }
}
