package gui;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InicioVet extends javax.swing.JFrame {
    private String idVet;
    public InicioVet(String idVet) {
        initComponents();
        this.setTitle("Vet Link");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logocircle.png"));
        Image logo = icon.getImage();
        setIconImage(logo);
        this.idVet=idVet;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicioVet = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelBanner = new javax.swing.JLabel();
        labelSlogan = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelTitle1 = new javax.swing.JLabel();
        labelTitle2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegCon = new javax.swing.JMenuItem();
        menuRegVet = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuMan = new javax.swing.JMenuItem();
        menuManVet = new javax.swing.JMenuItem();
        menuBoletas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInicioVet.setBackground(new java.awt.Color(255, 255, 255));
        panelInicioVet.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logovet.png"))); // NOI18N
        panelInicioVet.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, 300, 390, 250));

        labelBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Default_Create_a_vibrant_banner_featuring_a_diverse_assembly_o_3.jpg"))); // NOI18N
        panelInicioVet.add(labelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 270));

        labelSlogan.setFont(new java.awt.Font("Calibri Light", 1, 28)); // NOI18N
        labelSlogan.setForeground(new java.awt.Color(0, 102, 102));
        labelSlogan.setText("Conecta. Cuida. Protege.");
        panelInicioVet.add(labelSlogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));

        labelTitle.setFont(new java.awt.Font("Leelawadee", 1, 70)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 102, 102));
        labelTitle.setText("VetLink");
        panelInicioVet.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        labelTitle1.setFont(new java.awt.Font("Leelawadee", 1, 70)); // NOI18N
        labelTitle1.setForeground(new java.awt.Color(0, 102, 102));
        labelTitle1.setText("Bienvenido");
        panelInicioVet.add(labelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));

        labelTitle2.setFont(new java.awt.Font("Leelawadee", 1, 70)); // NOI18N
        labelTitle2.setForeground(new java.awt.Color(0, 102, 102));
        labelTitle2.setText("a");
        panelInicioVet.add(labelTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        getContentPane().add(panelInicioVet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 630));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(0, 102, 102));
        jMenu1.setText("Registros");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuRegCon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRegCon.setBackground(new java.awt.Color(255, 255, 255));
        menuRegCon.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        menuRegCon.setForeground(new java.awt.Color(0, 102, 102));
        menuRegCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/scroll-solid.png"))); // NOI18N
        menuRegCon.setText("Registrar Consulta");
        menuRegCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRegCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegConActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegCon);

        menuRegVet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuRegVet.setBackground(new java.awt.Color(255, 255, 255));
        menuRegVet.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        menuRegVet.setForeground(new java.awt.Color(0, 102, 102));
        menuRegVet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/address-card-solid.png"))); // NOI18N
        menuRegVet.setText("Registrar Trabajador");
        menuRegVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuRegVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegVetActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegVet);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jMenu2.setBorder(null);
        jMenu2.setForeground(new java.awt.Color(0, 102, 102));
        jMenu2.setText("Manipular");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuMan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuMan.setBackground(new java.awt.Color(255, 255, 255));
        menuMan.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        menuMan.setForeground(new java.awt.Color(0, 102, 102));
        menuMan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/database-solid.png"))); // NOI18N
        menuMan.setText("Manipular Datos");
        menuMan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManActionPerformed(evt);
            }
        });
        jMenu2.add(menuMan);

        menuManVet.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuManVet.setBackground(new java.awt.Color(255, 255, 255));
        menuManVet.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        menuManVet.setForeground(new java.awt.Color(0, 102, 102));
        menuManVet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/database-solid.png"))); // NOI18N
        menuManVet.setText("Manipular datos Veterinario");
        menuManVet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuManVet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManVetActionPerformed(evt);
            }
        });
        jMenu2.add(menuManVet);

        menuBoletas.setBackground(new java.awt.Color(255, 255, 255));
        menuBoletas.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        menuBoletas.setForeground(new java.awt.Color(0, 102, 102));
        menuBoletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/database-solid.png"))); // NOI18N
        menuBoletas.setText("Boletas ");
        menuBoletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBoletasActionPerformed(evt);
            }
        });
        jMenu2.add(menuBoletas);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jMenu3.setForeground(new java.awt.Color(0, 102, 102));
        jMenu3.setText("Salir");
        jMenu3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuExit.setBackground(new java.awt.Color(255, 255, 255));
        menuExit.setFont(new java.awt.Font("Leelawadee", 0, 18)); // NOI18N
        menuExit.setForeground(new java.awt.Color(0, 102, 102));
        menuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/door-open-solid.png"))); // NOI18N
        menuExit.setText("Salir");
        menuExit.setToolTipText("");
        menuExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        jMenu3.add(menuExit);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Desea Salir?", "Veterinaria", JOptionPane.YES_NO_OPTION);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuExitActionPerformed

    private void menuRegVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegVetActionPerformed
        RegistroVets vets = new RegistroVets(idVet);
        vets.setVisible(true);
        vets.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuRegVetActionPerformed

    private void menuRegConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegConActionPerformed
        RegistroConsulta cons = new RegistroConsulta(idVet);
        cons.setVisible(true);
        cons.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_menuRegConActionPerformed

    private void menuManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManActionPerformed
        Manipulacion man=new Manipulacion(idVet);
        man.setLocationRelativeTo(null);
        man.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuManActionPerformed

    private void menuManVetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManVetActionPerformed
        ManipulacionVets man=new ManipulacionVets(idVet);
        man.setLocationRelativeTo(null);
        man.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_menuManVetActionPerformed

    private void menuBoletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBoletasActionPerformed
      VistaBoleta pBoleta = new VistaBoleta(idVet);
      pBoleta.setVisible(true);
      pBoleta.setLocationRelativeTo(null);
      this.dispose();
    }//GEN-LAST:event_menuBoletasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelBanner;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelSlogan;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JLabel labelTitle2;
    private javax.swing.JMenuItem menuBoletas;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenuItem menuMan;
    private javax.swing.JMenuItem menuManVet;
    private javax.swing.JMenuItem menuRegCon;
    private javax.swing.JMenuItem menuRegVet;
    private javax.swing.JPanel panelInicioVet;
    // End of variables declaration//GEN-END:variables
}
