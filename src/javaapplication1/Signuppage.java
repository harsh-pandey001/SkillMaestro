package javaapplication1;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Signuppage extends javax.swing.JFrame {

    public Signuppage() {
        initComponents();
        txtfirstname.requestFocus(null);
    }
    PreparedStatement pat;
    Connection con;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtusid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        txtfirstname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtphn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        conpwd = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        F = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Signup");
        setLocation(new java.awt.Point(-10, 0));
        setPreferredSize(new java.awt.Dimension(2000, 2000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(677, 760));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon("F:\\Button\\new back button (1).png")); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, 60));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\Telegram Desktop\\Group 3.png")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(677, 760));
        jLabel2.setMinimumSize(new java.awt.Dimension(677, 760));
        jLabel2.setPreferredSize(new java.awt.Dimension(677, 760));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 780));

        txtusid.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtusid.setToolTipText("");
        txtusid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        txtusid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusidActionPerformed(evt);
            }
        });
        txtusid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtusidKeyPressed(evt);
            }
        });
        jPanel1.add(txtusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 360, 350, 50));

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 144, 221));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Signup");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 270, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(11, 144, 221));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 90, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 144, 221));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Username ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 100, 50));

        txtpass.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        txtpass.setEchoChar('*');
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 450, 350, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(11, 115, 236));
        jButton2.setIcon(new javax.swing.ImageIcon("F:\\Button\\signup.png")); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 720, 120, 60));

        txtfirstname.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtfirstname.setToolTipText("");
        txtfirstname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        txtfirstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtfirstnameFocusLost(evt);
            }
        });
        txtfirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfirstnameActionPerformed(evt);
            }
        });
        txtfirstname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfirstnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfirstnameKeyTyped(evt);
            }
        });
        jPanel1.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 180, 350, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(11, 144, 221));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Full Name ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 100, 50));

        txtphn.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtphn.setToolTipText("");
        txtphn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        txtphn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphnActionPerformed(evt);
            }
        });
        txtphn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtphnKeyPressed(evt);
            }
        });
        jPanel1.add(txtphn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 270, 350, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(11, 144, 221));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Phone Number");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 140, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(11, 144, 221));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Gender");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 640, 170, 50));

        conpwd.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        conpwd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        conpwd.setEchoChar('*');
        conpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                conpwdKeyPressed(evt);
            }
        });
        jPanel1.add(conpwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 540, 350, 50));

        show.setForeground(new java.awt.Color(11, 144, 221));
        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 610, -1, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("*");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 650, 40, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, 20, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 30, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 370, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("*");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 40, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(11, 144, 221));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Confirm Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, 170, 50));

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("*");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 40, 30));

        F.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        F.setForeground(new java.awt.Color(11, 144, 221));
        F.setText("Female");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        jPanel1.add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 650, 170, 40));

        M.setFont(new java.awt.Font("Segoe UI Historic", 0, 20)); // NOI18N
        M.setForeground(new java.awt.Color(11, 144, 221));
        M.setText("Male");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        jPanel1.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 650, 140, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1660, 960));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusidActionPerformed

    private void txtfirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfirstnameActionPerformed

    }//GEN-LAST:event_txtfirstnameActionPerformed

    private void txtphnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphnActionPerformed

    public void executeinsert() throws SQLException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Muskan@0712");

            pat = con.prepareStatement("insert into SubMarks(Username) values(?)");
            pat.setString(1, txtusid.getText().trim());
            pat.executeUpdate();

        } catch (ClassNotFoundException e1) {

            JOptionPane.showMessageDialog(this, "System error");

        }

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        Loginpage.main(null);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String Username, Name, pwd, Phnumber;

        Username = txtusid.getText();

        Name = txtfirstname.getText();

        Phnumber = txtphn.getText();
        if (Phnumber.length() == 10) {
            pwd = txtpass.getText();
            String pwd2 = conpwd.getText();
            if (pwd.equals(pwd2)) {
                try {

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Muskan@0712");

                    if (pwd.isEmpty() || Name.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Fill all the boxes!");
                    } else {
                        pat = con.prepareStatement("insert into Table1(Username,Name,Phnumber,Password) values(?,?,?,?)");
                        pat.setString(1, Username.trim());
                        pat.setString(2, Name);
                        pat.setString(3, Phnumber);
                        pat.setString(4, pwd);
                        pat.executeUpdate();
                        executeinsert();
                        Loginpage.main(null);
                    }

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                } catch (SQLException ex) {

                    if (Phnumber.isEmpty() || Username.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Fill all the boxes!");
                    } else {

                        JOptionPane.showMessageDialog(this, "Username already Exist!");

                    }

                }
            } else {
                JOptionPane.showMessageDialog(this, "Password doesn't Matched");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invailed Contact number");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtphnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphnKeyPressed
        String phn = txtphn.getText();
        int length = phn.length();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' || evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (length < 10) {
                txtphn.setEditable(true);
            } else {
                txtphn.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                txtphn.setEditable(true);
            } else {
                txtphn.setEditable(false);
            }
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpass.setEditable(true);
            txtusid.requestFocus();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_UP) {
                txtpass.setEditable(true);
                txtfirstname.requestFocus();
            }
        }
    }//GEN-LAST:event_txtphnKeyPressed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if (show.isSelected()) {

            txtpass.setEchoChar((char) 0);
            conpwd.setEchoChar((char) 0);

        } else {

            txtpass.setEchoChar('*');
            conpwd.setEchoChar('*');
        }
    }//GEN-LAST:event_showActionPerformed

    private void txtfirstnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfirstnameKeyTyped

    }//GEN-LAST:event_txtfirstnameKeyTyped

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed
        String pass = txtpass.getText();

        int length = pass.length();

        if (length < 6 || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            txtpass.setEditable(true);
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
                txtpass.setEditable(true);
                conpwd.requestFocus();

            } else {
                if (evt.getExtendedKeyCode() == KeyEvent.VK_UP) {
                    txtpass.setEditable(true);
                    txtusid.requestFocus();
                } else {
                    txtpass.setEditable(false);
                }

            }

        }


    }//GEN-LAST:event_txtpassKeyPressed

    private void conpwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conpwdKeyPressed
        String pass = conpwd.getText();
        int length = pass.length();
        char c = evt.getKeyChar();

        if (length < 6 || evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
            conpwd.setEditable(true);
        } else {

            if (evt.getExtendedKeyCode() == KeyEvent.VK_UP) {
                conpwd.setEditable(true);
                txtpass.requestFocus();

            }

            conpwd.setEditable(false);

        }

    }//GEN-LAST:event_conpwdKeyPressed

    private void txtfirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtfirstnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfirstnameFocusLost

    private void txtfirstnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfirstnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtphn.requestFocus();

        }
    }//GEN-LAST:event_txtfirstnameKeyPressed

    private void txtusidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtusidKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtpass.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtphn.requestFocus();
        }
    }//GEN-LAST:event_txtusidKeyPressed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        if (M.isSelected()) {
            F.setSelected(false);
        }
    }//GEN-LAST:event_MActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        if (F.isSelected()) {
            M.setSelected(false);
        }
    }//GEN-LAST:event_FActionPerformed

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
            java.util.logging.Logger.getLogger(Signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signuppage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signuppage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton M;
    private javax.swing.JPasswordField conpwd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox show;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtphn;
    private javax.swing.JTextField txtusid;
    // End of variables declaration//GEN-END:variables
}
