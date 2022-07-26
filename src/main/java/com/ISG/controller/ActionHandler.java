package com.ISG.controller;

import com.ISG.model.HeaderTableModel;
import com.ISG.model.ITemsTableModel;
import com.ISG.model.InvoiceHeader;
import com.ISG.model.InvoiceLine;
import com.ISG.view.InvoiceFrame;
import com.ISG.view.NewInvoiceDialog;
import com.ISG.view.NewItemDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author mmyra
 */
public class ActionHandler implements ActionListener
{
    private InvoiceFrame Frame;
    NewInvoiceDialog DialogNewInvoice;
    NewItemDialog DialogNewItem;
    private int LastSelectedInvoice;
    
    public ActionHandler(InvoiceFrame f)
    {
        this.Frame = f;
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand())
        {
            case "New Invoice":
                New_Invoice();
                break;
            case "Delete Invoice":
                Delete_Invoice();
                break;
            case "add Item":
                add_Item();
                break;
            case "remove Item":
                remove_Item();
                break;
            case "Load File":
                Load_File();
                break;
            case "Save File":
                Save_File();
                break;
            case "Exit":
                System.exit(0);
                break;
            case "OK new Invoice":
                OK_new_invoice();
                break;
            case "Cancel new Invoice":
                Cancel_new_invoice();
                break;
            case "OK New Item":
                OK_new_Item();
                break;
            case "Cancel new Item":
                Cancel_new_Item();
                break;
            default:
        }
    }

    private void New_Invoice()
    {
        JOptionPane.showMessageDialog(null,"For Real Time date Enter only the name","Read it First" ,JOptionPane.PLAIN_MESSAGE);
        DialogNewInvoice = new NewInvoiceDialog(Frame);
        DialogNewInvoice.setVisible(true);
    }

    private void Delete_Invoice()
    {
        if(Frame.getInvoiceTable().getSelectedRow() >= 0)
        {
            Frame.getInVoiceHeaderList().remove(Frame.getInvoiceTable().getSelectedRow());
            Frame.getHeaderTable().fireTableDataChanged();
            Frame.getItemsTable().setModel(new ITemsTableModel(new ArrayList<InvoiceLine>()));
            //Labels Resetting
            Frame.getLabelCusNameOut().setText(" ");
            Frame.getLabelDateOut().setText(" ");
            Frame.getLabelinvNumOut().setText(" ");
            Frame.getLabelFullAmountOut().setText(" ");
        }
    }

    private void add_Item()
    {
        DialogNewItem = new NewItemDialog(Frame);
        DialogNewItem.setVisible(true);
    }

    private void remove_Item()
    {
        
    }

    private void Load_File()
    {
        JOptionPane.showMessageDialog(null,"select the invoice Header File","read First" ,JOptionPane.PLAIN_MESSAGE);
        JFileChooser FileC = new JFileChooser();
        int FileResult = FileC.showOpenDialog(Frame);
        if(FileResult == JFileChooser.APPROVE_OPTION)
        {
            try
            {
//                File HeaderFile = FileC.getSelectedFile();
//                String StringHeaderPath = FileC.getSelectedFile().getAbsolutePath();
                Path HeaderPath = Paths.get(FileC.getSelectedFile().getAbsolutePath());
                List<String> HeaderLines = Files.lines(HeaderPath).collect(Collectors.toList());
                ArrayList<InvoiceHeader> invoiceheaderList = new ArrayList<>();
                for(String HeaderLine : HeaderLines)
                {
                    String[] parts = HeaderLine.split(",");
                    //InvoiceHeader(int InvoiceNumber, String CustomerName, Date Invoicedate)
                    InvoiceHeader invHeader = new InvoiceHeader(Integer.parseInt(parts[0]),
                                          parts[2],InvoiceFrame.DateFormat.parse(parts[1]));
                    invoiceheaderList.add(invHeader);
                }
                Frame.setInVoiceHeaderList(invoiceheaderList);
                JOptionPane.showMessageDialog(null,"wait wait\nNow select the items File","wait wait",JOptionPane.PLAIN_MESSAGE);
                
                //Dialog for loading list file
                FileResult = FileC.showOpenDialog(Frame);
                if(FileResult == JFileChooser.APPROVE_OPTION)
                {
                    Path ItemsPath = Paths.get(FileC.getSelectedFile().getAbsolutePath());
                    List<String> ItemsLines = Files.lines(ItemsPath).collect(Collectors.toList());
                    for(String ItemsLine : ItemsLines) //now "ItemsLines" has each line in String list we will loop for each string Line
                    {
                        //for each line
                        String[] parts = ItemsLine.split(","); //split itemsline into parts if you find "," in line in put them in array of String
                        
                        int ItemID = Integer.parseInt(parts[0]);   //the Invoice Number in interger form
                        InvoiceHeader invHeader = Frame.getInvHeaderFromNum(ItemID);
                        
                        //InvoiceLine(String ItemName, double price, int count, InvoiceHeader invoiceheader)
                        InvoiceLine invLine = new InvoiceLine(parts[1], Double.parseDouble(parts[2]),
                                        Integer.parseInt(parts[3]), invHeader);
                        invHeader.getLines().add(invLine);
                    }
                }
                System.out.println("files loaded");
                invoiceheaderList = Frame.getInVoiceHeaderList();
                HeaderTableModel H_Table = new HeaderTableModel(invoiceheaderList);
                /////////////////////////////////////////////////
                ////////////////retrace those lines//////////////
                Frame.setHeaderTable(H_Table);
                Frame.getInvoiceTable().setModel(H_Table);
                System.out.println("files sent to table");
                
            } 
            catch (IOException ex)
            {
                Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private void Save_File()
    {
        
    }

    private void OK_new_invoice()
    {
        DialogNewInvoice.setVisible(false);
        
        String Name = DialogNewInvoice.getTextFieldofCustName().getText();
        String date = DialogNewInvoice.getTextFieldofInvDate().getText();
        Date InvoiceDate = new Date();
        try {
            InvoiceDate = InvoiceFrame.DateFormat.parse(date);
        } catch (ParseException ex) {
            Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("the size = " + Frame.getInVoiceHeaderList().size());
        InvoiceHeader inv = new InvoiceHeader((Frame.getInVoiceHeaderList().size()+1), Name, InvoiceDate);
        Frame.getInVoiceHeaderList().add(inv);
        Frame.getHeaderTable().fireTableDataChanged();
        
        
        DialogNewInvoice.dispose();
        DialogNewInvoice = null;
    }

    private void Cancel_new_invoice()
    {
        DialogNewInvoice.setVisible(false);
        DialogNewInvoice.dispose();
        DialogNewInvoice = null;
    }

    private void OK_new_Item()
    {
        DialogNewItem.setVisible(false);
        
        String ItemName = DialogNewItem.getTextFieldItemName().getText();
        int ItemCount = Integer.parseInt(DialogNewItem.getTextFieldItemCount().getText());
        double ItemPrice = Double.parseDouble(DialogNewItem.getTextFieldItemPrice().getText());
        /* notes
         * after adding the first Item I found out that you cant add another 
         * Item utill the user select the Invoice First again that is a bug 
         * for me so I created this simple algorithm to use the last selected 
         * Invoice to used it over and over again and in the same time im using 
         * it to refresh the two tables and the Labels at the same time ... I 
         * know a lot of coding but better performance.
         */
        if(Frame.getInvoiceTable().getSelectedRow() >= 0)
        {
            LastSelectedInvoice = Frame.getInvoiceTable().getSelectedRow();
            InvoiceHeader Header = Frame.getInVoiceHeaderList().get(Frame.getInvoiceTable().getSelectedRow());
            InvoiceLine Line = new InvoiceLine(ItemName, ItemPrice, ItemCount, Header);
            Header.getLines().add(Line);
            Frame.getHeaderTable().fireTableDataChanged();
            
            //remaking the chanfe value function here for refreshing
            ArrayList<InvoiceLine> SelectedItemsList = Header.getLines();
            Frame.setInVoiceItemsList(SelectedItemsList);
            Frame.getItemsTable().setModel(new ITemsTableModel(SelectedItemsList));
            //Labels Setting
            Frame.getLabelCusNameOut().setText(Header.getCustomerName());
            Frame.getLabelDateOut().setText(""+ Header.getInvoicedate());
            Frame.getLabelinvNumOut().setText(""+ Header.getInvoiceNumber());
            Frame.getLabelFullAmountOut().setText(""+ Header.getInvoiceTotal());
        }
        else
        {
            InvoiceHeader Header = Frame.getInVoiceHeaderList().get(LastSelectedInvoice);
            InvoiceLine Line = new InvoiceLine(ItemName, ItemPrice, ItemCount, Header);
            Header.getLines().add(Line);
            Frame.getHeaderTable().fireTableDataChanged();
            
            //remaking the chanfe value function here for refreshing
            ArrayList<InvoiceLine> SelectedItemsList = Header.getLines();
            Frame.setInVoiceItemsList(SelectedItemsList);
            Frame.getItemsTable().setModel(new ITemsTableModel(SelectedItemsList));
            //Labels Setting
            Frame.getLabelCusNameOut().setText(Header.getCustomerName());
            Frame.getLabelDateOut().setText(""+ Header.getInvoicedate());
            Frame.getLabelinvNumOut().setText(""+ Header.getInvoiceNumber());
            Frame.getLabelFullAmountOut().setText(""+ Header.getInvoiceTotal());
        }
        
        DialogNewItem.dispose();
        DialogNewItem = null;
    }

    private void Cancel_new_Item()
    {
        DialogNewItem.setVisible(false);
        DialogNewItem.dispose();
        DialogNewItem = null;
    }
}
