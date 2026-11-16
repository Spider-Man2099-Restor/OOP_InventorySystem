package com.inventory.main;
import com.inventory.view.SignUpForm;
import com.inventory.util.FileUtil;

import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;


public class Main {
    public static void main (String [] args) throws Exception{
        
        FileUtil.createStartupFile("Users.txt");
        FileUtil.createStartupFile("Products.txt");
        
        FlatMacLightLaf.setup();
         
        SwingUtilities.invokeLater(() -> {
            SignUpForm frame = new SignUpForm();
            frame.setVisible(true);
        });
    }
}