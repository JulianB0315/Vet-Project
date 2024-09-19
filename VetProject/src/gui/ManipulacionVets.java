package gui;

import DB.ConexionOracle;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ManipulacionVets extends javax.swing.JFrame {

    DefaultTableModel mt = new DefaultTableModel();
    private String idVete;

    public ManipulacionVets(String idVet) {
        initComponents();
        String IDS[] = {"Nombre Veterinario", "Apellido Veterinario", "Especialidad", "Telefono"};
        mt.setColumnIdentifiers(IDS);
        tabla.setModel(mt);
        this.setTitle("Vet Link - Manipular Datos");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idVete = idVet;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(151, 189, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow-left-solid.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 92, 141));
        jLabel1.setText("Manipulación de Datos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 540, -1));

        tabla.setBackground(new java.awt.Color(255, 255, 255));
        tabla.setForeground(new java.awt.Color(13, 92, 141));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Veterinario", "Apellido Veterinario", "Especialidad", "Telefono"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 830, 370));

        btnListar.setBackground(new java.awt.Color(13, 92, 141));
        btnListar.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnListar.setForeground(new java.awt.Color(255, 255, 255));
        btnListar.setText("Listar");
        btnListar.setToolTipText("");
        btnListar.setBorder(null);
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnListarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnListarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnListarMousePressed(evt);
            }
        });
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 190, 50));

        btnDel.setBackground(new java.awt.Color(13, 92, 141));
        btnDel.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnDel.setForeground(new java.awt.Color(255, 255, 255));
        btnDel.setText("Eliminar");
        btnDel.setBorder(null);
        btnDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelMouseExited(evt);
            }
        });
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });
        jPanel1.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 190, 50));

        btnSalir.setBackground(new java.awt.Color(13, 92, 141));
        btnSalir.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(13, 92, 141));
        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(13, 92, 141), 3, true));
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 190, 50));

        btnUpdate1.setBackground(new java.awt.Color(13, 92, 141));
        btnUpdate1.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Actualizar");
        btnUpdate1.setToolTipText("");
        btnUpdate1.setBorder(null);
        btnUpdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdate1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdate1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdate1MousePressed(evt);
            }
        });
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        InicioVet inicio = new InicioVet(idVete);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseEntered
        btnListar.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnListarMouseEntered

    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseExited
        btnListar.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnListarMouseExited

    private void btnListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarMousePressed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
// Lógica para listar los datos del veterinario
        DefaultTableModel mt = (DefaultTableModel) tabla.getModel();
        mt.setRowCount(0);

        try (Connection conn = ConexionOracle.getConnection()) {
            // Consulta
            String sql = "SELECT nombre, apellidos, especialidad, telefono FROM VETERINARIO";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            // Llenar la tabla con los datos de los veterinarios
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String especialidad = rs.getString("especialidad");
                String telefono = rs.getString("telefono");

                // Agregar los datos a la tabla
                Object[] fila = {nombre, apellidos, especialidad, telefono};
                mt.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage(), "Vet Link - Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered
        btnDel.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnDelMouseEntered

    private void btnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseExited
        btnDel.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnDelMouseExited

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada >= 0) {
            // Obtenemos el veterinario_id de la fila seleccionada
            String veterinarioID = (String) mt.getValueAt(filaSeleccionada, 0);

            // Confirmación 
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                Connection conn = null;
                PreparedStatement psVeterinario = null;

                try {
                    conn = ConexionOracle.getConnection();

                    // Consulta para eliminar de la tabla veterinarios
                    String sqlVeterinario = "DELETE FROM VETERINARIO WHERE veterinario_id=?";
                    psVeterinario = conn.prepareStatement(sqlVeterinario);
                    psVeterinario.setString(1, veterinarioID);
                    psVeterinario.executeUpdate();
                    mt.removeRow(filaSeleccionada);
                    JOptionPane.showMessageDialog(null, "Registro de veterinario eliminado correctamente.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
                } finally {
                    try {
                        if (psVeterinario != null) {
                            psVeterinario.close();
                        }
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar.");
        }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Veterinaria", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnUpdate1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1MouseEntered

    private void btnUpdate1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1MouseExited

    private void btnUpdate1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdate1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1MousePressed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
