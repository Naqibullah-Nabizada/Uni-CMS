package Umis;

/**
 *
 * @author NAQIB
 */
public class addBook extends javax.swing.JFrame {

    DAL d = new DAL();

    /**
     * Creates new form addBook
     */
    public addBook() {
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

        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbLanguage = new javax.swing.JComboBox<>();
        txtBookTitle = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPublishDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 181, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_back_arrow_48px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 360, -1, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img (1).jpeg"))); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 410));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Book Title");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, -1, 20));

        cmbLanguage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Farsi", "Pashto", "English", "Turkey", "France", "Spanish" }));
        jPanel3.add(cmbLanguage, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, 200, -1));

        txtBookTitle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBookTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBookTitleKeyPressed(evt);
            }
        });
        jPanel3.add(txtBookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 100, 200, -1));

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel3.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 300, 80, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 80, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Author");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, 20));

        txtAuthor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 200, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Language");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, 20));

        txtPublishDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(txtPublishDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, 200, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Publish Date");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, -1, 20));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1040, 410));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_cancel_48px.png"))); // NOI18N
        jLabel1.setText("X");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 50, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel2.setText("دانشگاه کابل");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel4.setText("Kabul University");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 340, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/images (2).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_books_100px_1.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ican/icons8_book_80px.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new Library().show();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        txtBookTitle.setText("");
        txtAuthor.setText("");
        txtPublishDate.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        String bookTitle = txtBookTitle.getText();
        String Author = txtAuthor.getText();
        String language = cmbLanguage.getSelectedItem().toString();
        String publishDate = txtPublishDate.getText();

        try {
            d.connect();
            if (!bookTitle.equals("") && !Author.equals("") && !language.equals("") && !publishDate.equals("")){
                d.insert("INSERT INTO book VALUES (NULL, '"+ bookTitle +"', '"+ Author +"', '"+ language +"', '"+ publishDate +"')");
            btnResetActionPerformed(null);
            }else{
                d.showMsg("Something is wrong, try again!");
            }
            

        } catch (Exception e) {
            d.showMsg("Please enter valid record!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtBookTitleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBookTitleKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookTitleKeyPressed

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
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JComboBox<String> cmbLanguage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookTitle;
    private javax.swing.JTextField txtPublishDate;
    // End of variables declaration//GEN-END:variables
}