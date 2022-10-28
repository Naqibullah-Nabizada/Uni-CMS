package Umis;

import java.time.Year;

public class addStudent extends javax.swing.JFrame {

    DAL dal = new DAL();

    public addStudent() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        Female = new javax.swing.JRadioButton();
        cmbDob = new javax.swing.JComboBox<>();
        txtFirstname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtLastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtFathername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbGraduted = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        cmbSemester = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        cmbFaculty = new javax.swing.JComboBox<>();
        cmbDepartment = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 181, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_back_arrow_48px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 360, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("firstname");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, 20));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel2.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Female.setText("Female");
        jPanel2.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 80, -1));

        cmbDob.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(cmbDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 200, -1));

        txtFirstname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("lastname");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, 20));

        txtLastname.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Date of Birth");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, 20));

        txtFathername.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtFathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("fathername");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, 20));

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        Male.setSelected(true);
        Male.setText("Male");
        jPanel2.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 60, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, 20));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Email");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, 20));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 210, -1));

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Phone");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Graduted");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, -1, 20));

        cmbGraduted.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(cmbGraduted, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 210, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Semester");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, 20));

        cmbSemester.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jPanel2.add(cmbSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 210, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Faculty");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, -1, 20));

        cmbFaculty.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cmbFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFacultyActionPerformed(evt);
            }
        });
        jPanel2.add(cmbFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 210, -1));

        cmbDepartment.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });
        jPanel2.add(cmbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 210, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setText("Department");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, 20));

        btnRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img (19).jpeg"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1040, 410));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setText("دانشگاه کابل");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 250, 70));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_cancel_48px.png"))); // NOI18N
        jLabel10.setText("X");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel6.setText("Kabul University");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 340, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img (15).jpeg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new Student().show();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtFirstname.setText("");
        txtLastname.setText("");
        txtFathername.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

            Year date = java.time.Year.now();
            String d = date.toString();
            int year = Integer.parseInt(d);
            
            int begin = year - 40;
            int end = year - 18;
            
            for (int i=begin; i<=end; i++){
                cmbDob.addItem(i+"");
            }
           
            
            int start = year - 15;
            int y = year;
            
            for (int i=start; i<=y; i++){
                cmbGraduted.addItem(i+"");
            }
            
            
            cmbSemester.addItem(1+"");
            cmbSemester.addItem(3+"");
            
            
            dal.connect();
            
            String[][] faculty = dal.select("SELECT faculty_id, faculty_name FROM faculty");
            
            for (int i=0; i<faculty.length; i++){
                cmbFaculty.addItem(faculty[i][0] +"- "+  faculty[i][1]);
            }
            
            
    }//GEN-LAST:event_formWindowOpened

    private void cmbFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFacultyActionPerformed
        // TODO add your handling code here:
        
        String[] parts = cmbFaculty.getSelectedItem().toString().split("-");
        
        dal.connect();
        String[][] department = dal.select("SELECT dep_id, dep_name FROM department WHERE faculty_id="+parts[0]);
        
        cmbDepartment.removeAllItems();
        
        for (int i = 0; i<department.length; i++){
            cmbDepartment.addItem(department[i][0] +"- "+ department[i][1]);
        }
    }//GEN-LAST:event_cmbFacultyActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        
        String fname = txtFirstname.getText();
        String lname = txtLastname.getText();
        String faname = txtFathername.getText();
        
        String gender= "Male";
        
        if (Male.isSelected()){
            gender = "Male";
        }
        if (Female.isSelected()){
            gender = "Female";
        }
        
        String dob = cmbDob.getSelectedItem().toString();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String address = txtAddress.getText();
        String graduted = cmbGraduted.getSelectedItem().toString();
        int semester = Integer.parseInt(cmbSemester.getSelectedItem().toString());
        String faculty = cmbFaculty.getSelectedItem().toString().split("-")[0];
        String department = cmbDepartment.getSelectedItem().toString().split("-")[0];
        
        dal.connect();
        
        dal.insert("INSERT INTO student VALUES (null, '"+fname+"', '"+lname+"', '"+faname+"', '"+ gender +"', '"+dob+"', '"+phone+"', '"+email+"', '"+address+"','"+graduted+"', "+semester+", '"+faculty+"', '"+department+"')");
        
        btnResetActionPerformed(null);
        
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartmentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbDob;
    private javax.swing.JComboBox<String> cmbFaculty;
    private javax.swing.JComboBox<String> cmbGraduted;
    private javax.swing.JComboBox<String> cmbSemester;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFathername;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
