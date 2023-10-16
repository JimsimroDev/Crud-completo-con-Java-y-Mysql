package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.Rol;
import com.kejhoma.appindigenas.logica.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;

public class CrearUsu extends javax.swing.JPanel {

    Controladora control;
    User usr;

    public CrearUsu(Controladora control, User usr) {

        this.control = control;
        this.usr = usr;

        initComponents();

        estilos();

        List<Rol> listaRoles = control.traerRoles();

        if (listaRoles != null) {
            for (Rol rol : listaRoles) {
                cmbRol.addItem(rol.getNombreRol());
            }
        }
    }

    private void estilos() {
        btnGuarda.putClientProperty("JButton.buttonType", "roundRect");
        btnLimpiar.putClientProperty("JButton.buttonType", "roundRect");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contieneUsuarios = new LIB.JEImagePanel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        btnGuarda = new javax.swing.JButton();
        txtContrasenia = new LIB.JTexfieldPH_Password();
        txtUsuario = new LIB.JTexfieldPH_FielTex();

        contieneUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/indigenasCauca.png"))); // NOI18N

        jPanelTransparente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLimpiar.setBackground(new Color(86, 174, 244,50));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 140, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Crear un nuevo usuario");
        jPanelTransparente1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 380, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña");
        jPanelTransparente1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre De Usuario");
        jPanelTransparente1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Rol");
        jPanelTransparente1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 110, 30));

        cmbRol.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige una opcion" }));
        cmbRol.setOpaque(false);
        jPanelTransparente1.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 210, -1));

        btnGuarda.setBackground(new Color(86, 174, 244,50));
        btnGuarda.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        btnGuarda.setForeground(new java.awt.Color(0, 0, 0));
        btnGuarda.setText("Guardar");
        btnGuarda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardaMouseExited(evt);
            }
        });
        btnGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaActionPerformed(evt);
            }
        });
        jPanelTransparente1.add(btnGuarda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 140, -1));

        txtContrasenia.setBackground(new Color(0,0,0,0));
        txtContrasenia.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtContrasenia.setForeground(new java.awt.Color(0, 204, 204));
        txtContrasenia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasenia.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtContrasenia.setOpaque(false);
        txtContrasenia.setPhColor(new java.awt.Color(255, 255, 255));
        txtContrasenia.setPlaceholder("Contraseña");
        jPanelTransparente1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, 30));

        txtUsuario.setBackground(new Color(0,0,0,0));
        txtUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtUsuario.setForeground(new java.awt.Color(0, 204, 204));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtUsuario.setOpaque(false);
        txtUsuario.setPhColor(new java.awt.Color(255, 255, 255));
        txtUsuario.setPlaceholder("Usuario");
        jPanelTransparente1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, 30));

        javax.swing.GroupLayout contieneUsuariosLayout = new javax.swing.GroupLayout(contieneUsuarios);
        contieneUsuarios.setLayout(contieneUsuariosLayout);
        contieneUsuariosLayout.setHorizontalGroup(
            contieneUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contieneUsuariosLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        contieneUsuariosLayout.setVerticalGroup(
            contieneUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contieneUsuariosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contieneUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contieneUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 562, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cmbRol.setSelectedItem(0);
        txtUsuario.setText("");
        txtContrasenia.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
        
        if(txtUsuario.getText().isEmpty() || txtContrasenia.getText().isEmpty() ||cmbRol.getSelectedIndex()==0){
        JOptionPane.showMessageDialog(jPanelTransparente1, "Debes llenar todos campos");
    }else{
        
        String rol = (String) cmbRol.getSelectedItem();
        String usuario = txtUsuario.getText();
        String contra = txtContrasenia.getText();

        control.crearUsuario(usuario, contra, rol);
//        
        JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
//        txtUsuario.setText("");
//        txtContrasenia.setText("");
        BdUsuarios mostrarU = new BdUsuarios();
        mostrarU.setSize(870, 580);
        mostrarU.setLocation(0, 0);

        contieneUsuarios.removeAll();
        contieneUsuarios.add(mostrarU, BorderLayout.CENTER);
        contieneUsuarios.revalidate();
        contieneUsuarios.repaint();
        
        }

    }//GEN-LAST:event_btnGuardaActionPerformed

    private void btnGuardaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardaMouseEntered
        btnGuarda.setForeground(Color.white);
        btnGuarda.setBackground(new Color(86, 174, 244));
    }//GEN-LAST:event_btnGuardaMouseEntered

    private void btnGuardaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardaMouseExited
        btnGuarda.setForeground(Color.black);
        btnGuarda.setBackground(new Color(86, 174, 244,50));
    }//GEN-LAST:event_btnGuardaMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setForeground(Color.white);
        btnLimpiar.setBackground(new Color(86, 174, 244));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setForeground(Color.black);
        btnLimpiar.setBackground(new Color(86, 174, 244,50));
    }//GEN-LAST:event_btnLimpiarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbRol;
    private LIB.JEImagePanel contieneUsuarios;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private LIB.JPanelTransparente jPanelTransparente1;
    private LIB.JTexfieldPH_Password txtContrasenia;
    private LIB.JTexfieldPH_FielTex txtUsuario;
    // End of variables declaration//GEN-END:variables
}
