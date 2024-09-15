package gui;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import DB.ConexionOracle;
import java.awt.Image;

public class Registrarse extends javax.swing.JFrame {
    private String dni;
    private String idVeter;
    ImageIcon eye = new ImageIcon(getClass().getResource("/resources/eye.png"));
    ImageIcon eyeslash = new ImageIcon(getClass().getResource("/resources/eye-slash.png"));
    private boolean novisible=true;
    public Registrarse(String idVete,String dni) {
        initComponents();
        this.setTitle("Vet Link - Registrar Contraseña");
        this.dni=dni;
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idVeter=idVete;
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblRegis = new javax.swing.JLabel();
        panelForm = new javax.swing.JPanel();
        lblContra = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JPasswordField();
        btnVer = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 92, 141));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow-left-solid green.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(13, 92, 141));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegis.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        lblRegis.setForeground(new java.awt.Color(151, 189, 183));
        lblRegis.setText("Registrarse");
        jPanel2.add(lblRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 310, 90));

        panelForm.setBackground(new java.awt.Color(13, 92, 141));
        panelForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 189, 183), 3, true));
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContra.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        lblContra.setForeground(new java.awt.Color(151, 189, 183));
        lblContra.setText("Contraseña:");
        panelForm.add(lblContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 150, -1));

        txtNewPassword.setBackground(new java.awt.Color(13, 92, 141));
        txtNewPassword.setFont(new java.awt.Font("Leelawadee", 0, 24)); // NOI18N
        txtNewPassword.setForeground(new java.awt.Color(151, 189, 183));
        txtNewPassword.setToolTipText("");
        txtNewPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(28, 155, 128)));
        panelForm.add(txtNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 260, 40));

        btnVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eye-slash.png"))); // NOI18N
        btnVer.setBorder(null);
        btnVer.setContentAreaFilled(false);
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });
        panelForm.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jPanel1.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 480, 180));

        btnAcceder.setBackground(new java.awt.Color(28, 155, 128));
        btnAcceder.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Registrarse");
        btnAcceder.setBorder(null);
        btnAcceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAccederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccederMouseExited(evt);
            }
        });
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        jPanel1.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 150, 50));

        btnCancel.setBackground(new java.awt.Color(121, 180, 211));
        btnCancel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(151, 189, 183));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 189, 183), 3, true));
        btnCancel.setContentAreaFilled(false);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelMouseExited(evt);
            }
        });
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 150, 50));

        btnExit.setBackground(new java.awt.Color(121, 180, 211));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(151, 189, 183));
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(151, 189, 183), 3, true));
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 130, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        RegistroVets vets=new RegistroVets(idVeter);
        vets.setVisible(true);
        vets.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAccederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseEntered
        btnAcceder.setBackground(new Color(86, 168, 124));
    }//GEN-LAST:event_btnAccederMouseEntered

    private void btnAccederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseExited
        btnAcceder.setBackground(new Color(28,155,128));
    }//GEN-LAST:event_btnAccederMouseExited

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // Debe insertar la contraseña y el usuario, solo eso, dependiendo el dni que introduzcan.
        String contra=txtNewPassword.getText();
        
        if(contra.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor completar todos los datos", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(contra.length()<8){
           JOptionPane.showMessageDialog(null, "La contraseña tiene que ser, como mínimo de 8 dígitos","Error",JOptionPane.ERROR_MESSAGE);
       }
        else {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirmar registro de los datos?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if(confirmacion==JOptionPane.YES_OPTION){
                try (Connection conn = ConexionOracle.getConnection()){
                    String sql = "UPDATE VETERINARIO SET contraseña = ? WHERE dni=?";
                    PreparedStatement ps =conn.prepareStatement(sql);
                    ps.setString(1, contra);
                    ps.setString(2, dni);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Se completo el regsitro","felicidades",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "En completar el formulario", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked

    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtNewPassword.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int x=JOptionPane.showConfirmDialog(null, "¿Desea Salir?","Veterinaria",JOptionPane.YES_NO_OPTION );
        if(x==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        novisible=!novisible;
        if(novisible){
            btnVer.setIcon(eye);
            txtNewPassword.setEchoChar('*');
        }
        else {
            btnVer.setIcon(eyeslash);
            txtNewPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_btnVerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnVer;
    private javax.swing.JButton btnVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblContra;
    private javax.swing.JLabel lblRegis;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPasswordField txtNewPassword;
    // End of variables declaration//GEN-END:variables
}
