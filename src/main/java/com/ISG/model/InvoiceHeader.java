/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.model;

import static com.ISG.view.InvoiceFrame.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author mmyra
 */
public class InvoiceHeader 
{
    private int InvoiceNumber;
    private String CustomerName;
    private Date Invoicedate;
    private ArrayList<InvoiceLine> Lines;

    public InvoiceHeader(int InvoiceNumber, String CustomerName, Date Invoicedate)
    {
        this.InvoiceNumber = InvoiceNumber;
        this.CustomerName = CustomerName;
        this.Invoicedate = Invoicedate;
    }

    public Date getInvoicedate() 
    {
        return Invoicedate;
    }

    public void setInvoicedate(Date Invoicedate)
    {
        this.Invoicedate = Invoicedate;
    }

    public int getInvoiceNumber()
    {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(int InvoiceNumber)
    {
        this.InvoiceNumber = InvoiceNumber;
    }

    public String getCustomerName()
    {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName)
    {
        this.CustomerName = CustomerName;
    }

    public ArrayList<InvoiceLine> getLines()
    {
        if(Lines == null)
        {
            Lines = new ArrayList<>();
        }
        return Lines;
    }

    public void setLines(ArrayList<InvoiceLine> Lines)
    {
        this.Lines = Lines;
    }

    public double getInvoiceTotal()
    {
        double total = 0;
        
        for (int i = 0; i < getLines().size(); i++)
        {
            total += getLines().get(i).getItemsTotal();
        }
        
        return total;
    }

    @Override
    public String toString() 
    {
        return (InvoiceNumber + "," + DateFormat.format(Invoicedate) + "," + CustomerName + "\n");
    }
}
