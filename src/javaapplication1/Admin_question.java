/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Admin_question extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pat = null;

    public Admin_question() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtque = new javax.swing.JTextArea();
        txtnum = new javax.swing.JTextField();
        langbox = new javax.swing.JComboBox<>();
        level = new javax.swing.JComboBox<>();
        D = new javax.swing.JTextField();
        A = new javax.swing.JTextField();
        B = new javax.swing.JTextField();
        C = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnext = new javax.swing.JButton();
        txtnext1 = new javax.swing.JButton();
        txtnext2 = new javax.swing.JButton();
        txtnext3 = new javax.swing.JButton();
        txtnext4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(11, 144, 221));
        jPanel2.setPreferredSize(new java.awt.Dimension(1510, 70));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\Button\\LogoSKILL.png")); // NOI18N
        jLabel4.setText("SkillMaestro");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 60));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 260, 80));

        jButton4.setIcon(new javax.swing.ImageIcon("F:\\Button\\new back button (1).png")); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 0, 60, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 1670, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtque.setColumns(20);
        txtque.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtque.setRows(5);
        txtque.setToolTipText("");
        txtque.setWrapStyleWord(true);
        txtque.setBorder(null);
        txtque.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtque.setDoubleBuffered(true);
        txtque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtqueKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtque);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 1140, 230));

        txtnum.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        txtnum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtnum.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumActionPerformed(evt);
            }
        });
        txtnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnumKeyPressed(evt);
            }
        });
        jPanel3.add(txtnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, 50));

        langbox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        langbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "Cpp", "Java", "Logical Reasoning", "Quantative aptitude", "English" }));
        langbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                langboxActionPerformed(evt);
            }
        });
        jPanel3.add(langbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 290, 210, 40));

        level.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic", "Intermediate", "Advance" }));
        jPanel3.add(level, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 380, 210, 40));

        D.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        D.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DKeyPressed(evt);
            }
        });
        jPanel3.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 1130, 50));

        A.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        A.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AKeyPressed(evt);
            }
        });
        jPanel3.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 1130, 50));

        B.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        B.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BKeyPressed(evt);
            }
        });
        jPanel3.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 1130, 50));

        C.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CKeyPressed(evt);
            }
        });
        jPanel3.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 1130, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Option - D ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 110, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Q no. ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Question :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Option - A");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 110, 50));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Option - B");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 110, 50));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Option - C ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 110, 50));

        txtnext.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext.setIcon(new javax.swing.ImageIcon("F:\\Button\\delete.png")); // NOI18N
        txtnext.setBorder(null);
        txtnext.setBorderPainted(false);
        txtnext.setContentAreaFilled(false);
        txtnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnextActionPerformed(evt);
            }
        });
        jPanel3.add(txtnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 140, 40));

        txtnext1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext1.setIcon(new javax.swing.ImageIcon("F:\\Button\\prev.png")); // NOI18N
        txtnext1.setBorder(null);
        txtnext1.setBorderPainted(false);
        txtnext1.setContentAreaFilled(false);
        txtnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnext1ActionPerformed(evt);
            }
        });
        jPanel3.add(txtnext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 110, 40));

        txtnext2.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext2.setIcon(new javax.swing.ImageIcon("F:\\Button\\Add.png")); // NOI18N
        txtnext2.setBorder(null);
        txtnext2.setBorderPainted(false);
        txtnext2.setContentAreaFilled(false);
        txtnext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnext2ActionPerformed(evt);
            }
        });
        jPanel3.add(txtnext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 110, 40));

        txtnext3.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext3.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        txtnext3.setBorder(null);
        txtnext3.setBorderPainted(false);
        txtnext3.setContentAreaFilled(false);
        txtnext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnext3ActionPerformed(evt);
            }
        });
        jPanel3.add(txtnext3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 570, 110, 40));

        txtnext4.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext4.setIcon(new javax.swing.ImageIcon("F:\\Button\\uodate.png")); // NOI18N
        txtnext4.setBorder(null);
        txtnext4.setBorderPainted(false);
        txtnext4.setContentAreaFilled(false);
        txtnext4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnext4ActionPerformed(evt);
            }
        });
        jPanel3.add(txtnext4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 140, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 80, 1670, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void dataentry() {
        String ques,qnum, A,B,C,D;
      
        
        

        int c;

//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Muskan@0712");
//
//            pat = con.prepareStatement("insert into cbasic(Username,Name,Phnumber,Password) values(?,?,?,?)");
//                        pat.setString(1, ques.trim());
//                        pat.setString(2, Name);
//                        pat.setString(3, Phnumber);
//                        pat.setString(4, pwd);
//                        pat.execute();
//
//
//
//            JOptionPane.showMessageDialog(this, "Updated");
//
//        } catch (ClassNotFoundException | SQLException e1) {
//            JOptionPane.showMessageDialog(this, e1);
//        }

    }


    private void txtnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumActionPerformed

    }//GEN-LAST:event_txtnumActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void langboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_langboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_langboxActionPerformed

    private void txtnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnextActionPerformed


    }//GEN-LAST:event_txtnextActionPerformed

    private void txtnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnext1ActionPerformed

    private void txtnext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnext2ActionPerformed

    }//GEN-LAST:event_txtnext2ActionPerformed

    private void txtnext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnext3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnext3ActionPerformed

    private void txtnext4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnext4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnext4ActionPerformed

    private void txtnumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumKeyPressed
        String phn = txtnum.getText();
        int length = phn.length();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (length < 3) {
                txtnum.setEditable(true);
            } else {
                txtnum.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtnum.setEditable(true);
            } else {
                txtnum.setEditable(false);
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtnum.setEditable(true);
            txtque.requestFocus();
        }
    }//GEN-LAST:event_txtnumKeyPressed

    private void txtqueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtqueKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            A.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            txtnum.requestFocus();
        }
    }//GEN-LAST:event_txtqueKeyPressed

    private void AKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            B.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtque.requestFocus();
        }
    }//GEN-LAST:event_AKeyPressed

    private void BKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            C.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            A.requestFocus();
        }
    }//GEN-LAST:event_BKeyPressed

    private void CKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            D.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_UP) {
            B.requestFocus();
        }
    }//GEN-LAST:event_CKeyPressed

    private void DKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            C.requestFocus();
        }
    }//GEN-LAST:event_DKeyPressed

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
            java.util.logging.Logger.getLogger(Admin_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_question.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A;
    private javax.swing.JTextField B;
    private javax.swing.JTextField C;
    private javax.swing.JTextField D;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> langbox;
    private javax.swing.JComboBox<String> level;
    private javax.swing.JButton txtnext;
    private javax.swing.JButton txtnext1;
    private javax.swing.JButton txtnext2;
    private javax.swing.JButton txtnext3;
    private javax.swing.JButton txtnext4;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextArea txtque;
    // End of variables declaration//GEN-END:variables
}