package com.inventory.dao;

import com.inventory.model.Product;
import com.inventory.util.DBConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    public List<Product> getAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String expDate = rs.getString("exp_date");
                list.add(new Product(
                        rs.getString("product_id"),
                        rs.getString("product_name"),
                        rs.getString("product_brand"),
                        rs.getString("product_category"),
                        rs.getDouble("cost_price"),
                        rs.getDouble("selling_price"),
                        rs.getString("product_unit"),
                        rs.getInt("product_quantity"),
                        rs.getInt("reorder_level"),
                        expDate == null ? "N/A" : expDate,
                        rs.getString("date_added")
                ));
            }
        }
        return list;
    }

    public boolean exists(String productId) throws SQLException {
        String sql = "SELECT 1 FROM products WHERE product_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, productId.trim());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public void insert(Product p) throws SQLException {
        String sql = "INSERT INTO products (product_name, product_brand, product_category, "
                + "cost_price, selling_price, product_unit, product_quantity, reorder_level, "
                + "exp_date, date_added, product_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        save(sql, p);
    }

    public void update(Product p) throws SQLException {
        String sql = "UPDATE products SET product_name = ?, product_brand = ?, product_category = ?, "
                + "cost_price = ?, selling_price = ?, product_unit = ?, product_quantity = ?, "
                + "reorder_level = ?, exp_date = ?, date_added = ? WHERE product_id = ?";
        save(sql, p);
    }

    public void delete(String productId) throws SQLException {
        String sql = "DELETE FROM products WHERE product_id = ?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, productId);
            ps.executeUpdate();
        }
    }

    // insert() and update() use the same parameter order, with product_id last
    private void save(String sql, Product p) throws SQLException {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductBrand());
            ps.setString(3, p.getProductCategory());
            ps.setDouble(4, p.getCostPrice());
            ps.setDouble(5, p.getSellingPrice());
            ps.setString(6, p.getProductUnit());
            ps.setInt(7, p.getProductQuantity());
            ps.setInt(8, p.getReorderLevel());
            setDate(ps, 9, p.getExpDate());
            setDate(ps, 10, p.getDateAdded());
            ps.setString(11, p.getProductId());
            ps.executeUpdate();
        }
    }

    // "N/A" or blank is stored as NULL in the DATE column
    private void setDate(PreparedStatement ps, int index, String value) throws SQLException {
        if (value == null || value.isBlank() || value.trim().equalsIgnoreCase("N/A")) {
            ps.setNull(index, Types.DATE);
        } else {
            ps.setDate(index, Date.valueOf(value.trim()));
        }
    }
}