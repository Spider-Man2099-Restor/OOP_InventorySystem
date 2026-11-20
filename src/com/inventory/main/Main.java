package com.inventory.main;
import com.inventory.view.SignUpForm;
import com.inventory.util.FileUtil;

import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.UIManager;


public class Main {
    public static void main (String [] args) throws Exception{
        
        FileUtil.createStartupFile("Users.txt");
        FileUtil.createStartupFile("Products.txt");
        
        FlatMacLightLaf.setup();
        UIManager.put("Button.arc",15);
        UIManager.put("Component.arc",15);
        UIManager.put("TextComponent.arc",8);
        
        UIManager.put("TableHeader.background", new Color(235, 241, 248));
        UIManager.put("TableHeader.foreground", new Color(30, 41, 59));
        UIManager.put("TableHeader.bottomSeparatorColor", new Color(203, 213, 225));
        
        SwingUtilities.invokeLater(() -> {
            SignUpForm frame = new SignUpForm();
            frame.setVisible(true);
        });
    }
}