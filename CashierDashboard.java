
package ManagementSystem;


public class CashierDashboard extends javax.swing.JFrame {

    
    
    public CashierDashboard() {
        initComponents();
        
        jButtonConsultant.addActionListener(evt -> openDoctorInfoWindow());
        jButtonAppoinment.addActionListener(evt -> openPatientInfoWindow());
        jButtonList.addActionListener(evt -> openPatientInfoWindow());
        jButtonschedule.addActionListener(evt -> openSheduleWindow());
        jButtonreport.addActionListener(evt -> openReportsWindow());
        jButtonlogout.addActionListener(evt -> openDashBoardWindow());
        
        
    }
    
    private void openDashBoardWindow() {
        DashBoard DashBoardWindow = new DashBoard();
        DashBoardWindow.setVisible(true);  // Show the DoctorInfo window
        this.dispose();  // Close the dashboard (optional)
    }
    
    private void openDoctorInfoWindow() {
        DoctorInfo doctorInfoWindow = new DoctorInfo(this);
        doctorInfoWindow.setVisible(true);  // Show the DoctorInfo window
        this.setVisible(false);   // Close the dashboard (optional)
    }
    
    private void openPatientInfoWindow() {
    PatientInfo patientInfoWindow = new PatientInfo(this);
    patientInfoWindow.setVisible(true);
    this.setVisible(false);  // Hide current window
 }
    
    private void openSheduleWindow() {
        new_Shedule SheduleWindow = new new_Shedule(this);
        SheduleWindow.setVisible(true);  
        this.setVisible(false);   // Close the dashboard (optional)
    }
    
    private void openReportsWindow() {
        Doctor_Reports ReportsWindow = new Doctor_Reports(this);
        ReportsWindow.setVisible(true);  
        this.setVisible(false);   // Close the dashboard (optional)
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonlogout = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButtonAppoinment = new javax.swing.JButton();
        jButtonList = new javax.swing.JButton();
        jButtonreport = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButtonConsultant = new javax.swing.JButton();
        jButtonschedule = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(231, 246, 246));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMERGENCY :  0112345678  /   0112345688  /  0112345567");

        jButtonlogout.setBackground(java.awt.SystemColor.activeCaption);
        jButtonlogout.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonlogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogout.setText("Logout");
        jButtonlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jButtonlogout, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jButtonlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 592, 1162, -1));

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));

        jButtonAppoinment.setBackground(java.awt.SystemColor.activeCaption);
        jButtonAppoinment.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButtonAppoinment.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAppoinment.setText("Add Appoinment ");
        jButtonAppoinment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAppoinmentActionPerformed(evt);
            }
        });

        jButtonList.setBackground(java.awt.SystemColor.activeCaption);
        jButtonList.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButtonList.setForeground(new java.awt.Color(255, 255, 255));
        jButtonList.setText("Patient List");
        jButtonList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListActionPerformed(evt);
            }
        });

        jButtonreport.setBackground(java.awt.SystemColor.activeCaption);
        jButtonreport.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButtonreport.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreport.setText("Reports");
        jButtonreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreportActionPerformed(evt);
            }
        });

        jButton10.setBackground(java.awt.SystemColor.activeCaption);
        jButton10.setText("jButton1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButtonConsultant.setBackground(java.awt.SystemColor.activeCaption);
        jButtonConsultant.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButtonConsultant.setForeground(new java.awt.Color(255, 255, 255));
        jButtonConsultant.setText("Consultant");
        jButtonConsultant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultantActionPerformed(evt);
            }
        });

        jButtonschedule.setBackground(java.awt.SystemColor.activeCaption);
        jButtonschedule.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jButtonschedule.setForeground(new java.awt.Color(255, 255, 255));
        jButtonschedule.setText("Doctor Schedule");
        jButtonschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonscheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAppoinment, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonList, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonreport, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultant, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jButtonAppoinment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButtonConsultant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButtonList, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButtonreport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 210, 520));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("City Nursing Hospital");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(427, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(328, 328, 328))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngtree-health-care-icon-grid-logo-picture-image_1591324.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 950, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1156, 1156, 1156)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAppoinmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAppoinmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAppoinmentActionPerformed

    private void jButtonListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonListActionPerformed

    private void jButtonreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonreportActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButtonConsultantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultantActionPerformed

    private void jButtonscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonscheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonscheduleActionPerformed

    private void jButtonlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlogoutActionPerformed

    
    public static void main(String args[]) {
       java.awt.EventQueue.invokeLater(() -> new CashierDashboard().setVisible(true));
      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButtonAppoinment;
    private javax.swing.JButton jButtonConsultant;
    private javax.swing.JButton jButtonList;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JButton jButtonreport;
    private javax.swing.JButton jButtonschedule;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
