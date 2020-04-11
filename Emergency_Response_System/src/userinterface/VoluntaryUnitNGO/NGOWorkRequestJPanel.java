/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VoluntaryUnitNGO;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NewVolunteerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivibhatt
 */
public class NGOWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkRequestJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    public NGOWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;

        populateTable();
    }

        public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblNGOWorkRequest.getModel();
        model.setRowCount(0);
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
            if (workRequest instanceof NewVolunteerWorkRequest) {
                Object[] row = new Object[4];
                row[0] = workRequest;
                row[1] = workRequest.getSender();
                row[2] = ((NewVolunteerWorkRequest) workRequest).getRequestType();
                row[3] = ((NewVolunteerWorkRequest) workRequest).getRemainingQuantity();
                model.addRow(row);

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
        tblNGOWorkRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewDetailsBtn2 = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnComplete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        tblNGOWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Manager Requested", "Request Type", "Number of Units"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNGOWorkRequest);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Requests Received");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGE WORK REQUEST");

        viewDetailsBtn2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewDetailsBtn2.setText("View Details");
        viewDetailsBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtn2ActionPerformed(evt);
            }
        });

        btnAssign.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnComplete.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnComplete.setText("Serve");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(382, 382, 382)
                                .addComponent(btnAssign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewDetailsBtn2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnComplete))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnBack)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(1, 1, 1)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComplete)
                    .addComponent(btnAssign)
                    .addComponent(viewDetailsBtn2))
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDetailsBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtn2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNGOWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            NewVolunteerWorkRequest workRequest = (NewVolunteerWorkRequest) tblNGOWorkRequest.getValueAt(selectedRow, 2);
            NGOAdminDetailJPanel ngoAdminDetail = new NGOAdminDetailJPanel(userProcessContainer, account, organization, enterprise, network, system, workRequest);
            userProcessContainer.add("NGOAdminDetailJPanel", ngoAdminDetail);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_viewDetailsBtn2ActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNGOWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            NewVolunteerWorkRequest workRequest= (NewVolunteerWorkRequest) tblNGOWorkRequest.getValueAt(selectedRow, 2);
            if (workRequest.getStatus().equals("Requested")) {
                workRequest.setStatus("Pending");
                workRequest.setReceiver(account);
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Already assigned");
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblNGOWorkRequest.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            NewVolunteerWorkRequest workRequest = (NewVolunteerWorkRequest) tblNGOWorkRequest.getValueAt(selectedRow, 2);
            if (workRequest.getStatus().equals("Allocated")) {
                workRequest.setStatus("Complete");
                JOptionPane.showMessageDialog(null, "Request Completed Successfully !! ");
                populateTable();
            } else {
                JOptionPane.showMessageDialog(null, "Please assign first");
            }
        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:        userProcessContainer.remove(this);
        NGOAdminWorkAreaJPanel ngoAdminWorkAreaJPanel = new NGOAdminWorkAreaJPanel( userProcessContainer,  account,  organization,  enterprise,  network,  system);
        userProcessContainer.add("NGOAdminWorkAreaJPanel", ngoAdminWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

        
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnComplete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNGOWorkRequest;
    private javax.swing.JButton viewDetailsBtn2;
    // End of variables declaration//GEN-END:variables
}