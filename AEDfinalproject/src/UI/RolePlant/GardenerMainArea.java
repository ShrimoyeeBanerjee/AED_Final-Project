package UI.RolePlant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Info.CropInfo;
import Info.CropInfoDirectory;
import Info.CropMethod;
import Info.CropMethodDirectory;
import Business.ecosystem;
import Enterprise.Enterprise;
import organization.Euser;
import UserAcc.useracc;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JPanel;
//import userinterface.planterRole.RentalLand;
////import userinterface.planterRole.GardenDesign;
//import userinterface.planterRole.EnrollingForEvent;
//import userinterface.planterRole.SellLandEvents;

/**
 *
 * @author hrishithaputtala
 */
public class GardenerMainArea extends javax.swing.JPanel {

    /**
     * Creates new form PlanterWorkArea
     */
    JPanel container;
    ecosystem system;
    useracc account;
    Euser endUserOrganization;
    ecosystem business;
    CropInfoDirectory cropDataDirectory;
    CropMethodDirectory cropMethodDirectory;
    Enterprise enterprise;
    public GardenerMainArea(JPanel container, useracc account, Euser endUserOrganization, Enterprise enterprise,ecosystem business) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.container = container;
        this.account = account;
        this.endUserOrganization = endUserOrganization;
        this.endUserOrganization = endUserOrganization;
        this.business = business;
        this.enterprise=enterprise;
        uploadCropData();
        uploadCropMethod();
        
            
        
        
        
    }
    
    
    public void uploadCropData(){
        String csvFile = "Dataset.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        cropDataDirectory = new CropInfoDirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] vlues = line.split(csvSplitBy);
                
                String stateName = vlues[0];
                String city = vlues[1];
                String season = vlues[2];
                String crop1 = vlues[3];
                String crop2 = vlues[4];
                String crop3 = vlues[5];
                
                CropInfo cropData = cropDataDirectory.addCropData();
                cropData.setStateName(stateName);
                cropData.setCity(city);
                cropData.setSeason(season);
                cropData.setCrop1(crop1);
                cropData.setCrop2(crop2);
                cropData.setCrop3(crop3);
            }
           

            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void uploadCropMethod(){
        String csvFile = "Method.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";
        
        cropMethodDirectory = new CropMethodDirectory();
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null){
                String[] vlues = line.split(csvSplitBy);
                
                String cropName = vlues[0];
                String method = vlues[1];
                
                CropMethod cropMethod = cropMethodDirectory.addCropMethod();
                cropMethod.setCropName(cropName);
                cropMethod.setMethod(method);
                 
                System.out.println(cropMethod.getCropName()+" "+cropMethod.getMethod());
            }     

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        catch (IOException e) {
            e.printStackTrace();
        } 
        finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
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
        btnPlanGarden = new javax.swing.JButton();
        btnRegisterForEvents = new javax.swing.JButton();
        btnLand = new javax.swing.JButton();
        btnCommunityQA = new javax.swing.JButton();
        btnPutLandForLease = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PLANTER WORK AREA");

        btnPlanGarden.setText("PLAN MY GARDEN");
        btnPlanGarden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanGardenActionPerformed(evt);
            }
        });

        btnRegisterForEvents.setText("REGISTER FOR EVENTS");
        btnRegisterForEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterForEventsActionPerformed(evt);
            }
        });

        btnLand.setText("LEASE LAND");
        btnLand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLandActionPerformed(evt);
            }
        });

        btnCommunityQA.setText("Ask Community");
        btnCommunityQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommunityQAActionPerformed(evt);
            }
        });

        btnPutLandForLease.setText("PUT UP LAND FOR LEASE");
        btnPutLandForLease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPutLandForLeaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLand, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPutLandForLease, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCommunityQA, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlanGarden, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnRegisterForEvents, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlanGarden, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(btnRegisterForEvents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPutLandForLease, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCommunityQA, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLand, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(260, 260, 260))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterForEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterForEventsActionPerformed
//         TODO add your handling code here:
        EnrollingForEvent reg = new EnrollingForEvent(container,account,endUserOrganization);
        container.add("Register for events", reg);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
                                
    }//GEN-LAST:event_btnRegisterForEventsActionPerformed

    private void btnPlanGardenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanGardenActionPerformed
        // TODO add your handling code here:
        GardenDesign plang = new GardenDesign(container,account,cropDataDirectory,cropMethodDirectory);
        container.add("Planmygarden", plang);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnPlanGardenActionPerformed

    private void btnLandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLandActionPerformed
        // TODO add your handling code here:
        
        RentalLand ll = new RentalLand(container,account,endUserOrganization,enterprise,business);
        container.add("LeaseLandJPanel", ll);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnLandActionPerformed

    private void btnPutLandForLeaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPutLandForLeaseActionPerformed
        // TODO add your handling code here:
        SellLandEvents sll = new SellLandEvents(container,account,business);
        container.add("SellLandJPanel", sll);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnPutLandForLeaseActionPerformed

    private void btnCommunityQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommunityQAActionPerformed
        // TODO add your handling code here:
        CommunityPanel askjp = new CommunityPanel(container,account,business);
        container.add("AskCommunityJPanel", askjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnCommunityQAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCommunityQA;
    private javax.swing.JButton btnLand;
    private javax.swing.JButton btnPlanGarden;
    private javax.swing.JButton btnPutLandForLease;
    private javax.swing.JButton btnRegisterForEvents;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
