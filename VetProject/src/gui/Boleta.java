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
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PrinterJob;
import java.awt.print.Printable;
import java.awt.print.PageFormat;
public class Boleta extends javax.swing.JFrame {
    private String idCliente;
    private String dueño;
    private String mascota;
    private Double peso;
    private String especie;
    private int edad;
    private String telefono;

    public Boleta(String idCliente, String dueño, String mascota, double peso, String especie, String tPrimario,
            String tSegundario, int edad, String telefono) {
        initComponents();
        this.setTitle("Vet Link - Boleta");
        String textoBoleta = "<html>" +
                "<head>" +
                "<style>" +
                "body { font-family: Arial, sans-serif; font-size: 12px; margin: 20px; }" +
                "h1 { font-size: 24px; text-align: center; margin-bottom: 20px; }" +
                "table { width: 100%; border-collapse: collapse; margin-bottom: 20px; }" +
                "th, td { border: 1px solid #ddd; padding: 10px; text-align: left; }" +
                "th { background-color: #f4f4f4; }" +
                "tr:nth-child(even) { background-color: #f9f9f9; }" +
                "caption { font-size: 18px; font-weight: bold; margin: 10px 0; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<h1>Boleta Veterinaria</h1>" +
                "<table>" +
                "<caption>Detalles de la Mascota</caption>" +
                "<tr><th>ID Cliente:</th><td>" + idCliente + "</td></tr>" +
                "<tr><th>Dueño:</th><td>" + dueño + "</td></tr>" +
                "<tr><th>Mascota:</th><td>" + mascota + "</td></tr>" +
                "<tr><th>Peso:</th><td>" + peso + " kg</td></tr>" +
                "<tr><th>Especie:</th><td>" + especie + "</td></tr>" +
                "<tr><th>Tratamiento Primario:</th><td>" + tPrimario + "</td></tr>" +
                "<tr><th>Tratamiento Secundario:</th><td>" + tSegundario + "</td></tr>" +
                "<tr><th>Edad:</th><td>" + edad + " años</td></tr>" +
                "<tr><th>Teléfono:</th><td>" + telefono + "</td></tr>" +
                "</table>" +
                "</body>" +
                "</html>";

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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMainBoleta = new javax.swing.JPanel();
        btnAccept = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        txtBoleta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMainBoleta.setBackground(new java.awt.Color(86, 168, 124));
        panelMainBoleta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        txtBoleta.setBackground(new java.awt.Color(255, 255, 255));
        txtBoleta.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        txtBoleta.setForeground(new java.awt.Color(0, 102, 153));
        txtBoleta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelMainBoleta.add(txtBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 440, 670));

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
        // JULIAN TIENES QUE BORRAR ESTO PORQUE PEDRO YA HIZO LOS INSERT EN LA VENTANA ANTERIOR
        // AQUI INSERTA DATOS A LA TABLA BOLETA NOMAS
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

            JOptionPane.showMessageDialog(null, "Registro insertado con exito", "Felicidades",
                    JOptionPane.INFORMATION_MESSAGE);
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
         //Metodo para imprimir
        try {
            // Obtiene un objeto PrinterJob para gestionar la impresión
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPrintable(new Printable() {
                @Override
                public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                    if (pageIndex > 0) {
                        return NO_SUCH_PAGE;
                    }
                    Graphics2D g2d = (Graphics2D) graphics;
                    g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                    g2d.scale(0.8, 0.8);
                    txtBoleta.printAll(graphics);
                    return PAGE_EXISTS;
                }
            });
            boolean printAccepted = printerJob.printDialog();
            if (printAccepted) {
                printerJob.print(); 
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(this, "Error al imprimir: " + e.getMessage(), "Error",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
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
    private javax.swing.JPanel panelMainBoleta;
    private javax.swing.JLabel txtBoleta;
    // End of variables declaration//GEN-END:variables
}
