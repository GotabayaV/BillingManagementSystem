import java.sql.*;
import database.DBConnection;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gota
 */
public class updateProduct extends javax.swing.JFrame {
    Connection connection;

    /**
     * Creates new form updateProduct
     */
    public updateProduct() {
        initComponents();
        connection = DBConnection.getDBConnection().getConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        cmbActive = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        txtPName = new javax.swing.JTextField();
        txtRate = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPID = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtSearchID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(380, 200));
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Product ID");
        jLabel3.setPreferredSize(new java.awt.Dimension(66, 16));

        cmbActive.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbActive.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbActivePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Rate");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Description");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Active");

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Reset.png"))); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close Jframe.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        txtPName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPName.setForeground(java.awt.Color.gray);
        txtPName.setText("Enter Product Name");
        txtPName.setMinimumSize(new java.awt.Dimension(260, 22));
        txtPName.setPreferredSize(new java.awt.Dimension(260, 22));
        txtPName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPNameFocusLost(evt);
            }
        });
        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });

        txtRate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtRate.setForeground(java.awt.Color.gray);
        txtRate.setText("Enter Rate");
        txtRate.setMinimumSize(new java.awt.Dimension(260, 22));
        txtRate.setPreferredSize(new java.awt.Dimension(260, 22));
        txtRate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRateFocusLost(evt);
            }
        });
        txtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateActionPerformed(evt);
            }
        });

        txtDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtDescription.setForeground(java.awt.Color.gray);
        txtDescription.setText("Enter Description");
        txtDescription.setMinimumSize(new java.awt.Dimension(260, 22));
        txtDescription.setPreferredSize(new java.awt.Dimension(260, 22));
        txtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionFocusLost(evt);
            }
        });
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update product ani.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update product.png"))); // NOI18N

        lblPID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPID.setForeground(java.awt.Color.red);
        lblPID.setText("P001");

        txtSearchName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSearchName.setForeground(java.awt.Color.gray);
        txtSearchName.setText("Product Name");
        txtSearchName.setMaximumSize(new java.awt.Dimension(96, 22));
        txtSearchName.setMinimumSize(new java.awt.Dimension(96, 22));
        txtSearchName.setName(""); // NOI18N
        txtSearchName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchNameFocusLost(evt);
            }
        });
        txtSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNameActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Seatch by");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("or");

        txtSearchID.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtSearchID.setForeground(java.awt.Color.gray);
        txtSearchID.setText("ID");
        txtSearchID.setMinimumSize(new java.awt.Dimension(44, 22));
        txtSearchID.setPreferredSize(new java.awt.Dimension(44, 22));
        txtSearchID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchIDFocusLost(evt);
            }
        });
        txtSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(31, 31, 31)
                                .addComponent(txtSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbActive, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblPID, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(btnSave)
                                .addGap(45, 45, 45)
                                .addComponent(btnReset)
                                .addGap(47, 47, 47)
                                .addComponent(btnClose))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtSearchID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRate, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnClose))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbActivePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbActivePopupMenuWillBecomeInvisible
        btnSave.requestFocus();
    }//GEN-LAST:event_cmbActivePopupMenuWillBecomeInvisible

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String pid = lblPID.getText();
        String pname = txtPName.getText();
        String rate = txtRate.getText();
        String description = txtDescription.getText();
        String active = (String) cmbActive.getSelectedItem();
        int i = 0;

        try {
            Statement statement = connection.createStatement();
            i = statement.executeUpdate("update buyer set product_name =  '"+ pname +"' ,  rate = '"+ rate +"' , description =  '"+ description +"' ,  active = '"+ active +"' where product_id = '"+ pid +"'");
        } catch (SQLException e) {
            setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error!",JOptionPane.WARNING_MESSAGE);
            setAlwaysOnTop(true);
        }
        if(i == 1){
            JOptionPane.showMessageDialog(null, "Successfully updated!");
            btnResetActionPerformed(evt);
        }else{
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtSearchName.setText("Product Name");
        txtSearchName.setForeground(Color.GRAY);
        txtSearchID.setText("ID");
        txtSearchID.setForeground(Color.GRAY);
        lblPID.setText("");
        txtPName.setText("Enter Product Name");
        txtRate.setText("Enter Rate");
        txtDescription.setText("Enter Description");
        txtPName.setForeground(Color.GRAY);
        txtRate.setForeground(Color.GRAY);
        txtDescription.setForeground(Color.GRAY);
        cmbActive.setSelectedIndex(0);
        txtSearchName.requestFocus();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtPNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNameFocusGained
        if(txtPName.getText().equals("Enter Product Name")){
            txtPName.setText("");
            txtPName.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtPNameFocusGained

    private void txtPNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPNameFocusLost
        if(txtPName.getText().equals("")){
            txtPName.setText("Enter Product Name");
            txtPName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtPNameFocusLost

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        txtRate.requestFocus();
    }//GEN-LAST:event_txtPNameActionPerformed

    private void txtRateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRateFocusGained
        if(txtRate.getText().equals("Enter Rate")){
            txtRate.setText("");
            txtRate.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtRateFocusGained

    private void txtRateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRateFocusLost
        if(txtRate.getText().equals("")){
            txtRate.setText("Enter Rate");
            txtRate.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtRateFocusLost

    private void txtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateActionPerformed
        txtDescription.requestFocus();
    }//GEN-LAST:event_txtRateActionPerformed

    private void txtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusGained
        if(txtDescription.getText().equals("Enter Description")){
            txtDescription.setText("");
            txtDescription.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtDescriptionFocusGained

    private void txtDescriptionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionFocusLost
        if(txtDescription.getText().equals("")){
            txtDescription.setText("Enter Description");
            txtDescription.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtDescriptionFocusLost

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        cmbActive.requestFocus();
        cmbActive.setPopupVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String query;
        if(txtSearchID.getText().equals("ID"))
            query = "select * from product where product_name = '"+ txtSearchName.getText() +"'";
        else
            query = "select * from product where product_id = '"+ txtSearchID.getText() +"'";

        try {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            if(result.next()){
                lblPID.setText(result.getString(1));
                txtPName.setText(result.getString(2));
                txtRate.setText(result.getString(3));
                txtDescription.setText(result.getString(4));
                if(result.getString(5).equals("Yes"))
                    cmbActive.setSelectedIndex(0);
                else
                    cmbActive.setSelectedIndex(1);
            }else{
                JOptionPane.showMessageDialog(null, "Product does not exist","",1);
                txtSearchName.requestFocus();
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNameFocusGained
        if(txtSearchName.getText().equals("Product Name")){
            txtSearchName.setText("");
            txtSearchName.setForeground(Color.BLACK);
        }
            txtSearchID.setText("ID");
            txtSearchID.setForeground(Color.GRAY);
    }//GEN-LAST:event_txtSearchNameFocusGained

    private void txtSearchNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNameFocusLost
       if(txtSearchName.getText().equals("")){
            txtSearchName.setText("Product Name");
            txtSearchName.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtSearchNameFocusLost

    private void txtSearchIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchIDFocusGained
        if(txtSearchID.getText().equals("ID")){
            txtSearchID.setText("");
            txtSearchID.setForeground(Color.BLACK);
        }
            txtSearchName.setText("Product Name");
            txtSearchName.setForeground(Color.GRAY);
    }//GEN-LAST:event_txtSearchIDFocusGained

    private void txtSearchIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchIDFocusLost
        if(txtSearchID.getText().equals("")){
            txtSearchID.setText("ID");
            txtSearchID.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtSearchIDFocusLost

    private void txtSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNameActionPerformed
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtSearchNameActionPerformed

    private void txtSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIDActionPerformed
        btnSearchActionPerformed(evt);
    }//GEN-LAST:event_txtSearchIDActionPerformed

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
            java.util.logging.Logger.getLogger(updateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbActive;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblPID;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTextField txtSearchName;
    // End of variables declaration//GEN-END:variables
}
