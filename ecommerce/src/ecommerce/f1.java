package ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sinch
 */
public class f1 extends javax.swing.JFrame {

    /**
     * Creates new form f1
     */
    public f1() {
        initComponents();
        setSize(530,490);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(179, 214, 237));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(232, 207, 105));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-customer-30.png")); // NOI18N
        jButton1.setText("Customer");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(50, 90, 149, 42);

        jButton2.setBackground(new java.awt.Color(232, 207, 105));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-merchant-account-40.png")); // NOI18N
        jButton2.setText("Payment");
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(50, 160, 149, 43);

        jButton4.setBackground(new java.awt.Color(232, 207, 105));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-supplier-30.png")); // NOI18N
        jButton4.setText("Supplier");
        jButton4.setOpaque(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(320, 90, 147, 42);

        jButton5.setBackground(new java.awt.Color(232, 207, 105));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-warehouse-32.png")); // NOI18N
        jButton5.setText("Products");
        jButton5.setOpaque(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(320, 150, 147, 43);

        jButton7.setBackground(new java.awt.Color(232, 207, 105));
        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton7.setText("Log out");
        jButton7.setOpaque(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(420, 405, 89, 30);

        jSeparator1.setBackground(new java.awt.Color(220, 235, 250));
        jSeparator1.setForeground(new java.awt.Color(220, 235, 250));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 50, 531, 10);

        jLabel1.setBackground(new java.awt.Color(220, 235, 250));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-database-48.png")); // NOI18N
        jLabel1.setText("Ecommerce Database");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 530, 60);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-shopping-cart-30.png")); // NOI18N
        jButton3.setText("Unpurchased Cart Items");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(20, 280, 210, 40);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-purchase-order-30.png")); // NOI18N
        jButton6.setText("Customer Order History");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(270, 280, 230, 40);

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-in-inventory-30.png")); // NOI18N
        jButton8.setText("Product Stock");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(150, 340, 210, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\ecom5.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-110, 20, 660, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new customer().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new payment().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                                    // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new seller().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                               // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new Products().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new f2().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                                
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new unpurchasedCust().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new customerOrderHistory().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new productQuantity().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                 
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(f1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new f1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
