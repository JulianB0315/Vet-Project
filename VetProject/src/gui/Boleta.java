package gui;

import java.awt.Color;
import java.awt.print.PrinterException;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DB.ConexionOracle;

public class Boleta extends javax.swing.JFrame {
    private String idCliente;
    private String dueño;
    private String mascota;
    private Double peso;
    private String especie;
    private int edad;
    private String telefono;

    public Boleta(String idCliente, String dueño, String mascota, double peso, String especie, String tPrimario,String tSegundario, int edad, String telefono) {
        initComponents();
        this.setTitle("Vet Link - Boleta");
        String textoBoleta =    
        "*****************************************\n" +
        "*          BOLETA VETERINARIA           *\n" +
        "*****************************************\n\n" +
        String.format("%-20s : %s\n", "ID Cliente", idCliente) +
        String.format("%-20s : %s\n", "Dueño", dueño) +
        String.format("%-20s : %s\n", "Mascota", mascota) +
        String.format("%-20s : %s kg\n", "Peso", peso) +
        String.format("%-20s : %s\n", "Especie", especie) +
        String.format("%-20s : %s\n", "Tratamiento Primario", tPrimario) +
        String.format("%-20s : %s\n", "Tratamiento Secundario", tSegundario) +
        String.format("%-20s : %s \n", "Edad", edad) +
        String.format("%-20s : %s\n", "Teléfono", telefono) +
        "*****************************************";

        txtBoleta.setText(textoBoleta);
        this.edad = edad;
        this.idCliente = idCliente;
        this.dueño = dueño;
        this.mascota = mascota;
        this.peso = peso;
        this.especie = especie;
        this.telefono = telefono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainBoleta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtBoleta = new javax.swing.JTextArea();
        btnAccept = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMainBoleta.setBackground(new java.awt.Color(86, 168, 124));
        panelMainBoleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBoleta.setEditable(false);
        txtBoleta.setBackground(new java.awt.Color(217, 227, 234));
        txtBoleta.setColumns(20);
        txtBoleta.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        txtBoleta.setForeground(new java.awt.Color(13, 92, 141));
        txtBoleta.setRows(5);
        txtBoleta.setBorder(null);
        jScrollPane2.setViewportView(txtBoleta);

        panelMainBoleta.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 400, 690));

        btnAccept.setBackground(new java.awt.Color(13, 92, 141));
        btnAccept.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Aceptar");
        btnAccept.setToolTipText("");
        btnAccept.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.white));
        btnAccept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAcceptMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAcceptMouseExited(evt);
            }
        });
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        panelMainBoleta.add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 730, 180, 40));

        btnPrint.setBackground(new java.awt.Color(121, 180, 211));
        btnPrint.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(0, 51, 153));
        btnPrint.setText("Imprimir");
        btnPrint.setToolTipText("");
        btnPrint.setBorder(null);
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrintMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrintMouseExited(evt);
            }
        });
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });
        panelMainBoleta.add(btnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 730, 170, 40));

        getContentPane().add(panelMainBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAcceptMouseEntered
        btnAccept.setBackground(new Color(121, 180, 211));
    }// GEN-LAST:event_btnAcceptMouseEntered

    private void btnAcceptMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnAcceptMouseExited
        btnAccept.setBackground(new Color(13, 92, 141));
    }// GEN-LAST:event_btnAcceptMouseExited

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAcceptActionPerformed
        String idMascota = generarID();
        String veterinario = "00000001";
        try (Connection conn = ConexionOracle.getConnection()) {
            // tabla Cliente
            String sqlDueño = "INSERT INTO CLIENTE (CLIENTE_ID, NOMBRE, TELEFONO) VALUES (?, ?, ?)";
            PreparedStatement due = conn.prepareStatement(sqlDueño);
            due.setString(1, idCliente);
            due.setString(2, dueño);
            due.setString(3, telefono);
            due.executeQuery();

            // Tabla mascota
            String sqlMascota = "INSERT INTO MASCOTA (MASCOTA_ID, NOMBRE, ESPECIE, EDAD, PESO, CLIENTE_ID, VETERINARIO_ID) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement mas = conn.prepareStatement(sqlMascota);
            mas.setString(1, idMascota);
            mas.setString(2, mascota);
            mas.setString(3, especie);
            mas.setInt(4, edad);
            mas.setDouble(5, peso);
            mas.setString(6, idCliente);
            mas.setString(7, veterinario);
            mas.executeQuery();
            
            JOptionPane.showMessageDialog(null, "Registro insertado con exito", "Felicidades", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_btnAcceptActionPerformed

    private void btnPrintMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnPrintMouseEntered
        btnPrint.setBackground(new Color(202, 210, 210));
    }// GEN-LAST:event_btnPrintMouseEntered

    private void btnPrintMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btnPrintMouseExited
        btnPrint.setBackground(new Color(121, 180, 211));
    }// GEN-LAST:event_btnPrintMouseExited

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPrintActionPerformed
        // Impresión de la boleta
        try {
            txtBoleta.print();
        } catch (PrinterException ex) {
            Logger.getLogger(Boleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_btnPrintActionPerformed

    // Método privado para generar el ID
    private static String generarID() {
        int ID_LENGTH = 8;
        SecureRandom random = new SecureRandom();
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(ID_LENGTH);

        for (int i = 0; i < ID_LENGTH; i++) {
            int index = random.nextInt(CHARACTERS.length());
            sb.append(CHARACTERS.charAt(index));
        }

        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnPrint;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelMainBoleta;
    private javax.swing.JTextArea txtBoleta;
    // End of variables declaration//GEN-END:variables
}
