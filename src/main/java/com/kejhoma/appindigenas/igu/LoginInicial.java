package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.User;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class LoginInicial extends javax.swing.JFrame {

    Controladora control = null;

    public LoginInicial() {

        control = new Controladora();

        initComponents();

        setIconImage(getIconImage());

        estilos();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/sombreroIni.png"));
        return retValue;
    }

    private void estilos() {
        btnIngresar.putClientProperty("JButton.buttonType", "roundRect");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jEImagePanel1 = new LIB.JEImagePanel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        jEImagePanel3 = new LIB.JEImagePanel();
        txtUsuario = new LIB.JTexfieldPH_FielTex();
        jEImagePanel2 = new LIB.JEImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jEImagePanel4 = new LIB.JEImagePanel();
        btnIngresar = new javax.swing.JButton();
        txtContrasenia = new LIB.JTexfieldPH_Password();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sombrero.png"))); // NOI18N
        jEImagePanel1.setName(""); // NOI18N
        jEImagePanel1.setLayout(new java.awt.GridBagLayout());

        jPanelTransparente1.setLayout(new java.awt.GridBagLayout());

        jEImagePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel3Layout = new javax.swing.GroupLayout(jEImagePanel3);
        jEImagePanel3.setLayout(jEImagePanel3Layout);
        jEImagePanel3Layout.setHorizontalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jEImagePanel3Layout.setVerticalGroup(
            jEImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(78, 80, 0, 0);
        jPanelTransparente1.add(jEImagePanel3, gridBagConstraints);

        txtUsuario.setBackground(new Color(0,0,0,0));
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setToolTipText("");
        txtUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtUsuario.setName(""); // NOI18N
        txtUsuario.setOpaque(false);
        txtUsuario.setPhColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setPlaceholder("       Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 249;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(79, 80, 0, 70);
        jPanelTransparente1.add(txtUsuario, gridBagConstraints);

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.ipady = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 0);
        jPanelTransparente1.add(jEImagePanel2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 60, 0, 0);
        jPanelTransparente1.add(jLabel1, gridBagConstraints);

        jEImagePanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/passworV.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel4Layout = new javax.swing.GroupLayout(jEImagePanel4);
        jEImagePanel4.setLayout(jEImagePanel4Layout);
        jEImagePanel4Layout.setHorizontalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jEImagePanel4Layout.setVerticalGroup(
            jEImagePanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 80, 0, 0);
        jPanelTransparente1.add(jEImagePanel4, gridBagConstraints);

        btnIngresar.setBackground(new java.awt.Color(86, 174, 244,50));
        btnIngresar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 204, 204));
        btnIngresar.setText("Ingresar");
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 10, 28, 0);
        jPanelTransparente1.add(btnIngresar, gridBagConstraints);

        txtContrasenia.setBackground(new Color(0,0,0,0));
        txtContrasenia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasenia.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        txtContrasenia.setOpaque(false);
        txtContrasenia.setPhColor(new java.awt.Color(204, 255, 204));
        txtContrasenia.setPlaceholder("     Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 239;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(55, 80, 0, 0);
        jPanelTransparente1.add(txtContrasenia, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -199;
        gridBagConstraints.ipady = -138;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jEImagePanel1.add(jPanelTransparente1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String usuario = txtUsuario.getText();
        String contrasena = txtContrasenia.getText();
        User usr = control.validarUsuario(usuario, contrasena);

        if (usr != null) {
            String rol = usr.getUnRol().getNombreRol();

            if (rol.equals("administrador")) {
                JOptionPane.showMessageDialog(null, "Bienvenido!....");
                BdIndigenas panta = new BdIndigenas(control, usr);
                panta.setVisible(true);
                panta.setLocationRelativeTo(null);
                this.dispose();
            }
            if (rol.equals("usuario")) {
                JOptionPane.showMessageDialog(null, "Bienvenido!....");
                PantallaUsuarios pUser = new PantallaUsuarios(control, usr);
                pUser.setVisible(true);
                pUser.setLocationRelativeTo(null);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o Clave invalida intenta de nuevo!....");
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        btnIngresar.setForeground(Color.white);
        btnIngresar.setBackground(new Color(86, 174, 244));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        btnIngresar.setForeground(new Color(0,204,204));
        btnIngresar.setBackground(new Color(86, 174, 244,50));
    }//GEN-LAST:event_btnIngresarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel3;
    private LIB.JEImagePanel jEImagePanel4;
    private javax.swing.JLabel jLabel1;
    private LIB.JPanelTransparente jPanelTransparente1;
    private LIB.JTexfieldPH_Password txtContrasenia;
    private LIB.JTexfieldPH_FielTex txtUsuario;
    // End of variables declaration//GEN-END:variables
}
