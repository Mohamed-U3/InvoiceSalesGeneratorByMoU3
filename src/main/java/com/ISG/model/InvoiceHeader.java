/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.model;

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
    private String Invoicedate;
    private ArrayList<InvoiceLine> Lines;

    public InvoiceHeader(int InvoiceNumber, String CustomerName, String Invoicedate)
    {
        this.InvoiceNumber = InvoiceNumber;
        this.CustomerName = CustomerName;
        this.Invoicedate = Invoicedate;
    }

    public String getInvoicedate() 
    {
        return Invoicedate;
    }

    public void setInvoicedate(String Invoicedate)
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
    
    
}
