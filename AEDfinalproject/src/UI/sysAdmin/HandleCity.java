/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.sysAdmin;

import Business.ecosystem;
import Enterprise.Enterprise;
import Network.network;
import Network.subnetwork;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hrishithaputtala
 */
public class HandleCity extends javax.swing.JPanel {

    /**
     * Creates new form HandleCity
     */
    JPanel userProcessContainer;
   ecosystem system;

    public HandleCity(JPanel userProcessContainer, ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        populateCityTable();
        populatestateComboBox();
    }
    
    private void populateCityTable() {
        DefaultTableModel model = (DefaultTableModel) cityJTable.getModel();

        model.setRowCount(0);
        for (network network : system.getNetworkList()) {
          for (subnetwork subnet:network.getSubNet()){  
            Object[] row = new Object[2];
            row[0] = subnet.getName();
            row[1] = network.getName();
            model.addRow(row);
        }
    }}
    
      private void populatestateComboBox()
     {
         stateComboBox.removeAllItems();
            
         for (network network : system.getNetworkList()) 
        {
            stateComboBox.addItem(network);
        }
     }
      
     public void populateCityCombo(network network) {
        ComboBoxCity.removeAllItems();

        //for (network net : system.getNetworkList()) {
            //for (Enterprise enterprise : subnet.getEnterpriseDirectory().getEnterpriseList()){
            if (stateComboBox.getSelectedItem().toString().equals("MA")){
                ComboBoxCity.addItem("Boston");
                ComboBoxCity.addItem("Revere");
                ComboBoxCity.addItem("Newton");
            }
            else if (stateComboBox.getSelectedItem().toString().equals("TX")){
                ComboBoxCity.removeAllItems();
                ComboBoxCity.addItem("Houston");
                ComboBoxCity.addItem("Austin");
                ComboBoxCity.addItem("Dallas");
            }
            else if (stateComboBox.getSelectedItem().toString().equals("CA")){
                ComboBoxCity.removeAllItems();
                ComboBoxCity.addItem("Los Angeles");
                ComboBoxCity.addItem("San Diego");
                ComboBoxCity.addItem("San Jose");
            }
            else if (stateComboBox.getSelectedItem().toString().equals("NY")){
                ComboBoxCity.removeAllItems();
                ComboBoxCity.addItem("New York City");
                ComboBoxCity.addItem("Buffalo");
                ComboBoxCity.addItem("Rochester");
            }
            else if (stateComboBox.getSelectedItem().toString().equals("NJ")){
                ComboBoxCity.removeAllItems();
                ComboBoxCity.addItem("Newark");
                ComboBoxCity.addItem("Jersey City");
                ComboBoxCity.addItem("Paterson");
            }
            
       // }
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
        cityJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stateComboBox = new javax.swing.JComboBox();
        addCityBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ComboBoxCity = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cityJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "City", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cityJTable);
        if (cityJTable.getColumnModel().getColumnCount() > 0) {
            cityJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 150));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("State:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("City:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        stateComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateComboBoxActionPerformed(evt);
            }
        });
        add(stateComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        addCityBtn.setText("Add");
        addCityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCityBtnActionPerformed(evt);
            }
        });
        add(addCityBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jButton1.setText("<< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        ComboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxCityActionPerformed(evt);
            }
        });
        add(ComboBoxCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("CITY LIST");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 2));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        sysadminWorkarea sysAdminwjp = (sysadminWorkarea) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addCityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCityBtnActionPerformed
        // TODO add your handling code here:
        
        network network = (network) stateComboBox.getSelectedItem();
        //Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        String name = ComboBoxCity.getSelectedItem().toString();
        if (network == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        if(network.getSubNet().isEmpty()){
              subnetwork subnet = network.createAndAddsubNetwork();
              subnet.setName(name);
              populateCityTable();
              JOptionPane.showMessageDialog(null, "City Successfully Added");
        }
        else{
        
        
          for  (subnetwork sub:network.getSubNet())
            {
                if (sub.getName().equalsIgnoreCase(name))
                {
                  JOptionPane.showMessageDialog(null, "City Already exists");
                }
              
            
            else{
                  subnetwork subnet = network.createAndAddsubNetwork();
                subnet.setName(name);
                
        populateCityTable();   
                JOptionPane.showMessageDialog(null, "city Successfully Added");
                    }
              break;  
            }
        }
//        Enterprise enterprise = network.getSubNet().getEnterpriseDirectory().createAndAddEnterprise(name, type);
//
//        populateTable();

        
        
    }//GEN-LAST:event_addCityBtnActionPerformed

    private void stateComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateComboBoxActionPerformed
        // TODO add your handling code here:
        network network = (network) stateComboBox.getSelectedItem();
        if (network != null) {
            populateCityCombo(network);
        }
    }//GEN-LAST:event_stateComboBoxActionPerformed

    private void ComboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxCityActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ComboBoxCityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCity;
    private javax.swing.JButton addCityBtn;
    private javax.swing.JTable cityJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox stateComboBox;
    // End of variables declaration//GEN-END:variables
}
