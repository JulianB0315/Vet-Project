package gui;

import DB.ConexionOracle;
import java.awt.Color;
import gui.InicioVet;
import java.sql.ResultSet;
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Manipulacion extends javax.swing.JFrame {

    
    private String idVete;

    public Manipulacion(String idVet) {
        initComponents();
        
        
        this.setTitle("Vet Link - Manipular Datos");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idVete = idVet;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDAto = new javax.swing.JTable();
        btnSalir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMain.setBackground(new java.awt.Color(151, 189, 183));
        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(13, 92, 141));
        jLabel1.setText("Manipulación de Datos");
        panelMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 540, -1));

        tblDAto.setBackground(new java.awt.Color(255, 255, 255));
        tblDAto.setForeground(new java.awt.Color(13, 92, 141));
        tblDAto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Cliente", "Nombres", "Telefono", "ID Mascota", "Edad", "Peso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDAto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblDAto);

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
        panelMain.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 510, 190, 50));

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
        panelMain.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 190, 50));

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
        panelMain.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 510, 190, 50));

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
        panelMain.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 190, 50));

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

    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseEntered
        btnListar.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnListarMouseEntered

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered
        btnDel.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnDelMouseEntered

    private void btnListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarMousePressed

    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseExited
        btnListar.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnListarMouseExited

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
        int filaSeleccionada = tblDAto.getSelectedRow();

        if (filaSeleccionada >= 0) {
            String id_cliente =tblDAto.getValueAt(filaSeleccionada, 0).toString();

            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar este registro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                Connection conn = null;
                PreparedStatement psMascota = null;
                PreparedStatement psCliente = null;

                try {
                    conn = ConexionOracle.getConnection();

                    // Este es el query para eliminar de la tabla mascotas
                    String sqlMascota = "DELETE FROM MASCOTA WHERE cliente_id=?";
                    psMascota = conn.prepareStatement(sqlMascota);
                    psMascota.setString(1, id_cliente);
                    psMascota.executeUpdate();

                    // Este es el query para eliminar de la tabla clientes
                    String sqlCliente = "DELETE FROM CLIENTE WHERE cliente_id=?";
                    psCliente = conn.prepareStatement(sqlCliente);
                    psCliente.setString(1, id_cliente);
                     psCliente.executeUpdate();

                    // Eliminación exitosa
                    
                    JOptionPane.showMessageDialog(null, "Registro eliminado correctamente.");
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar el registro: " + e.getMessage());
                } finally {
                    // Asegúrate de cerrar PreparedStatement y Connection
                    try {
                        if (psMascota != null) {
                            psMascota.close();
                        }
                        if (psCliente != null) {
                            psCliente.close();
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

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        DefaultTableModel mt = (DefaultTableModel) tblDAto.getModel();
        mt.setRowCount(0);

        try (Connection conn = ConexionOracle.getConnection()) {
            // La query para jalar los datos
            String sql = "SELECT C.cliente_id, C.nombre AS nombre_cliente, C.telefono, " +
                       "M.mascota_id, M.edad, M.peso " +
                       "FROM CLIENTE C " +
                       "JOIN MASCOTA M ON C.cliente_id = M.cliente_id";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            //llenar las tablitas
            while (rs.next()) {
                String id_cliente = rs.getString("cliente_id");
                String nombreCliente = rs.getString("nombre_cliente");
                String telefonoCliente = rs.getString("telefono");
                String id_mascota = rs.getString("mascota_id");
                int edadMascota = rs.getInt("edad");
                double pesoMascota = rs.getDouble("peso");

                Object[] fila = {id_cliente,nombreCliente, telefonoCliente,id_mascota, edadMascota, pesoMascota};
                mt.addRow(fila); // Agregar la fila al modelo de la tabla
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos: " + e.getMessage(), "Vet Link - Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnUpdateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateMousePressed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int filaSeleccionada = tblDAto.getSelectedRow();

        if (filaSeleccionada >= 0) {
            // Obtenemos los valores de la fila seleccionada
            String id_cliente =tblDAto.getValueAt(filaSeleccionada, 0).toString();
            String nombre =tblDAto.getValueAt(filaSeleccionada, 1).toString();
            String telefono = tblDAto.getValueAt(filaSeleccionada, 2).toString();
            String edad =  tblDAto.getValueAt(filaSeleccionada, 4).toString();
            String peso = tblDAto.getValueAt(filaSeleccionada, 5).toString();
            int edadin = Integer.parseInt(edad);
            Double pesoDouble = Double.parseDouble(peso); 
            try {
                Connection conn = ConexionOracle.getConnection();
                //Esste es para el cliente papus
                String sqlCliente = "UPDATE CLIENTE SET nombre=?, telefono=? WHERE cliente_id=?";
                PreparedStatement psCliente = conn.prepareStatement(sqlCliente);
                psCliente.setString(1, nombre);
                psCliente.setString(2, telefono);
                psCliente.setString(3, id_cliente);
                psCliente.executeUpdate();

                // Este para actualizar la mascota
                String sqlMascota = "UPDATE MASCOTA SET edad=?, peso=? WHERE cliente_id=?";
                PreparedStatement psMascota = conn.prepareStatement(sqlMascota);
                psMascota.setInt(1, edadin);
                psMascota.setDouble(2, pesoDouble);
                psMascota.setString(3, id_cliente);
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
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTable tblDAto;
    // End of variables declaration//GEN-END:variables
}
