
package com.inventory.model;


public class Product {
    
    private String productId;
    private String productName;
    private String productBrand;
    private String productCategory;
    private String productUnit;
    private String expDate;
    private String dateAdded;
    
    private double costPrice;
    private double sellingPrice;
    
    private int productQuantity;
    private int reorderLevel;
    
    
    public Product() {
    }

    public Product(String productId, String productName, String productBrand, String productCategory, double costPrice, double sellingPrice, String productUnit, int productQuantity, int reorderLevel, String expDate, String dateAdded) {
        this.productId = productId;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productCategory = productCategory;
        this.productUnit = productUnit;
        this.expDate = expDate;
        this.dateAdded = dateAdded;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.productQuantity = productQuantity;
        this.reorderLevel = reorderLevel;
    }
    
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(double costPrice) {
        this.costPrice = costPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    @Override
    public String toString() {
        return  productId + "|" + productName + "|" + productBrand + "|" + productCategory + "|" + costPrice + "|" + sellingPrice + "|" + productUnit + "|" + productQuantity + "|" + reorderLevel + "|" + expDate + "|" + dateAdded ;
    }
    
}
