/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.jackson.imp.view;

import com.formdev.flatlaf.FlatLightLaf;
import com.jackson.imp.JsonParsing;
import com.jackson.imp.Request;
import com.jackson.imp.model.user.User;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Luis
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    Request client;
    JsonParsing jsonUtil;

    Login login;

    public Register() {
        initComponents();

        client = new Request();
        jsonUtil = new JsonParsing();

        login = new Login();

        setLocationRelativeTo(null);
        setResizable(false);

        NameField.setBorder(BorderFactory.createCompoundBorder(EmailField.getBorder(),
                BorderFactory.createEmptyBorder(5, 15, 5, 5)));

        EmailField.setBorder(BorderFactory.createCompoundBorder(EmailField.getBorder(),
                BorderFactory.createEmptyBorder(5, 15, 5, 5)));

        PasswordField.setBorder(BorderFactory.createCompoundBorder(EmailField.getBorder(),
                BorderFactory.createEmptyBorder(5, 0, 5, 5)));

        PasswordField.setText("Password");
        PasswordField.setEchoChar((char) 0);
        PasswordField.setForeground(Color.decode("#CCCCCC"));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(450, 112));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrarse");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 60));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Crea una cuenta para acceder a nuestros servicios.");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 450, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 110));

        LoginButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(0, 0, 0));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginButtonMousePressed(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 80, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Email");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 10, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        NameField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        NameField.setForeground(new java.awt.Color(204, 204, 204));
        NameField.setText("Ingresa tu nombre");
        NameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                NameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                NameFieldFocusLost(evt);
            }
        });
        jPanel1.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 350, 50));

        EmailField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        EmailField.setForeground(new java.awt.Color(204, 204, 204));
        EmailField.setText("ejemplo@email.com");
        EmailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFieldFocusLost(evt);
            }
        });
        jPanel1.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 350, 50));

        PasswordField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(204, 204, 204));
        PasswordField.setText("Password");
        PasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFieldFocusLost(evt);
            }
        });
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 350, 50));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Registrarse");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 250, 40));

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

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        // TODO add your handling code here:
        LoginButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        // TODO add your handling code here:
        LoginButton.setForeground(Color.decode("#556EE6"));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void LoginButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMousePressed
        // TODO add your handling code here:
        SetVisibleLogin();
    }//GEN-LAST:event_LoginButtonMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:

        String response = null;

        User newUser = new User(null,
                NameField.getText(),
                EmailField.getText(),
                String.valueOf(PasswordField.getPassword()));

        if (newUser == null) {
            System.out.println("Error al registrar usuario");
            return;
        }

        try {
            response = jsonUtil.parse(client.postRequest("api/auth/register", jsonUtil.toJson(newUser)), User.class).toString();
            System.out.println(response);
        } catch (IOException ex) {
            System.out.println("IOException");
        }

        if (response == null) {
            System.out.println("Error de respuesta de registro");
            return;
        }

        JOptionPane.showMessageDialog(this, "Registro Correcto");

        SetVisibleLogin();
    }//GEN-LAST:event_jButton1MousePressed

    private void NameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFieldFocusGained
        // TODO add your handling code here:
        if (NameField.getText().equals("Ingresa tu nombre")) {
            NameField.setText("");
            NameField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_NameFieldFocusGained

    private void NameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_NameFieldFocusLost
        // TODO add your handling code here:
        if (NameField.getText().equals("")) {
            NameField.setText("Ingresa tu nombre");
            NameField.setForeground(Color.decode("#CCCCCC"));
        }
    }//GEN-LAST:event_NameFieldFocusLost

    private void EmailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFieldFocusGained
        // TODO add your handling code here:
        if (EmailField.getText().equals("ejemplo@email.com")) {
            EmailField.setText("");
            EmailField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_EmailFieldFocusGained

    private void EmailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFieldFocusLost
        // TODO add your handling code here:
        if (EmailField.getText().equals("")) {
            EmailField.setText("ejemplo@email.com");
            EmailField.setForeground(Color.decode("#CCCCCC"));
        }
    }//GEN-LAST:event_EmailFieldFocusLost

    private void PasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusGained
        // TODO add your handling code here:
        String password = String.valueOf(PasswordField.getPassword());

        if (password.equals("Password")) {
            PasswordField.setText("");
            PasswordField.setForeground(Color.black);
            PasswordField.setEchoChar('*');
        }
    }//GEN-LAST:event_PasswordFieldFocusGained

    private void PasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFieldFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(PasswordField.getPassword());

        if (password.toLowerCase().equals("Password") || password.toLowerCase().equals("")) {
            PasswordField.setText("Password");
            PasswordField.setEchoChar((char) 0);
            PasswordField.setForeground(Color.decode("#CCCCCC"));
        }
    }//GEN-LAST:event_PasswordFieldFocusLost

    private void SetVisibleLogin() {
        login.setVisible(true);
        this.dispose();
    }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JTextField NameField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
