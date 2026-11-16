package com.inventory.view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.inventory.model.Product;
import com.inventory.validations.ProductValidation;
import java.io.IOException;
import javax.swing.JOptionPane;

public class editForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(editForm.class.getName());
    private Dashboard dashboard;
    private int rowIndex;

    public editForm(Dashboard dashboard, int rowIndex, Product product) {
        initComponents();
        this.dashboard = dashboard;
        this.rowIndex = rowIndex;

        // Pre-fill all fields with the selected product's current data
        tfEditProductId.setText(product.getProductId());
        tfEditProductId.setEditable(false); // Prevent changing the unique ID
        tfEditName.setText(product.getProductName());
        tfEditBrand.setText(product.getProductBrand());
        cbEditCategory.setSelectedItem(product.getProductCategory());
        tfEditCostPrice.setText(String.valueOf(product.getCostPrice()));
        tfEditSellingPrice.setText(String.valueOf(product.getSellingPrice()));
        cbEditUnit.setSelectedItem(product.getProductUnit());
        sEditQuantity.setValue(product.getProductQuantity());
        sEditReorderLevel.setValue(product.getReorderLevel());
        tfEditExpDate.setText(product.getExpDate());
    }

    public editForm() {
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
        tfEditProductId = new javax.swing.JTextField();
        tfEditName = new javax.swing.JTextField();
        tfEditBrand = new javax.swing.JTextField();
        cbEditCategory = new javax.swing.JComboBox<>();
        tfEditCostPrice = new javax.swing.JTextField();
        tfEditSellingPrice = new javax.swing.JTextField();
        sEditQuantity = new javax.swing.JSpinner();
        sEditReorderLevel = new javax.swing.JSpinner();
        tfEditExpDate = new javax.swing.JTextField();
        cbEditUnit = new javax.swing.JComboBox<>();
        footer = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NeatNest");
        setResizable(false);

        header.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Edit Product");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fields marked with * are required");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(10, Short.MAX_VALUE))
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

        tfEditProductId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfEditProductId.addActionListener(this::tfEditProductIdActionPerformed);

        tfEditName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfEditBrand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfEditBrand.addActionListener(this::tfEditBrandActionPerformed);

        cbEditCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEditCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All categories", "Electronics", "Hardware", "Cosmetics" }));

        tfEditCostPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfEditSellingPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sEditQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        sEditReorderLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfEditExpDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cbEditUnit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbEditUnit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PCS", "PR", "SET", "KGS", "LTR", "FT", "IN" }));

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
                            .addComponent(tfEditProductId)
                            .addComponent(tfEditName)
                            .addComponent(tfEditBrand)
                            .addComponent(cbEditCategory, 0, 235, Short.MAX_VALUE)
                            .addComponent(tfEditCostPrice)
                            .addComponent(tfEditSellingPrice)
                            .addComponent(sEditQuantity)
                            .addComponent(sEditReorderLevel)
                            .addComponent(tfEditExpDate)
                            .addComponent(cbEditUnit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(tfEditProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfEditBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbEditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfEditCostPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfEditSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbEditUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sEditQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sEditReorderLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addingFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tfEditExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        editBtn.setBackground(new java.awt.Color(0, 0, 51));
        editBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Edit Product");
        editBtn.addActionListener(this::editBtnActionPerformed);

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
                .addComponent(editBtn))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tfEditProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditProductIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditProductIdActionPerformed

    private void tfEditBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditBrandActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // 1. Clear all JTextFields
        tfEditProductId.setText("");
        tfEditName.setText("");
        tfEditBrand.setText("");
        tfEditCostPrice.setText("");
        tfEditSellingPrice.setText("");
        tfEditExpDate.setText("");

        // 2. Reset all JComboBoxes to the first item
        cbEditCategory.setSelectedIndex(0);
        cbEditUnit.setSelectedIndex(0);

        // 3. Reset all JSpinners to 0
        sEditQuantity.setValue(0);
        sEditReorderLevel.setValue(0);

        // 4. Put the typing cursor back on the first field
        tfEditProductId.requestFocus();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
          String id = tfEditProductId.getText().trim();
    String name = tfEditName.getText().trim();
    String brand = tfEditBrand.getText().trim();
    String category = cbEditCategory.getSelectedItem().toString();
    String costPriceText = tfEditCostPrice.getText().trim();
    String sellingPriceText = tfEditSellingPrice.getText().trim();
    String unit = cbEditUnit.getSelectedItem().toString();
    int quantity = (int) sEditQuantity.getValue();
    int reorder = (int) sEditReorderLevel.getValue();
    String expDate = tfEditExpDate.getText().trim();
    String dateUpdate = java.time.LocalDate.now().toString(); // Updates to today's date!

    try {
        // Validate using editProductValidation (same as addProductValidation, minus duplicate ID check)
        if (ProductValidation.editProductValidation(
                name, brand, category, costPriceText, sellingPriceText,
                unit, quantity, reorder, expDate)) {

            double costPrice = Double.parseDouble(costPriceText);
            double sellingPrice = Double.parseDouble(sellingPriceText);

            Product updatedProduct = new Product(
                id, name, brand, category, costPrice, sellingPrice,
                unit, quantity, reorder, expDate, dateUpdate
            );

            if (dashboard != null) {
                dashboard.updateProduct(rowIndex, updatedProduct);
            }

            JOptionPane.showMessageDialog(this, "Product updated successfully!");
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
        JOptionPane.showMessageDialog(this, "Error updating product: " + ex.getMessage());
    }
    }//GEN-LAST:event_editBtnActionPerformed

    public static void main(String args[]) {
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new editForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addingForm;
    private javax.swing.JComboBox<String> cbEditCategory;
    private javax.swing.JComboBox<String> cbEditUnit;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton editBtn;
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
    private javax.swing.JSpinner sEditQuantity;
    private javax.swing.JSpinner sEditReorderLevel;
    private javax.swing.JTextField tfEditBrand;
    private javax.swing.JTextField tfEditCostPrice;
    private javax.swing.JTextField tfEditExpDate;
    private javax.swing.JTextField tfEditName;
    private javax.swing.JTextField tfEditProductId;
    private javax.swing.JTextField tfEditSellingPrice;
    // End of variables declaration//GEN-END:variables
}
