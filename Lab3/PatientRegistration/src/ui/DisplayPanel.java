/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.time.LocalDate;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import models.Patient;

/**
 *
 * @author ISHAQ
 */
public class DisplayPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPanel
     */
    Patient patient;
    JPanel bottomPanel;
    javax.swing.JLabel titleLabel;
    public DisplayPanel(Patient patient, JPanel bottomPanel, javax.swing.JLabel titleLabel) {
        this.patient = patient;
        this.bottomPanel = bottomPanel;
        this.titleLabel = titleLabel;
        initComponents();
        populateData();
    }
    
    void populateData(){
        lblName.setText("Name: "+patient.getFirstName()+" "+patient.getLastName());
        lblEmail.setText("Email: "+patient.getEmail());
        lblDateOfBirth.setText("Date of Birth: "+patient.getDateOfBirth());
        lblAge.setText("Age: "+(LocalDate.now().getYear() -
                Integer.parseInt(patient.getDateOfBirth().split("-")[2]))+" years");
        lblPatientType.setText("Patient Type: "+patient.getPatientType());
        lblGender.setText("Gender: "+patient.getGender());
        lblMessage.setText("<html><p>"
                + "Message: "
                + patient.getMessage()
                + "</p></html>");
        
        lblPhoto.setIcon(new ImageIcon(new ImageIcon(patient.getPhoto().getAbsolutePath())
                .getImage().getScaledInstance(150,150,
                    Image.SCALE_SMOOTH)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblPhoto = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblPatientType = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        btnBack.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBack.setText("Go Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblPhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblAge.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAge.setText("Age");

        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        lblDateOfBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDateOfBirth.setText("DoB");

        lblPatientType.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPatientType.setText("P Type");

        lblGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lblMessage.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblMessage.setText("Message");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMessage)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblAge)
                            .addComponent(lblEmail)
                            .addComponent(lblGender)
                            .addComponent(lblDateOfBirth))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPatientType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblName)
                        .addGap(18, 18, 18)
                        .addComponent(lblAge)
                        .addGap(18, 18, 18)
                        .addComponent(lblGender)
                        .addGap(18, 18, 18)
                        .addComponent(lblEmail)
                        .addGap(30, 30, 30)
                        .addComponent(lblDateOfBirth)
                        .addGap(28, 28, 28)
                        .addComponent(lblPatientType)
                        .addGap(18, 18, 18)
                        .addComponent(lblMessage))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBack)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout) bottomPanel.getLayout();
        titleLabel.setText("Patient Registration Form");
        cl.previous(bottomPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatientType;
    private javax.swing.JLabel lblPhoto;
    // End of variables declaration//GEN-END:variables
}