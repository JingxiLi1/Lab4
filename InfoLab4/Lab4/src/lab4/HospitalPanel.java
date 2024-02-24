/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package lab4;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Community;
import model.Hospital;
import model.HospitalDirectory;
import model.MedicalSystem;

/**
 *
 * @author wenqing-mbp16
 */
public class HospitalPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalPanel
     */
    public HospitalPanel() {
        initComponents();
        poplutateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        hospitalInfoLabel = new javax.swing.JScrollPane();
        hospitalTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        hospitalLabel = new javax.swing.JLabel();
        communityLabel = new javax.swing.JLabel();
        hospitalLabel2 = new javax.swing.JLabel();
        hospitalField = new javax.swing.JTextField();
        communityField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setText("Hospital Infomation");

        hospitalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hospital", "Community", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        hospitalInfoLabel.setViewportView(hospitalTable);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        hospitalLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        hospitalLabel.setText("Hospital ");

        communityLabel.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        communityLabel.setText("Community");

        hospitalLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        hospitalLabel2.setText("City");

        hospitalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalFieldActionPerformed(evt);
            }
        });

        communityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityFieldActionPerformed(evt);
            }
        });

        cityField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hospitalLabel2)
                            .addComponent(hospitalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(communityLabel))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(communityField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(hospitalField, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addComponent(cityField))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(titleLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(hospitalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(deleteButton)
                .addGap(106, 106, 106)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateButton)
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(hospitalInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(addButton)
                    .addComponent(deleteButton))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hospitalLabel)
                    .addComponent(hospitalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(communityLabel)
                    .addComponent(communityField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hospitalLabel2)
                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(298, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Hospital hospital = new Hospital();
        if (hospitalField.getText().equals("") || communityField.getText().equals("") || cityField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Can't leave any field blank!");
            return;
        }

        hospital.setName(hospitalField.getText());
        for (Community comm : MedicalSystem.getInstance().getCommunities()) {
            if ((comm.getName() == null ? communityField.getText() == null : comm.getName().equals(communityField.getText()))
                    && (comm.getCity() == null ? cityField.getText() == null : comm.getCity().equals(cityField.getText()))) {
                hospital.setComm(comm);
                hospital.setCity(comm.getCity());
                comm.addHospital(hospital);
            }
        }

        if (hospital.getComm() == null) {
            Community comm = new Community();
            comm.setName(communityField.getText());
            comm.setCity(cityField.getText());
            comm.addHospital(hospital);
            hospital.setComm(comm);
            hospital.setCity(comm.getCity());
            MedicalSystem.getInstance().addCommunity(comm);
        }

        HospitalDirectory.getInstance().addHospital(hospital);
        JOptionPane.showMessageDialog(this, "Hospital Information is added successfully.");
        poplutateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void hospitalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hospitalFieldActionPerformed

    private void communityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityFieldActionPerformed

    private void cityFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = hospitalTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be deleted", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
            Hospital selectedHospital = (Hospital) model.getValueAt(selectedIndex, 0);
            HospitalDirectory.getInstance().removeHospital(selectedHospital);
            JOptionPane.showMessageDialog(this, "Hospital Information is deleted successfully.");
            poplutateTable();
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        Hospital hospital;
        int selectedIndex = hospitalTable.getSelectedRow();
        if (selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to be updated", "Error - No selection", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
            hospital = (Hospital) model.getValueAt(selectedIndex, 0);

            if (cityField.getText().equals("") || communityField.getText().equals("") || hospitalField.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Can't leave any field blank!");
                return;
            }
            hospital.setComm(null);
            for (Community comm : MedicalSystem.getInstance().getCommunities()) {
                if ((comm.getName() == null ? communityField.getText() == null : comm.getName().equals(communityField.getText()))
                        && (comm.getCity() == null ? cityField.getText() == null : comm.getCity().equals(cityField.getText()))) {
                    hospital.setComm(comm);
                    hospital.setCity(comm.getCity());
                    comm.addHospital(hospital);
                }
            }

            if (hospital.getComm() == null) {
                Community comm = new Community();
                comm.setName(communityField.getText());
                comm.setCity(cityField.getText());
                comm.addHospital(hospital);
                hospital.setComm(comm);
                hospital.setCity(comm.getCity());
                MedicalSystem.getInstance().addCommunity(comm);
            }
            JOptionPane.showMessageDialog(this, "Hospital Information is update successfully.");
            poplutateTable();
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    public void poplutateTable() {
        DefaultTableModel model = (DefaultTableModel) hospitalTable.getModel();
        model.setRowCount(0);
        for (Hospital h : HospitalDirectory.getInstance().getHospitals()) {
            Object[] row = new Object[3];
            row[0] = h;
            row[1] = h.getComm().getName();
            row[2] = h.getCity();
            model.addRow(row);
        }
        clearFields();
    }

    private void clearFields() {
        hospitalField.setText("");
        communityField.setText("");
        cityField.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField communityField;
    private javax.swing.JLabel communityLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField hospitalField;
    private javax.swing.JScrollPane hospitalInfoLabel;
    private javax.swing.JLabel hospitalLabel;
    private javax.swing.JLabel hospitalLabel2;
    private javax.swing.JTable hospitalTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}