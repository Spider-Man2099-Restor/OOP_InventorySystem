package com.inventory.view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.inventory.model.Product;
import com.inventory.validations.ProductValidation;
import java.io.IOException;
import javax.swing.JOptionPane;

public class addForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(addForm.class.getName());
    private Dashboard dashboard;

    public addForm(Dashboard dashboard) {
        initComponents();
        this.dashboard = dashboard;
    }

    public addForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addingForm = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfaddProductId = new javax.swing.JTextField();
        tfAddName = new javax.swing.JTextField();
        tfAddBrand = new javax.swing.JTextField();
        cbAddCategory = new javax.swing.JComboBox<>();
        tfAddCostPrice = new javax.swing.JTextField();
        tfAddSellingPrice = new javax.swing.JTextField();
        sAddQuantity = new javax.swing.JSpinner();
        sAddReorderLevel = new javax.swing.JSpinner();
        tfaddExpDate = new javax.swing.JTextField();
        cbUnit = new javax.swing.JComboBox<>();
        footer = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NeatNest");
        setResizable(false);

        header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("New Product");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fields marked with * are required");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        addingForm.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setText("Product Details");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel4.setText("Product ID *");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Name *");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Brand *");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Category *");

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel8.setText("Cost Price *");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel9.setText("Selling Price *");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel10.setText("Unit *");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel11.setText("Quantity *");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setText("Reorder Level *");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel13.setText("Exp. Date *");

        tfaddProductId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfaddProductId.addActionListener(this::tfaddProductIdActionPerformed);

        tfAddName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfAddBrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfAddBrand.addActionListener(this::tfAddBrandActionPerformed);

        cbAddCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbAddCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All categories", "Electronics", "Hardware", "Cosmetics" }));
        cbAddCategory.setFocusable(false);

        tfAddCostPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfAddSellingPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sAddQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sAddReorderLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfaddExpDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbUnit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCS", "PR", "SET", "KGS", "LTR", "FT", "IN" }));
        cbUnit.setFocusable(false);

        javax.swing.GroupLayout addingFormLayout = new javax.swing.GroupLayout(addingForm);
        addingForm.setLayout(addingFormLayout);
        addingFormLayout.setHorizontalGroup(
            addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingFormLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(addingFormLayout.createSequentialGroup()
                        .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(43, 43, 43)
                        .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfaddProductId)
                            .addComponent(tfAddName)
                            .addComponent(tfAddBrand)
                            .addComponent(cbAddCategory, 0, 235, Short.MAX_VALUE)
                            .addComponent(tfAddCostPrice)
                            .addComponent(tfAddSellingPrice)
                            .addComponent(sAddQuantity)
                            .addComponent(sAddReorderLevel)
                            .addComponent(tfaddExpDate)
                            .addComponent(cbUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addingFormLayout.setVerticalGroup(
            addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addingFormLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfaddProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfAddBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfAddCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfAddSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sAddQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sAddReorderLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfaddExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        addBtn.setBackground(new java.awt.Color(0, 0, 51));
        addBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add Product");
        addBtn.addActionListener(this::addBtnActionPerformed);

        clearBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(this::clearBtnActionPerformed);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, footerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBtn))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addingForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addingForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfaddProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaddProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaddProductIdActionPerformed

    private void tfAddBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAddBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAddBrandActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // 1. Clear all JTextFields
        tfaddProductId.setText("");
        tfAddName.setText("");
        tfAddBrand.setText("");
        tfAddCostPrice.setText("");
        tfAddSellingPrice.setText("");
        tfaddExpDate.setText("");

        // 2. Reset all JComboBoxes to the first item
        cbAddCategory.setSelectedIndex(0);
        cbUnit.setSelectedIndex(0);

        // 3. Reset all JSpinners to 0
        sAddQuantity.setValue(0);
        sAddReorderLevel.setValue(0);

        // 4. Put the typing cursor back on the first field
        tfaddProductId.requestFocus();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String id = tfaddProductId.getText().trim();
        String name = tfAddName.getText().trim();
        String brand = tfAddBrand.getText().trim();
        String category = cbAddCategory.getSelectedItem().toString();
        String costPriceText = tfAddCostPrice.getText().trim();
        String sellingPriceText = tfAddSellingPrice.getText().trim();
        String unit = cbUnit.getSelectedItem().toString();
        int quantity = (int) sAddQuantity.getValue();
        int reorder = (int) sAddReorderLevel.getValue();
        String expDate = tfaddExpDate.getText().trim();
        String dateUpdate = java.time.LocalDate.now().toString();

        try {
            if (ProductValidation.addProductValidation(
                    id, name, brand, category, costPriceText, sellingPriceText,
                    unit, quantity, reorder, expDate)) {

                double costPrice = Double.parseDouble(costPriceText);
                double sellingPrice = Double.parseDouble(sellingPriceText);

                // 1. Create the Product object
                Product newProduct = new Product(
                        id, name, brand, category, costPrice, sellingPrice,
                        unit, quantity, reorder, expDate, dateUpdate
                );

                // 2. Add to ArrayList, add to productsTable, and write to Products.txt
                if (dashboard != null) {
                    dashboard.addNewProduct(newProduct);
                }

                JOptionPane.showMessageDialog(
                        this,
                        "Product added successfully!",
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE
                );

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(
                        this,
                        "Invalid product details. Please check all fields.",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE
                );
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error saving product: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }//GEN-LAST:event_addBtnActionPerformed

    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new addForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel addingForm;
    private javax.swing.JComboBox<String> cbAddCategory;
    private javax.swing.JComboBox<String> cbUnit;
    private javax.swing.JButton clearBtn;
    private javax.swing.JPanel footer;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner sAddQuantity;
    private javax.swing.JSpinner sAddReorderLevel;
    private javax.swing.JTextField tfAddBrand;
    private javax.swing.JTextField tfAddCostPrice;
    private javax.swing.JTextField tfAddName;
    private javax.swing.JTextField tfAddSellingPrice;
    private javax.swing.JTextField tfaddExpDate;
    private javax.swing.JTextField tfaddProductId;
    // End of variables declaration//GEN-END:variables
}
