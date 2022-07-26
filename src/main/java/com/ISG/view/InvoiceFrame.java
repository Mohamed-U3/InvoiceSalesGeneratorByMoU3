/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ISG.view;

import com.ISG.controller.ActionHandler;
import com.ISG.controller.SelectionOnTableListener;
import com.ISG.model.HeaderTableModel;
import com.ISG.model.InvoiceHeader;
import com.ISG.model.InvoiceLine;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author mmyra
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
        Handler = new ActionHandler(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnNewInv = new javax.swing.JButton();
        BtnNewInv.addActionListener(Handler);
        BtnDelInv = new javax.swing.JButton();
        BtnDelInv.addActionListener(Handler);
        BtnAddItem = new javax.swing.JButton();
        BtnAddItem.addActionListener(Handler);
        BtnRemItem = new javax.swing.JButton();
        BtnRemItem.addActionListener(Handler);

        jScrollPane1 = new javax.swing.JScrollPane();
        InvoiceTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ItemsTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LabelinvNumOut = new javax.swing.JLabel();
        LabelDateOut = new javax.swing.JLabel();
        LabelCusNameOut = new javax.swing.JLabel();
        LabelFullAmountOut = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        LoadMenuOption = new javax.swing.JMenuItem();
        LoadMenuOption.addActionListener(Handler);
        SaveMenuOption = new javax.swing.JMenuItem();
        SaveMenuOption.addActionListener(Handler);
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ExitMenuOption = new javax.swing.JMenuItem();
        ExitMenuOption.addActionListener(Handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnNewInv.setText("New Invoice");
        BtnNewInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewInvActionPerformed(evt);
            }
        });

        BtnDelInv.setText("Delete Invoice");
        BtnDelInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDelInvActionPerformed(evt);
            }
        });

        BtnAddItem.setText("add Item");
        BtnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddItemActionPerformed(evt);
            }
        });

        BtnRemItem.setText("remove Item");

        InvoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        InvoiceTable.getSelectionModel().addListSelectionListener(selectionListener);
        InvoiceTable.getSelectedRow();
        jScrollPane1.setViewportView(InvoiceTable);

        ItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(ItemsTable);

        jLabel1.setText("Invoice Num :");

        jLabel2.setText("Date :");

        jLabel3.setText("Customer Name:");

        jLabel4.setText("Full amount :");

        jLabel5.setForeground(new java.awt.Color(200, 0, 0));
        jLabel5.setText("Invoice Table");

        jLabel6.setForeground(new java.awt.Color(200, 0, 0));
        jLabel6.setText("Invoice Item Table");

        LabelinvNumOut.setText("  ");

        LabelDateOut.setText("  ");
        LabelDateOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LabelCusNameOut.setText("  ");

        LabelFullAmountOut.setText("  ");
        LabelFullAmountOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jMenu1.setText("File");

        LoadMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        LoadMenuOption.setText("Load File");
        jMenu1.add(LoadMenuOption);

        SaveMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SaveMenuOption.setText("Save File");
        jMenu1.add(SaveMenuOption);
        jMenu1.add(jSeparator1);

        ExitMenuOption.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        ExitMenuOption.setText("Exit");
        jMenu1.add(ExitMenuOption);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFullAmountOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelCusNameOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelDateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelinvNumOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnNewInv)
                                .addGap(102, 102, 102)
                                .addComponent(BtnDelInv))
                            .addComponent(jLabel5))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BtnAddItem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRemItem)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(LabelinvNumOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(LabelDateOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(LabelCusNameOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(LabelFullAmountOut))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnNewInv)
                    .addComponent(BtnDelInv)
                    .addComponent(BtnAddItem)
                    .addComponent(BtnRemItem))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNewInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnNewInvActionPerformed

    private void BtnDelInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDelInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnDelInvActionPerformed

    private void BtnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAddItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddItem;
    private javax.swing.JButton BtnDelInv;
    private javax.swing.JButton BtnNewInv;
    private javax.swing.JButton BtnRemItem;
    private javax.swing.JMenuItem ExitMenuOption;
    private javax.swing.JTable InvoiceTable;
    private javax.swing.JTable ItemsTable;
    private javax.swing.JLabel LabelCusNameOut;
    private javax.swing.JLabel LabelDateOut;
    private javax.swing.JLabel LabelFullAmountOut;
    private javax.swing.JLabel LabelinvNumOut;
    private javax.swing.JMenuItem LoadMenuOption;
    private javax.swing.JMenuItem SaveMenuOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    public static SimpleDateFormat DateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private ActionHandler Handler = new ActionHandler(this);
    private ArrayList<InvoiceHeader> inVoiceHeaderList;
    private ArrayList<InvoiceLine> inVoiceItemsList; //we might not need it but what ever
    private HeaderTableModel HeaderTable;
    private SelectionOnTableListener selectionListener = new SelectionOnTableListener(this);
    
    
    //InvoiceLine ArrayList --- getter and Setters --- we might not need it but what ever
    public ArrayList<InvoiceLine> getInVoiceItemsList() {
        return inVoiceItemsList;
    }

    public void setInVoiceItemsList(ArrayList<InvoiceLine> inVoiceItemsList) {
        this.inVoiceItemsList = inVoiceItemsList;
    }
    ///////////////////////////////////////////////////////////////////////////////////////
    
    
    
    public ActionHandler getHandler() {
        return Handler;
    }
    
    public ArrayList<InvoiceHeader> getInVoiceHeaderList() {
        return inVoiceHeaderList;
    }
    
    public void setInVoiceHeaderList(ArrayList<InvoiceHeader> inVoiceHeaderList) {
        this.inVoiceHeaderList = inVoiceHeaderList;
    }
    
    public InvoiceHeader getInvHeaderFromNum(int num)
    {
        for(InvoiceHeader invoiceheader: inVoiceHeaderList)
        {
            if(invoiceheader.getInvoiceNumber() == num)
            {
                return invoiceheader;
            }
        }
        return null;
    }

    public HeaderTableModel getHeaderTable() {
        return HeaderTable;
    }

    public void setHeaderTable(HeaderTableModel HeaderTable)
    {
        this.HeaderTable = HeaderTable;
    }

    public JTable getInvoiceTable()
    {
        return InvoiceTable;
    }

    public JTable getItemsTable()
    {
        return ItemsTable;
    }
    
    //the Labels that above the tabel Getters Functions
    public JLabel getLabelCusNameOut() {
        return LabelCusNameOut;
    }

    public JLabel getLabelDateOut() {
        return LabelDateOut;
    }

    public JLabel getLabelFullAmountOut() {
        return LabelFullAmountOut;
    }

    public JLabel getLabelinvNumOut() {
        return LabelinvNumOut;
    }
}
