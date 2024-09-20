
package gui;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import DB.ConexionOracle;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.JTableHeader;

public class VistaBoleta extends javax.swing.JFrame {
private String idVete;

    public VistaBoleta(String idVete) {
        initComponents();
        this.idVete=idVete;
        JTableHeader header = tblBoleta.getTableHeader(); // Objeto y metodo para obtener el encabezado de la tabla y poder editarlo
        header.setBackground(new Color(24,183,177));  // Color de fondo del encabezado
        header.setForeground(new Color(13,82,84)); // Color para la fuente del encabezado
        header.setFont(new Font("Lewadee", Font.BOLD, 10)); // Tipo y tamaño de fuente para el encabezado
        tblBoleta.setRowHeight(25); // Asignamos una altura a las filas
        this.setTitle("Vet Link - Ver Boletas");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoleta = new javax.swing.JTable();
        btnListar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBoleta = new javax.swing.JButton();

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
        jLabel1.setText("Ver Boletas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 320, -1));

        tblBoleta.setBackground(new java.awt.Color(255, 255, 255));
        tblBoleta.setFont(new java.awt.Font("Leelawadee", 0, 12)); // NOI18N
        tblBoleta.setForeground(new java.awt.Color(13, 92, 141));
        tblBoleta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID de la Boleta", "Fecha", "ID del Cliente", "ID de la Mascota", "ID Tratamiento principal", "ID Tratamiento secundario", "Total sin IGV", "IGV", "Total", "Estado", "ID Vetenario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tblBoleta);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 940, 370));

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
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 190, 50));

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
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 510, 190, 50));

        btnBoleta.setBackground(new java.awt.Color(13, 92, 141));
        btnBoleta.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        btnBoleta.setForeground(new java.awt.Color(255, 255, 255));
        btnBoleta.setText("Ver Boleta");
        btnBoleta.setToolTipText("");
        btnBoleta.setBorder(null);
        btnBoleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBoleta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBoletaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBoletaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBoletaMousePressed(evt);
            }
        });
        btnBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoletaActionPerformed(evt);
            }
        });
        jPanel1.add(btnBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 510, 190, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 977, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // Lógica para listar los datos del veterinario
        DefaultTableModel mt = (DefaultTableModel) tblBoleta.getModel();
        mt.setRowCount(0);

        try (Connection conn = ConexionOracle.getConnection()) {
            // Consulta SQL que trae los nombres de los tratamientos
            String sql = "SELECT b.BOLETA_ID, b.FECHA, b.CLIENTE_ID, b.MASCOTA_ID,t1.NOMBRE_TRATAMIENTO AS TRATAMIENTO_PRINCIPAL, "
                       + "t2.NOMBRE_TRATAMIENTO AS TRATAMIENTO_SECUNDARIO, "
                       + "b.TOTAL_SIN_IGV, b.IGV, b.TOTAL, b.ESTADO, b.VETERINARIO_ID "
                       + "FROM BOLETA b "
                       + "LEFT JOIN TRATAMIENTO t1 ON b.TRATAMIENTO_ID_PRINCIPAL = t1.TRATAMIENTO_ID "
                       + "LEFT JOIN TRATAMIENTO t2 ON b.TRATAMIENTO_ID_SECUNDARIO = t2.TRATAMIENTO_ID";
            
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        
            
            while (rs.next()) {
                String id_Boleta = rs.getString("BOLETA_ID");
                String fecha = rs.getString("FECHA");
                String cliente = rs.getString("CLIENTE_ID");
                String mascota = rs.getString("MASCOTA_ID");
                String tratamiento_1 = rs.getString("TRATAMIENTO_PRINCIPAL");
                String tratamiento_2 = rs.getString("TRATAMIENTO_SECUNDARIO");
                String totalSinIGV = rs.getString("TOTAL_SIN_IGV");
                String IGV = rs.getString("IGV");
                String total = rs.getString("TOTAL");
                String estado = rs.getString("ESTADO");
                String veterinario = rs.getString("VETERINARIO_ID");
        
                
                Object[] fila = {id_Boleta, fecha, cliente, mascota, tratamiento_1, tratamiento_2, totalSinIGV, IGV, total, estado, veterinario};
                mt.addRow(fila);  // 
            }
        } catch (SQLException e) {
            e.printStackTrace();  
        }
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnListarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnListarMousePressed

    private void btnListarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseExited
        btnListar.setBackground(new Color(13, 92, 141));
    }//GEN-LAST:event_btnListarMouseExited

    private void btnListarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseEntered
        btnListar.setBackground(new Color(121, 180, 211));
    }//GEN-LAST:event_btnListarMouseEntered

    private void btnBoletaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletaMouseEntered

    private void btnBoletaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletaMouseExited

    private void btnBoletaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBoletaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBoletaMousePressed

    private void btnBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoletaActionPerformed
        int filaSeleccionada = tblBoleta.getSelectedRow();
        if (filaSeleccionada >=0) {
            String idCliente = tblBoleta.getValueAt(filaSeleccionada, 2).toString();
            String idMascot = tblBoleta.getValueAt(filaSeleccionada, 3).toString();
            String tPrimario =  tblBoleta.getValueAt(filaSeleccionada, 4).toString();
            String tSegundario =  tblBoleta.getValueAt(filaSeleccionada, 5).toString();
            String idVet = tblBoleta.getValueAt(filaSeleccionada, 10).toString();
            int Boton =1;
            Boleta pBoleta = new Boleta(idCliente, idMascot, tPrimario, tSegundario, idVet,Boton);
            pBoleta.setVisible(true);
            pBoleta.setLocationRelativeTo(null);
        }else{
            JOptionPane.showMessageDialog(null, "Escojer una boleta");
        }
    }//GEN-LAST:event_btnBoletaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoleta;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBoleta;
    // End of variables declaration//GEN-END:variables
}
