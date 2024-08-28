package gui;

import java.awt.Color;

public class InicioVet extends javax.swing.JFrame {
    public InicioVet() {
        initComponents();
        this.setTitle("Vet Link");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicioVet = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelBanner = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        labelSlogan = new javax.swing.JLabel();
        labelSubt = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicioVet.setBackground(new java.awt.Color(255, 255, 255));
        panelInicioVet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logovet.png"))); // NOI18N
        panelInicioVet.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 300, 390, 250));

        labelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Default_Create_a_vibrant_banner_featuring_a_diverse_assembly_o_3.jpg"))); // NOI18N
        panelInicioVet.add(labelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 270));

        btnRegistro.setBackground(new java.awt.Color(28, 155, 128));
        btnRegistro.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(217, 227, 234));
        btnRegistro.setText("Registrar Consulta");
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegistroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnRegistroMouseReleased(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelInicioVet.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 450, 270, 80));

        labelSlogan.setFont(new java.awt.Font("Calibri Light", 1, 28)); // NOI18N
        labelSlogan.setForeground(new java.awt.Color(0, 102, 102));
        labelSlogan.setText("Conecta. Cuida. Protege.");
        panelInicioVet.add(labelSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        labelSubt.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        labelSubt.setForeground(new java.awt.Color(0, 102, 102));
        labelSubt.setText("Registre su Consulta");
        panelInicioVet.add(labelSubt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        labelTitle.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 102, 102));
        labelTitle.setText("Bienvenido a VetLink");
        panelInicioVet.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        getContentPane().add(panelInicioVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        RegistroConsulta register = new RegistroConsulta();
        register.setVisible(true);
        register.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
        btnRegistro.setBackground(new Color(86, 168, 124));
    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        btnRegistro.setBackground(new Color(28,155,128));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void btnRegistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMousePressed
        
    }//GEN-LAST:event_btnRegistroMousePressed

    private void btnRegistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseReleased
       
    }//GEN-LAST:event_btnRegistroMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel labelBanner;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSlogan;
    private javax.swing.JLabel labelSubt;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel panelInicioVet;
    // End of variables declaration//GEN-END:variables
}
