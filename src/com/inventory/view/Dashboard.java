package com.inventory.view;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.inventory.model.Product;
import com.inventory.util.FileUtil;
import java.awt.Color;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Dashboard.class.getName());
    private ArrayList<Product> productList = new ArrayList<>();
    private javax.swing.table.TableRowSorter<DefaultTableModel> rowSorter;

    public Dashboard() {

        initComponents();
        loadProductsToTable();
        setupPowerSearch();
        
        this.getContentPane().setBackground(Color.WHITE);
        Header.setBackground(Color.WHITE);
        
        btnPanel.setBackground(Color.WHITE);
        Header.putClientProperty(FlatClientProperties.STYLE,
                "arc: 20; background: #FFFFFF; border: 1,1,1,1, #E2E8F0, 1, 20");
//        btnPanel.putClientProperty(FlatClientProperties.STYLE,
//                "arc: 20; background: #FFFFFF; border: 1,1,1,1, #E2E8F0, 1, 20");
        searchPanel.putClientProperty(FlatClientProperties.STYLE,
                "arc: 20; background: #FFFFFF; border: 1,1,1,1, #E2E8F0, 1, 20");
        tablePanel.putClientProperty(FlatClientProperties.STYLE,
                "arc: 20; background: #FFFFFF; border: 1,1,1,1, #E2E8F0, 1, 20");
        
        
        
        jScrollPane1.setBorder(BorderFactory.createEmptyBorder());
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        brandLogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPanel = new javax.swing.JPanel();
        newProductBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchPanel = new javax.swing.JPanel();
        searcTxt = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        categoriesTxt = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        clearBtn = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NeatNest");
        setBackground(java.awt.SystemColor.control);

        Header.setBackground(new java.awt.Color(255, 255, 255));

        brandLogo.setFont(new java.awt.Font("Segoe UI Semibold", 2, 24)); // NOI18N
        brandLogo.setForeground(new java.awt.Color(0, 0, 153));
        brandLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/images/replacement (1).png"))); // NOI18N
        brandLogo.setText("NeatNest");
        brandLogo.setIconTextGap(8);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Inventory tracking made simple, fast, and stress-free.");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(brandLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(brandLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        newProductBtn.setBackground(new java.awt.Color(0, 0, 51));
        newProductBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        newProductBtn.setForeground(new java.awt.Color(255, 255, 255));
        newProductBtn.setText("+ New Product");
        newProductBtn.setFocusable(false);
        newProductBtn.addActionListener(this::newProductBtnActionPerformed);

        editBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 102));
        editBtn.setText("Edit");
        editBtn.setFocusable(false);
        editBtn.addActionListener(this::editBtnActionPerformed);

        deleteBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(153, 0, 0));
        deleteBtn.setText("Delete");
        deleteBtn.setFocusable(false);
        deleteBtn.addActionListener(this::deleteBtnActionPerformed);

        javax.swing.GroupLayout btnPanelLayout = new javax.swing.GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(newProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnPanelLayout.setVerticalGroup(
            btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(newProductBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));

        searcTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searcTxt.setText("Search");

        tfSearch.setHighlighter(null);
        tfSearch.setOpaque(true);
        tfSearch.setVerifyInputWhenFocusTarget(false);

        categoriesTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        categoriesTxt.setText("Categories");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All categories", "Electronics", "Hardware", "Cosmetics" }));
        jComboBox1.setFocusable(false);

        clearBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.setFocusable(false);
        clearBtn.addActionListener(this::clearBtnActionPerformed);

        javax.swing.GroupLayout searchPanelLayout = new javax.swing.GroupLayout(searchPanel);
        searchPanel.setLayout(searchPanelLayout);
        searchPanelLayout.setHorizontalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(searcTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(categoriesTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clearBtn)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        searchPanelLayout.setVerticalGroup(
            searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(searchPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searcTxt)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriesTxt)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        productsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Brand", "Category", "Cost Price", "Selling Price", "Unit", "Quantity", "Reorder Level", "Exp Date", "Date Added/Updated"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productsTable.setFocusable(false);
        productsTable.setGridColor(java.awt.SystemColor.control);
        productsTable.setSelectionBackground(java.awt.SystemColor.textHighlight);
        productsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        productsTable.setShowGrid(true);
        productsTable.setShowVerticalLines(false);
        jScrollPane1.setViewportView(productsTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductBtnActionPerformed
        addForm form = new addForm(this);
        form.setVisible(true);
    }//GEN-LAST:event_newProductBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        tfSearch.setText("");
        jComboBox1.setSelectedIndex(0); // Resets to "All categories"
        applyFilters();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        int selectedRow = productsTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a product row from the table first.",
                    "No Product Selected",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // Grab the selected Product from your ArrayList and pass it to editForm
        Product selectedProduct = productList.get(selectedRow);
        editForm form = new editForm(this, selectedRow, selectedProduct);
        form.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = productsTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Please select a product row from the table first.",
                    "No Product Selected",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        Product selectedProduct = productList.get(selectedRow);
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to delete '" + selectedProduct.getProductName() + "'?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return; // User clicked No or closed the dialog
        }

        try {
            // 3. Remove from ArrayList in memory
            productList.remove(selectedRow);

            // 4. Rebuild lines and overwrite Products.txt
            List<String> lines = new ArrayList<>();
            for (Product p : productList) {
                lines.add(p.getProductId() + "|" + p.getProductName() + "|"
                        + p.getProductBrand() + "|" + p.getProductCategory() + "|"
                        + p.getCostPrice() + "|" + p.getSellingPrice() + "|"
                        + p.getProductUnit() + "|" + p.getProductQuantity() + "|"
                        + p.getReorderLevel() + "|" + p.getExpDate() + "|"
                        + p.getDateAdded());
            }
            FileUtil.writeAllLines("Products.txt", lines);

            // 5. Refresh productsTable on screen
            loadProductsToTable();

            JOptionPane.showMessageDialog(
                    this,
                    "Product deleted successfully!",
                    "Deleted",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error deleting product: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

  
    public static void main(String args[]) {
//
        FlatMacLightLaf.setup();
        
        UIManager.put("Button.arc",15);
        UIManager.put("Component.arc",15);
        UIManager.put("TextComponent.arc",8);
        
        UIManager.put("TableHeader.background", new Color(235, 241, 248));
        UIManager.put("TableHeader.foreground", new Color(30, 41, 59));
        UIManager.put("TableHeader.bottomSeparatorColor", new Color(203, 213, 225));
        
        java.awt.EventQueue.invokeLater(() -> new Dashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JLabel brandLogo;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JLabel categoriesTxt;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newProductBtn;
    private javax.swing.JTable productsTable;
    private javax.swing.JLabel searcTxt;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    public void loadProductsToTable() {
        productList.clear(); // Keeps productList synced with the table
        DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
        model.setRowCount(0);

        try {
            List<String> lines = FileUtil.readLines("Products.txt");

            for (String line : lines) {
                if (line.isBlank()) {
                    continue;
                }

                String[] p = line.split("\\|");

                if (p.length >= 11) {
                    // 1. Add Product object into productList so Edit/Delete works
                    // 1. Add Product object into productList so Edit/Delete works
                    Product product = new Product(
                            p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim(),
                            Double.parseDouble(p[4].trim()),
                            Double.parseDouble(p[5].trim()),
                            p[6].trim(),
                            Integer.parseInt(p[7].trim()),
                            Integer.parseInt(p[8].trim()),
                            p[9].trim(), p[10].trim()
                    );
                    productList.add(product);

// 2. Add row into productsTable
                    model.addRow(new Object[]{
                        p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim(),
                        p[4].trim(), p[5].trim(), p[6].trim(), p[7].trim(),
                        p[8].trim(), p[9].trim(), p[10].trim()
                    });

                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Failed to load products: " + ex.getMessage(),
                    "File Error",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void addNewProduct(Product product) throws IOException {
        // 1. Add to ArrayList
        productList.add(product);

        // 2. Add directly to productsTable
        DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
        model.addRow(new Object[]{
            product.getProductId(), product.getProductName(),
            product.getProductBrand(), product.getProductCategory(),
            product.getCostPrice(), product.getSellingPrice(),
            product.getProductUnit(), product.getProductQuantity(),
            product.getReorderLevel(), product.getExpDate(),
            product.getDateAdded()
        });

        // 3. Write to Products.txt
        String line = product.getProductId() + "|" + product.getProductName() + "|"
                + product.getProductBrand() + "|" + product.getProductCategory() + "|"
                + product.getCostPrice() + "|" + product.getSellingPrice() + "|"
                + product.getProductUnit() + "|" + product.getProductQuantity() + "|"
                + product.getReorderLevel() + "|" + product.getExpDate() + "|"
                + product.getDateAdded();

        FileUtil.appendLine("Products.txt", line);
    }

    public void updateProduct(int rowIndex, Product updatedProduct) throws IOException {
        // 1. Update the Product in your ArrayList
        productList.set(rowIndex, updatedProduct);

        // 2. Rebuild all lines and overwrite Products.txt
        List<String> lines = new ArrayList<>();
        for (Product p : productList) {
            lines.add(p.getProductId() + "|" + p.getProductName() + "|"
                    + p.getProductBrand() + "|" + p.getProductCategory() + "|"
                    + p.getCostPrice() + "|" + p.getSellingPrice() + "|"
                    + p.getProductUnit() + "|" + p.getProductQuantity() + "|"
                    + p.getReorderLevel() + "|" + p.getExpDate() + "|"
                    + p.getDateAdded());
        }
        FileUtil.writeAllLines("Products.txt", lines);

        // 3. Refresh productsTable
        loadProductsToTable();
    }

    private void setupPowerSearch() {
        DefaultTableModel model = (DefaultTableModel) productsTable.getModel();
        rowSorter = new javax.swing.table.TableRowSorter<>(model);
        productsTable.setRowSorter(rowSorter);

        // 1. Live filter as you type or delete characters in tfSearch
        tfSearch.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                applyFilters();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                applyFilters();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                applyFilters();
            }
        });

        // 2. Live filter when you change the Category dropdown (jComboBox1)
        jComboBox1.addActionListener(e -> applyFilters());

    }

    private void applyFilters() {
        String searchText = tfSearch.getText().trim();
        String selectedCategory = jComboBox1.getSelectedItem().toString();

        List<javax.swing.RowFilter<Object, Object>> filters = new ArrayList<>();

        // 1. Power Search filter (searches across ALL columns, case-insensitive)
        if (!searchText.isEmpty()) {
            filters.add(javax.swing.RowFilter.regexFilter("(?i)" + java.util.regex.Pattern.quote(searchText)));
        }

        // 2. Category dropdown filter (Column 3 is Category)
        if (!selectedCategory.equalsIgnoreCase("All categories")) {
            filters.add(javax.swing.RowFilter.regexFilter("^" + java.util.regex.Pattern.quote(selectedCategory) + "$", 3));
        }

        // Combine both filters together
        if (filters.isEmpty()) {
            rowSorter.setRowFilter(null); // Show all rows
        } else {
            rowSorter.setRowFilter(javax.swing.RowFilter.andFilter(filters));
        }
    }
}
