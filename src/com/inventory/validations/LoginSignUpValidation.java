
package com.inventory.validations;
import com.inventory.util.FileUtil;
import com.inventory.view.SignUpForm;
import java.io.IOException;
import java.util.List;

public class LoginSignUpValidation {
    
    public boolean validateSignUp(String userName, String email, String password) throws IOException {
    // 1. Check for empty or blank inputs first
    if (userName == null || userName.isBlank() ||
        email == null || email.isBlank() ||
        password == null || password.isBlank()) {
        return false;
    }

    // 2. Check basic email format and password length
    if (!email.contains("@") || password.length() < 6) {
        return false;
    }

    // 3. Check Users.txt for duplicate email (using the fixed duplicateEmail method)
    Helpers h = new Helpers();
    if (h.duplicateEmail(email)) {
        return false;
    }

    return true; // Everything is valid!
}

    
    public boolean validateLogin(String userName, String email, String password) throws IOException {
    // 1. Check for empty or blank inputs first
    if (userName == null || userName.isBlank() ||
        email == null || email.isBlank() ||
        password == null || password.isBlank()) {
        return false;
    }

    // 2. Check matches in Users.txt
    List<String> lines = FileUtil.readLines("Users.txt");

    for (String line : lines) {
        if (line.isBlank()) {
            continue; // Skip empty lines safely
        }

        String[] parts = line.split("\\|");
        if (parts.length < 3) {
            continue; // Skip corrupted lines so it won't crash
        }

        String name = parts[0].trim();
        String mail = parts[1].trim();
        String pass = parts[2];

        // Return true IMMEDIATELY if all three match this user
        if (name.equals(userName.trim()) && 
            mail.equalsIgnoreCase(email.trim()) && 
            pass.equals(password)) {
            return true; 
        }
    }

    // 3. If the loop finishes with zero matches, login fails
    return false; 
}

    
}
