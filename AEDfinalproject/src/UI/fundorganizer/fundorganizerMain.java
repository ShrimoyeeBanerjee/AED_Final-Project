/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.fundorganizer;

//import Business.FundOrganizerRole.*;
import Business.ecosystem;
import Enterprise.Enterprise;
import organization.funding;
import UserAcc.useracc;
import Work.Funding;
import Work.Funding;
import Work.Request;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shalinishree
 */
public class fundorganizerMain extends javax.swing.JPanel {

    /**
     * Creates new form FundOrganizerWorkAreaJPanle
     */
   JPanel userProcessContainer;
   funding fundingOrganization;
   useracc account;
   ecosystem business;

    public fundorganizerMain(JPanel userProcessContainer, funding fundingOrganization, useracc account, ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.fundingOrganization = fundingOrganization;
        this.account = account;
        this.business = business;
        
        populatefundingRequests();
        
    }

    public void populatefundingRequests(){
            DefaultTableModel dtm = (DefaultTableModel)tblfundingRequests.getModel();
        dtm.setRowCount(0);
        for(Request wk : fundingOrganization.getWorkQueue().getWorkRequestList()){
            if (wk instanceof Funding){
                Object[] row1 = new Object[4];
                row1[0] = ((Funding) wk).getId();
                row1[1] = ((Funding) wk).getApplicant();
                row1[2] = ((Funding) wk);
                row1[3] = ((Funding) wk).getStatus();
     
                 dtm.addRow(row1);
                
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblfundingRequests = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        AnalyticsButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("FUNDING ORGANIZER WORK AREA");

        tblfundingRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ApplicationID", "Sender", "Request", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblfundingRequests);
        if (tblfundingRequests.getColumnModel().getColumnCount() > 0) {
            tblfundingRequests.getColumnModel().getColumn(0).setResizable(false);
            tblfundingRequests.getColumnModel().getColumn(1).setResizable(false);
            tblfundingRequests.getColumnModel().getColumn(2).setResizable(false);
            tblfundingRequests.getColumnModel().getColumn(3).setResizable(false);
        }

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        AnalyticsButton.setText("MARKET PRICE CONTROL");
        AnalyticsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalyticsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnReject)
                                .addGap(18, 18, 18)
                                .addComponent(btnApprove))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(AnalyticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReject)
                    .addComponent(btnApprove))
                .addGap(38, 38, 38)
                .addComponent(AnalyticsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblfundingRequests.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        else{
           
            DefaultTableModel tbl = (DefaultTableModel) tblfundingRequests.getModel();
            Funding wr = (Funding)tbl.getValueAt(selectedRow,2);
            wr.setStatus("Approved");
            populatefundingRequests();
            
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
         int selectedRow = tblfundingRequests.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
        
        else{
           
            DefaultTableModel tbl = (DefaultTableModel) tblfundingRequests.getModel();
            Funding wr = (Funding)tbl.getValueAt(selectedRow,2);
            wr.setStatus("Rejected");
            populatefundingRequests();
            
        }
    
    }//GEN-LAST:event_btnRejectActionPerformed

    private void AnalyticsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalyticsButtonActionPerformed
        // TODO add your handling code here:
        Analysisfund ajp = new Analysisfund(userProcessContainer);
        userProcessContainer.add("AnalyticsJPanel", ajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_AnalyticsButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnalyticsButton;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblfundingRequests;
    // End of variables declaration//GEN-END:variables
}
