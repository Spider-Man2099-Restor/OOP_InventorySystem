package com.inventory.validations;

import com.inventory.dao.UserDAO;
import java.sql.SQLException;

public class LoginSignUpValidation {

    public boolean validateSignUp(String userName, String email, String password) throws SQLException {
        if (userName == null || userName.isBlank()
                || email == null || email.isBlank()
                || password == null || password.isBlank()) {
            return false;
        }
        if (!email.contains("@") || password.length() < 6) {
            return false;
        }
        return !new UserDAO().emailExists(email);
    }

    public boolean validateLogin(String userName, String email, String password) throws SQLException {
        if (userName == null || userName.isBlank()
                || email == null || email.isBlank()
                || password == null || password.isBlank()) {
            return false;
        }
        return new UserDAO().checkLogin(userName, email, password);
    }
}