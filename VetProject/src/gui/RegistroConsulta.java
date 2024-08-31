package gui;

public class RegistroConsulta extends javax.swing.JFrame {

    public RegistroConsulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        labelLogo2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelTitleConsulta = new javax.swing.JLabel();
        labelDueño = new javax.swing.JLabel();
        txtDueño = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        labellDueño1 = new javax.swing.JLabel();
        TXTmascota = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        labellDueño2 = new javax.swing.JLabel();
        TXTedad = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labellDueño3 = new javax.swing.JLabel();
        TXTpeso = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        labellDueño4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        labellDueño5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBackground(new java.awt.Color(151, 189, 183));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logocircle.png"))); // NOI18N
        panelRegistro.add(labelLogo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 180, 190));

        jPanel1.setBackground(new java.awt.Color(243, 244, 247));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        panelRegistro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 100));

        labelTitleConsulta.setFont(new java.awt.Font("Leelawadee", 1, 36)); // NOI18N
        labelTitleConsulta.setForeground(new java.awt.Color(13, 92, 141));
        labelTitleConsulta.setText("Registrar Consulta");
        panelRegistro.add(labelTitleConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        labelDueño.setBackground(new java.awt.Color(13, 92, 141));
        labelDueño.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelDueño.setForeground(new java.awt.Color(13, 92, 141));
        labelDueño.setText("Dueño:");
        labelDueño.setToolTipText("");
        panelRegistro.add(labelDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        txtDueño.setBackground(new java.awt.Color(151, 189, 183));
        txtDueño.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDueño.setForeground(new java.awt.Color(13, 92, 141));
        txtDueño.setBorder(null);
        panelRegistro.add(txtDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 40));

        separador1.setBackground(new java.awt.Color(13, 92, 141));
        separador1.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 270, 10));

        labellDueño1.setBackground(new java.awt.Color(13, 92, 141));
        labellDueño1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labellDueño1.setForeground(new java.awt.Color(13, 92, 141));
        labellDueño1.setText("Mascota:");
        labellDueño1.setToolTipText("");
        panelRegistro.add(labellDueño1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        TXTmascota.setBackground(new java.awt.Color(151, 189, 183));
        TXTmascota.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        TXTmascota.setForeground(new java.awt.Color(13, 92, 141));
        TXTmascota.setBorder(null);
        TXTmascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTmascotaActionPerformed(evt);
            }
        });
        panelRegistro.add(TXTmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 270, 40));

        jSeparator2.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator2.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 270, 10));

        labellDueño2.setBackground(new java.awt.Color(13, 92, 141));
        labellDueño2.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labellDueño2.setForeground(new java.awt.Color(13, 92, 141));
        labellDueño2.setText("Edad:");
        labellDueño2.setToolTipText("");
        panelRegistro.add(labellDueño2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        TXTedad.setBackground(new java.awt.Color(151, 189, 183));
        TXTedad.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        TXTedad.setForeground(new java.awt.Color(13, 92, 141));
        TXTedad.setBorder(null);
        TXTedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTedadActionPerformed(evt);
            }
        });
        panelRegistro.add(TXTedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 270, 40));

        jSeparator3.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator3.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 270, 10));

        labellDueño3.setBackground(new java.awt.Color(13, 92, 141));
        labellDueño3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labellDueño3.setForeground(new java.awt.Color(13, 92, 141));
        labellDueño3.setText("Peso:");
        labellDueño3.setToolTipText("");
        panelRegistro.add(labellDueño3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        TXTpeso.setBackground(new java.awt.Color(151, 189, 183));
        TXTpeso.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        TXTpeso.setForeground(new java.awt.Color(13, 92, 141));
        TXTpeso.setBorder(null);
        TXTpeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTpesoActionPerformed(evt);
            }
        });
        panelRegistro.add(TXTpeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 270, 40));

        jSeparator4.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator4.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 270, 10));

        labellDueño4.setBackground(new java.awt.Color(13, 92, 141));
        labellDueño4.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labellDueño4.setForeground(new java.awt.Color(13, 92, 141));
        labellDueño4.setText("Tratamientos primarios:");
        labellDueño4.setToolTipText("");
        panelRegistro.add(labellDueño4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator5.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 270, 10));

        jComboBox1.setBackground(new java.awt.Color(151, 189, 183));
        jComboBox1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(13, 92, 141));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Vacunación", "Desparasitación", "Esterilización", "Urgencias", "Cirugía" }));
        panelRegistro.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 270, 40));

        jSeparator6.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator6.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 270, 10));

        labellDueño5.setBackground(new java.awt.Color(13, 92, 141));
        labellDueño5.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labellDueño5.setForeground(new java.awt.Color(13, 92, 141));
        labellDueño5.setText("Tratamientos primarios:");
        labellDueño5.setToolTipText("");
        panelRegistro.add(labellDueño5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(151, 189, 183));
        jComboBox2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(13, 92, 141));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Cuidado Dental", "Baño medicado", "Corte de pelo", "Corte de uñas", "Adiestramiento" }));
        panelRegistro.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 270, 40));

        jSeparator7.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator7.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 270, 10));

        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTmascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTmascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTmascotaActionPerformed

    private void TXTedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTedadActionPerformed

    private void TXTpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpesoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TXTedad;
    private javax.swing.JTextField TXTmascota;
    private javax.swing.JTextField TXTpeso;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel labelDueño;
    private javax.swing.JLabel labelLogo2;
    private javax.swing.JLabel labelTitleConsulta;
    private javax.swing.JLabel labellDueño1;
    private javax.swing.JLabel labellDueño2;
    private javax.swing.JLabel labellDueño3;
    private javax.swing.JLabel labellDueño4;
    private javax.swing.JLabel labellDueño5;
    private javax.swing.JPanel panelRegistro;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextField txtDueño;
    // End of variables declaration//GEN-END:variables
}
