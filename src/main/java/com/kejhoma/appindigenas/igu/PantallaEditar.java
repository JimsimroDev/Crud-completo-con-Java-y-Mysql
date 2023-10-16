package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.Indigenas;
import com.kejhoma.appindigenas.logica.User;
import javax.swing.JOptionPane;

public class PantallaEditar extends javax.swing.JPanel {

    int id_indigenas;
    Controladora control;
    User usr;
    Indigenas indi;

    public PantallaEditar(Controladora control, User usr, int id_indigenas) {

        control = new Controladora();

        this.control = control;
        this.usr = usr;

        initComponents();

        this.id_indigenas = id_indigenas;

        estilos();

        //Buscar los datos y los cargo a la interfaz con el metodo para traer los indigenas
        indi = control.traerIndigena(id_indigenas);
        txtNumeroDoc.setText(String.valueOf(indi.getNumeroDoc()));
        txtNombre.setText(indi.getNombre());
        txtApellido.setText(indi.getApellido());
        txtFechaNac.setText(indi.getFecha_nac());
        cmbTipoDoc.setSelectedItem(indi.getTipoDoc());

        //cargo tipo doc de forma generica
//        String tipoDoc = indi.getTipoDoc();
//        int candidadItems = cmbTipoDoc.getItemCount();
//        for(int i = 0; i < candidadItems; i++){
//            if(String.valueOf(cmbTipoDoc.getItemAt(i)).equals("tipoDoc")){
//               cmbTipoDoc.setSelectedIndex(i);
//            }
//        }
    }

    private void estilos() {
        btnGuarda.putClientProperty("JButton.buttonType", "roundRect");
        btnLimpiar.putClientProperty("JButton.buttonType", "roundRect");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEImagePanel2 = new LIB.JEImagePanel();
        jPanelTransparente1 = new LIB.JPanelTransparente();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtNumeroDoc = new javax.swing.JTextField();
        cmbTipoDoc = new javax.swing.JComboBox<>();
        btnGuarda = new javax.swing.JButton();

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/indigenasCauca.png"))); // NOI18N

        jPanelTransparente1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Agregar Integrantes Indigenas a la BD");
        jPanelTransparente1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 410, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha de nacimiento");
        jPanelTransparente1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 160, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Apellidos");
        jPanelTransparente1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 160, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombres");
        jPanelTransparente1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Numero De Documento");
        jPanelTransparente1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 180, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tipo De Documento");
        jPanelTransparente1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 160, 30));

        txtNombre.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtNombre.setName(""); // NOI18N
        txtNombre.setOpaque(false);
        jPanelTransparente1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 210, 30));

        txtApellido.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(0, 204, 204));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtApellido.setName(""); // NOI18N
        txtApellido.setOpaque(false);
        jPanelTransparente1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 210, 30));

        txtFechaNac.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtFechaNac.setForeground(new java.awt.Color(0, 204, 204));
        txtFechaNac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaNac.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtFechaNac.setName("nacimi"); // NOI18N
        txtFechaNac.setOpaque(false);
        jPanelTransparente1.add(txtFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 210, 30));

        txtNumeroDoc.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        txtNumeroDoc.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroDoc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumeroDoc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtNumeroDoc.setOpaque(false);
        jPanelTransparente1.add(txtNumeroDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 210, 30));

        cmbTipoDoc.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        cmbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elige Una Opcion", "Cédula de Ciudadanía:", "Tarjeta de Identidad:", "Registro Civil:" }));
        cmbTipoDoc.setBorder(null);
        cmbTipoDoc.setOpaque(false);
        jPanelTransparente1.add(cmbTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 210, 30));

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

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel2Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEImagePanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanelTransparente1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEImagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        cmbTipoDoc.setSelectedItem(0);
        txtNumeroDoc.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtFechaNac.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaActionPerformed
        String tipoDoc = (String) cmbTipoDoc.getSelectedItem();
        int numeroDoc = Integer.parseInt(txtNumeroDoc.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String fechaNac = txtFechaNac.getText();

        control.editarIndigena(indi, tipoDoc, numeroDoc, nombre, apellido, fechaNac);
        JOptionPane.showMessageDialog(null, "Integrante editado correctamente");

        BdIndigenas princ = new BdIndigenas(control, usr);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);

    }//GEN-LAST:event_btnGuardaActionPerformed

    private void btnGuardaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardaMouseEntered
        btnGuarda.setForeground(new java.awt.Color(250, 250, 250));
    }//GEN-LAST:event_btnGuardaMouseEntered

    private void btnGuardaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardaMouseExited
        btnGuarda.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnGuardaMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setForeground(new java.awt.Color(250, 250, 250));
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnLimpiarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuarda;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbTipoDoc;
    private LIB.JEImagePanel jEImagePanel2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private LIB.JPanelTransparente jPanelTransparente1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroDoc;
    // End of variables declaration//GEN-END:variables
}
