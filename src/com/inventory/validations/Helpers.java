package com.inventory.validations;

import com.inventory.util.FileUtil;
import java.io.IOException;
import java.util.List;

public class Helpers {

    public boolean duplicateEmail(String email) throws IOException {
        List<String> lines = FileUtil.readLines("Users.txt");

        for (String line : lines) {
            String[] parts = line.split("\\|"); // Change "," to whatever separator you use

            if (parts.length > 2 && email.trim().equalsIgnoreCase(parts[1].trim())) {
                return true; // Duplicate found!
            }
        }

        return false; // No duplicate found
    }
    
    
}
