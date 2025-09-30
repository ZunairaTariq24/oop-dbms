package com.hr.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.hr.bean.Receiver;
import com.hr.bean.Sender;
import com.hr.bean.Package;
import com.hr.dao.Receiver_Dao;
import com.hr.dao.SenderDao;
import com.hr.dao.parcel_dao;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

public class Customer_Detail extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public Customer_Detail(String pack_Id) throws Exception {

        // Fetching data from DAOs
        Sender sender = SenderDao.getAllSenders().get(0); // Assuming you get at least one sender
        Package parcel = parcel_dao.getPackagesByID(pack_Id).get(0); // Assuming you get at least one package
        Receiver receiver = Receiver_Dao.getReceiverByID(pack_Id).get(0); // Assuming receiver is fetched using pack_Id

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 690, 436);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Sender Detail");
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblNewLabel.setBounds(30, 0, 246, 35);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("Name");
        lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_1.setBounds(57, 35, 46, 14);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_3 = new JLabel("City");
        lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_3.setBounds(57, 57, 46, 14);
        contentPane.add(lblNewLabel_3);

        JLabel lblReceiverDetail = new JLabel("Receiver Detail");
        lblReceiverDetail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblReceiverDetail.setBounds(30, 102, 246, 35);
        contentPane.add(lblReceiverDetail);

        JLabel lblNewLabel_1_1 = new JLabel("Name");
        lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_1_1.setBounds(57, 148, 46, 14);
        contentPane.add(lblNewLabel_1_1);

        JLabel lblNewLabel_3_1 = new JLabel("City");
        lblNewLabel_3_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_3_1.setBounds(57, 173, 46, 14);
        contentPane.add(lblNewLabel_3_1);

        JLabel lblNewLabel_5_1 = new JLabel("Phone Number");
        lblNewLabel_5_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_5_1.setBounds(57, 198, 117, 14);
        contentPane.add(lblNewLabel_5_1);

        JLabel lblParcelDetail = new JLabel("Parcel Detail");
        lblParcelDetail.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
        lblParcelDetail.setBounds(30, 221, 246, 35);
        contentPane.add(lblParcelDetail);

        JLabel lblNewLabel_7 = new JLabel("Parcel Id");
        lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 16));
        lblNewLabel_7.setBounds(57, 255, 98, 14);
        contentPane.add(lblNewLabel_7);

        JLabel lblNewLabel_16 = new JLabel("");
        lblNewLabel_16.setIcon(new ImageIcon(Customer_Detail.class.getResource("/images/images.jpeg")));
        lblNewLabel_16.setBounds(369, 118, 295, 237);
        contentPane.add(lblNewLabel_16);

        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(0, 0, 674, 397);
        contentPane.add(desktopPane);

        JLabel lblNewLabel_2 = new JLabel(sender.getSend_Name());
        lblNewLabel_2.setBounds(224, 33, 46, 14);
        desktopPane.add(lblNewLabel_2);

        JLabel lblNewLabel_5 = new JLabel("Phone Number");
        lblNewLabel_5.setBounds(51, 77, 117, 14);
        desktopPane.add(lblNewLabel_5);
        lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 16));

        JLabel lblNewLabel_4 = new JLabel(sender.getSend_city());
        lblNewLabel_4.setBounds(224, 58, 85, 14);
        desktopPane.add(lblNewLabel_4);

        JLabel lblNewLabel_2_1 = new JLabel(receiver.getRec_name());
        lblNewLabel_2_1.setBounds(169, 145, 46, 14);
        desktopPane.add(lblNewLabel_2_1);

        JLabel lblNewLabel_6_1 = new JLabel(receiver.getRec_phone());
        lblNewLabel_6_1.setBounds(169, 198, 146, 14);
        desktopPane.add(lblNewLabel_6_1);

        JLabel lblNewLabel_4_1 = new JLabel(receiver.getRec_city());
        lblNewLabel_4_1.setBounds(166, 170, 85, 14);
        desktopPane.add(lblNewLabel_4_1);

        JLabel lblNewLabel_6 = new JLabel(sender.getSend_Phone());
        lblNewLabel_6.setBounds(202, 77, 146, 14);
        desktopPane.add(lblNewLabel_6);

        JLabel lblNewLabel_12 = new JLabel(parcel.getPack_id());
        lblNewLabel_12.setBounds(224, 256, 46, 14);
        desktopPane.add(lblNewLabel_12);

        JLabel lblNewLabel_13 = new JLabel("28jan2024");
        lblNewLabel_13.setBounds(202, 281, 89, 14);
        desktopPane.add(lblNewLabel_13);

        JLabel lblNewLabel_14 = new JLabel("23Feb2024");
        lblNewLabel_14.setBounds(202, 299, 107, 14);
        desktopPane.add(lblNewLabel_14);

        JLabel lblNewLabel_15 = new JLabel(parcel.getWEIGHT());
        lblNewLabel_15.setBounds(224, 324, 46, 14);
        desktopPane.add(lblNewLabel_15);
        
                JLabel lblNewLabel_8 = new JLabel("Dispatch date");
                lblNewLabel_8.setBounds(51, 280, 100, 14);
                desktopPane.add(lblNewLabel_8);
                lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 16));
                
                        JLabel lblNewLabel_9 = new JLabel("Arrival Date");
                        lblNewLabel_9.setBounds(51, 298, 78, 14);
                        desktopPane.add(lblNewLabel_9);
                        lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 16));
                        
                                JLabel lblNewLabel_10 = new JLabel("Weight");
                                lblNewLabel_10.setBounds(51, 305, 68, 25);
                                desktopPane.add(lblNewLabel_10);
                                lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 16));
                                
                                        JLabel lblNewLabel_11 = new JLabel("Destination City");
                                        lblNewLabel_11.setBounds(39, 324, 150, 25);
                                        desktopPane.add(lblNewLabel_11);
                                        lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 16));
                                        
                                                JLabel lblNewLabel_17 = new JLabel("Service Charges");
                                                lblNewLabel_17.setBounds(39, 349, 191, 21);
                                                desktopPane.add(lblNewLabel_17);
                                                lblNewLabel_17.setFont(new Font("Times New Roman", Font.BOLD, 16));
                                                
                                                        JLabel lblNewLabel_18 = new JLabel("600");
                                                        lblNewLabel_18.setBounds(202, 346, 164, 29);
                                                        desktopPane.add(lblNewLabel_18);
    }
}

