/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GoogleMAP;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.LocationPoint;
import Business.Network.Network;
import Business.Organization.FireSafetyOrganization;
import Business.Organization.MedicalOrganization;
import Business.Organization.Organization;
import Business.Organization.PoliceOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyUnitRequest;
import Business.WorkQueue.ReportingAdminSceneRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhankuwarsisodiya
 */
public class NearestOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NearestOrganizationJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Organization recieverOrganization;
    WorkRequest workRequest;
    Enterprise enterprise;
    Network network;
    Network senderNetwork;
    EcoSystem business;
    //DefaultTableModel model;

    public NearestOrganizationJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, WorkRequest workRequest, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.workRequest = workRequest;
        this.enterprise = enterprise;
        this.network = network;
        this.senderNetwork = network;
        this.business = business;
        populateNetwork();
        //model = (DefaultTableModel) nearestOrgTable.getModel();
    }
    
    private void populateNetwork() {
        networkJComboBox.removeAllItems();

        for (Network network : business.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
        networkJComboBox.setSelectedItem(network);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        policeOrg = new javax.swing.JButton();
        fireOrg = new javax.swing.JButton();
        medicineOrg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nearestOrgTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        policeOrg.setText("Police Organization");
        policeOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                policeOrgActionPerformed(evt);
            }
        });

        fireOrg.setText("Fire Organization");
        fireOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireOrgActionPerformed(evt);
            }
        });

        medicineOrg.setText("Medicine Organization");
        medicineOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineOrgActionPerformed(evt);
            }
        });

        nearestOrgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization", "Distance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(nearestOrgTable);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jButton2.setText("Place Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Network");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 941, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(policeOrg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fireOrg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicineOrg)
                                .addGap(27, 27, 27)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(policeOrg)
                    .addComponent(fireOrg)
                    .addComponent(medicineOrg)
                    .addComponent(jButton2))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fireOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireOrgActionPerformed
        // TODO add your handling code here:
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        System.out.println("network1 ---===--->> " + network);
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("network2 ---===--->> " + network);
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("network3 ---===--->> " + network);
                if (org instanceof FireSafetyOrganization) {
                    recieverOrganization = org;
                    System.out.println("network4 ---===--->> " + network);
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                        orgList.add(org);
                        /*row[0] = org.getName();
                        row[1] = org.getOrganizationDistanceFromScene(point);
                        model.addRow(row);*/
                    //}
                }
            }

        }
        
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        for(Organization oo : orgList) {
            row[0] = oo.getName();
            row[1] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
        
        
        
    }//GEN-LAST:event_fireOrgActionPerformed

    private void policeOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_policeOrgActionPerformed
        // TODO add your handling code here:
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof PoliceOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                        orgList.add(org);
                        row[0] = org.getName();
                        row[1] = org.getOrganizationDistanceFromScene(point);
                        model.addRow(row);
                    //}
                }
            }

        }
    }//GEN-LAST:event_policeOrgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void medicineOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineOrgActionPerformed
        // TODO add your handling code here:
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[2];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof MedicalOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                        orgList.add(org);
                        row[0] = org.getName();
                        row[1] = org.getOrganizationDistanceFromScene(point);
                        model.addRow(row);
                    //}
                }
            }

        }
    }//GEN-LAST:event_medicineOrgActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        this.network = (Network)networkJComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        EmergencyUnitRequest emergencyRequest = new EmergencyUnitRequest();
        emergencyRequest.setStatus("Requested");
        emergencyRequest.setRecieverOrganization(recieverOrganization);
        emergencyRequest.setSenderOrganization(organization);
        emergencyRequest.setSenderNetwork(senderNetwork);
        
        organization.getWorkQueue().getWorkRequestList().add(emergencyRequest);
        recieverOrganization.getWorkQueue().getWorkRequestList().add(emergencyRequest);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fireOrg;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton medicineOrg;
    private javax.swing.JTable nearestOrgTable;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton policeOrg;
    // End of variables declaration//GEN-END:variables
}
