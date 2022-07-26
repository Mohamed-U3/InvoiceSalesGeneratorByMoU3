/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mmyra
 */
public class NewInvoiceDialog extends JDialog
{
    private JTextField TextFieldofCustName;
    private JTextField TextFieldofInvDate;
    private JLabel LabelCustName;
    private JLabel LabelInvDate;
    private JButton BtnOk;
    private JButton BtnCancel;

    public NewInvoiceDialog(InvoiceFrame Frame) 
    {
        TextFieldofCustName = new JTextField(18);
        TextFieldofInvDate = new JTextField(18);
        
        LabelCustName = new JLabel("Name of Customer:");
        LabelInvDate = new JLabel("Date of Invoice:");
        
        BtnOk = new JButton("OK");
        BtnCancel = new JButton("Cancel");
        
        BtnOk.setActionCommand("OK new Invoice");
        BtnCancel.setActionCommand("Cancel new Invoice");
        
        BtnOk.addActionListener(Frame.getHandler());
        BtnCancel.addActionListener(Frame.getHandler());
        setLayout(new FlowLayout());
        setSize(360,150);
        setLocation(200,200);
        
        add(LabelCustName);
        add(TextFieldofCustName);
        
        add(LabelInvDate);
        add(TextFieldofInvDate);
        
        add(BtnOk);
        add(BtnCancel);
    }

    public JTextField getTextFieldofCustName()
    {
        return TextFieldofCustName;
    }

    public JTextField getTextFieldofInvDate()
    {
        return TextFieldofInvDate;
    }
}
