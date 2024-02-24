package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.Indigenas;
import com.kejhoma.appindigenas.logica.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BdIndigenas extends javax.swing.JFrame {

    int xMouse, yMouse;

    Controladora control;
    User usr;

    public BdIndigenas(Controladora control, User usr) {

        this.control = control;
        this.usr = usr;

        initComponents();

        setIconImage(getIconImage());
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/sombreroIni.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIndigenas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtIP1 = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnOscuro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("APP Indigenas");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        contenedor.setBackground(new java.awt.Color(153, 255, 153));
        contenedor.setMinimumSize(new java.awt.Dimension(870, 580));
        contenedor.setOpaque(false);
        contenedor.setPreferredSize(new java.awt.Dimension(870, 580));
        contenedor.setRequestFocusEnabled(false);

        tablaIndigenas.setBackground(new java.awt.Color(166, 164, 158));
        tablaIndigenas.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        tablaIndigenas.setForeground(new java.awt.Color(255, 255, 255));
        tablaIndigenas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaIndigenas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaIndigenas.setOpaque(false);
        tablaIndigenas.setRowHeight(30);
        tablaIndigenas.setSelectionBackground(new java.awt.Color(99, 163, 189));
        tablaIndigenas.setSelectionForeground(new java.awt.Color(51, 51, 51));
        tablaIndigenas.setShowGrid(false);
        jScrollPane1.setViewportView(tablaIndigenas);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0,50));
        btnEliminar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminarB.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setIconTextGap(20);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar3png.png"))); // NOI18N
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
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editarB.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setIconTextGap(20);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
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

        btnAgregar.setBackground(new java.awt.Color(86, 174, 244,50));
        btnAgregar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregarB.png"))); // NOI18N
        btnAgregar.setText("Agregar Intregante");
        btnAgregar.setBorderPainted(false);
        btnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgregar.setIconTextGap(20);
        btnAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtIP1.setEditable(false);
        txtIP1.setOpaque(true);

        txtUser.setEditable(false);
        txtUser.setBackground(new Color(0,0,0,0));
        txtUser.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        btnOscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modoDark.png"))); // NOI18N
        btnOscuro.setBorder(null);
        btnOscuro.setBorderPainted(false);
        btnOscuro.setContentAreaFilled(false);
        btnOscuro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOscuro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOscuroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btnOscuro, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1)
                .addGap(16, 16, 16)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnOscuro))
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel2.setBackground(new java.awt.Color(225, 223, 211));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        btnUsuarios.setBackground(new java.awt.Color(225, 223, 211));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Symbol", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usersBorroso.png"))); // NOI18N
        btnUsuarios.setText("Usuarios                           >");
        btnUsuarios.setBorder(null);
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setIconTextGap(20);
        btnUsuarios.setPreferredSize(new java.awt.Dimension(96, 32));
        btnUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exitB.png"))); // NOI18N
        btnCerrarSesion.setText("cerrar sesión");
        btnCerrarSesion.setBorder(null);
        btnCerrarSesion.setBorderPainted(false);
        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarSesion.setIconTextGap(20);
        btnCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit.png"))); // NOI18N
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

        btnInicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homBorro.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setBorder(null);
        btnInicio.setBorderPainted(false);
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setIconTextGap(40);
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(166, 164, 158));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setFocusPainted(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnExit)
                .addGap(21, 21, 21)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 887, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Calendar cal = Calendar.getInstance();
        this.txtUser.setText(usr.getNombreUsu() + " | Fecha: " + cal.getTime() +  "|");
        InetAddress inetAddress;
        try {
            inetAddress = InetAddress.getLocalHost();
        this.txtIP1.setText(" IP de la maquina " + inetAddress.getHostAddress());
        } catch (UnknownHostException ex) {
            Logger.getLogger(BdIndigenas.class.getName()).log(Level.SEVERE, null, ex);
        }
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        BdIndigenas indi = new BdIndigenas(control, usr);
        indi.setVisible(true);
        indi.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int mensaje = JOptionPane.YES_NO_OPTION;
        int mensa = JOptionPane.showConfirmDialog(null, "Seguro que desea cerrar sesion?", "SALIR", mensaje);

        if (mensa == 0) {
            LoginInicial inicial = new LoginInicial();
            inicial.setVisible(true);
            inicial.setLocationRelativeTo(null);
            this.dispose();
        }

    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        PantallaAgregar agrgar = new PantallaAgregar(control, usr);
        agrgar.setSize(870, 580);
        //agrgar.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(agrgar, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed

        BdUsuarios mostrarU = new BdUsuarios();
        mostrarU.setSize(870, 580);
        mostrarU.setLocation(0, 0);

        contenedor.removeAll();
        contenedor.add(mostrarU, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        //Validar que la tabla tenga registro
        if (tablaIndigenas.getRowCount() > 0) {
            //Conteolar que se haya seleccionado un elemento
            if (tablaIndigenas.getSelectedRow() != -1) {

                //debo seleccionar el id que desio borrar
                int id_indigenas = Integer.parseInt(String.valueOf(tablaIndigenas.getValueAt(tablaIndigenas.getSelectedRow(), 0)));
                //llamo el metodo para borrar
                int mensaje = JOptionPane.YES_NO_OPTION;
                int mensa = JOptionPane.showConfirmDialog(null, "Seguro que desea eliminar este elmento?", "Eliminar", mensaje);

                if (mensa == 0) {
                    control.borrarIndigenas(id_indigenas);
                    //avisar al usuario que se borro correctamente
                    String mos = "El elemento selecionado se a eliminado..";
                    String titulo = "Eliminar";
                    JOptionPane.showMessageDialog(null, mos, titulo, JOptionPane.INFORMATION_MESSAGE);
                    cargarTabla();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes elegir un elemento a elminar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Tabla esta vacia");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));

    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setForeground(new java.awt.Color(250, 250, 250));


    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        //Validar que la tabla tenga registro
        if (tablaIndigenas.getRowCount() > 0) {
            //Conteolar que se haya seleccionado un elemento
            if (tablaIndigenas.getSelectedRow() != -1) {

                //debo seleccionar el id que desio borrar
                int id_indigenas = Integer.parseInt(String.valueOf(tablaIndigenas.getValueAt(tablaIndigenas.getSelectedRow(), 0)));

                PantallaEditar edtidar = new PantallaEditar(control, usr, id_indigenas);
                edtidar.setSize(870, 580);

                edtidar.setSize(870, 580);
                //agrgar.setLocation(0, 0);

                contenedor.removeAll();
                contenedor.add(edtidar, BorderLayout.CENTER);
                contenedor.revalidate();
                contenedor.repaint();

                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Debes elegir un elemento a editar");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La Tabla esta vacia");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    boolean modoOscuro = false;
    private void btnOscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOscuroActionPerformed
        if (!modoOscuro) {
           
            modoDarck(btnOscuro);
            modoOscuro = true;
        } else {
           
            txtUser.setForeground(Color.white);
            btnOscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modoDark.png")));
            modoOscuro = false;
        }

    }//GEN-LAST:event_btnOscuroActionPerformed

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered

    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(new Color(166, 164, 158));
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnOscuro;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel contenedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tablaIndigenas;
    private javax.swing.JTextField txtIP1;
    private javax.swing.JTextField txtUser;
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
            "Tipo De Documento",
            "Numero De Documento",
            "Nombre",
            "Apellido",
            "<html>Fecha De Nacimiento <br> | año | mes | dia | <br><p></p> </html> "
        };
        modeloTabla.setColumnIdentifiers(titulos);

        //Traer de la base de datos la lista de Usuarios
        List<Indigenas> listaIndigenas = control.traerIndigenas();

        //modelo las fechas para que salgan de manera corecta
        //SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        if (listaIndigenas != null) {
            for (Indigenas indi : listaIndigenas) {

                Object[] objeto = {
                    indi.getId(),
                    indi.getTipoDoc(),
                    indi.getNumeroDoc(),
                    indi.getNombre(),
                    indi.getApellido(),
                    indi.getFecha_nac()
                };
                modeloTabla.addRow(objeto);
            }
        }

        tablaIndigenas.setModel(modeloTabla);

    }

    private void modoDarck(JButton btn) {
        btnOscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/modoLike.png")));
    }
}
