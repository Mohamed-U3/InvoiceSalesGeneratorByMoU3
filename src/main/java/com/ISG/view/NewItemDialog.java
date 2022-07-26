/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mmyra
 */
public class NewItemDialog extends JDialog
{
    private JTextField TextFieldItemName;
    private JTextField TextFieldItemCount;
    private JTextField TextFieldItemPrice;
    private JLabel LabelItemName;
    private JLabel LabelItemCount;
    private JLabel LabelItemPrice;
    private JButton BtnOk;
    private JButton BtnCancel;
    
    public NewItemDialog(InvoiceFrame Frame)
    {
        TextFieldItemName = new JTextField(18);
        TextFieldItemCount = new JTextField(18);
        TextFieldItemPrice = new JTextField(18);
        
        LabelItemName = new JLabel("Name of Item");
        LabelItemCount = new JLabel("Count of Item");
        LabelItemPrice = new JLabel("Price of Item");
        
        BtnOk = new JButton("OK");
        BtnCancel = new JButton("Cancel");
        
        BtnOk.setActionCommand("OK New Item");
        BtnCancel.setActionCommand("Cancel new Item");
        
        BtnOk.addActionListener(Frame.getHandler());
        BtnCancel.addActionListener(Frame.getHandler());
        
        setLayout(new GridLayout(4, 2));
        
        //adding Text Fields
        add(TextFieldItemName);
        add(TextFieldItemCount);
        add(TextFieldItemPrice);
        
        //adding Labels
        add(LabelItemName);
        add(LabelItemCount);
        add(LabelItemPrice);
        
        //adding Buttons
        add(BtnOk);
        add(BtnCancel);
        
        pack();
    }

    public JTextField getTextFieldItemName() {
        return TextFieldItemName;
    }

    public JTextField getTextFieldItemCount() {
        return TextFieldItemCount;
    }

    public JTextField getTextFieldItemPrice() {
        return TextFieldItemPrice;
    }
}
