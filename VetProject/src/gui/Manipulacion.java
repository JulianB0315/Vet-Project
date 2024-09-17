package gui;

import DB.ConexionOracle;
import java.awt.Color;
import gui.InicioVet;
import java.awt.Image;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Manipulacion extends javax.swing.JFrame {

    DefaultTableModel mt = new DefaultTableModel();
    private String idVete;
    public Manipulacion(String idVet) {
        initComponents();
        String IDS[] = {"Nombre", "Telefono", "Edad Mascota", "Peso Mascota"}; //"Nombre Veterinario", "Apellido Veterinario", "Telefono Veterinario", "Especialidad Veterinario"}; //Aca va tambien lo de su mascota
        mt.setColumnIdentifiers(IDS);
        tabla.setModel(mt);
        this.setTitle("Vet Link - Manipular Datos");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idVete=idVet;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(151, 189, 183));
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 92, 141));
        jLabel1.setText("Manipulación de Datos");
        panelMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 540, -1));

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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabla);

        panelMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 910, 370));

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
        panelMain.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 190, 50));

        btnUpdate.setBackground(new java.awt.Color(13, 92, 141));
        btnUpdate.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Actualizar");
        btnUpdate.setToolTipText("");
        btnUpdate.setBorder(null);
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnUpdateMousePressed(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        panelMain.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 190, 50));

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
        panelMain.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 190, 50));

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow-left-solid.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setContentAreaFilled(false);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelMain.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 954, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        btnUpdate.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered
        btnDel.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnDelMouseEntered

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        btnUpdate.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseExited
        btnDel.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnDelMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Veterinaria", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
        InicioVet inicio = new InicioVet(idVete);
        inicio.setVisible(true);
        inicio.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
    int filaSeleccionada = tabla.getSelectedRow();

    if (filaSeleccionada >= 0) {
        // Obtenemos el ClienteID de la fila seleccionada
        String clienteID = (String) mt.getValueAt(filaSeleccionada, 0);
        
        // Confirmación antes de eliminar
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirmacion == JOptionPane.YES_OPTION) {
            Connection conn = null;
            PreparedStatement psMascota = null;
            PreparedStatement psCliente = null;
            
            try {
                conn = ConexionOracle.getConnection(); // Asegúrate de tener una conexión válida
                
                // Este es la query para eliminar de la tabla mascotas
                String sqlMascota = "DELETE FROM MASCOTA WHERE cliente_id=?";
                psMascota = conn.prepareStatement(sqlMascota);
                psMascota.setString(1, clienteID);
                psMascota.executeUpdate();
                
                // Este es el query para eliminar de la tabla clientes
                String sqlCliente = "DELETE FROM CLIENTE WHERE cliente_id=?";
                psCliente = conn.prepareStatement(sqlCliente);
                psCliente.setString(1, clienteID);
                psCliente.executeUpdate();
                
                // Eliminación exitosa
                mt.removeRow(filaSeleccionada);
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
            } finally {
                try {
                    if (psMascota != null) psMascota.close();
                    if (psCliente != null) psCliente.close();
                    if (conn != null) conn.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para eliminar.");
    }
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int filaSeleccionada = tabla.getSelectedRow();

        if (filaSeleccionada >= 0) {
            // Obtenemos los valores de la fila seleccionada
            String nuevoClienteID = (String) mt.getValueAt(filaSeleccionada, 0);
            String nuevoNombre = (String) mt.getValueAt(filaSeleccionada, 2);
            String nuevoTelefono = (String) mt.getValueAt(filaSeleccionada, 3);
            String nuevaEdad = (String) mt.getValueAt(filaSeleccionada, 5);
            String nuevoPeso = (String) mt.getValueAt(filaSeleccionada, 6);

            try {
                Connection conn = ConexionOracle.getConnection(); 
                //Esste es para el cliente papus
                String sqlCliente = "UPDATE CLIENTE SET nombre=?, telefono=? WHERE cliente_id=?";
                PreparedStatement psCliente = conn.prepareStatement(sqlCliente);
                psCliente.setString(2, nuevoNombre);
                psCliente.setString(3, nuevoTelefono);
                psCliente.setString(4, nuevoClienteID);
                psCliente.executeUpdate();

                // Este para actualizar la mascota
                String sqlMascota = "UPDATE MASCOTA SET edad=?, peso=? WHERE cliente_id=?";
                PreparedStatement psMascota = conn.prepareStatement(sqlMascota);
                psMascota.setString(2, nuevaEdad);
                psMascota.setString(3, nuevoPeso);
                psMascota.setString(4, nuevoClienteID);
                psMascota.executeUpdate();

                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al actualizar los datos: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para actualizar.");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
