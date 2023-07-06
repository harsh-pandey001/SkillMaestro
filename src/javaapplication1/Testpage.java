package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public final class Testpage extends javax.swing.JFrame {

    String num = null;
    int count = 0;
    int c = 1;
    int marks = 0;
    String corans, userans, level, lang, username1;
    int j = 0;
    int a[] = new int[21];
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Function f = new Function();
    Timer t;
    int sec = 0, min = 0;

    public Testpage() {
        initComponents();
    }

    Testpage(String lang1, String level1, String username) {
        initComponents();
        setLocationRelativeTo(this);
        Testtimer();
        this.username1 = username.trim();
        lang = lang1.trim();
        level = level1.trim();
        f.find(null);
        txtcount.setText(String.valueOf(c) + ".");

    }

    public void Testtimer() {
        t = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                txt_timemin.setText(String.valueOf(min));
                txt_time.setText(String.valueOf(sec));
                if (sec == 60) {
                    sec = 0;
                    min++;
                    if (min == 10) {

                        t.stop();
                        checkans(num);
                        dispose();
                        new Score(marks, username1, min, sec).setVisible(true);
                    }
                }
                sec++;

            }
        });
        t.start();

    }

    public void insertmarks(int marks1) throws SQLException {

        Connection con = null;
        PreparedStatement pat = null;
        String s = String.valueOf(marks1);

        if (lang.equals("C")) {

            switch (level) {
                case "Basic":
                     try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");

                    pat = con.prepareStatement("Update SubMarks set Cbasic = ? where Username = ?");
                    pat.setString(1, s);
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;

                case "Intermediate":
                   try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set CIntermediate = ? where Username = ?");
                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;

                case "Advanced":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Cadvanced = ? where Username = ?");
                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;

                default:
                    break;

            }

        } else if (lang.equals("C++")) {

            switch (level) {
                case "Basic":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Cppbasic = ? where Username = ?");
                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;

                case "Intermediate":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Cppintermediate = ? where Username = ?");
                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;

                case "Advanced":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Cppadvanced = ? where Username = ?");

                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;
                default:
                    break;

            }

        } else if (lang.equals("Java")) {

            switch (level) {
                case "Basic":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Javabasic = ? where Username = ?");
                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;
                case "Intermediate":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Javaintermediate = ? where Username = ?");

                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;
                case "Advanced":
                      try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    pat = con.prepareStatement("Update SubMarks set Javaadvanced = ? where Username = ?");
                    pat.setString(1, String.valueOf(marks1));
                    pat.setString(2, username1);
                    pat.executeUpdate();

                } catch (ClassNotFoundException e1) {

                    JOptionPane.showMessageDialog(this, "System error");

                }
                break;
                default:
                    break;

            }

        }

    }

    public void getRandomNonRepeatingIntegers(int size, int min,
            int max) {
        Random random = new Random();
        while (numbers.size() < size) {

            int randomNumber = random.nextInt((max - min) + 1) + min;
            if (!numbers.contains(randomNumber)) {
                numbers.add(randomNumber);
            }
        }
    }

    public int levelcheck() {
        if (lang.equals("C")) {

            switch (level) {
                case "Basic":
                    getRandomNonRepeatingIntegers(20, 1, 30);
                    return 1;

                case "Intermediate":
                    getRandomNonRepeatingIntegers(20, 31, 60);
                    return 1;

                case "Advanced":
                    getRandomNonRepeatingIntegers(20, 61, 90);
                    return 1;

                default:
                    return 0;
            }

        } else if (lang.equals("C++")) {

            switch (level) {
                case "Basic":
                    getRandomNonRepeatingIntegers(20, 91, 120);
                    return 1;

                case "Intermediate":
                    getRandomNonRepeatingIntegers(20, 121, 150);
                    return 1;

                case "Advanced":
                    getRandomNonRepeatingIntegers(20, 151, 180);
                    return 1;

                default:
                    return 0;
            }

        } else if (lang.equals("Java")) {

            switch (level) {
                case "Basic":
                    getRandomNonRepeatingIntegers(20, 181, 210);
                    return 1;

                case "Intermediate":
                    getRandomNonRepeatingIntegers(20, 211, 240);
                    return 1;

                case "Advanced":
                    getRandomNonRepeatingIntegers(20, 241, 270);
                    return 1;

                default:
                    return 0;
            }

        }
        return 0;

    }

    public void checkans(String que) {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        if (A.isSelected()) {
            userans = "A";
        } else if (B.isSelected()) {
            userans = "B";
        } else if (C.isSelected()) {
            userans = "C";
        } else if (D.isSelected()) {
            userans = "D";
        }
        if (userans == null) {
            JOptionPane.showMessageDialog(this, "You have not attempted this Question");
        } else {
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");

                ps = con.prepareStatement("select Right_answer from CBasic where Qid = ? and Level = ? and Language = ?");
                ps.setString(1, que);
                ps.setString(2, level);
                ps.setString(3, lang);

                rs = ps.executeQuery();
                if (rs.next()) {
                    corans = rs.getString("Right_answer");

                } else {
                    JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
                }

            } catch (ClassNotFoundException | SQLException ex) {

                JOptionPane.showMessageDialog(null, ex.getMessage());

            }

            if (userans.equals(corans)) {
                marks = marks + 1;

            }

            userans = null;
            A.setSelected(false);
            B.setSelected(false);
            C.setSelected(false);
            D.setSelected(false);
        }
    }

    public class Function {

        Connection con = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        String q;
        int t;

        public void find(String n) {

            t = levelcheck();
            if (t == 1) {
                if (num == null) {
                    a[0] = (int) numbers.get(0);
                    num = String.valueOf(a[0]);
                    n = num;
                }

                try {
                    count++;

                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://F:/java components/UserInfo2.accdb");
                    ps = con.prepareStatement("select * from CBasic where Qid = ? and Level = ? and Language = ?");
                    ps.setString(1, n);
                    ps.setString(2, level);
                    ps.setString(3, lang);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        txtq.setText(rs.getString("Question"));
                        txtA.setText(rs.getString("op1"));
                        txtB.setText(rs.getString("op2"));
                        txtC.setText(rs.getString("op3"));
                        txtD.setText(rs.getString("op4"));
                    } else {
                        JOptionPane.showMessageDialog(null, "NO DATA FOR THIS ID");
                    }

                } catch (ClassNotFoundException | SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex.getMessage());

                }
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtnext1 = new javax.swing.JButton();
        txtnext = new javax.swing.JButton();
        txtcount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        A = new javax.swing.JRadioButton();
        txtA = new javax.swing.JTextField();
        B = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        C = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        D = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtq = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_time1 = new javax.swing.JLabel();
        txt_timemin = new javax.swing.JLabel();
        txt_time3 = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(60, 0));
        setMinimumSize(new java.awt.Dimension(1000, 990));
        setPreferredSize(new java.awt.Dimension(1400, 1500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtnext1.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext1.setIcon(new javax.swing.ImageIcon("F:\\Button\\Submit.png")); // NOI18N
        txtnext1.setBorder(null);
        txtnext1.setBorderPainted(false);
        txtnext1.setContentAreaFilled(false);
        txtnext1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnext1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtnext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 110, 40));

        txtnext.setFont(new java.awt.Font("Segoe UI Historic", 0, 18)); // NOI18N
        txtnext.setIcon(new javax.swing.ImageIcon("F:\\Button\\Next.png")); // NOI18N
        txtnext.setBorder(null);
        txtnext.setBorderPainted(false);
        txtnext.setContentAreaFilled(false);
        txtnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnextActionPerformed(evt);
            }
        });
        jPanel1.add(txtnext, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 110, 40));

        txtcount.setEditable(false);
        txtcount.setBackground(new java.awt.Color(255, 255, 255));
        txtcount.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        txtcount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcount.setBorder(null);
        txtcount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcountActionPerformed(evt);
            }
        });
        jPanel1.add(txtcount, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("A.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 60, 60));

        A.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        jPanel1.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 40, 60));

        txtA.setEditable(false);
        txtA.setBackground(new java.awt.Color(255, 255, 255));
        txtA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtA.setText(" ");
        txtA.setBorder(null);
        txtA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        jPanel1.add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 990, 60));

        B.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        jPanel1.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 40, 60));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("B.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 60, 60));

        txtB.setEditable(false);
        txtB.setBackground(new java.awt.Color(255, 255, 255));
        txtB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtB.setText(" ");
        txtB.setBorder(null);
        txtB.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });
        jPanel1.add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 990, 60));

        C.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        jPanel1.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 40, 60));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("C.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 60, 60));

        txtC.setEditable(false);
        txtC.setBackground(new java.awt.Color(255, 255, 255));
        txtC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtC.setText(" ");
        txtC.setBorder(null);
        txtC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCActionPerformed(evt);
            }
        });
        jPanel1.add(txtC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 990, 60));

        txtD.setEditable(false);
        txtD.setBackground(new java.awt.Color(255, 255, 255));
        txtD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtD.setText(" ");
        txtD.setBorder(null);
        txtD.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDActionPerformed(evt);
            }
        });
        jPanel1.add(txtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 550, 990, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("D.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 60, 60));

        D.setFont(new java.awt.Font("Segoe UI Historic", 0, 36)); // NOI18N
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        jPanel1.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 40, 60));

        txtq.setEditable(false);
        txtq.setColumns(20);
        txtq.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        txtq.setLineWrap(true);
        txtq.setRows(5);
        txtq.setBorder(null);
        txtq.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtq.setFocusable(false);
        txtq.setRequestFocusEnabled(false);
        jScrollPane2.setViewportView(txtq);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 1093, 256));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1880, 910));

        jPanel2.setBackground(new java.awt.Color(11, 144, 221));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\Button\\LogoSKILL.png")); // NOI18N
        jLabel5.setText("SkillMaestro");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 60));

        txt_time1.setBackground(new java.awt.Color(255, 255, 255));
        txt_time1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txt_time1.setForeground(new java.awt.Color(255, 255, 255));
        txt_time1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_time1.setText("Timer :");
        txt_time1.setToolTipText("");
        jPanel2.add(txt_time1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 20, 100, 40));

        txt_timemin.setBackground(new java.awt.Color(255, 255, 255));
        txt_timemin.setFont(new java.awt.Font("MS UI Gothic", 1, 20)); // NOI18N
        txt_timemin.setForeground(new java.awt.Color(255, 255, 255));
        txt_timemin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_timemin.setToolTipText("");
        jPanel2.add(txt_timemin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 20, 40, 40));

        txt_time3.setBackground(new java.awt.Color(255, 255, 255));
        txt_time3.setFont(new java.awt.Font("MS UI Gothic", 1, 20)); // NOI18N
        txt_time3.setForeground(new java.awt.Color(255, 255, 255));
        txt_time3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_time3.setText(":");
        txt_time3.setToolTipText("");
        jPanel2.add(txt_time3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 20, 40));

        txt_time.setBackground(new java.awt.Color(255, 255, 255));
        txt_time.setFont(new java.awt.Font("MS UI Gothic", 1, 20)); // NOI18N
        txt_time.setForeground(new java.awt.Color(255, 255, 255));
        txt_time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_time.setToolTipText("");
        jPanel2.add(txt_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, 40, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1650, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed

    }//GEN-LAST:event_txtAActionPerformed

    private void txtDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void txtCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCActionPerformed


    private void txtnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnextActionPerformed

        String q;
        if (count == 1) {
            j = 1;
        } else {
            j++;
        }

        for (int i = j; i < numbers.size();) {

            if (num.equals(String.valueOf(a[0]))) {

                checkans(num);

            } else {
                checkans(num);
            }

            a[i] = numbers.get(i);
            num = String.valueOf(a[i]);
            f.find(num);
            c++;
            txtcount.setText(String.valueOf(c) + ".");
            txtnext1.setEnabled(false);

            break;
        }

        if (c == 20) {
            txtnext.setEnabled(false);
            txtnext1.setEnabled(true);
//            JOptionPane.showMessageDialog(this, "You reached Question limits after answering question\n Please Submit :)");
        }

    }//GEN-LAST:event_txtnextActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed

        if (A.isSelected()) {

            B.setSelected(false);
            C.setSelected(false);
            D.setSelected(false);

        }


    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        if (B.isSelected()) {

            A.setSelected(false);
            C.setSelected(false);
            D.setSelected(false);

        }
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        if (C.isSelected()) {

            B.setSelected(false);
            A.setSelected(false);
            D.setSelected(false);

        }

    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        if (D.isSelected()) {

            B.setSelected(false);
            C.setSelected(false);
            A.setSelected(false);

        }
    }//GEN-LAST:event_DActionPerformed

    private void txtcountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcountActionPerformed

    }//GEN-LAST:event_txtcountActionPerformed

    private void txtnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnext1ActionPerformed

//        try {
//            insertmarks(marks);
//        } catch (SQLException ex) {
//            Logger.getLogger(Testpage.class.getName()).log(Level.SEVERE, null, ex);
//        }
        if (c == 20) {
            checkans(num);
            try {
                insertmarks(marks);
            } catch (SQLException ex) {
                Logger.getLogger(Testpage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        dispose();
        new Score(marks, username1, min, sec).setVisible(true);


    }//GEN-LAST:event_txtnext1ActionPerformed

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
                new Testpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JLabel txt_time;
    private javax.swing.JLabel txt_time1;
    private javax.swing.JLabel txt_time3;
    private javax.swing.JLabel txt_timemin;
    private javax.swing.JTextField txtcount;
    private javax.swing.JButton txtnext;
    private javax.swing.JButton txtnext1;
    private javax.swing.JTextArea txtq;
    // End of variables declaration//GEN-END:variables
}
