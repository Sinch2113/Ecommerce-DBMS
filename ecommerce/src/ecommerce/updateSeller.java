/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author sinch
 */
public class updateSeller extends javax.swing.JFrame {

    /**
     * Creates new form updateSeller
     */
    public updateSeller() {
        initComponents();
        setSize(560,500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Seller ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(55, 81, 68, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Seller Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(55, 145, 92, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Seller Address:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(55, 189, 107, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Seller Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(55, 284, 90, 22);

        jButton1.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-update-30.png")); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(267, 397, 107, 39);

        jButton2.setIcon(new javax.swing.ImageIcon("S:\\notes\\DBMS\\DBMS mini project\\icons\\icons8-back-to-30.png")); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(416, 397, 93, 39);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(215, 77, 137, 32);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(215, 127, 189, 37);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(215, 189, 260, 71);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(215, 287, 260, 32);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Seller Phone No:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(55, 348, 122, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(215, 345, 203, 31);

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 600, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
        {
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");
          new seller().setVisible(true);
           setVisible(false);
        }
           catch(Exception e)
        {
            System.out.println(e);
    }                 // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String sql="update Seller set sup_name=?,sup_addess=?,sup_email=?,sup_phone=? where sid=?;";
        try{  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproject","root","root");  
		PreparedStatement pstmt=con.prepareStatement(sql);  
                pstmt.setString(1,jTextField2.getText());
                pstmt.setString(2,jTextField3.getText());
                
                pstmt.setString(3,jTextField4.getText());
                pstmt.setString(4,jTextField5.getText());
                pstmt.setString(5,jTextField1.getText());
		int x=pstmt.executeUpdate();  
                if(x==1)
		System.out.println("Updation successful");  
                new seller().setVisible(true);
                setVisible(false);
		con.close();  
		}catch(Exception e){ 
                    System.out.println(e);
                }           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(updateSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateSeller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateSeller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
