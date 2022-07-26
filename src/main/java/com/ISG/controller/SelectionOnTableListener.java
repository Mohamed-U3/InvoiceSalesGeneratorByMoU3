/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.controller;

import com.ISG.model.HeaderTableModel;
import com.ISG.model.ITemsTableModel;
import com.ISG.model.InvoiceHeader;
import com.ISG.model.InvoiceLine;
import com.ISG.view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author mmyra
 */
public class SelectionOnTableListener implements ListSelectionListener
{
    private InvoiceFrame Frame;

    public SelectionOnTableListener(InvoiceFrame Frame)
    {
        this.Frame = Frame;
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        ITemsTableModel ObjItemsTableModel;
                
        System.out.println("the Invoice selected Row num: " + Frame.getInvoiceTable().getSelectedRow());
        if(Frame.getInvoiceTable().getSelectedRow() >= 0)
        {
            InvoiceHeader SelectedInvoiceHeader = Frame.getInVoiceHeaderList().get(Frame.getInvoiceTable().getSelectedRow());
            ArrayList<InvoiceLine> SelectedItemsList = SelectedInvoiceHeader.getLines();
            ObjItemsTableModel = new ITemsTableModel(SelectedItemsList);
            Frame.setInVoiceItemsList(SelectedItemsList);
            Frame.getItemsTable().setModel(ObjItemsTableModel);
            //Labels Setting
            Frame.getLabelCusNameOut().setText(SelectedInvoiceHeader.getCustomerName());
            Frame.getLabelDateOut().setText(""+ SelectedInvoiceHeader.getInvoicedate());
            Frame.getLabelinvNumOut().setText(""+ SelectedInvoiceHeader.getInvoiceNumber());
            Frame.getLabelFullAmountOut().setText(""+ SelectedInvoiceHeader.getInvoiceTotal());
        }
        else
        {
            //Table Resetting
            Frame.getItemsTable().setModel(new ITemsTableModel(new ArrayList<InvoiceLine>()));
            //Labels Resetting
            Frame.getLabelCusNameOut().setText(" ");
            Frame.getLabelDateOut().setText(" ");
            Frame.getLabelinvNumOut().setText(" ");
            Frame.getLabelFullAmountOut().setText(" ");
        }
        
    }
    
}
