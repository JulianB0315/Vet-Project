package gui;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import DB.ConexionOracle;
import java.awt.Image;
import javax.swing.ImageIcon;

public class RegistroVets extends javax.swing.JFrame {
    private String idVete;
    public RegistroVets(String idVet) {
        initComponents();
        this.setTitle("Vet Link - Registrar Trabajadores");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idVete=idVet;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        panelForm = new javax.swing.JPanel();
        lblNombresVet = new javax.swing.JLabel();
        txtNombresVet = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApesVet = new javax.swing.JTextField();
        lblDni = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        lblEspeciialidades = new javax.swing.JLabel();
        cmb = new javax.swing.JComboBox<>();
        lblFNac = new javax.swing.JLabel();
        lblTelf = new javax.swing.JLabel();
        txtTelf = new javax.swing.JTextField();
        dateFNac = new com.toedter.calendar.JDateChooser();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(151, 189, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logocircle.png"))); // NOI18N
        jPanel1.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 180, 190));

        jPanel2.setBackground(new java.awt.Color(243, 244, 247));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow-left-solid.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        panelForm.setBackground(new java.awt.Color(151, 189, 183));
        panelForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 92, 141), 3, true));
        panelForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombresVet.setBackground(new java.awt.Color(13, 92, 141));
        lblNombresVet.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblNombresVet.setForeground(new java.awt.Color(13, 92, 141));
        lblNombresVet.setText("Nombres:");
        lblNombresVet.setToolTipText("");
        panelForm.add(lblNombresVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNombresVet.setBackground(new java.awt.Color(151, 189, 183));
        txtNombresVet.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtNombresVet.setForeground(new java.awt.Color(13, 92, 141));
        txtNombresVet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(13, 92, 141)));
        txtNombresVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresVetActionPerformed(evt);
            }
        });
        panelForm.add(txtNombresVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 270, 40));

        lblApellidos.setBackground(new java.awt.Color(13, 92, 141));
        lblApellidos.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblApellidos.setForeground(new java.awt.Color(13, 92, 141));
        lblApellidos.setText("Apellidos:");
        lblApellidos.setToolTipText("");
        panelForm.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        txtApesVet.setBackground(new java.awt.Color(151, 189, 183));
        txtApesVet.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtApesVet.setForeground(new java.awt.Color(13, 92, 141));
        txtApesVet.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(13, 92, 141)));
        txtApesVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApesVetActionPerformed(evt);
            }
        });
        panelForm.add(txtApesVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 270, 40));

        lblDni.setBackground(new java.awt.Color(13, 92, 141));
        lblDni.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblDni.setForeground(new java.awt.Color(13, 92, 141));
        lblDni.setText("DNI:");
        lblDni.setToolTipText("");
        panelForm.add(lblDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtDni.setBackground(new java.awt.Color(151, 189, 183));
        txtDni.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(13, 92, 141));
        txtDni.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(13, 92, 141)));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        panelForm.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 270, 40));

        lblEspeciialidades.setBackground(new java.awt.Color(13, 92, 141));
        lblEspeciialidades.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblEspeciialidades.setForeground(new java.awt.Color(13, 92, 141));
        lblEspeciialidades.setText("Especialidades:");
        lblEspeciialidades.setToolTipText("");
        panelForm.add(lblEspeciialidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        cmb.setBackground(new java.awt.Color(151, 189, 183));
        cmb.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        cmb.setForeground(new java.awt.Color(13, 92, 141));
        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jefe Veterinario", "Médico General", "Secretaria", "Nutricionista" }));
        cmb.setSelectedIndex(1);
        cmb.setSelectedItem("Médico General");
        cmb.setToolTipText("");
        cmb.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(13, 92, 141)));
        panelForm.add(cmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 270, 50));

        lblFNac.setBackground(new java.awt.Color(13, 92, 141));
        lblFNac.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblFNac.setForeground(new java.awt.Color(13, 92, 141));
        lblFNac.setText("Fecha de Nacimiento:");
        lblFNac.setToolTipText("");
        panelForm.add(lblFNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, -1, -1));

        lblTelf.setBackground(new java.awt.Color(13, 92, 141));
        lblTelf.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lblTelf.setForeground(new java.awt.Color(13, 92, 141));
        lblTelf.setText("Teléfono:");
        lblTelf.setToolTipText("");
        panelForm.add(lblTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtTelf.setBackground(new java.awt.Color(151, 189, 183));
        txtTelf.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtTelf.setForeground(new java.awt.Color(13, 92, 141));
        txtTelf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(13, 92, 141)));
        txtTelf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelfActionPerformed(evt);
            }
        });
        panelForm.add(txtTelf, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 270, 40));

        dateFNac.setBackground(new java.awt.Color(151, 189, 183));
        dateFNac.setForeground(new java.awt.Color(13, 92, 141));
        panelForm.add(dateFNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 280, 30));

        jPanel1.add(panelForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 690, 400));

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
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 630, 210, 50));

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
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 210, 50));

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
        jPanel1.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresVetActionPerformed

    private void txtApesVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApesVetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApesVetActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        InicioVet inicio=new InicioVet(idVete);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void txtTelfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelfActionPerformed

    private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseClicked

    }//GEN-LAST:event_btnCancelMouseClicked

    private void btnCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseEntered

    private void btnCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelMouseExited

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtNombresVet.setText("");
        txtApesVet.setText("");
        txtDni.setText("");
        txtTelf.setText("");
        dateFNac.setDate(null);
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

    private void btnRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseEntered
       btnRegistro.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnRegistroMouseEntered

    private void btnRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseExited
        btnRegistro.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnRegistroMouseExited

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String noms=txtNombresVet.getText();
        String apes=txtApesVet.getText();
        String dni=txtDni.getText();
        String telf=txtTelf.getText();
        String esp=(String)cmb.getSelectedItem();
        Date f_nac=dateFNac.getDate();
        Calendar fNac=Calendar.getInstance();
        fNac.setTime(f_nac);
        Calendar fechaActual = Calendar.getInstance();
        int diferencia = fechaActual.get(Calendar.YEAR) - fNac.get(Calendar.YEAR);
        if(noms.isEmpty()||apes.isEmpty()||dni.isEmpty()||telf.isEmpty()||f_nac==null){
            JOptionPane.showMessageDialog(null, "Por favor completar todos los datos", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (!noms.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Ingresar un nombre válido", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Verifica que solo se ingresen caracteres para los apellidos del vet
        else if (!apes.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
            JOptionPane.showMessageDialog(null, "Ingresar apellidos válidos", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        // Verifica que solo se ingresen numeros para el telefono con un limite de 9 numeros, nada menos ni nada mas
        else if (!telf.matches("\\d{9}")) {
            JOptionPane.showMessageDialog(null, "Número de teléfono inválido", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if (!dni.matches("\\d{8}")) {
            JOptionPane.showMessageDialog(null, "El DNI solo debe contener números", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(diferencia<18){
            JOptionPane.showMessageDialog(null, "El Empleado debe ser mayor de 18 años", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Confirmar registro de los datos?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION){
            String veterinario_id=generateIdVeterinario();
               try (Connection conn = ConexionOracle.getConnection()){
                String sql = "INSERT INTO VETERINARIO (veterinario_id, nombre, apellidos, fecha_nacimiento, especialidad, telefono,dni, contraseña) VALUES (?, ?, ?, ?, ?, ?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, veterinario_id);
                ps.setString(2, noms);            
                ps.setString(3, apes);            
                ps.setDate(4, new java.sql.Date(f_nac.getTime()));         
                ps.setString(5, esp);             
                ps.setString(6, telf);       
                ps.setString(7, dni);     
                ps.setString(8," ");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se completos la primera parte del resgistro", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
                Registrarse reg=new Registrarse(idVete, dni);
                reg.setVisible(true);
                reg.setLocationRelativeTo(null);
                this.dispose();
               } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo salio mal","Error",JOptionPane.WARNING_MESSAGE);
               }
            }
        }
    }//GEN-LAST:event_btnRegistroActionPerformed
    // Nuevo metodo para id del vet, para formato
    private String generateIdVeterinario(){
        String prefijo = "VT";
        String nums = "0123456789";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(prefijo); 
        while (sb.length() < 8) {
            int index = rnd.nextInt(nums.length()); 
            sb.append(nums.charAt(index));
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmb;
    private com.toedter.calendar.JDateChooser dateFNac;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblDni;
    private javax.swing.JLabel lblEspeciialidades;
    private javax.swing.JLabel lblFNac;
    private javax.swing.JLabel lblNombresVet;
    private javax.swing.JLabel lblTelf;
    private javax.swing.JPanel panelForm;
    private javax.swing.JTextField txtApesVet;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombresVet;
    private javax.swing.JTextField txtTelf;
    // End of variables declaration//GEN-END:variables
}
