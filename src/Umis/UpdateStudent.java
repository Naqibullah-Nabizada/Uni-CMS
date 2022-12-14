/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Umis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author NAQIB
 */
public class UpdateStudent extends javax.swing.JFrame {

    DAL dal = new DAL();

    private final String connect = "jdbc:mysql://localhost/umis";
    private final String username = "roo";
    private final String password = null;

    /**
     * Creates new form UpdateStudent
     */
    public UpdateStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        UpdatePanel = new javax.swing.JPanel();
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
        btnUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UpdatePanel.setBackground(new java.awt.Color(0, 181, 204));
        UpdatePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_back_arrow_48px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        UpdatePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, -1, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("firstname");
        UpdatePanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        UpdatePanel.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, -1, -1));

        buttonGroup1.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Female.setText("Female");
        UpdatePanel.add(Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 90, -1));

        cmbDob.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(cmbDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, -1));

        txtFirstname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("lastname");
        UpdatePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 30));

        txtLastname.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 210, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Date of Birth");
        UpdatePanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, 30));

        txtFathername.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(txtFathername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 210, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setText("fathername");
        UpdatePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        buttonGroup1.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        Male.setSelected(true);
        Male.setText("Male");
        UpdatePanel.add(Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 60, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setText("Gender");
        UpdatePanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Address");
        UpdatePanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 210, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setText("Email");
        UpdatePanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, 30));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, -1));

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 210, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Phone");
        UpdatePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setText("Graduted");
        UpdatePanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, 30));

        cmbGraduted.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(cmbGraduted, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 210, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setText("Semester");
        UpdatePanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 30));

        cmbSemester.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(cmbSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 210, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setText("Faculty");
        UpdatePanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, 30));

        cmbFaculty.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cmbFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFacultyActionPerformed(evt);
            }
        });
        UpdatePanel.add(cmbFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 210, -1));

        cmbDepartment.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdatePanel.add(cmbDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 210, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setText("Department");
        UpdatePanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, 30));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        UpdatePanel.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 100, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/girl.png"))); // NOI18N
        UpdatePanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 510, 490));

        getContentPane().add(UpdatePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1040, 490));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setText("Kabul University");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 340, 70));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_add_user_group_woman_man_80px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        new allStudent().show();
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

    private void cmbFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFacultyActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_cmbFacultyActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String fname = txtFirstname.getText();
        String lname = txtLastname.getText();
        String faname = txtFathername.getText();

        String gender = "Male";

        if (Male.isSelected()) {
            gender = "Male";
        }
        if (Female.isSelected()) {
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

        try {

            dal.connect();
            dal.update("UPDATE student SET firstname = '" + fname + "', lastname = '" + lname + "', fathername = '" + faname + "', gender = '" + gender + "', dob = '" + dob + "', phone =  '" + phone + "', email = '" + email + "', address =  '" + address + "', graduted_year = '" + graduted + "', semester = " + semester + ", faculty_id = '" + faculty + "', dem_id = '" + department + "')");
            btnResetActionPerformed(null);

        } catch (Exception e) {
            dal.showMsg("Something is wrong, try again!");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(connect, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT s.firstname, s.lastname, s.fathername, gender, dob, s.phone, s.email, s.address, graduted_year, semester, faculty_name, dep_name FROM student s INNER JOIN faculty f ON s.faculty_id = f.faculty_id INNER JOIN department d ON s.dep_id = d.dep_id WHERE student_id = " + 4);

            rs.next();
            txtFirstname.setText(rs.getString("firstname"));
            txtLastname.setText(rs.getString("lastname"));
            txtFathername.setText(rs.getString("fathername"));
            if (Male.isSelected()) {
                Male.setText(rs.getString("gender"));
            }
            if (Female.isSelected()) {
                Female.setText(rs.getString("gender"));
            }
            cmbDob.setSelectedItem(rs.getString("dob"));
            txtPhone.setText(rs.getString("phone"));
            txtEmail.setText(rs.getString("email"));
            txtAddress.setText(rs.getString("address"));
            cmbGraduted.setSelectedItem(rs.getString("graduted_year"));
            cmbSemester.setSelectedItem(rs.getString("semester"));
            cmbFaculty.setSelectedItem(rs.getString("faculty_name"));
            cmbDepartment.setSelectedItem(rs.getString("dep_name"));
            
        } catch (Exception e) {

            dal.showMsg("Something is wrong");
        }

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Female;
    private javax.swing.JRadioButton Male;
    private javax.swing.JPanel UpdatePanel;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFathername;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
