/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.buyer;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.buyer;
import UserAcc.useracc;
import Work.Farmercropsell;
import Work.Request;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shrimoyee
 */
public class buyerMainarea extends javax.swing.JPanel {

    /**
     * Creates new form buyerMainarea
     */
    JPanel userProcessContainer;
    useracc account;
    buyer buyerOrganization;
    Enterprise enterprise;
    ecosystem business;
    ArrayList<Request> listOfReq;
    

    public buyerMainarea(JPanel userProcessContainer, useracc account, buyer buyerOrganization, Enterprise enterprise,ecosystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.buyerOrganization = buyerOrganization;
        this.enterprise = enterprise;
        this.business = business;
        this.listOfReq = buyerOrganization.getWorkQueue().getWorkRequestList();
        
        populateQATable();
    }
    
    public void populateQATable(){
        DefaultTableModel tbl1 = (DefaultTableModel) tbl.getModel();
        tbl1.setRowCount(0);
        for(Request wk : listOfReq){
            if(wk instanceof Farmercropsell){
                Object[] row = new Object[4];
                row[0] = wk;
                row[1] = ((Farmercropsell) wk).getQuantity();
                row[2] = ((Farmercropsell) wk).getContactDetails();
                row[3] = wk.getSender();
                
                tbl1.addRow(row);
        }
 
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        btnInterested = new javax.swing.JButton();
        btnReply = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Crop Name", "Quantity", "Contact Details", "Sender"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        btnInterested.setText(" Interested");
        btnInterested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInterestedActionPerformed(evt);
            }
        });

        btnReply.setText("Reply");
        btnReply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReplyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Buyer Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInterested)
                        .addGap(30, 30, 30)
                        .addComponent(btnReply))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInterested)
                    .addComponent(btnReply))
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInterestedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInterestedActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        else{
            DefaultTableModel tbl1 = (DefaultTableModel) tbl.getModel();
            
                Request wr = (Request)tbl1.getValueAt(selectedRow,0);
                wr.setReceiver(account);
                JOptionPane.showMessageDialog(null,"Thank you for showing your interest");
                wr.setStatus("Waiting for reply from  "+account);
                populateQATable();
        }
    }//GEN-LAST:event_btnInterestedActionPerformed

    private void btnReplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReplyActionPerformed
        // TODO add your handling code here:
        int selectedRow = tbl.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        else{
           
            DefaultTableModel tbl2 = (DefaultTableModel) tbl.getModel();
            Request wr = (Request)tbl2.getValueAt(selectedRow,0);
            if(wr.getReceiver()!=null){
                if(wr.getReceiver().toString().equalsIgnoreCase(account.toString())){

            String answer = JOptionPane.showInputDialog("Your Reply :");
            wr.setAnswer(answer);
            wr.setStatus("Completed");
            populateQATable();
                }
                else JOptionPane.showMessageDialog(null,"Someone else already shows interest first!");
            }
            else JOptionPane.showMessageDialog(null,"Please assign the dealt to you and then proceed to reply!");
        }
    }//GEN-LAST:event_btnReplyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInterested;
    private javax.swing.JButton btnReply;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}