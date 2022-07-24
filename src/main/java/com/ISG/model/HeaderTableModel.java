package com.ISG.model;

import com.ISG.view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author mmyra
 */
public class HeaderTableModel extends AbstractTableModel
{
    private ArrayList<InvoiceHeader> inVoiceHeaderList;
    private String[] Columns = {"Inv. Num","Date","Cumst. Name","Total"};

    public HeaderTableModel(ArrayList<InvoiceHeader> inVoiceHeaderList) {
        this.inVoiceHeaderList = inVoiceHeaderList;
    }


    @Override
    public int getRowCount()
    {
        return inVoiceHeaderList.size();
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
            case 0:     return  inVoiceHeaderList.get(rowIndex).getInvoiceNumber();
            case 1:     return  InvoiceFrame.DateFormat.format(inVoiceHeaderList.get(rowIndex).getInvoicedate());
            case 2:     return  inVoiceHeaderList.get(rowIndex).getCustomerName();
            case 3:     return  inVoiceHeaderList.get(rowIndex).getInvoiceTotal();
        }
        return "Empty";
    }

    @Override
    public String getColumnName(int column)
    {
        return Columns[column];
    }
}
