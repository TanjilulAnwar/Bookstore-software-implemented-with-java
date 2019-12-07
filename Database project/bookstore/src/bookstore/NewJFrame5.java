/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
       


/**
 *
 * @author Tanjilul Anwar
 */
public class NewJFrame5 extends javax.swing.JFrame {
String isbn_no=null;
public static String c_name;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame5() {
        initComponents();
        //_________
    
        //_________
        
    }
    Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:F:\\bookstore\\large.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    
    public   void selected(){
     jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
                      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    
                      int column = 2;
int row = jTable1.getSelectedRow();
String value = jTable1.getModel().getValueAt(row, column).toString();
                    //System.out.print(value);
                     
                    
                  
                      jLabel10.setText("Copies available:");
                    
                    String sql ="select * from book where isbn like  '"+value+"'";

                      try {Connection conn=this.connect();
                           ResultSet rs=null;
                              PreparedStatement pst=null;
                          pst=conn.prepareStatement(sql);
                          rs=pst.executeQuery();
                          byte[] img = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH));
           jLabel3.setIcon(imageIcon);
            jLabel1.setText(rs.getString("title"));
            jLabel7.setText(rs.getString("author"));
            String add1 =rs.getString("price");
            String add2 =rs.getString("bcopy");
            String add3 =rs.getString("category");
            isbn_no=rs.getString("isbn");
           jLabel9.setText("$"+rs.getString("price")+" USD");
           jLabel11.setText(rs.getString("bcopy"));
           jLabel12.setText(rs.getString("category"));
             conn.close();
                      } catch (SQLException ex) {
                          //Logger.getLogger(NewJFrame5.class.getName()).log(Level.SEVERE, null, ex);
                          System.out.println("table selection handled");
                      }
             
                  
                      
                   
                  });
                  
    }
    
    
    
    
     public   void jet2(){
                  jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
                      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                      int i = jTable1.getSelectedRow();
                      int column = 2;
int row = jTable1.getSelectedRow();
String value = jTable1.getModel().getValueAt(row, column).toString();
                    //System.out.print(value);
                      jLabel1.setText((String)model.getValueAt(i, 0));
                     jLabel7.setText((String)model.getValueAt(i, 1));
                      String j =Integer.toString(i);
                      jLabel8.setText("USD");
                      jLabel10.setText("Copies available:");
                    
                    String sql ="select * from book where isbn like  '"+value+"'";

                      try {Connection conn=this.connect();
ResultSet rs=null;
PreparedStatement pst=null;
                          pst=conn.prepareStatement(sql);
                          rs=pst.executeQuery();
                          byte[] img = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH));
           jLabel3.setIcon(imageIcon);
            String add1 =rs.getString("price");
            String add2 =rs.getString("bcopy");
            String add3 =rs.getString("category");
            isbn_no=rs.getString("isbn");
           jLabel9.setText("$"+add1);
           jLabel11.setText(add2);
           jLabel12.setText(add3);
             conn.close();
                      } catch (SQLException ex) {
                          Logger.getLogger(NewJFrame5.class.getName()).log(Level.SEVERE, null, ex);
                      }
             
                  
                      
                   
                  });
    }

 public   void jet(){
                  jTable1.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
                      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                      int i = jTable1.getSelectedRow();
                    
                      jLabel1.setText((String)model.getValueAt(i, 0));
                     jLabel7.setText((String)model.getValueAt(i, 1));
                      String j =Integer.toString(i);
                      jLabel8.setText("USD");
                      jLabel10.setText("Copies available:");
                    
                    String sql ="select * from book LIMIT "+j+",1";

                      try {Connection conn=this.connect();
ResultSet rs=null;
PreparedStatement pst=null;
                          pst=conn.prepareStatement(sql);
                          rs=pst.executeQuery();
                          byte[] img = rs.getBytes("Image");
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH));
           jLabel3.setIcon(imageIcon);
            String add1 =rs.getString("price");
            String add2 =rs.getString("bcopy");
            String add3 =rs.getString("category");
            isbn_no=rs.getString("isbn");
           jLabel9.setText("$"+add1);
           jLabel11.setText(add2);
           jLabel12.setText(add3);
             conn.close();
                      } catch (SQLException ex) {
                          Logger.getLogger(NewJFrame5.class.getName()).log(Level.SEVERE, null, ex);
                      }
             
                  
                      
                   
                  });
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 20));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Bad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 80, 50));

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 153, 0));
        jLabel5.setText(".com");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 220, 20));

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Reads");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title ", "Author", "ISBN", "Publisher"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 490, 440));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("title");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 190, 50));

        jLabel3.setText("pic");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 180));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("author");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 50, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("PRICE");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, 30));

        jLabel10.setText("GEN WORD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 100, 20));

        jLabel11.setText("COPIES");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 70, 20));

        jLabel12.setText("CATEGORY");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, -1));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Logout ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 70, 30));

        jButton6.setText("cart");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 80, 30));

        jButton7.setText("add to cart");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 30));

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
selected();
    try (Connection conn = this.connect()) {
        ResultSet rs=null;
        PreparedStatement pst=null;
        String sql ="select title,author,ISBN,publisher from book";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
      jTable1.setRowHeight(50);
      jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        //jTable1.setColumnSelectionAllowed(false);
       // jTable1.setRowSelectionAllowed(true);
        conn.close();
    }
      
    
    catch(SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }

       
    
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        NewJFrame obj =new NewJFrame();
        obj.setVisible(true);
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//selected();
String f = jTextField1.getText();
    try (Connection conn = this.connect()) {
        ResultSet rs=null;
        PreparedStatement pst=null;
        String sql ="select title,author,ISBN,publisher from book where title like '"+f+"%' or author like '"+f+"%' or publisher like '"+f+"%'or category like '"+f+"%'";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
       jTable1.setModel(DbUtils.resultSetToTableModel(rs));
       // jTable1.setRowHeight(50);
        //jTable1.getColumnModel().getColumn(4).setPreferredWidth(120);
        //jTable1.setColumnSelectionAllowed(false);
        //jTable1.setRowSelectionAllowed(true);
  
        
    }
    
      
    
    catch(SQLException e){
    JOptionPane.showMessageDialog(null, e);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
int no_copy = Integer.valueOf(  JOptionPane.showInputDialog("Number of copies")) ; 
int column =0;
int row = jTable1.getSelectedRow();
String title = jTable1.getModel().getValueAt(row, column).toString();
System.out.print(title);
   Connection conn = connect();
        try {
   Statement stmt = conn.createStatement();    
            String sql = "select * from book where title='"+title+"';";
        ResultSet rset = stmt.executeQuery(sql);
        if (rset.next()){ 
        
         int price=rset.getInt("price");
         int sum=no_copy*price;
             String sql1 = "insert into invoice values('"+title+"',"+price+","+no_copy+","+sum+");";
             stmt.execute(sql1);
            JOptionPane.showMessageDialog(this,"Added to cart");   
            
        } }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        //------------------------
         try{
   Statement stmt = conn.createStatement();    
            String sql = "select * from book where title='"+title+"';";
        ResultSet rset = stmt.executeQuery(sql);
        if (rset.next()){ 
        
         int price=rset.getInt("price");
         int sum=no_copy*price;
             String sql1 = "insert into temp(c_name,b_title,quantity,total) values('"+c_name+"','"+title+"',"+no_copy+","+sum+");";
             stmt.execute(sql1);
             
            
        } }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    try {
        Connection conn = this.connect();
        ResultSet rs=null;
        PreparedStatement pst=null;
        String sql ="select * from invoice";
        pst=conn.prepareStatement(sql);
        rs=pst.executeQuery();
        NewJFrame6 obj =new NewJFrame6();
        
obj.setVisible(true);
 this.dispose();
        NewJFrame6.jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        NewJFrame6.jTable1.setRowHeight(20);
        NewJFrame6.jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
        NewJFrame6.jTable1.setColumnSelectionAllowed(false);
        NewJFrame6.jTable1.setRowSelectionAllowed(true);
       
        
    }   catch(Exception e){};  
    

// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
