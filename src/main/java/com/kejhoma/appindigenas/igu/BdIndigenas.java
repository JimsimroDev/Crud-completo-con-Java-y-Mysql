package com.kejhoma.appindigenas.igu;

import com.kejhoma.appindigenas.logica.Controladora;
import com.kejhoma.appindigenas.logica.Indigenas;
import com.kejhoma.appindigenas.logica.User;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
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
    JFrame frame = new JFrame();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        contendorPrinc = new LIB.JPanelRound();
        jPanel2 = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaIndigenas = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        btnMaximizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APP Indigenas");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        contendorPrinc.setForeground(new java.awt.Color(255, 255, 255));
        contendorPrinc.setColorPrimario(new java.awt.Color(255, 139, 151));
        contendorPrinc.setColorSecundario(new java.awt.Color(127, 229, 229));
        contendorPrinc.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        contendorPrinc.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                contendorPrincMouseDragged(evt);
            }
        });
        contendorPrinc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contendorPrincMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(86, 174, 244,50));
        jPanel2.setOpaque(false);

        btnUsuarios.setBackground(new java.awt.Color(86, 174, 244,50));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usersBorroso.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnUsuarios.setIconTextGap(20);
        btnUsuarios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        btnUsuarios.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnCerrarSesion.setBackground(new java.awt.Color(86, 174, 244,50));
        btnCerrarSesion.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnCerrarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exitB.png"))); // NOI18N
        btnCerrarSesion.setText("cerrar sesión");
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

        btnInicio.setBackground(new java.awt.Color(86, 174, 244,50));
        btnInicio.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homBorro.png"))); // NOI18N
        btnInicio.setText("Inicio");
        btnInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnInicio.setIconTextGap(20);
        btnInicio.setOpaque(false);
        btnInicio.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contenedor.setBackground(new java.awt.Color(0, 0, 0));
        contenedor.setMinimumSize(new java.awt.Dimension(870, 580));
        contenedor.setOpaque(false);
        contenedor.setPreferredSize(new java.awt.Dimension(870, 580));
        contenedor.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BIENVENIDO A LA BASE DE DATOS INDIGENAS");

        tablaIndigenas.setBackground(new Color(0,0,0,0));
        tablaIndigenas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        txtUser.setEditable(false);
        txtUser.setBackground(new Color(0,0,0,0));
        txtUser.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 0, 0));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtUser.setBorder(null);
        txtUser.setOpaque(false);

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addGap(192, 192, 192))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(72, 72, 72))
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addGap(768, 768, 768)
                .addComponent(txtUser)
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnMaximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize (1).png"))); // NOI18N
        btnMaximizar.setBorder(null);
        btnMaximizar.setContentAreaFilled(false);
        btnMaximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMaximizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMaximizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize.png"))); // NOI18N
        btnMaximizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMaximizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximizarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar1.png"))); // NOI18N
        btnCerrar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("APP Indigenas");

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize (1).png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMinimizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/maximize.png"))); // NOI18N
        btnMinimizar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMinimizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contendorPrincLayout = new javax.swing.GroupLayout(contendorPrinc);
        contendorPrinc.setLayout(contendorPrincLayout);
        contendorPrincLayout.setHorizontalGroup(
            contendorPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contendorPrincLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerrar)
                .addGap(14, 14, 14)
                .addComponent(btnMaximizar)
                .addGap(12, 12, 12)
                .addComponent(btnMinimizar)
                .addGap(982, 982, 982)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(contendorPrincLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE))
        );
        contendorPrincLayout.setVerticalGroup(
            contendorPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contendorPrincLayout.createSequentialGroup()
                .addGroup(contendorPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contendorPrincLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(btnCerrar)
                    .addComponent(btnMaximizar)
                    .addComponent(btnMinimizar))
                .addGap(5, 5, 5)
                .addGroup(contendorPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contendorPrincLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contendorPrincLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(114, 114, 114))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contendorPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contendorPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtUser.setText(usr.getNombreUsu());
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseExited
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setBackground(new Color(86, 174, 244,50));
    }//GEN-LAST:event_btnEditarMouseExited

    private void btnEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseEntered
        btnEditar.setForeground(new java.awt.Color(250, 250, 250));
        btnEditar.setBackground(new Color(86, 174, 244));
    }//GEN-LAST:event_btnEditarMouseEntered

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        BdIndigenas indi = new BdIndigenas(control, usr);
        indi.setVisible(true);
        indi.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        btnInicio.setForeground(new java.awt.Color(0, 0, 0));
        btnInicio.setBackground(new java.awt.Color(86, 174, 244,50));
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        btnInicio.setForeground(new java.awt.Color(250, 250, 250));
        btnInicio.setBackground(new java.awt.Color(86, 174, 244));

    }//GEN-LAST:event_btnInicioMouseEntered

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
        btnCerrarSesion.setBackground(new Color(86, 174, 244,50));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setForeground(new java.awt.Color(250, 250, 250));
        btnCerrarSesion.setBackground(new Color(86, 174, 244));
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

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
        btnAgregar.setBackground(new Color(86, 174, 244,50));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setForeground(new java.awt.Color(250, 250, 250));
        btnAgregar.setBackground(new Color(86, 174, 244));
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

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setBackground(new java.awt.Color(86, 174, 244,50));
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        btnUsuarios.setForeground(new java.awt.Color(250, 250, 250));
        btnUsuarios.setBackground(new java.awt.Color(86, 174, 244));
    }//GEN-LAST:event_btnUsuariosMouseEntered

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
        btnEliminar.setBackground(new java.awt.Color(255, 0, 0,50));

    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setForeground(new java.awt.Color(250, 250, 250));
        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));

        
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximizarActionPerformed
        int estadoActual = this.getExtendedState();
    
    if ((estadoActual & MAXIMIZED_BOTH) == 0) {
        this.setExtendedState(MAXIMIZED_BOTH);
    } else {
        this.setExtendedState(NORMAL);
    }
        
    }//GEN-LAST:event_btnMaximizarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        int mensaje = JOptionPane.YES_NO_OPTION;
        int mensa = JOptionPane.showConfirmDialog(null, "Deseas Cerrar la aplicacion?", "SALIR", mensaje);

        if (mensa == 0) {

            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

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

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void contendorPrincMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contendorPrincMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_contendorPrincMousePressed

    private void contendorPrincMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contendorPrincMouseDragged
        int Y = evt.getYOnScreen();
        int X = evt.getXOnScreen();
        setLocation(X - xMouse, Y - yMouse);
    }//GEN-LAST:event_contendorPrincMouseDragged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnMaximizar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnUsuarios;
    private LIB.JPanelRound contendorPrinc;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tablaIndigenas;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
    
    private void cambiarColorBoton(JButton boton, Color color){
        boton.setBackground(color);
    }
    
    
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
            "<html>Fecha De Nacimiento <br> | año | mes | dia | </html> "
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

}
