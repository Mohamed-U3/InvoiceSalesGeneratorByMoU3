/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ISG.model;

/**
 *
 * @author mmyra
 */
public class InvoiceLine 
{
    private InvoiceHeader invoiceheader;
    private String ItemName;
    private double price;
    private int count;

    public InvoiceLine(String ItemName, double price, int count, InvoiceHeader invoiceheader)
    {
        this.ItemName = ItemName;
        this.price = price;
        this.count = count;
        this.invoiceheader = invoiceheader;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public InvoiceHeader getInvoice() {
        return invoiceheader;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoiceheader = invoice;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getItemsTotal()
    {
        return price * count;
    }
    
}
