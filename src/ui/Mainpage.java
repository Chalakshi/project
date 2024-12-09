package ui;
import db.DBConnection;


 
import java.sql.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


import java.util.*;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JRException;





public class Mainpage extends javax.swing.JFrame {

    
    public Mainpage() {
        initComponents();
    }
    
    public class MyJasperFillManager {
    public static JasperPrint fillReport(JasperReport jr, Map<String, Object> parameters, Connection conn) throws JRException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
    public class JasperFillManager {
    public static JasperPrint fillReport(JasperReport jr, Map<String, Object> parameters, Connection conn) throws JRException {
        return net.sf.jasperreports.engine.JasperFillManager.fillReport(jr, parameters, conn); 
    }
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_addp = new javax.swing.JButton();
        btn_reg = new javax.swing.JButton();
        btn_order = new javax.swing.JButton();
        btn_report = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btn_addp.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_addp.setForeground(new java.awt.Color(0, 153, 153));
        btn_addp.setText("Add products");
        btn_addp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_addp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addpActionPerformed(evt);
            }
        });

        btn_reg.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_reg.setForeground(new java.awt.Color(0, 153, 153));
        btn_reg.setText(" Register Customers");
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });

        btn_order.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_order.setForeground(new java.awt.Color(0, 153, 153));
        btn_order.setText("Place Order");
        btn_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderActionPerformed(evt);
            }
        });

        btn_report.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_report.setForeground(new java.awt.Color(0, 153, 153));
        btn_report.setText("View Reports");
        btn_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("WELCOME TO FLORA EXPRESS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(305, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_addp, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_order, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_addp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(btn_order, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btn_report, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void btn_addpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addpActionPerformed
             new Dashboard().setVisible(true);
                dispose(); // Close current window
            
   
                
              
    
      

    }//GEN-LAST:event_btn_addpActionPerformed

    private void btn_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderActionPerformed
                    new Order().setVisible(true);
                dispose(); 
            
          
    }//GEN-LAST:event_btn_orderActionPerformed

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
         new Register().setVisible(true);
                dispose(); 
            
       
    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportActionPerformed
         
        
        try {
            String reportPath = "C:\\Users\\rajak\\Desktop\\OOP_CW\\EAD_fianlproject\\src\\ui\\report1.jrxml";
           
            JasperReport jr = JasperCompileManager.compileReport(reportPath);
            
           
            Connection conn = DBConnection.createDBConnection();
            
            
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conn);
            
            
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    
       
    }//GEN-LAST:event_btn_reportActionPerformed



   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                      new Mainpage().setVisible(true);
            }
        });
    }
        


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addp;
    private javax.swing.JButton btn_order;
    private javax.swing.JButton btn_reg;
    private javax.swing.JButton btn_report;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
