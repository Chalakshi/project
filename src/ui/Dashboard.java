package ui;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import net.proteanit.sql.DbUtils; 
import java.sql.ResultSet;

public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
        tableload();

    }
       public void tableload(){
        try{
            String sql = "SELECT  product_id,product_type,price,description FROM products";
            Connection conn = dbconnection.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            tbl_3.setModel(DbUtils.resultSetToTableModel(rs));
            
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        }
        public void tabledata(){
        int r= tbl_3.getSelectedRow();
        
        String product_id =tbl_3.getValueAt(r,0).toString();
        
        String product_type=tbl_3.getValueAt(r,1).toString();

        String price=tbl_3.getValueAt(r,2).toString();

        String description=tbl_3.getValueAt(r,3).toString();
 
        

        txt_pid.setText(product_id);
        cmb_p.setSelectedItem(product_type);
        txt_price.setText(price);
        txt_des.setText(description);
        
}   
    
    public void update(){
        String product_id =txt_pid.getText();
        String product_type =cmb_p.getSelectedItem().toString();
        String price= txt_price.getText();
        String description =txt_des.getText();
        
        
        try{
            
            String sql = "UPDATE products SET product_type= ?,price= ?,description= ? WHERE product_id= ?";
             Connection conn = dbconnection.getConnection();
             PreparedStatement pstmt =conn.prepareStatement(sql);
             
             pstmt.setString(1, product_type);
             pstmt.setString(2, price);
             pstmt.setString(3, description);
             pstmt.setString(4, product_id);
             

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
        

    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        label8 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        txt_pid = new java.awt.TextField();
        txt_price = new java.awt.TextField();
        txt_des = new java.awt.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_3 = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        cmb_p = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();
        btn_back = new javax.swing.JButton();
        label3 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1379, 610));
        setSize(new java.awt.Dimension(1379, 610));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        label8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label8.setText("Product Id");

        label10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label10.setText("Price");

        label11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label11.setText("Description");

        txt_pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pidActionPerformed(evt);
            }
        });

        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        txt_des.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_desActionPerformed(evt);
            }
        });

        tbl_3.setAutoCreateRowSorter(true);
        tbl_3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Product Id", "Product Type", "Price", "Description"
            }
        ));
        tbl_3.setColumnSelectionAllowed(true);
        tbl_3.setGridColor(new java.awt.Color(0, 153, 153));
        tbl_3.setShowGrid(true);
        tbl_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_3MouseClicked(evt);
            }
        });
        tbl_3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_3KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_3);

        btn_add.setBackground(new java.awt.Color(0, 153, 102));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
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

        btn_update.setBackground(new java.awt.Color(0, 51, 204));
        btn_update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        btn_update.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_updateKeyReleased(evt);
            }
        });

        cmb_p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Red Rose Bouquet", "White Rose Bouquet", "Lily Bouquet", "Sun Flower Bouquet", "Tyulip Flower Bouquet", "Mix Flower Bouquet" }));
        cmb_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_pActionPerformed(evt);
            }
        });

        label2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        label2.setText("Product type");

        btn_back.setBackground(new java.awt.Color(51, 51, 51));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        label3.setBackground(new java.awt.Color(0, 153, 153));
        label3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("                                                    ADD PRODUCTS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(634, 634, 634)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(613, 613, 613))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_p, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_des, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btn_update)
                        .addGap(24, 24, 24)
                        .addComponent(btn_delete)
                        .addGap(49, 49, 49)
                        .addComponent(btn_back)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addComponent(label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_pid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_p, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_des, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(71, 71, 71)
                                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(130, 130, 130))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_pActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_pActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
                 String sql = "INSERT INTO products (product_id,product_type,price,description) VALUES (?, ?, ?, ?)";

    try (Connection conn = dbconnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        int product_id = Integer.parseInt(txt_pid.getText());
        String product_type = cmb_p.getSelectedItem().toString();
        String price = txt_price.getText();
        String description = txt_des.getText();
        
       
        
        if (txt_pid.getText().isEmpty() || product_type.isEmpty() || price.isEmpty() ||
            description.isEmpty()  ) {
            JOptionPane.showMessageDialog(null, "All fields are required!");
            return;
        }

        pstmt.setInt(1, product_id);
        pstmt.setString(2, (product_type!= null) ? product_type : "Unknown product_type");
        pstmt.setString(3, (price != null)? price: "Unknown price");
        pstmt.setString(4, description);
        
        
        
        int rows = pstmt.executeUpdate();

        if (rows > 0) {
            JOptionPane.showMessageDialog(null, "product added successfully!");
            txt_pid.setText("");
            cmb_p.setSelectedItem(null);
            txt_price.setText(null);
            txt_des.setText("");
            
            
        }
          pstmt.close();
          conn.close();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Database Error: " + ex.getMessage());
       
    }                                       
    tableload();
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
              int check = JOptionPane.showConfirmDialog(null, "Do you want to delete?", "Confirm Delete", JOptionPane.YES_NO_OPTION);

    if (check == JOptionPane.YES_OPTION) {
        String product_id = txt_pid.getText();

        
        if (product_id == null || product_id.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Product ID cannot be empty.");
            return;
        }

        try {
            
            String sql = "DELETE FROM products WHERE product_id = ?";
            
            
            try (Connection conn = dbconnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                
                
                pstmt.setString(1, product_id);

                
                int rowsAffected = pstmt.executeUpdate();

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

         
        tableload();
    }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         update();
        tableload();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_updateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_updateKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateKeyReleased

    private void tbl_3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_3KeyReleased
        tabledata();
    }//GEN-LAST:event_tbl_3KeyReleased

    private void tbl_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_3MouseClicked
        tabledata();
    }//GEN-LAST:event_tbl_3MouseClicked

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Mainpage().setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pidActionPerformed

    private void txt_desActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_desActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_desActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Dashboard().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_p;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label8;
    private javax.swing.JTable tbl_3;
    private java.awt.TextField txt_des;
    private java.awt.TextField txt_pid;
    private java.awt.TextField txt_price;
    // End of variables declaration//GEN-END:variables
}
