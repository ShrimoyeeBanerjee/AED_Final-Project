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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
