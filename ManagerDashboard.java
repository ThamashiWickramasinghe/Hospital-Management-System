
package ManagementSystem;


public class ManagerDashboard extends javax.swing.JFrame {

   
    public ManagerDashboard() {
        initComponents();
        jButtonpatient.addActionListener(evt -> openPatientInfoWindow());
        jButtondoctor.addActionListener(evt -> openDoctorInfoWindow());
        jButtoncashier.addActionListener(evt -> openCashierRegisterWindow());
        jButtonmanager.addActionListener(evt -> openAddManagerWindow());
        jButtonschedule.addActionListener(evt -> openSheduleWindow());
        jButtonreport.addActionListener(evt -> openReportsWindow());
        jButtonstaff.addActionListener(evt -> openViewDetailsWindow());
        jButtonlogout.addActionListener(evt -> openDashBoardWindow());
    }
    
    private void openDashBoardWindow() {
        DashBoard DashBoardWindow = new DashBoard();
        DashBoardWindow.setVisible(true);  // Show the DoctorInfo window
        this.dispose();  // Close the dashboard (optional)
    }
    
    private void openViewDetailsWindow() {
        ViewDetails ViewDetailsWindow = new ViewDetails(this);
        ViewDetailsWindow.setVisible(true);  // Show the DoctorInfo window
        this.setVisible(false);  // Close the dashboard (optional)
    }
    
    
    private void openDoctorInfoWindow() {
        DoctorInfo doctorInfoWindow = new DoctorInfo(this);
        doctorInfoWindow.setVisible(true);  // Show the DoctorInfo window
        this.setVisible(false);  // Close the dashboard (optional)
    }
    
    private void openPatientInfoWindow() {
    PatientInfo patientInfoWindow = new PatientInfo(this);
    patientInfoWindow.setVisible(true);
    this.setVisible(false);  // Hide current window
    }
    
    private void openCashierRegisterWindow() {
        CashierRegister CashierRegisterWindow = new CashierRegister(this);
        CashierRegisterWindow.setVisible(true);  
        this.setVisible(false);   // Close the dashboard (optional)
    }
    
    private void openAddManagerWindow() {
        AddManager AddManagerWindow = new AddManager(this);
        AddManagerWindow.setVisible(true);  
        this.setVisible(false);  // Close the dashboard (optional)
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonpatient = new javax.swing.JButton();
        jButtondoctor = new javax.swing.JButton();
        jButtoncashier = new javax.swing.JButton();
        jButtonmanager = new javax.swing.JButton();
        jButtonschedule = new javax.swing.JButton();
        jButtonstaff = new javax.swing.JButton();
        jButtonreport = new javax.swing.JButton();
        jButtonlogout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(226, 241, 249));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("City Nursing Home");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 70));

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jButtonpatient.setBackground(java.awt.SystemColor.activeCaption);
        jButtonpatient.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonpatient.setForeground(new java.awt.Color(255, 255, 255));
        jButtonpatient.setText("Add Appoinment");
        jButtonpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpatientActionPerformed(evt);
            }
        });

        jButtondoctor.setBackground(java.awt.SystemColor.activeCaption);
        jButtondoctor.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtondoctor.setForeground(new java.awt.Color(255, 255, 255));
        jButtondoctor.setText("Consultants");

        jButtoncashier.setBackground(java.awt.SystemColor.activeCaption);
        jButtoncashier.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtoncashier.setForeground(new java.awt.Color(255, 255, 255));
        jButtoncashier.setText("Add Cashier");

        jButtonmanager.setBackground(java.awt.SystemColor.activeCaption);
        jButtonmanager.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonmanager.setForeground(new java.awt.Color(255, 255, 255));
        jButtonmanager.setText("Add Manager");
        jButtonmanager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmanagerActionPerformed(evt);
            }
        });

        jButtonschedule.setBackground(java.awt.SystemColor.activeCaption);
        jButtonschedule.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonschedule.setForeground(new java.awt.Color(255, 255, 255));
        jButtonschedule.setText("Doctor Schedule");
        jButtonschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonscheduleActionPerformed(evt);
            }
        });

        jButtonstaff.setBackground(java.awt.SystemColor.activeCaption);
        jButtonstaff.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonstaff.setForeground(new java.awt.Color(255, 255, 255));
        jButtonstaff.setText("View Staff");
        jButtonstaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonstaffActionPerformed(evt);
            }
        });

        jButtonreport.setBackground(java.awt.SystemColor.activeCaption);
        jButtonreport.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonreport.setForeground(new java.awt.Color(255, 255, 255));
        jButtonreport.setText("Reports");
        jButtonreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonreportActionPerformed(evt);
            }
        });

        jButtonlogout.setBackground(java.awt.SystemColor.activeCaption);
        jButtonlogout.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButtonlogout.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogout.setText("Log Out");
        jButtonlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtondoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtoncashier, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonreport, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtondoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtoncashier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButtonmanager, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButtonreport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 590));

        jPanel4.setBackground(new java.awt.Color(0, 102, 153));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EMERGENCY : 0112345678  /  0112345677  /  0112345546");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jLabel4)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 960, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pngtree-health-care-icon-grid-logo-picture-image_1591324.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 960, 560));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMERGENCY : 0112345678  /  0122345677  /  0112344556");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 560, 490, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonmanagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmanagerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonmanagerActionPerformed

    private void jButtonscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonscheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonscheduleActionPerformed

    private void jButtonstaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonstaffActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonstaffActionPerformed

    private void jButtonreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonreportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonreportActionPerformed

    private void jButtonlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonlogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonlogoutActionPerformed

    private void jButtonpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonpatientActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ManagerDashboard().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtoncashier;
    private javax.swing.JButton jButtondoctor;
    private javax.swing.JButton jButtonlogout;
    private javax.swing.JButton jButtonmanager;
    private javax.swing.JButton jButtonpatient;
    private javax.swing.JButton jButtonreport;
    private javax.swing.JButton jButtonschedule;
    private javax.swing.JButton jButtonstaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
