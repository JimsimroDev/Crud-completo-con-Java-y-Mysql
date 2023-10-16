package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.Rol;
import com.kejhoma.appindigenas.logica.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BdUsuarios extends javax.swing.JPanel {
    
    int id_usuarios;
    Controladora control;
    User usr;

    public BdUsuarios() {
        initComponents();

        control = new Controladora();
        this.usr = usr;

        cargarTabla();

        estilos();
    }

    private void estilos() {
        btnCrear.putClientProperty("JButton.buttonType", "roundRect");
        btnEditar.putClientProperty("JButton.buttonType", "roundRect");
        btnEliminar.putClientProperty("JButton.buttonType", "roundRect");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        contenedor2 = new LIB.JEImagePanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();

        jScrollPane1.setOpaque(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setOpaque(false);

        contenedor2.setOpaque(false);

        tablaUsuarios.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        tablaUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaUsuarios.setRowHeight(30);
        tablaUsuarios.setSelectionBackground(new java.awt.Color(99, 163, 189));
        tablaUsuarios.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tablaUsuarios.setShowGrid(true);
        jScrollPane3.setViewportView(tablaUsuarios);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0,50));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eiminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(86, 174, 244,50));
        btnEditar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEditarMouseExited(evt);
            }
        });
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(86, 174, 244,50));
        btnCrear.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setText("Crear nuevo usuario");
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCrearMouseExited(evt);
            }
        });
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedor2Layout = new javax.swing.GroupLayout(contenedor2);
        contenedor2.setLayout(contenedor2Layout);
        contenedor2Layout.setHorizontalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(145, 145, 145)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(161, 161, 161)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );
        contenedor2Layout.setVerticalGroup(
            contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedor2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Validar que la tabla tenga registro
        if (tablaUsuarios.getRowCount() > 0) {
            //Conteolar que se haya seleccionado un elemento
            if (tablaUsuarios.getSelectedRow() != -1) {

                //debo seleccionar el id que desio borrar
                int id_usuarios = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
                //llamo el metodo para borrar
                control.borrarUsuarios(id_usuarios);
                //avisar al usuario que se borro correctamente
                JOptionPane.showMessageDialog(null, "El Elemento selecionado se a Eliminado");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debes elegir un elemento a elminar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Tabla esta vacia");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
//        CrearUsuarios crear = new CrearUsuarios(control,usr);  
//        crear.setVisible(true);
//        crear.setLocationRelativeTo(null);

        CrearUsu crear = new CrearUsu(control, usr);
        crear.setSize(870, 580);
        crear.setLocation(0, 0);

        contenedor2.removeAll();
        contenedor2.add(crear, BorderLayout.CENTER);
        contenedor2.revalidate();
        contenedor2.repaint();

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Validar que la tabla tenga registro
        if (tablaUsuarios.getRowCount() > 0) {
            //Conteolar que se haya seleccionado un elemento
            if (tablaUsuarios.getSelectedRow() != -1) {

                //debo seleccionar el id que desio borrar
                int id_usuarios = Integer.parseInt(String.valueOf(tablaUsuarios.getValueAt(tablaUsuarios.getSelectedRow(), 0)));
                //llamo el metodo para borrar
                EditarUsu editar = new EditarUsu( control,  usr, id_usuarios);
                editar.setSize(870, 580);
                editar.setLocation(0, 0);

                contenedor2.removeAll();
                contenedor2.add(editar, BorderLayout.CENTER);
                contenedor2.revalidate();
                contenedor2.repaint();
                //avisar al usuario que se borro correctamente
                //JOptionPane.showMessageDialog(null, "El Elemento selecionado se a Editar");
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debes elegir un elemento a Editar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Tabla esta vacia");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCrearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseEntered
        btnCrear.setForeground(new java.awt.Color(250, 250, 250));
        btnCrear.setBackground(new java.awt.Color(86, 174, 244));
    }//GEN-LAST:event_btnCrearMouseEntered

    private void btnCrearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearMouseExited
        btnCrear.setForeground(new java.awt.Color(0, 0, 0));
        btnCrear.setBackground(new java.awt.Color(86, 174, 244,50));
    }//GEN-LAST:event_btnCrearMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setForeground(new java.awt.Color(250, 250, 250));
        btnEditar.setBackground(new java.awt.Color(86, 174, 244));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setBackground(new java.awt.Color(86, 174, 244,50));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setForeground(new java.awt.Color(250, 250, 250));
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setBackground(new java.awt.Color(255, 0, 0,50));
    }//GEN-LAST:event_btnEliminarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private LIB.JEImagePanel contenedor2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };

        String[] titulos = {
            "ID",
            "Usuario",
            "Rol",};
        modeloTabla.setColumnIdentifiers(titulos);

        //Traer de la base de datos la lista de Usuarios
        List<User> listaUsuarios = control.traerUsuarios();

        //modelo las fechas para que salgan de manera corecta
        //SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        if (listaUsuarios != null) {
            for (User usu : listaUsuarios) {

                Object[] objeto = {
                    usu.getId(),
                    usu.getNombreUsu(),
                    usu.getUnRol().getNombreRol()
                };
                modeloTabla.addRow(objeto);
            }
        }

        tablaUsuarios.setModel(modeloTabla);

    }

}
