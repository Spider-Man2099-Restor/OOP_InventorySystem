package com.inventory.validations;
import com.inventory.view.Dashboard;
import com.inventory.util.FileUtil;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import com.inventory.dao.ProductDAO;
import java.sql.SQLException;

public class ProductValidation {
    
     public static boolean addProductValidation(
            String id, String name, String brand, String category,
            String costPriceText, String sellingPriceText, String unit,
            int quantity, int reorder, String expDate) throws IOException, SQLException {

        // 1. Validate Product ID (not blank & not already in Products.txt)
        if (id == null || id.isBlank()) {
            return false;
        }
        List<String> lines = FileUtil.readLines("Products.txt");
            if (new ProductDAO().exists(id)) {
            return false; // Duplicate ID found
        }
        // 2. Validate Product Name
        if (name == null || name.isBlank()) {
            return false;
        }

        // 3. Validate Brand
        if (brand == null || brand.isBlank()) {
            return false;
        }

        // 4. Validate Category (not null, not blank, not default placeholder)
        if (category == null || category.isBlank() || category.equalsIgnoreCase("Select Category")) {
            return false;
        }

        // 5. Validate Cost Price & Selling Price (valid numbers, non-negative, selling >= cost)
        if (costPriceText == null || costPriceText.isBlank() ||
            sellingPriceText == null || sellingPriceText.isBlank()) {
            return false;
        }
        try {
            double costPrice = Double.parseDouble(costPriceText.trim());
            double sellingPrice = Double.parseDouble(sellingPriceText.trim());

            if (costPrice <= 0 || sellingPrice <= 0) {
                return false;
            }
            if (sellingPrice < costPrice) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false; // User typed letters instead of numbers
        }

        // 6. Validate Unit (not null, not blank, not default placeholder)
        if (unit == null || unit.isBlank() || unit.equalsIgnoreCase("Select Unit")) {
            return false;
        }

        // 7. Validate Quantity & Reorder Level spinners
        if (quantity < 0 || reorder < 0) {
            return false;
        }

        // 8. Validate Expiration Date (must not be blank and must follow YYYY-MM-DD)
         if (expDate == null || expDate.isBlank()) {
            return false;
        }

        if (!expDate.trim().equalsIgnoreCase("N/A")) {
            try {
                LocalDate parsedExpDate = LocalDate.parse(expDate.trim());
                if (parsedExpDate.isBefore(LocalDate.now())) {
                    return false; // Reject already-expired products
                }
            } catch (DateTimeParseException e) {
                return false; // Invalid date format (not YYYY-MM-DD or N/A)
            }
        }
        
        return true; // Every single input is valid!
    }
     
     
     
       public static boolean editProductValidation(
            String name, String brand, String category,
            String costPriceText, String sellingPriceText, String unit,
            int quantity, int reorder, String expDate) {

        // 1. Validate Product Name
        if (name == null || name.isBlank()) {
            return false;
        }

        // 2. Validate Brand
        if (brand == null || brand.isBlank()) {
            return false;
        }

        // 3. Validate Category
        if (category == null || category.isBlank() || category.equalsIgnoreCase("Select Category")) {
            return false;
        }

        // 4. Validate Cost Price & Selling Price
        if (costPriceText == null || costPriceText.isBlank() ||
            sellingPriceText == null || sellingPriceText.isBlank()) {
            return false;
        }
        try {
            double costPrice = Double.parseDouble(costPriceText.trim());
            double sellingPrice = Double.parseDouble(sellingPriceText.trim());

            if (costPrice <= 0 || sellingPrice <= 0) {
                return false;
            }
            if (sellingPrice < costPrice) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }

        // 5. Validate Unit
        if (unit == null || unit.isBlank() || unit.equalsIgnoreCase("Select Unit")) {
            return false;
        }

        // 6. Validate Quantity & Reorder Level spinners
        if (quantity < 0 || reorder < 0) {
            return false;
        }

        // 7. Validate Expiration Date ("N/A" or valid future YYYY-MM-DD date)
        if (expDate == null || expDate.isBlank()) {
            return false;
        }
        if (!expDate.trim().equalsIgnoreCase("N/A")) {
            try {
                LocalDate parsedExpDate = LocalDate.parse(expDate.trim());
                if (parsedExpDate.isBefore(LocalDate.now())) {
                    return false;
                }
            } catch (DateTimeParseException e) {
                return false;
            }
        }

        return true; // All edited fields are valid!
    }
}
