package gui;

import DB.ConexionOracle;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RegistroConsulta extends javax.swing.JFrame {

    public RegistroConsulta() {
        initComponents();
        this.setTitle("Vet Link - Registrar Consulta");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRegistro = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        panelLogo = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
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
        labelTelf = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        separador8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRegistro.setBackground(new java.awt.Color(151, 189, 183));
        panelRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logocircle.png"))); // NOI18N
        panelRegistro.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 180, 190));

        panelLogo.setBackground(new java.awt.Color(243, 244, 247));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow-left-solid.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1008, Short.MAX_VALUE))
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVolver)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        panelRegistro.add(panelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 100));

        labelDueño.setBackground(new java.awt.Color(13, 92, 141));
        labelDueño.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelDueño.setForeground(new java.awt.Color(13, 92, 141));
        labelDueño.setText("Dueño:");
        labelDueño.setToolTipText("");
        panelRegistro.add(labelDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtDueño.setBackground(new java.awt.Color(151, 189, 183));
        txtDueño.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDueño.setForeground(new java.awt.Color(13, 92, 141));
        txtDueño.setBorder(null);
        txtDueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDueñoActionPerformed(evt);
            }
        });
        panelRegistro.add(txtDueño, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 270, 40));

        separador1.setBackground(new java.awt.Color(13, 92, 141));
        separador1.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 270, 10));

        labelMascot.setBackground(new java.awt.Color(13, 92, 141));
        labelMascot.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelMascot.setForeground(new java.awt.Color(13, 92, 141));
        labelMascot.setText("Mascota:");
        labelMascot.setToolTipText("");
        panelRegistro.add(labelMascot, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        txtMascota.setBackground(new java.awt.Color(151, 189, 183));
        txtMascota.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtMascota.setForeground(new java.awt.Color(13, 92, 141));
        txtMascota.setBorder(null);
        txtMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMascotaActionPerformed(evt);
            }
        });
        panelRegistro.add(txtMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 270, 40));

        separador4.setBackground(new java.awt.Color(13, 92, 141));
        separador4.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 270, 10));

        labelEdad.setBackground(new java.awt.Color(13, 92, 141));
        labelEdad.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelEdad.setForeground(new java.awt.Color(13, 92, 141));
        labelEdad.setText("Edad:");
        labelEdad.setToolTipText("");
        panelRegistro.add(labelEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        txtEdad.setBackground(new java.awt.Color(151, 189, 183));
        txtEdad.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(13, 92, 141));
        txtEdad.setBorder(null);
        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });
        panelRegistro.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 270, 40));

        separador3.setBackground(new java.awt.Color(13, 92, 141));
        separador3.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 270, 10));

        labelPeso.setBackground(new java.awt.Color(13, 92, 141));
        labelPeso.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(13, 92, 141));
        labelPeso.setText("Peso:");
        labelPeso.setToolTipText("");
        panelRegistro.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        txtPeso.setBackground(new java.awt.Color(151, 189, 183));
        txtPeso.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(13, 92, 141));
        txtPeso.setBorder(null);
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        panelRegistro.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 270, 40));

        separador5.setBackground(new java.awt.Color(13, 92, 141));
        separador5.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 270, 10));

        labelTPrim.setBackground(new java.awt.Color(13, 92, 141));
        labelTPrim.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTPrim.setForeground(new java.awt.Color(13, 92, 141));
        labelTPrim.setText("Tratamientos primarios:");
        labelTPrim.setToolTipText("");
        panelRegistro.add(labelTPrim, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        separador6.setBackground(new java.awt.Color(13, 92, 141));
        separador6.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 270, 10));

        cbxTPrim.setBackground(new java.awt.Color(151, 189, 183));
        cbxTPrim.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxTPrim.setForeground(new java.awt.Color(13, 92, 141));
        cbxTPrim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Vacunación", "Desparasitación", "Esterilización", "Urgencias", "Cirugía" }));
        panelRegistro.add(cbxTPrim, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 270, 40));

        separador2.setBackground(new java.awt.Color(13, 92, 141));
        separador2.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 270, 10));

        labelTSec.setBackground(new java.awt.Color(13, 92, 141));
        labelTSec.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTSec.setForeground(new java.awt.Color(13, 92, 141));
        labelTSec.setText("Tratamientos secundarios:");
        labelTSec.setToolTipText("");
        panelRegistro.add(labelTSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, -1, -1));

        cbxTSec.setBackground(new java.awt.Color(151, 189, 183));
        cbxTSec.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxTSec.setForeground(new java.awt.Color(13, 92, 141));
        cbxTSec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Cuidado Dental", "Baño medicado", "Corte de pelo", "Corte de uñas", "Adiestramiento" }));
        panelRegistro.add(cbxTSec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 270, 40));

        jSeparator7.setBackground(new java.awt.Color(13, 92, 141));
        jSeparator7.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 270, 10));

        labelEspecie.setBackground(new java.awt.Color(13, 92, 141));
        labelEspecie.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelEspecie.setForeground(new java.awt.Color(13, 92, 141));
        labelEspecie.setText("Especie:");
        labelEspecie.setToolTipText("");
        panelRegistro.add(labelEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));

        cbxEspecie.setBackground(new java.awt.Color(151, 189, 183));
        cbxEspecie.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxEspecie.setForeground(new java.awt.Color(13, 92, 141));
        cbxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perro", "Gato", "Conejo", "Cuy", "Pajaro", "Reptil" }));
        panelRegistro.add(cbxEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 270, 40));

        btnExit.setBackground(new java.awt.Color(121, 180, 211));
        btnExit.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(13, 92, 141));
        btnExit.setText("Salir");
        btnExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(121, 180, 211), 3, true));
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
        panelRegistro.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 660, 270, 50));

        btnCancel.setBackground(new java.awt.Color(121, 180, 211));
        btnCancel.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(13, 92, 141));
        btnCancel.setText("Cancelar");
        btnCancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(121, 180, 211), 3, true));
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
        panelRegistro.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 600, 270, 50));

        btnRegistro.setBackground(new java.awt.Color(13, 92, 141));
        btnRegistro.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistro.setText("Registrar");
        btnRegistro.setBorder(null);
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
        panelRegistro.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 270, 50));

        labelTiempo.setBackground(new java.awt.Color(13, 92, 141));
        labelTiempo.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTiempo.setForeground(new java.awt.Color(13, 92, 141));
        labelTiempo.setText("Tiempo:");
        labelTiempo.setToolTipText("");
        panelRegistro.add(labelTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        cbxTiempo.setBackground(new java.awt.Color(151, 189, 183));
        cbxTiempo.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        cbxTiempo.setForeground(new java.awt.Color(13, 92, 141));
        cbxTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Años", "Meses" }));
        panelRegistro.add(cbxTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 270, 40));

        separador7.setBackground(new java.awt.Color(13, 92, 141));
        separador7.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 10));

        labelTelf.setBackground(new java.awt.Color(13, 92, 141));
        labelTelf.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelTelf.setForeground(new java.awt.Color(13, 92, 141));
        labelTelf.setText("Teléfono:");
        labelTelf.setToolTipText("");
        panelRegistro.add(labelTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        txtTelf.setBackground(new java.awt.Color(151, 189, 183));
        txtTelf.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtTelf.setForeground(new java.awt.Color(13, 92, 141));
        txtTelf.setBorder(null);
        panelRegistro.add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 270, 40));

        separador8.setBackground(new java.awt.Color(13, 92, 141));
        separador8.setForeground(new java.awt.Color(13, 92, 141));
        panelRegistro.add(separador8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 270, 10));

        getContentPane().add(panelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked

    }//GEN-LAST:event_btnCancelMouseClicked

    private void txtDueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDueñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDueñoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        InicioVet inicio = new InicioVet();
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtMascotaActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {
        //Limpiar todos los datos
        txtDueño.setText("");
        txtMascota.setText("");
        txtTelf.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        cbxTPrim.setSelectedItem("Ninguno");
        cbxTSec.setSelectedItem("Ninguno");
    }

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {
        btnRegistro.setBackground(new Color(121, 180, 211));
    }

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {
        btnRegistro.setBackground(new Color(13, 92, 141));
    }

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {
        btnCancel.setBackground(new Color(202, 210, 210));
    }

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {
        btnCancel.setBackground(new Color(13, 92, 141));
    }

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {
        btnExit.setBackground(new Color(202, 210, 210));
    }

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {
        btnExit.setBackground(new Color(13, 92, 141));
    }

    //Metodo para generar el id unico de la mascotita
    private String generateIdMascota() {
        //Usa la fecha y la hora para el id (por si las moscas)
        return "MASC" + System.currentTimeMillis();
    }

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {
        // Recuperar los datos del formulario
        String idCliente = generateIdCliente(); // Asumo que tienes un método para generar el ID del cliente
        String dueño = txtDueño.getText();
        String mascota = txtMascota.getText();
        String pesoString = txtPeso.getText();
        String especie = (String) cbxEspecie.getSelectedItem();
        String TPrimario = (String) cbxTPrim.getSelectedItem();
        String TSegundario = (String) cbxTSec.getSelectedItem();
        String edadString = txtEdad.getText();
        String telefono = txtTelf.getText();

        // Validaciones (tal como las tienes actualmente)
        if (!edadString.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Ingresar una edad válida", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String STiempo = (String) cbxTiempo.getSelectedItem();
        switch (STiempo) {
            case "Meses":
                if (Integer.parseInt(edadString) > 11) {
                    JOptionPane.showMessageDialog(null, "Ingresar una edad válida", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                break;
            case "Años":
                if (Integer.parseInt(edadString) > 18) {
                    JOptionPane.showMessageDialog(null, "Ingresar una edad válida", "Error", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingresar edad de la mascota");
                return;
        }

        if (!pesoString.matches("\\d+(\\.\\d+)?")) {
            JOptionPane.showMessageDialog(null, "Ingresar un peso válido", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!dueño.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Ingresar un nombre válido", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!mascota.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Ingresar un nombre válido para la mascota", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!telefono.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "Número inválido", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (dueño.isEmpty() || mascota.isEmpty() || pesoString.isEmpty() || especie.isEmpty() || TPrimario.isEmpty() || edadString.isEmpty() || STiempo.isEmpty() || telefono.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor completar todos los datos", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int edad = Integer.parseInt(edadString);
        double peso = Double.parseDouble(pesoString);

        // Confirmación del registro
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirmar registro de los datos?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            // Guardar en la base de datos
            try {
                Connection conn = ConexionOracle.getConnection(); // Asegúrate de tener una conexión válida

                // Inserción en la tabla CLIENTE
                String sqlCliente = "INSERT INTO CLIENTE (cliente_id, nombre, telefono) VALUES (?, ?, ?)";
                PreparedStatement psCliente = conn.prepareStatement(sqlCliente);
                psCliente.setString(1, idCliente);
                psCliente.setString(2, dueño);
                psCliente.setString(3, telefono);
                psCliente.executeUpdate();

                // Inserción en la tabla MASCOTA
                String sqlMascota = "INSERT INTO MASCOTA (mascota_id, cliente_id, nombre, especie, peso, edad, tipo_primario, tipo_secundario) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement psMascota = conn.prepareStatement(sqlMascota);
                psMascota.setString(1, generateIdMascota()); // Genera el ID de la mascota
                psMascota.setString(2, idCliente);
                psMascota.setString(3, mascota);
                psMascota.setString(4, especie);
                psMascota.setDouble(5, peso);
                psMascota.setInt(6, edad);
                psMascota.setString(7, TPrimario);
                psMascota.setString(8, TSegundario);
                psMascota.executeUpdate();

                JOptionPane.showMessageDialog(null, "Registro exitoso.");

                // Esto para la boleta 
                Boleta boleta = new Boleta(idCliente, dueño, mascota, peso, especie, TPrimario, TSegundario, edad, telefono);
                boleta.setVisible(true);
                boleta.setLocationRelativeTo(null);
                this.dispose();

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar los datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        int x = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Veterinaria", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        }
    }

    //metodo para crear idCita
    private String generateIdCliente() {
        String characters = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();

        // Generar 8 dígitos aleatorios
        for (int i = 0; i < 8; i++) {
            int index = rnd.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnVolver;
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
    private javax.swing.JLabel labelTelf;
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
    private javax.swing.JSeparator separador8;
    private javax.swing.JTextField txtDueño;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
