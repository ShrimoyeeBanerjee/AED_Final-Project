/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.researcher;

import Info.CropInfoDirectory;
import Info.CropMethodDirectory;
import Business.ecosystem;
import Enterprise.Enterprise;
import organization.Euser;
import organization.researcher;
import UserAcc.useracc;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shalinishree
 */
public class researcherMain extends javax.swing.JPanel {

    /**
     * Creates new form researcherMain
     */
    JPanel container;
    useracc account;
    researcher researchOrganization;
    ecosystem business;
    Enterprise enterprise;  

    public researcherMain(JPanel container, useracc account, researcher researchOrganization, Enterprise enterprise,ecosystem business) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        
        this.container = container;
        this.account = account;
        this.researchOrganization = researchOrganization;
        this.researchOrganization = researchOrganization;
        this.business = business;
        this.enterprise=enterprise;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnRequestFunding = new javax.swing.JButton();
        analysisPanel = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("SCIENTIST WORK AREA");

        btnRequestFunding.setText("Request Funding");
        btnRequestFunding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestFundingActionPerformed(evt);
            }
        });

        analysisPanel.setText("Analysis");
        analysisPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analysisPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(analysisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequestFunding, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnRequestFunding, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(analysisPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestFundingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestFundingActionPerformed
        // TODO add your handling code here:
        fundrequest chkprogram = new fundrequest(container,account,researchOrganization,business);
        container.add("RequestFundingJPane", chkprogram);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnRequestFundingActionPerformed

    private void analysisPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analysisPanelActionPerformed
        // TODO add your handling code here:
         Analysis analysisJPanel = new Analysis(container);
       container.add("Analytics2JPanel", analysisJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_analysisPanelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton analysisPanel;
    private javax.swing.JButton btnRequestFunding;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
