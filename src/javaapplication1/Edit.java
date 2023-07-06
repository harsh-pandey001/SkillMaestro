package javaapplication1;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Edit extends javax.swing.JFrame {

    public Edit() {
    }
    PreparedStatement pat;
    Connection cons;
    String web;

    Edit(String user1) throws SQLException {
        this.web = user1;
        initComponents();
        muskan();
    }

    //Fetching Data function 
    public class Function {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;

        public ResultSet find(String s) {

            try {

                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Muskan@0712");

                ps = con.prepareStatement("select * from Table1 where Username = ?");
                ps.setString(1, web);
                rs = ps.executeQuery();

            } catch (ClassNotFoundException | SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage());

            }

            return rs;

        }
    }

    public void muskan() throws SQLException {
        Function f = new Function();
        ResultSet rs;
        String Ph;

        rs = f.find(web);
        try {
            if (rs.next()) {
                txtname.setText(rs.getString("Name"));
                txtusid.setText(web);
                txtphn.setText(rs.getString("Phnumber"));
                txtpass.setText(rs.getString("Password"));

            } else {
                JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtphn = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtusid = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        show = new javax.swing.JCheckBox();
        btnNewButton_1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(155, 45));
        setMinimumSize(new java.awt.Dimension(1194, 757));
        setPreferredSize(new java.awt.Dimension(1194, 757));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(2000, 2000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(11, 144, 221));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edit Profile");
        jLabel7.setFocusable(false);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 460, 60));

        jLabel2.setFont(new java.awt.Font("Centaur", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 144, 221));
        jLabel2.setText("Name ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 250, 50));

        txtname.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 284, 50));

        jLabel5.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 144, 221));
        jLabel5.setText("Phone Number");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 250, 50));

        txtphn.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
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
        jPanel2.add(txtphn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 284, 50));

        jLabel6.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(11, 144, 221));
        jLabel6.setText("Username");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 250, 50));

        txtusid.setEditable(false);
        txtusid.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtusid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        jPanel2.add(txtusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 284, 50));

        jLabel1.setFont(new java.awt.Font("Centaur", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 144, 221));
        jLabel1.setText("Password");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 250, 50));

        txtpass.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(11, 144, 221), 1, true));
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpassKeyPressed(evt);
            }
        });
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 500, 284, 50));

        show.setForeground(new java.awt.Color(11, 144, 221));
        show.setText("Show Password");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel2.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 110, -1));

        btnNewButton_1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNewButton_1.setIcon(new javax.swing.ImageIcon("F:\\Button\\Save.png")); // NOI18N
        btnNewButton_1.setBorder(null);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setContentAreaFilled(false);
        btnNewButton_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewButton_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnNewButton_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, 130, -1));

        jPanel3.setBackground(new java.awt.Color(11, 144, 221));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\Button\\LogoSKILL.png")); // NOI18N
        jLabel8.setText("SkillMaestro");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, 60));

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
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, 70, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 850));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed

    }//GEN-LAST:event_txtnameActionPerformed

    private void btnNewButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewButton_1ActionPerformed

        String Name, pwd, Phnumber;
        ResultSet r;
        Name = txtname.getText();
        pwd = txtpass.getText();
        Phnumber = txtphn.getText();

        if (Phnumber.length() == 10) {
            int c;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Muskan@0712");

                pat = cons.prepareStatement("Update Table1 set Name = ?, Password = ?, Phnumber = ?  where Username = ?");

                pat.setString(1, Name);
                pat.setString(2, pwd);
                pat.setString(3, Phnumber);
                pat.setString(4, web);
                pat.executeUpdate();

                JOptionPane.showMessageDialog(this, "Updated");

            } catch (ClassNotFoundException | SQLException e1) {
                JOptionPane.showMessageDialog(this, e1);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invailed Contact number");
        }
    }//GEN-LAST:event_btnNewButton_1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed

        if (show.isSelected()) {

            txtpass.setEchoChar((char) 0);

        } else {

            txtpass.setEchoChar('*');

        }
    }//GEN-LAST:event_showActionPerformed

    private void txtpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyPressed

    }//GEN-LAST:event_txtpassKeyPressed

    private void txtphnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphnKeyPressed
        String phn = txtphn.getText();
        int length = phn.length();
        char c = evt.getKeyChar();
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
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

    }//GEN-LAST:event_txtphnKeyPressed

    private void txtphnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        new Homepage(web).setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewButton_1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox show;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtphn;
    private javax.swing.JTextField txtusid;
    // End of variables declaration//GEN-END:variables
}
