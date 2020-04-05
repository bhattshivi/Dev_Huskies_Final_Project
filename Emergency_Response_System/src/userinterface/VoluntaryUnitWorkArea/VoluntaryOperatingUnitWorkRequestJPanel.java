/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VoluntaryUnitWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shivibhatt
 */
public class VoluntaryOperatingUnitWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VoluntaryOperatingUnitWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Network network;
    private OrganizationDirectory organizationDirectory;
    public VoluntaryOperatingUnitWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Network network, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.enterprise = enterprise;
        this.network = network;
        this.business = business;
        this.organizationDirectory = enterprise.getOrganizationDirectory();
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Status", "UserName", "Name", "Email ID", "City", "Organization Type", "Network"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        assignJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE WORK REQUEST");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(541, Short.MAX_VALUE)
                .addComponent(assignJButton)
                .addGap(3, 3, 3)
                .addComponent(processJButton)
                .addGap(438, 438, 438))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1097, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignJButton)
                    .addComponent(processJButton))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

//        int selectedRow = workRequestJTable.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
//            if (request.getStatus().equalsIgnoreCase("Completed")) {
//                JOptionPane.showMessageDialog(null, "Request already processed.");
//                return;
//            } else {
//                request.setReceiver(userAccount);
//                request.setStatus("Pending");
//                populateTable();
//
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "Choose a reuest to process.");
//            return;
//        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

//        int selectedRow = workRequestJTable.getSelectedRow();
//
//        if (selectedRow >= 0) {
//            RegistrationRequest request = (RegistrationRequest) workRequestJTable.getValueAt(selectedRow, 0);
//            Employee emp = new Employee();
//            emp.setName(request.getName());
//            if (request.getOrgType() == Organization.Type.NGO) {
//                System.out.println("UserInterfacengo");
//                organizationDirectory.createOrganization(request.getOrgType(), request.getName(), request.getPosition());
//                UserAccount ua1 = enterprise.getUserAccountDirectory().createUserAccount(request.getUserName(), request.getPassword(), emp, new NGOAdmin());
//
//            } else if (request.getOrgType() == Organization.Type.Personal) {
//                System.out.println("UserInterface");
//                organizationDirectory.createOrganization(request.getOrgType(), request.getName(), request.getPosition());
//                UserAccount ua2 = enterprise.getUserAccountDirectory().createUserAccount(request.getUserName(), request.getPassword(), emp, new PersonalAdmin());
//
//            } else if (request.getOrgType() == Organization.Type.Hospital) {
//                System.out.println("UserInterface");
//                organizationDirectory.createOrganization(request.getOrgType(), request.getName(), request.getPosition());
//                UserAccount ua3 = enterprise.getUserAccountDirectory().createUserAccount(request.getUserName(), request.getPassword(), emp, new HospitalAdmin());
//
//            } else if (request.getOrgType() == Organization.Type.Company) {
//                System.out.println("UserInterface");
//                organizationDirectory.createOrganization(request.getOrgType(), request.getName(), request.getPosition());
//                UserAccount ua4 = enterprise.getUserAccountDirectory().createUserAccount(request.getUserName(), request.getPassword(), emp, new CompanyManager());
//
//            }
//
//            request.setStatus("Completed");
//            populateTable();
//        } else {
//            JOptionPane.showMessageDialog(null, "Please select a request message to process.");
//            return;
//        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
