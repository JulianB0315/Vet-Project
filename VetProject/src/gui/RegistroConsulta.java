package gui;

import java.awt.Color;

public class RegistroConsulta extends javax.swing.JFrame {

    public RegistroConsulta() {
        initComponents();
        this.setTitle("Vet Link - Registro Consulta");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        labelDueño = new javax.swing.JLabel();
        txtDueño = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        labelMascot = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        separador4 = new javax.swing.JSeparator();
        labelEdad = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        labelPeso = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        separador5 = new javax.swing.JSeparator();
        labelTPrim = new javax.swing.JLabel();
        separador6 = new javax.swing.JSeparator();
        cbxTPrim = new javax.swing.JComboBox<>();
        separador2 = new javax.swing.JSeparator();
        labelTSec = new javax.swing.JLabel();
        cbxTSec = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();
        labelEspecie = new javax.swing.JLabel();
        cbxEspecie = new javax.swing.JComboBox<>();
        btnExit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        labelTiempo = new javax.swing.JLabel();
        cbxTiempo = new javax.swing.JComboBox<>();
        separador7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBackground(new java.awt.Color(151, 189, 183));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logocircle.png"))); // NOI18N
        panelRegistro.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 190));

        panelLogo.setBackground(new java.awt.Color(243, 244, 247));

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelRegistro.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        labelDueño.setBackground(new java.awt.Color(13, 92, 141));
        labelDueño.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelDueño.setForeground(new java.awt.Color(13, 92, 141));
        labelDueño.setText("Dueño:");
        labelDueño.setToolTipText("");
        panelRegistro.add(labelDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtDueño.setBackground(new java.awt.Color(151, 189, 183));
        txtDueño.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDueño.setForeground(new java.awt.Color(13, 92, 141));
        txtDueño.setBorder(null);
        panelRegistro.add(txtDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 270, 40));

        separador1.setBackground(new java.awt.Color(13, 92, 141));
        separador1.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 270, 10));

        labelMascot.setBackground(new java.awt.Color(13, 92, 141));
        labelMascot.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelMascot.setForeground(new java.awt.Color(13, 92, 141));
        labelMascot.setText("Mascota:");
        labelMascot.setToolTipText("");
        panelRegistro.add(labelMascot, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        txtMascota.setBackground(new java.awt.Color(151, 189, 183));
        txtMascota.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtMascota.setForeground(new java.awt.Color(13, 92, 141));
        txtMascota.setBorder(null);
        txtMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMascotaActionPerformed(evt);
            }
        });
        panelRegistro.add(txtMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 270, 40));

        separador4.setBackground(new java.awt.Color(13, 92, 141));
        separador4.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 270, 10));

        labelEdad.setBackground(new java.awt.Color(13, 92, 141));
        labelEdad.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelEdad.setForeground(new java.awt.Color(13, 92, 141));
        labelEdad.setText("Edad:");
        labelEdad.setToolTipText("");
        panelRegistro.add(labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, -1, -1));

        txtEdad.setBackground(new java.awt.Color(151, 189, 183));
        txtEdad.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(13, 92, 141));
        txtEdad.setBorder(null);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        panelRegistro.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, 270, 40));

        separador3.setBackground(new java.awt.Color(13, 92, 141));
        separador3.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 270, 10));

        labelPeso.setBackground(new java.awt.Color(13, 92, 141));
        labelPeso.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(13, 92, 141));
        labelPeso.setText("Peso:");
        labelPeso.setToolTipText("");
        panelRegistro.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, -1, -1));

        txtPeso.setBackground(new java.awt.Color(151, 189, 183));
        txtPeso.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(13, 92, 141));
        txtPeso.setBorder(null);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        panelRegistro.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 270, 40));

        separador5.setBackground(new java.awt.Color(13, 92, 141));
        separador5.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 270, 10));

        labelTPrim.setBackground(new java.awt.Color(13, 92, 141));
        labelTPrim.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTPrim.setForeground(new java.awt.Color(13, 92, 141));
        labelTPrim.setText("Tratamientos primarios:");
        labelTPrim.setToolTipText("");
        panelRegistro.add(labelTPrim, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, -1, -1));

        separador6.setBackground(new java.awt.Color(13, 92, 141));
        separador6.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 270, 10));

        cbxTPrim.setBackground(new java.awt.Color(151, 189, 183));
        cbxTPrim.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxTPrim.setForeground(new java.awt.Color(13, 92, 141));
        cbxTPrim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Vacunación", "Desparasitación", "Esterilización", "Urgencias", "Cirugía" }));
        panelRegistro.add(cbxTPrim, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 270, 40));

        separador2.setBackground(new java.awt.Color(13, 92, 141));
        separador2.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 270, 10));

        labelTSec.setBackground(new java.awt.Color(13, 92, 141));
        labelTSec.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTSec.setForeground(new java.awt.Color(13, 92, 141));
        labelTSec.setText("Tratamientos secundarios:");
        labelTSec.setToolTipText("");
        panelRegistro.add(labelTSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, -1, -1));

        cbxTSec.setBackground(new java.awt.Color(151, 189, 183));
        cbxTSec.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxTSec.setForeground(new java.awt.Color(13, 92, 141));
        cbxTSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Cuidado Dental", "Baño medicado", "Corte de pelo", "Corte de uñas", "Adiestramiento" }));
        panelRegistro.add(cbxTSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, 270, 40));

        jSeparator7.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator7.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 270, 10));

        labelEspecie.setBackground(new java.awt.Color(13, 92, 141));
        labelEspecie.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelEspecie.setForeground(new java.awt.Color(13, 92, 141));
        labelEspecie.setText("Especie:");
        labelEspecie.setToolTipText("");
        panelRegistro.add(labelEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        cbxEspecie.setBackground(new java.awt.Color(151, 189, 183));
        cbxEspecie.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxEspecie.setForeground(new java.awt.Color(13, 92, 141));
        cbxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Conejo", "Cuy", "Pajaro", "Reptil" }));
        panelRegistro.add(cbxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 270, 40));

        btnExit.setBackground(new java.awt.Color(121, 180, 211));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(0, 51, 153));
        btnExit.setText("Salir");
        btnExit.setBorder(null);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        panelRegistro.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, 260, 50));

        btnCancel.setBackground(new java.awt.Color(121, 180, 211));
        btnCancel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 51, 153));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(null);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
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
        panelRegistro.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 260, 50));

        btnRegistro.setBackground(new java.awt.Color(13, 92, 141));
        btnRegistro.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrar");
        btnRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroMouseExited(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        panelRegistro.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 260, 50));

        labelTiempo.setBackground(new java.awt.Color(13, 92, 141));
        labelTiempo.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(13, 92, 141));
        labelTiempo.setText("Tiempo:");
        labelTiempo.setToolTipText("");
        panelRegistro.add(labelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, -1));

        cbxTiempo.setBackground(new java.awt.Color(151, 189, 183));
        cbxTiempo.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxTiempo.setForeground(new java.awt.Color(13, 92, 141));
        cbxTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Años", "Meses" }));
        panelRegistro.add(cbxTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 270, 40));

        separador7.setBackground(new java.awt.Color(13, 92, 141));
        separador7.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 270, 10));

        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMascotaActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
       btnRegistro.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        btnRegistro.setBackground(new Color(13,92,141));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        btnCancel.setBackground(new Color(202, 210, 210));
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
       btnCancel.setBackground(new Color(121,180,211));
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(new Color(202, 210, 210));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
       btnExit.setBackground(new Color(121,180,211));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
       Boleta boleta=new Boleta();
       boleta.setVisible(true);
       boleta.setLocationRelativeTo(null);
       this.dispose();
    }//GEN-LAST:event_btnRegistroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbxEspecie;
    private javax.swing.JComboBox<String> cbxTPrim;
    private javax.swing.JComboBox<String> cbxTSec;
    private javax.swing.JComboBox<String> cbxTiempo;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelDueño;
    private javax.swing.JLabel labelEdad;
    private javax.swing.JLabel labelEspecie;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelMascot;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelTPrim;
    private javax.swing.JLabel labelTSec;
    private javax.swing.JLabel labelTiempo;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSeparator separador3;
    private javax.swing.JSeparator separador4;
    private javax.swing.JSeparator separador5;
    private javax.swing.JSeparator separador6;
    private javax.swing.JSeparator separador7;
    private javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
