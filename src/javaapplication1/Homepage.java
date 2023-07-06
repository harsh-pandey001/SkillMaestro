/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import JavaApplication1.*;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;

public class Homepage extends javax.swing.JFrame {

    String user;
    int Cb, Ca, Ci, Cpb, Cpa, Cpi, Jb, Ja, Ji, apti, Reas, Gk, Eng, c, cpp, java1;

    Homepage(String userid) {
        initComponents();
        this.user = userid;
    }

    class RoundedPanel extends JPanel {

        JScrollPane scr = new JScrollPane(jPanel1);
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint border
        }
    }

    public Homepage() {
        initComponents();
    }

    public void check_status() {
        try {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;

//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//            con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "Muskan@0712");
            ps = con.prepareStatement("select * from SubMarks where Username = ?");
            ps.setString(1, user);
            rs = ps.executeQuery();
            if (rs.next()) {
                Cb = Integer.parseInt(rs.getString("Cbasic"));
                Ci = Integer.parseInt(rs.getString("Cintermediate"));
                Ca = Integer.parseInt(rs.getString("Cadvanced"));
                Cpb = Integer.parseInt(rs.getString("Cppbasic"));
                Cpi = Integer.parseInt(rs.getString("Cppintermediate"));
                Cpa = Integer.parseInt(rs.getString("Cppadvanced"));
                Jb = Integer.parseInt(rs.getString("Javaintermediate"));
                Ja = Integer.parseInt(rs.getString("Javaadvanced"));
                Eng = Integer.parseInt(rs.getString("English"));
                apti = Integer.parseInt(rs.getString("Aptitude"));
                Gk = Integer.parseInt(rs.getString("General_Awareness"));
                Reas = Integer.parseInt(rs.getString("Logical_Reasoning"));

            } else {
                JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
            }

        } catch (ClassNotFoundException | SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage());

        }

        c = Cb + Ci + Ca;
        cpp = Cpb + Cpi + Cpa;
        java1 = Jb + Ji + Ja;
//        JOptionPane.showMessageDialog(this, c);
        if (c > 0 && cpp > 0 && java1 > 0 && Eng > 0 && apti > 0 && Gk > 0 && Reas > 0) {
            Piechart3D cc = new Piechart3D("Pie chart Test", "Analysis", c, cpp, java1, Eng, apti, Gk, Reas);
            cc.pack();
            cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cc.setVisible(true);
//        new Piechart3D(c,cpp,java1,Eng,apti,Gk,Reas).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "You have not given all the tests!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comm = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        prog = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        aptirea = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(-10, 0));
        setMinimumSize(new java.awt.Dimension(1200, 100));
        setPreferredSize(new java.awt.Dimension(1560, 1350));
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

        jButton1.setIcon(new javax.swing.ImageIcon("F:\\Button\\profileicon1.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1440, 10, 80, 60));

        jButton4.setIcon(new javax.swing.ImageIcon("F:\\Button\\Logout.png")); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, 80, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1550, 80));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(2029, 1700));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(2000, 1600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("F:\\programming_tips2.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 450, 280));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\137969776-vector-illustration-of-effective-communication-within-a-team.jpg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 500, 280));

        comm.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        comm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English" }));
        comm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commActionPerformed(evt);
            }
        });
        jPanel1.add(comm, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 225, -1));

        jLabel6.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Communication Skills ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 230, 50));

        prog.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        prog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C", "C++", "Java" }));
        prog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progActionPerformed(evt);
            }
        });
        jPanel1.add(prog, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 225, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Programming Skills");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 230, 50));

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Aptitude & Reasoning ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 390, 230, 50));

        jButton7.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, -1, -1));

        aptirea.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        aptirea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quatitative Aptitude", "Logical Reasoning", " " }));
        aptirea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aptireaActionPerformed(evt);
            }
        });
        jPanel1.add(aptirea, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 450, 225, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\1590668447php2Q.jpeg.jpeg")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 90, 490, 300));

        jButton8.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        jButton8.setBorder(null);
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 500, -1, -1));

        jButton9.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 500, -1, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon("F:\\Sem 5th project\\shutterstock_669838285-768x539 (1).jpg")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 420, 290));

        jButton11.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 950, -1, 40));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\Sem 5th project\\shutterstock_669838285-768x539.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 597, 420, 300));

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("General Awareness");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 890, 230, 50));

        jButton12.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 950, -1, 40));

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Analysis");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 890, 230, 50));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 1550, 1300));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        new Editprofile(user).setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
        new Instruction((String) prog.getSelectedItem(), user).setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void progActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_progActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
        new Instruction1("English", user).setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void aptireaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aptireaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aptireaActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        dispose();
        new Instruction1((String) aptirea.getSelectedItem(), user).setVisible(true);

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        check_status();
        dispose();


    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        dispose();
        new Instruction1("Gk", user).setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void commActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        Startup.main(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Homepage().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aptirea;
    private javax.swing.JComboBox<String> comm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> prog;
    // End of variables declaration//GEN-END:variables
}
