/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RolePlant;
import Business.Account.Account;
import Business.ecosystem;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author hrushithaputtala
 */
public class CommunityPanel extends JPanel {

    /**
     * Creates new form CommunityPanel
     */
    JPanel container;
    Account account;
    ecosystem business;
    public CommunityPanel(JPanel container, Account account, ecosystem business) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.container = container;
        this.account = account;
        this.business = business;
        populateMyQTable();
    }

    public void populateMyQTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblQandAPlanter.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wk : account.getWorkQueue().getWorkRequestList()){
       if (wk instanceof QAWorkRequest){     
        Object[] row1 = new Object[5];
        row1[0] = wk;
        row1[1] = wk.getSender();
        row1[2] = wk.getReceiver();
        row1[3] = wk.getStatus();
        row1[4] = wk.getAnswer();
        
        dtm.addRow(row1);
                }  }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QAplantTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        askquestionTxt = new javax.swing.JTextField();
        commQsubmit = new javax.swing.JButton();
        commbackbtn = new javax.swing.JButton();

        jLabel1.setText("COMMUNITY QUERIES");

        jLabel2.setText("QUESTIONS:");

        QAplantTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Question", "Answer", "Status"
            }
        ));
        jScrollPane1.setViewportView(QAplantTable);

        jLabel3.setText("Have A doubt?");

        askquestionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                askquestionTxtActionPerformed(evt);
            }
        });

        commQsubmit.setText("Ask Away!");
        commQsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commQsubmitActionPerformed(evt);
            }
        });

        commbackbtn.setText("<< BACK");
        commbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commbackbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(235, 235, 235))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(askquestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(commQsubmit)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(commbackbtn))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(askquestionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(commQsubmit)
                    .addComponent(commbackbtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void askquestionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_askquestionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_askquestionTxtActionPerformed

    private void commQsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commQsubmitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commQsubmitActionPerformed

    private void commbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commbackbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commbackbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable QAplantTable;
    private javax.swing.JTextField askquestionTxt;
    private javax.swing.JButton commQsubmit;
    private javax.swing.JButton commbackbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
