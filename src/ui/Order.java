  package ui;
            
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils; 
import java.sql.ResultSet;




public class Order extends javax.swing.JFrame {

       public Order() {
        initComponents();
        tableload();
    }

       public void tableload(){
        
            String sql = "SELECT order_id,product_id,customer_id,order_date,payment_method FROM orders";
        try(
            Connection conn = dbconnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()){
            
            tbl_2.setModel(DbUtils.resultSetToTableModel(rs));
            
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
   
       public void tabledata(){
        int r= tbl_2.getSelectedRow();
        
        String order_id =tbl_2.getValueAt(r,0).toString();
        
        String product_id=tbl_2.getValueAt(r,1).toString();

        String customer_id=tbl_2.getValueAt(r,2).toString();

        String order_date=tbl_2.getValueAt(r,3).toString();
 
        String payment_method=tbl_2.getValueAt(r,4).toString();

        txt_oid.setText(order_id);
        txt_pid.setText(product_id);
        txt_cid.setText(customer_id);
        txt_odate.setText(order_date);
        txt_pay.setText(payment_method);
}   
    
    public void update(){
        String order_id =txt_oid.getText();
        String product_id=txt_pid.getText();
        String customer_id= txt_cid.getText();
        String order_date =txt_odate.getText();
        String payment_method = txt_pay.getText();
        
        try{
            
            String sql = "UPDATE orders SET product_id= ?,customer_id= ?,order_date= ?,payment_method= ? WHERE order_id= ?";
             Connection conn = dbconnection.getConnection();
             PreparedStatement pstmt =conn.prepareStatement(sql);
             
             pstmt.setString(1, product_id);
             pstmt.setString(2, customer_id);
             pstmt.setString(3, order_date);
             pstmt.setString(4, payment_method);
             pstmt.setString(5, order_id);

        // Execute update query
        int rowsAffected = pstmt.executeUpdate();

        // Check if any rows were updated
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "No matching record found to update.");
        }

        
             
             JOptionPane.showMessageDialog(null,"Updated!");
         }catch(Exception e){
             JOptionPane.showMessageDialog(null,"not update");
        }
        
        
       
 
}@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        txt_oid = new java.awt.TextField();
        txt_pid = new java.awt.TextField();
        txt_cid = new java.awt.TextField();
        txt_odate = new java.awt.TextField();
        txt_pay = new java.awt.TextField();
        btnadd = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Order Id");

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Customer Id");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Product Id");

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Payment Method");

        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Order Date");

        txt_oid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_oidActionPerformed(evt);
            }
        });

        btnadd.setBackground(new java.awt.Color(0, 153, 102));
        btnadd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(51, 51, 0));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        label1.setBackground(new java.awt.Color(0, 153, 153));
        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ADD  ORDERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(533, 533, 533))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        tbl_2.setAutoCreateRowSorter(true);
        tbl_2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Product Id", "Customer Id", "Order Date", "Payment Method"
            }
        ));
        tbl_2.setCellSelectionEnabled(false);
        tbl_2.setGridColor(new java.awt.Color(0, 153, 153));
        tbl_2.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tbl_2.setSelectionForeground(new java.awt.Color(0, 153, 153));
        tbl_2.setShowHorizontalLines(true);
        tbl_2.setShowVerticalLines(true);
        tbl_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_2MouseClicked(evt);
            }
        });
        tbl_2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_2KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_2);

        jButton2.setBackground(new java.awt.Color(51, 0, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 51, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_oid, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(txt_pid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_cid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_odate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButton2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButton3)
                        .addGap(48, 48, 48)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_oid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(27, 27, 27)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_cid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txt_odate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
     
     String sql = "INSERT INTO orders (order_id, product_id, customer_id, order_date, payment_method) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = dbconnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        String order_id = txt_oid.getText();
        String product_id = txt_pid.getText();
        String customer_id = txt_cid.getText();
        String order_date = txt_odate.getText();
        String payment_Method = txt_pay.getText();
       
        
        if (order_id.isEmpty() || product_id.isEmpty() || customer_id.isEmpty() ||
            order_date.isEmpty() || payment_Method.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }

        pstmt.setString(1, order_id);
        pstmt.setString(2, product_id != null ? product_id: "no product_id");
        pstmt.setString(3, customer_id  != null ? customer_id : "no customer_id");
        pstmt.setString(4, order_date  != null ? order_date:"no order_date");
        pstmt.setString(5, payment_Method);
        
        
        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            JOptionPane.showMessageDialog(null, "Order placed successfully!");
            txt_oid.setText("");
            txt_pid.setText(null);
            txt_cid.setText(null);
            txt_odate.setText(null);
            txt_pay.setText("");
            
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
    }//GEN-LAST:event_btnaddActionPerformed
    tableload();
    }
    private void txt_oidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_oidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_oidActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
           new Mainpage().setVisible(true);
           dispose(); 
    }//GEN-LAST:event_btn_backActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
             int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (check == JOptionPane.YES_OPTION) {
        String order_id = txt_oid.getText();

        // Validate customer_id before proceeding
        if (order_id == null || order_id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Order ID cannot be empty.");
            return;
        }

        try {
            // SQL query with a placeholder
            String sql = "DELETE FROM orders WHERE order_id = ?";
            
            // Establish connection and prepare statement
            try (Connection conn = dbconnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                // Set the parameter value
                pstmt.setString(1, order_id);

                // Execute the delete operation
                int rowsAffected = pstmt.executeUpdate();

                // Check if a record was deleted
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Deleted successfully!");
                } else {
                    JOptionPane.showMessageDialog(null, "No matching record found to delete.");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        }

        // Reload the table data
        tableload();
    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        update();
        tableload();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_2KeyReleased
       tableload();
    }//GEN-LAST:event_tbl_2KeyReleased

    private void tbl_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_2MouseClicked
        tableload();
    }//GEN-LAST:event_tbl_2MouseClicked


        public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new Order().setVisible(true);   
                   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTable tbl_2;
    private java.awt.TextField txt_cid;
    private java.awt.TextField txt_odate;
    private java.awt.TextField txt_oid;
    private java.awt.TextField txt_pay;
    private java.awt.TextField txt_pid;
    // End of variables declaration//GEN-END:variables
}
