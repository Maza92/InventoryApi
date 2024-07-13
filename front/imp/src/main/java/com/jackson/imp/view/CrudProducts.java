/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jackson.imp.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import com.jackson.imp.JsonParsing;
import com.jackson.imp.Request;
import com.jackson.imp.model.product;
import component.ButtonEditor;
import component.ButtonRenderer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luis
 */
public class CrudProducts extends javax.swing.JFrame {

    /**
     * Creates new form CrudProducts
     */
    private String[] header = {"Nombre", "Descripcion", "Precio", "Stock", "Actions", ""};
    private ArrayList<product> products;

    Request rq;
    JsonParsing jp;
    DefaultTableModel model;

    public CrudProducts() throws Exception {
        initComponents();

        rq = new Request();
        jp = new JsonParsing();

        FilterField.setBorder(BorderFactory.createCompoundBorder(FilterField.getBorder(),
                BorderFactory.createEmptyBorder(5, 15, 5, 5)));

        FilterField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filter();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filter();
            }
        });
        setupTable();
        updateTable();
    }

    private void setupTable() {
        model = new DefaultTableModel(header, 0);
        Jtable.setModel(model);
        Jtable.setRowHeight(40);

        Jtable.getColumnModel().getColumn(0).setPreferredWidth(100);
        Jtable.getColumnModel().getColumn(1).setPreferredWidth(400);
        Jtable.getColumnModel().getColumn(2).setPreferredWidth(50);
        Jtable.getColumnModel().getColumn(3).setPreferredWidth(50);
        Jtable.getColumnModel().getColumn(4).setPreferredWidth(20);
        Jtable.getColumnModel().getColumn(5).setPreferredWidth(20);

        Jtable.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        Jtable.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        Jtable.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(Jtable, this));
        Jtable.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor(Jtable, this));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        Jtable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        Jtable.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        Jtable.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        Jtable.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 14));
        Jtable.getTableHeader().setForeground(Color.decode("#666666"));
        Jtable.getTableHeader().setPreferredSize(new Dimension(Jtable.getTableHeader().getWidth(), 40));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable = new javax.swing.JTable();
        FilterField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Product Management ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 250, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 60));

        Jtable.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Jtable.setForeground(new java.awt.Color(51, 51, 51));
        Jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Jtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 940, 470));

        FilterField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        FilterField.setForeground(new java.awt.Color(0, 0, 0));
        FilterField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FilterFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FilterFieldFocusLost(evt);
            }
        });
        jPanel1.add(FilterField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 920, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FilterFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FilterFieldFocusGained
        // TODO add your handling code here:
//        if (FilterField.getText().equals("Ingrese Nombre")) {
//            FilterField.setText("");
//            FilterField.setForeground(Color.BLACK);
//        }
    }//GEN-LAST:event_FilterFieldFocusGained

    private void FilterFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FilterFieldFocusLost
        // TODO add your handling code here:
//        if (FilterField.getText().equals("")) {
//            FilterField.setText("Ingrese Nombre");
//            FilterField.setForeground(Color.decode("#CCCCCC"));
//        }
    }//GEN-LAST:event_FilterFieldFocusLost

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        AddProducts products;
        try {
            products = new AddProducts(false);
            products.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(CrudProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MousePressed

    /**
     * @param args the command line arguments
     */
   

    private List<product> getProducts() throws IOException {
        return jp.parseArray(rq.getRequest("api/product"), product.class);
    }

    public void updateTable() throws Exception {
        products = (ArrayList<product>) getProducts();
        for (product product : products) {
            Object[] row = {product.getName(), product.getDescription(), product.getPrice(), product.getStock(), new JButton("Edit"), new JButton("Del")};
            model.addRow(row);
        }
    }

    private void updateTable(ArrayList<product> productList) {
        for (product product : productList) {
            JButton editButton = new JButton("Edit");
            JButton rmButton = new JButton("Del");

            Object[] row = {product.getName(), product.getDescription(), product.getPrice(), product.getStock(), editButton, rmButton};
            model.addRow(row);
        }
    }

    private void cleanTable() {
        DefaultTableModel model = (DefaultTableModel) Jtable.getModel();
        model.setRowCount(0);
        Jtable.setModel(model);
    }

    private void filter() {
        String text = FilterField.getText();
        ArrayList<product> filteredProducts = new ArrayList<>();
        for (product product : products) {
            if (product.getName().toLowerCase().contains(text.toLowerCase())) {
                filteredProducts.add(product);
            }
        }

        model.setRowCount(0);
        updateTable(filteredProducts);
    }

    public void editProduct(int row) throws Exception, MalformedURLException {
        String productName = Jtable.getValueAt(row, 0).toString();
        System.out.println(productName);

        product now = null;
        for (product product1 : products) {
            if (product1.getName().toLowerCase().equals(productName.toLowerCase())) {
                now = product1;
                break;
            }
        }

        AddProducts add = new AddProducts(true);
        add.updateProduct(now);
        add.setId(now.getId());
        add.setVisible(true);
        this.dispose();
    }

    public void deleteProduct(int row) throws Exception {

        String productName = Jtable.getValueAt(row, 0).toString();

        for (product product1 : products) {
            if (product1.getName().toLowerCase().equals(productName.toLowerCase())) {
                rq.deleteRequest("api/product/" + product1.getId());
                cleanTable();
                updateTable();
                return;
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FilterField;
    private javax.swing.JTable Jtable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
