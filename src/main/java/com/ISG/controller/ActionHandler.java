package com.ISG.controller;

import com.ISG.model.InvoiceHeader;
import com.ISG.model.InvoiceLine;
import com.ISG.view.InvoiceFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;

/**
 *
 * @author mmyra
 */
public class ActionHandler implements ActionListener
{
    private InvoiceFrame Frame;
    
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
            default:
        }
    }

    private void New_Invoice()
    {
        
    }

    private void Delete_Invoice()
    {
        
    }

    private void add_Item()
    {
        
    }

    private void remove_Item()
    {
        
    }

    private void Load_File()
    {
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
                ArrayList<InvoiceHeader> invoiceHeaderList = new ArrayList<>();
                for(String HeaderLine : HeaderLines)
                {
                    String[] parts = HeaderLine.split(",");
                    InvoiceHeader invHeader = new InvoiceHeader(Integer.parseInt(parts[0]), parts[2],parts[1]);
                    invoiceHeaderList.add(invHeader);
                }
//                System.out.println("TestTest");
                FileResult = FileC.showOpenDialog(Frame);
                if(FileResult == JFileChooser.APPROVE_OPTION)
                {
                    Path ItemsPath = Paths.get(FileC.getSelectedFile().getAbsolutePath());
                    List<String> ItemsLines = Files.lines(ItemsPath).collect(Collectors.toList());
                    for(String ItemsLine : ItemsLines) //now "ItemsLines" has each line in String list we will loop for each string Line
                    {
                        //for each line
                        String[] parts = ItemsLine.split(","); //split itemsline into parts if you find "," in line in put them in array of String
                        
                        int invID = Integer.parseInt(parts[0]); //the Invoice Number in interger form
                        for(InvoiceHeader invHeaderlst: invoiceHeaderList)
                        {
                            if(invHeaderlst.getInvoiceNumber() == invID)
                            {
                                /* first the nameofItems then the price then the count of items 
                                    then the object of the class invoiceHeader  */
                                InvoiceLine invLine = new InvoiceLine(parts[1], Double.parseDouble(parts[2]),
                                        Integer.parseInt(parts[3]), invHeaderlst);
                                invHeaderlst.getLines().add(invLine);
                            }
                        }
                        
                    }
                }
            } 
            catch (IOException ex)
            {
                Logger.getLogger(ActionHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

    private void Save_File()
    {
        
    }
}
