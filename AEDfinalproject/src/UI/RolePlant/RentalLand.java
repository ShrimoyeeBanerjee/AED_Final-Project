/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.RolePlant;

import Business.ecosystem;
import Enterprise.Enterprise;
import organization.Euser;
import organization.farmer;
import UserAcc.useracc;
import Work.SellingLand;
import Work.Request;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import email.emailVerification;

/**
 *
 * @author hrishithaputtala
 */
public class RentalLand extends javax.swing.JPanel {

    /**
     * Creates new form RentOrLeaseLand
     */
    JPanel container;
    useracc account;
    
     Euser endUserOrganization;
  Enterprise enterprise;
  ecosystem business;
   ArrayList<Request> listOfReq;
   

    RentalLand(JPanel container, useracc account, Euser endUserOrganization, Enterprise enterprise,ecosystem business) {
        initComponents(); //To change body of generated methods, choose Tools | Templates.
        this.container = container;
        this.account = account;
        this.endUserOrganization = endUserOrganization;
        this.enterprise = enterprise;
        this.business = business;
        this.listOfReq = endUserOrganization.getWorkQueue().getWorkRequestList();
         populateLandTable();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLandAvailable1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        toMailTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        subjectTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mailTextField = new javax.swing.JTextField();
        sendMailBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        userNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Lease my Land");

        jLabel2.setText("LAND AVAILABLE IN YOUR CITY ");

        jButton1.setText("Contact Owner");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblLandAvailable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Location", "Area ", "Price/Month", "Contact"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblLandAvailable1);
        if (tblLandAvailable1.getColumnModel().getColumnCount() > 0) {
            tblLandAvailable1.getColumnModel().getColumn(0).setResizable(false);
            tblLandAvailable1.getColumnModel().getColumn(1).setResizable(false);
            tblLandAvailable1.getColumnModel().getColumn(2).setResizable(false);
            tblLandAvailable1.getColumnModel().getColumn(2).setHeaderValue("Price/Month");
            tblLandAvailable1.getColumnModel().getColumn(3).setResizable(false);
            tblLandAvailable1.getColumnModel().getColumn(3).setHeaderValue("Contact");
        }

        btnBack.setText("<<BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setText("TO");
        jLabel4.setEnabled(false);

        toMailTextField.setEnabled(false);

        jLabel6.setText("Subject:");
        jLabel6.setEnabled(false);

        subjectTextField.setEnabled(false);

        jLabel7.setText("Message:");
        jLabel7.setEnabled(false);

        mailTextField.setEnabled(false);

        sendMailBtn.setText("Send Mail");
        sendMailBtn.setEnabled(false);
        sendMailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMailBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Email ID");

        jLabel9.setText("Password");

        userNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter your email id and pasword below:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBack)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(26, 26, 26)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel6)))))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(subjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(toMailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sendMailBtn)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(toMailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(userNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(subjectTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sendMailBtn)
                            .addComponent(btnBack))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        jLabel4.setEnabled(true);

          jLabel6.setEnabled(true);
           jLabel7.setEnabled(true);
           mailTextField.setEnabled(true);
           sendMailBtn.setEnabled(true);
           toMailTextField.setEnabled(true);
         
        subjectTextField.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendMailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMailBtnActionPerformed
        // TODO add your handling code here:
        boolean isSent = true;
 
try {
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.submitter", userNameTextField.getText()); //such as abc@gmail.com
        properties.setProperty("mail.smtp.auth", "true");
        
        properties.setProperty("mail.smtp.host", "smtp.gmail.com");   //use smtp.google.com for Google
        properties.put("mail.smtp.user", userNameTextField.getText()); //such as abc@gmail.com
        properties.put("mail.smtp.port", 465); //use 465 for Google's SMTP server
        properties.put("mail.smtp.socketFactory.port", 465); //use 465 for Google's SMTP server
        properties.put("mail.smtp.starttls.enable","true");
        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.put("mail.smtp.socketFactory.fallback", "false");
 
       Authenticator mailAuthenticator = new emailVerification(userNameTextField.getText(),passwordTextField.getText());
        
        Session mailSession = Session.getDefaultInstance(properties,mailAuthenticator);
        Message message = new MimeMessage(mailSession);
 
        InternetAddress fromAddress = new InternetAddress(userNameTextField.getText());
        InternetAddress toAddress = new InternetAddress(toMailTextField.getText());
 
        message.setFrom(fromAddress);
        message.setRecipient(RecipientType.TO, toAddress);
        //you can use RecipientTypes such as
        //RecipientType.TO
        //RecipientType.BCC
        //RecipientType.CC
        //RecipientType.NEWSGROUPS
        message.setSubject(subjectTextField.getText());
        message.setText(mailTextField.getText());
 
        Transport.send(message);
 
} catch (Exception e) {
     System.out.println("ERROR:" + e.getMessage());
     isSent = false;
}
 
     if(isSent == true) {
     //sendButton.setEnabled(false);
         System.out.println("Your e-mail has been sent");
}
        
    }//GEN-LAST:event_sendMailBtnActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void userNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameTextFieldActionPerformed

       public void populateLandTable(){
    DefaultTableModel tbl = (DefaultTableModel) tblLandAvailable1.getModel();
        tbl.setRowCount(0);
    for(Request wk : listOfReq){
        if (wk instanceof SellingLand )
        {
        Object[] row = new Object[5];
        row[0] = wk.getMessage();
        row[1] = ((SellingLand) wk).getArea();
        row[2] = ((SellingLand) wk).getPricePerMonth();
        row[3] = ((SellingLand) wk).getContact();
        
        
        tbl.addRow(row);
        }
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton sendMailBtn;
    private javax.swing.JTextField subjectTextField;
    private javax.swing.JTable tblLandAvailable1;
    private javax.swing.JTextField toMailTextField;
    private javax.swing.JTextField userNameTextField;
    // End of variables declaration//GEN-END:variables
}
