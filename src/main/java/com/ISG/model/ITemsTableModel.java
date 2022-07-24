/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.model;

import com.ISG.view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mmyra
 */
public class ITemsTableModel extends AbstractTableModel
{
    
    private String[] Columns = {"Item","Price","Count","Total"};
    ArrayList<InvoiceLine> SelectedItemsList;

    public ITemsTableModel(ArrayList<InvoiceLine> SelectedItemsList) {
        this.SelectedItemsList = SelectedItemsList;
    }
    
    
    @Override
    public int getRowCount()
    {
        return SelectedItemsList.size();
    }

    @Override
    public int getColumnCount()
    {
        return Columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch(columnIndex)
        {
            case 0:     return  SelectedItemsList.get(rowIndex).getItemName();
            case 1:     return  SelectedItemsList.get(rowIndex).getPrice();
            case 2:     return  SelectedItemsList.get(rowIndex).getCount();
            case 3:     return  SelectedItemsList.get(rowIndex).getItemsTotal();
        }
        return "Empty";
    }
    
    @Override
    public String getColumnName(int column)
    {
        return Columns[column];
    }
    
}
