 
package ui;
import javax.swing.*;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils; 
import java.sql.ResultSet;

public class Register extends javax.swing.JFrame {
    
   
    public Register() {
        initComponents();
        tableload();
        
    }

    public void tableload(){
        try{
            String sql = "SELECT customer_id,customer_name,address,mobile_number,email FROM customers";
            Connection conn = dbconnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            tbl_1.setModel(DbUtils.resultSetToTableModel(rs));
            
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    public void tabledata(){
        int r= tbl_1.getSelectedRow();
        
        String customer_id =tbl_1.getValueAt(r,0).toString();
        
        String customer_name=tbl_1.getValueAt(r,1).toString();

        String address=tbl_1.getValueAt(r,2).toString();

        String mobile_number=tbl_1.getValueAt(r,3).toString();
 
        String email=tbl_1.getValueAt(r,4).toString();

        txt_cusid.setText(customer_id);
        txt_cusname.setText(customer_name);
        txt_add.setText(address);
        txt_num.setText(mobile_number);
        txt_mail.setText(email);
}   
    
    public void update(){
        String customer_id =txt_cusid.getText();
        String customer_name =txt_cusname.getText();
        String address= txt_add.getText();
        String mobile_number =txt_num.getText();
        String email = txt_mail .getText();
        
        try{
            
            String sql = "UPDATE customers SET customer_name= ?,address= ?,mobile_number= ?,email= ? WHERE customer_id= ?";
             Connection conn = dbconnection.getConnection();
             PreparedStatement pstmt =conn.prepareStatement(sql);
             
             pstmt.setString(1, customer_name);
        pstmt.setString(2, address);
        pstmt.setString(3, mobile_number);
        pstmt.setString(4, email);
        pstmt.setString(5, customer_id);

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
        txt_cusname = new java.awt.TextField();
        txt_add = new java.awt.TextField();
        txt_num = new java.awt.TextField();
        txt_mail = new java.awt.TextField();
        btn_add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_1 = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        label6 = new java.awt.Label();
        txt_cusid = new java.awt.TextField();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Customer Name");

        label3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label3.setText("Address");

        label4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label4.setText("Mobile Number");

        label5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label5.setText("Email");

        txt_cusname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cusnameActionPerformed(evt);
            }
        });

        txt_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addActionPerformed(evt);
            }
        });

        txt_num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numActionPerformed(evt);
            }
        });

        txt_mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mailActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(0, 153, 102));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        label1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("ADD CUSTOMERS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tbl_1.setAutoCreateRowSorter(true);
        tbl_1.setModel(new javax.swing.table.DefaultTableModel(
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
                "Customer Id", "Customer Name", "Address", "Mobile Number", "Email"
            }
        ));
        tbl_1.setColumnSelectionAllowed(true);
        tbl_1.setGridColor(new java.awt.Color(0, 153, 153));
        tbl_1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        tbl_1.setShowGrid(true);
        tbl_1.setShowHorizontalLines(true);
        tbl_1.setShowVerticalLines(true);
        tbl_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_1MouseClicked(evt);
            }
        });
        tbl_1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_1);

        btn_update.setBackground(new java.awt.Color(0, 0, 153));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(204, 51, 0));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label6.setText("Customer Id");

        txt_cusid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cusidActionPerformed(evt);
            }
        });

        btn_back.setBackground(new java.awt.Color(51, 51, 51));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cusid, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 291, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_cusname, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_update)
                        .addGap(25, 25, 25)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cusid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_cusname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(txt_add, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txt_num, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txt_numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        

    String sql = "INSERT INTO customers (customer_id,customer_name,address,mobile_number,email) VALUES (?, ?, ?, ?, ?)";

    try (Connection conn = dbconnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        int customer_id = Integer.parseInt(txt_cusid.getText());
        String customer_name = txt_cusname.getText();
        String address = txt_add.getText();
        String mobile_number = txt_num.getText();
        String email= txt_mail.getText();
       
        
        if (txt_cusid.getText().isEmpty() || customer_name.isEmpty() || address.isEmpty() ||
            mobile_number.isEmpty() || email.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }

        pstmt.setInt(1, customer_id);
        pstmt.setString(2, (customer_name!= null) ? customer_name : "Unknown Customer");
        pstmt.setString(3, address);
        pstmt.setString(4, mobile_number);
        pstmt.setString(5, email);
        
        
        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            JOptionPane.showMessageDialog(null, "Customer added successfully!");
            txt_cusid.setText("");
            txt_cusname.setText("");
            txt_add.setText("");
            txt_num.setText("");
            txt_mail.setText("");
            
        } 
          pstmt.close();
          conn.close();
        } catch (NumberFormatException e) { 
            JOptionPane.showMessageDialog(null, "Invalid Customer ID. Please enter a numeric value.");
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
       
    }//GEN-LAST:event_btn_addActionPerformed
    tableload();
    }
    private void txt_cusnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cusnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cusnameActionPerformed

    private void txt_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addActionPerformed

    private void txt_mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_mailActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
          int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (check == JOptionPane.YES_OPTION) {
        String customer_id = txt_cusid.getText();

        // Validate customer_id before proceeding
        if (customer_id == null || customer_id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Customer ID cannot be empty.");
            return;
        }

        try {
            // SQL query with a placeholder
            String sql = "DELETE FROM customers WHERE customer_id = ?";
            
            // Establish connection and prepare statement
            try (Connection conn = dbconnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                // Set the parameter value
                pstmt.setString(1, customer_id);

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

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void tbl_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_1MouseClicked
        tabledata();
    }//GEN-LAST:event_tbl_1MouseClicked

    private void tbl_1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_1KeyReleased
        tabledata();
    }//GEN-LAST:event_tbl_1KeyReleased

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        update();
        tableload();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Mainpage().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_cusidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cusidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cusidActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new Register().setVisible(true);   
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTable tbl_1;
    private java.awt.TextField txt_add;
    private java.awt.TextField txt_cusid;
    private java.awt.TextField txt_cusname;
    private java.awt.TextField txt_mail;
    private java.awt.TextField txt_num;
    // End of variables declaration//GEN-END:variables
}
