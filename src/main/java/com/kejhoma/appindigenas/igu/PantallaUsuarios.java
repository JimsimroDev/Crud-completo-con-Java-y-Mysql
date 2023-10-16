package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.Indigenas;
import com.kejhoma.appindigenas.logica.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class PantallaUsuarios extends javax.swing.JFrame {

    Controladora control;
    User usr;

    public PantallaUsuarios(Controladora control, User usr) {

        initComponents();

        this.control = control;
        this.usr = usr;

        estilos();

    }

    private void estilos() {
        btnCerrarSesion.putClientProperty("JButton.buttonType", "roundRect");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTransparente1 = new LIB.JPanelTransparente();
        jEImagePanel1 = new LIB.JEImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIndigenas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        btnCerrarSesion = new javax.swing.JButton();

        javax.swing.GroupLayout jPanelTransparente1Layout = new javax.swing.GroupLayout(jPanelTransparente1);
        jPanelTransparente1.setLayout(jPanelTransparente1Layout);
        jPanelTransparente1Layout.setHorizontalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanelTransparente1Layout.setVerticalGroup(
            jPanelTransparente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jEImagePanel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhoan\\OneDrive\\Escritorio\\indigenas.png")); // NOI18N

        tablaIndigenas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tablaIndigenas.setForeground(new java.awt.Color(255, 255, 255));
        tablaIndigenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaIndigenas.setGridColor(new java.awt.Color(0, 0, 0));
        tablaIndigenas.setSelectionBackground(new java.awt.Color(153, 255, 255));
        tablaIndigenas.setSelectionForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tablaIndigenas);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BASE DE DATOS INDIGENAS");

        txtUser.setEditable(false);
        txtUser.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("jTextField1");
        txtUser.setBorder(null);
        txtUser.setOpaque(false);

        btnCerrarSesion.setBackground(new java.awt.Color(255, 204, 255));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 204, 204));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon("C:\\Users\\jhoan\\OneDrive\\Escritorio\\exitB.png")); // NOI18N
        btnCerrarSesion.setText("cerrar sesión");
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCerrarSesion.setIconTextGap(20);
        btnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\jhoan\\OneDrive\\Escritorio\\exit.png")); // NOI18N
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
        });
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(362, 362, 362)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126)
                .addComponent(txtUser))
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1)
                .addGap(57, 57, 57))
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(430, 430, 430))
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEImagePanel1Layout.createSequentialGroup()
                .addGroup(jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEImagePanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtUser.setText(usr.getNombreUsu());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setForeground(new java.awt.Color(0, 204, 204));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        LoginInicial inicial = new LoginInicial();
        inicial.setVisible(true);
        inicial.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private LIB.JEImagePanel jEImagePanel1;
    private javax.swing.JLabel jLabel1;
    private LIB.JPanelTransparente jPanelTransparente1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaIndigenas;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //Tituos de la tabla

        String[] titulos = {
            "Tipo De Documento",
            "Numero de Documento",
            "Nombre",
            "Apellido",
            "<html>Fecha Nacimiento<br>año-mes-dia</html>"};

        modeloTabla.setColumnIdentifiers(titulos);

        //Traer de la base de datos la lista de Usuarios
        List<Indigenas> listaIndigenas = control.traerIndigenas();

        //le doy formato a las fechas
        //SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy MM DD");
        if (listaIndigenas != null) {
            //recorro la lista
            for (Indigenas indi : listaIndigenas) {

                Object[] objecto = {
                    indi.getTipoDoc(),
                    indi.getNumeroDoc(),
                    indi.getNombre(),
                    indi.getApellido(),
                    indi.getFecha_nac()
                };

                modeloTabla.addRow(objecto);
            }

        }

        tablaIndigenas.setModel(modeloTabla);

    }
}
