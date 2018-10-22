/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windows;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import oop_3encriptors_sql.*;


/**
 *
 * @author lenova
 */
public class JEncriptor extends javax.swing.JFrame {
DefaultListModel model = new DefaultListModel();
    /**
     * Creates new form JEncriptor
     */
    public JEncriptor() 
    {
        initComponents();
        //JEncriptor_Panel.
         list.setModel(model);
         ButtonGroup group = new ButtonGroup();
         group.add(jRadioButton_AES);
         group.add(jRadioButton_Additive);
         group.add(jRadioButton_BitwiseInversion);
         group.add(jRadioButton_DES);
         group.add(jRadioButton_MD5);
         group.add(jRadioButton_sha1);
         group.add(jRadioButton_sha256);
         group.add(jRadioButton_xor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JEncriptor_Panel = new javax.swing.JPanel();
        jRadioButton_AES = new javax.swing.JRadioButton();
        jRadioButton_Additive = new javax.swing.JRadioButton();
        jRadioButton_BitwiseInversion = new javax.swing.JRadioButton();
        jRadioButton_DES = new javax.swing.JRadioButton();
        jRadioButton_MD5 = new javax.swing.JRadioButton();
        jRadioButton_sha1 = new javax.swing.JRadioButton();
        jRadioButton_sha256 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        TextField_input = new javax.swing.JTextField();
        jRadioButton_xor = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();

        JEncriptor_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encriptors", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jRadioButton_AES.setText("AES");

        jRadioButton_Additive.setText("Additive");
        jRadioButton_Additive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_AdditiveActionPerformed(evt);
            }
        });

        jRadioButton_BitwiseInversion.setText("Bitwise");

        jRadioButton_DES.setText("DES");

        jRadioButton_MD5.setText("MD5");

        jRadioButton_sha1.setText("SHA-1");

        jRadioButton_sha256.setText("SHA-256");

        jButton1.setText("Enccript");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TextField_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_inputActionPerformed(evt);
            }
        });

        jRadioButton_xor.setText("XOR");

        jLabel1.setText(" Message to encript");

        jLabel2.setText("Encripted message");

        list.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(list);

        javax.swing.GroupLayout JEncriptor_PanelLayout = new javax.swing.GroupLayout(JEncriptor_Panel);
        JEncriptor_Panel.setLayout(JEncriptor_PanelLayout);
        JEncriptor_PanelLayout.setHorizontalGroup(
            JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JEncriptor_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JEncriptor_PanelLayout.createSequentialGroup()
                        .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextField_input, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton_xor)
                            .addComponent(jRadioButton_BitwiseInversion)
                            .addComponent(jRadioButton_AES)
                            .addComponent(jRadioButton_DES)
                            .addComponent(jRadioButton_sha256)
                            .addComponent(jRadioButton_sha1)
                            .addComponent(jRadioButton_MD5)
                            .addComponent(jRadioButton_Additive)))
                    .addGroup(JEncriptor_PanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        JEncriptor_PanelLayout.setVerticalGroup(
            JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JEncriptor_PanelLayout.createSequentialGroup()
                .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_BitwiseInversion)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_AES)
                    .addComponent(TextField_input, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton_DES)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JEncriptor_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JEncriptor_PanelLayout.createSequentialGroup()
                        .addComponent(jRadioButton_sha256)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_sha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_MD5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_xor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton_Additive))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JEncriptor_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JEncriptor_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String strVal = TextField_input.getText();
        if(jRadioButton_xor.getModel().isSelected()== true)
        {
            XOR xor =  XOR.instance();
            String strEncript = xor.encript(strVal);             
            model.addElement("XOR: "+strEncript);            
        }
         if(jRadioButton_Additive.getModel().isSelected()== true)
        {
           //  Additive additive = Additive.instance();
            // String strEncript = additive.encript("Additive "+strVal);
             

//        AES aes = new AES();
//        String dtrVal = aes.encript("hello");
//        System.err.println( dtrVal);
            
        }
        if(jRadioButton_AES.getModel().isSelected()== true)
        {
            AES aes = new AES();
            String strEncript;             
            try {
                strEncript = aes.encript(strVal);
                model.addElement("AES: "+strEncript);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
        }
        if(jRadioButton_BitwiseInversion.getModel().isSelected()== true)
        {
//            BitwiseInversion bitwiseInversion =  BitwiseInversion.instance();
//            String strEncript = bitwiseInversion.encript(strVal);             
//            model.addElement("Bitwise Inversion: "+strEncript);            
        } 
        if(jRadioButton_DES.getModel().isSelected()== true)
        {
            Des des =  new Des();     
            try {
                String strEncript = des.encript(strVal);
                model.addElement("DES: "+strEncript);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchPaddingException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeyException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalBlockSizeException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BadPaddingException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvalidKeySpecException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            }
                        
        }
        if(jRadioButton_MD5.getModel().isSelected()== true)
        {
            MD5 md5 = new MD5();
            String strEncript;             
            try {
                strEncript = md5.encript(strVal);
                model.addElement("MD5: "+strEncript);  
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            }
                     
        }
        if(jRadioButton_sha1.getModel().isSelected()== true)
        {
            Sha1 sha1 = new Sha1();
            String strEncript;             
            try {
                strEncript = sha1.encript(strVal);
                model.addElement("SHA-1: "+strEncript);  
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            }


        } 
        if(jRadioButton_sha256.getModel().isSelected()== true)
        {
            Sha1 sha256 = new Sha1();
            String strEncript;             
            try {
                strEncript = sha256.encript(strVal);
                model.addElement("SHA-256: "+strEncript);  
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(JEncriptor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton_AdditiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_AdditiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_AdditiveActionPerformed

    private void TextField_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_inputActionPerformed

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
            java.util.logging.Logger.getLogger(JEncriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JEncriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JEncriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JEncriptor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JEncriptor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JEncriptor_Panel;
    private javax.swing.JTextField TextField_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton_AES;
    private javax.swing.JRadioButton jRadioButton_Additive;
    private javax.swing.JRadioButton jRadioButton_BitwiseInversion;
    private javax.swing.JRadioButton jRadioButton_DES;
    private javax.swing.JRadioButton jRadioButton_MD5;
    private javax.swing.JRadioButton jRadioButton_sha1;
    private javax.swing.JRadioButton jRadioButton_sha256;
    private javax.swing.JRadioButton jRadioButton_xor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    // End of variables declaration//GEN-END:variables
}