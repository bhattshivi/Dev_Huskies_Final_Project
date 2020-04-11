/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VoluntaryUnitNGO;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Location.LocationPoint;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shivibhatt
 */
public class ManageSceneJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSceneJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;
    Organization organization;
    Network network;
    UserAccount account;
    private LocationPoint locationPoint;
    public ManageSceneJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, Organization organization, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.organization = organization;
        this.network = network;
        populateSceneTable();
    }
        private void populateSceneTable(){
        DefaultTableModel model = (DefaultTableModel) tblScene.getModel();
        
        model.setRowCount(0);
        
        for (WorkRequest wr : organization.getWorkQueue().getWorkRequestList()){
            
           /* if (wr instanceof ReportingAdminSceneRequest) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = wr;
                row[1] = ((ReportingAdminSceneRequest) wr).getSceneName();
                row[2] = ((ReportingAdminSceneRequest) wr).getSceneZipcode();
                row[3] = ((ReportingAdminSceneRequest) wr).getSceneLocationPoint();
                row[4] = ((ReportingAdminSceneRequest) wr).getNoOfVictims();
                row[5] = ((ReportingAdminSceneRequest) wr).getEstimatedLoss();
                row[6] = ((ReportingAdminSceneRequest) wr).getStatus();
                //row[2] = org.getPosition();
                model.addRow(row);
            } */
            
            
            /*Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);*/
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
        tblScene = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        sceneLocation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        sceneName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        sceneZipCode = new javax.swing.JTextField();
        noOfVictims = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        estimatedLoss = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        createSceneBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblScene.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Scene #", "Scene Name", "Zip Code", "Location", "# of Victims", "Estimated Loss", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblScene);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 35, 1043, 146));

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MANAGE SCENE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 6, 849, -1));
        add(sceneLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 375, 188, -1));

        jLabel1.setText("Scene Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 204, -1, -1));

        jButton2.setText("Set Location");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 375, -1, -1));

        sceneName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sceneNameActionPerformed(evt);
            }
        });
        add(sceneName, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 199, 188, -1));

        jLabel2.setText("Zip Code");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 248, -1, -1));
        add(sceneZipCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 243, 188, -1));
        add(noOfVictims, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 287, 188, -1));

        jLabel4.setText("# of victims");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 292, -1, -1));
        add(estimatedLoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 331, 188, -1));

        jLabel5.setText("Estimated Loss");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 336, -1, -1));

        createSceneBtn.setText("Create Scene");
        createSceneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createSceneBtnActionPerformed(evt);
            }
        });
        add(createSceneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 422, -1, -1));

        jLabel6.setText("Location Point");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 380, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         NGOAdminWorkAreaJPanel ngoAdminWorkAreaJPanel = new NGOAdminWorkAreaJPanel( userProcessContainer,  account,  organization,  enterprise,  network,  system);
        userProcessContainer.add("NGOAdminWorkAreaJPanel", ngoAdminWorkAreaJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void sceneNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sceneNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sceneNameActionPerformed

    private void createSceneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createSceneBtnActionPerformed
        /*ReportingAdminSceneRequest sceneReq = new ReportingAdminSceneRequest();
        sceneReq.setSceneName(sceneName.getText());
        sceneReq.setSceneZipcode(sceneZipCode.getText());
        sceneReq.setNoOfVictims(Integer.parseInt(noOfVictims.getText()));
        sceneReq.setEstimatedLoss(estimatedLoss.getText());
        sceneReq.setSceneLocationPoint(locationPoint);
        sceneReq.setStatus("Requested");
        organization.getWorkQueue().getWorkRequestList().add(sceneReq);

        //for (Network net : business.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                    if (o instanceof DisasterOrganization) {
                        o.getWorkQueue().getWorkRequestList().add(sceneReq);
                    }
                }
            }*/
            //}
    }//GEN-LAST:event_createSceneBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton createSceneBtn;
    private javax.swing.JTextField estimatedLoss;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noOfVictims;
    private javax.swing.JTextField sceneLocation;
    private javax.swing.JTextField sceneName;
    private javax.swing.JTextField sceneZipCode;
    private javax.swing.JTable tblScene;
    // End of variables declaration//GEN-END:variables
}
