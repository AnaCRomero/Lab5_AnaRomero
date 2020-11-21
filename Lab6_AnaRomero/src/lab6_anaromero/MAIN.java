package lab6_anaromero;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Ana Romero
 */
public class MAIN extends javax.swing.JFrame {

    public MAIN() {
        initComponents();

        //Valida que la info este seleccionada
        RB_M.setSelected(true);
        RB_LIC.setSelected(true);
        CB_LIC.setVisible(false);
        CB_ING1.setVisible(false);
        CB_SALUD.setVisible(false);

        //-----------------------------------------------------------------------------------------
        //comboBox opciones Lic
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_LIC.getModel();
        modelo.addElement(new LICENCIATURA("Finanzas", "Finanzas", "LICENCIATURA", "Lic. Duarte", 24000));
        modelo.addElement(new LICENCIATURA("Derecho", "Derecho", "LICENCIATURA", "Lic. Afura", 35000));
        modelo.addElement(new LICENCIATURA("Admi. en empresas", "Admi. en empresas", "LICENCIATURA", "Lic. Romero", 29000));
        modelo.addElement(new LICENCIATURA("Diseño grafico", "Diseño grafico", "LICENCIATURA", "Lic. Fonseca", 26000));
        modelo.addElement(new LICENCIATURA("Mercadoctenia", "Mercadoctenia", "LICENCIATURA", "Lic. Rovelo", 27000));
        CB_LIC.setModel(modelo);

        //-----------------------------------------------------------------------------------------
        //comboBox opciones ING
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) CB_ING1.getModel();
        modelo2.addElement(new ING("Sistemas", "Sistemas", "Ingeneria", "Ing. Fortin", 40000));
        modelo2.addElement(new ING("Industrial", "Industrial", "Ingeneria", "Ing. Ayala", 43000));
        modelo2.addElement(new ING("Mecatronica", "Sistemas", "Ingeneria", "Ing. Zelaya", 44000));
        modelo2.addElement(new ING("Biomedica", "Biomedica", "Ingeneria", "Ing. Puerto", 54000));
        modelo2.addElement(new ING("Electricidad", "Electricidad", "Ingeneria", "Ing. Ramos", 56000));
        CB_ING1.setModel(modelo2);

        //-----------------------------------------------------------------------------------------
        //comboBox opciones Salud
        DefaultComboBoxModel modelo3 = (DefaultComboBoxModel) CB_SALUD.getModel();
        modelo3.addElement(new CIENCIA_SALUD("Medicina y Sirugia", "Medicina y Sirugia", "Ciencia de la Salud", "Lic. Fortin", 50000));
        modelo3.addElement(new CIENCIA_SALUD("Odontologia", "Odontologia", "Ciencia de la Salud", "Lic. Bentakurth", 51000));
        modelo3.addElement(new CIENCIA_SALUD("Nutricion", "Nutricion", "Ciencia de la Salud", "Lic. Puerto", 57000));
        modelo3.addElement(new CIENCIA_SALUD("Terapia Fisica", "Terapia Fisica", "Ciencia de la Salud", "Lic. Ayala", 57000));
        CB_SALUD.setModel(modelo3);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_SEXO = new javax.swing.ButtonGroup();
        TF_FACULTADCARRERA1 = new javax.swing.JTextField();
        BG_CARRERA = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        POP_ADMI = new javax.swing.JPopupMenu();
        MODIFICAR = new javax.swing.JMenuItem();
        ELIMINAR = new javax.swing.JMenuItem();
        JTree = new javax.swing.JMenuItem();
        MENU = new javax.swing.JPopupMenu();
        MODIFICAR1 = new javax.swing.JMenuItem();
        ELIMINAR1 = new javax.swing.JMenuItem();
        MENU_ARBOL = new javax.swing.JPopupMenu();
        EDIT = new javax.swing.JMenuItem();
        DELETE = new javax.swing.JMenuItem();
        EDIT_TREE = new javax.swing.JPopupMenu();
        EDITARR = new javax.swing.JMenuItem();
        ELIMINARR = new javax.swing.JMenuItem();
        MM = new javax.swing.JPopupMenu();
        MOD = new javax.swing.JMenuItem();
        DET = new javax.swing.JMenuItem();
        MENU_maestro = new javax.swing.JPopupMenu();
        MODI = new javax.swing.JMenuItem();
        DELETEE = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_NOMBRE = new javax.swing.JTextField();
        TF_APELLIDO = new javax.swing.JTextField();
        TF_EDAD = new javax.swing.JFormattedTextField();
        RB_F = new javax.swing.JRadioButton();
        RB_M = new javax.swing.JRadioButton();
        BTN_CREAR_ESTUDIANTE = new javax.swing.JButton();
        CB_LIC = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        RB_LIC = new javax.swing.JRadioButton();
        RB_ING = new javax.swing.JRadioButton();
        RB_CinciaSalud = new javax.swing.JRadioButton();
        CB_SALUD = new javax.swing.JComboBox<>();
        CB_ING1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TF_NOMBRECARRERA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        TF_JEFECARRERA = new javax.swing.JTextField();
        TF_MENSUALIDADCARRERA = new javax.swing.JFormattedTextField();
        BTN_CREAR_CARRERA = new javax.swing.JButton();
        RB_LIC1 = new javax.swing.JRadioButton();
        RB_ING1 = new javax.swing.JRadioButton();
        RB_CinciaSalud1 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TF_APELLIDOMAESTRO = new javax.swing.JTextField();
        TF_NOMBREMAESTRO = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TF_EDADMAESTRO = new javax.swing.JFormattedTextField();
        TF_SALARIOMAESTRO = new javax.swing.JFormattedTextField();
        jLabel16 = new javax.swing.JLabel();
        BTN_CREAR_MAESTRO = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        JL_M = new javax.swing.JList<>();
        jLabel23 = new javax.swing.JLabel();
        CB_CLASES = new javax.swing.JComboBox<>();
        BTN_PASAR = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TF_SECCION = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        TF_CLASE = new javax.swing.JTextField();
        TF_Salon = new javax.swing.JTextField();
        TF_EDIFICIO = new javax.swing.JTextField();
        BTN_CLASE = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        RB_SI = new javax.swing.JRadioButton();
        RB_NO = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JL_ESTUDIANTES = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JL_C = new javax.swing.JList<>();
        jPanel9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JL_C1 = new javax.swing.JList<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        JL_C2 = new javax.swing.JList<>();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JT_ESTUDIANTES = new javax.swing.JTree();

        MODIFICAR.setText("Modificar");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });
        POP_ADMI.add(MODIFICAR);

        ELIMINAR.setText("Eliminar");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });
        POP_ADMI.add(ELIMINAR);

        JTree.setText("Jtree");
        JTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTreeActionPerformed(evt);
            }
        });
        POP_ADMI.add(JTree);

        MODIFICAR1.setText("Modificar");
        MODIFICAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICAR1ActionPerformed(evt);
            }
        });
        MENU.add(MODIFICAR1);

        ELIMINAR1.setText("Eliminar");
        ELIMINAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINAR1ActionPerformed(evt);
            }
        });
        MENU.add(ELIMINAR1);

        EDIT.setText("Editar");
        MENU_ARBOL.add(EDIT);

        DELETE.setText("Eliminar");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        MENU_ARBOL.add(DELETE);

        EDITARR.setText("Editar");
        EDITARR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARRActionPerformed(evt);
            }
        });
        EDIT_TREE.add(EDITARR);

        ELIMINARR.setText("Eliminar");
        ELIMINARR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARRActionPerformed(evt);
            }
        });
        EDIT_TREE.add(ELIMINARR);

        MOD.setText("Modificar");
        MOD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODActionPerformed(evt);
            }
        });
        MM.add(MOD);

        DET.setText("Eliminar");
        DET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DETActionPerformed(evt);
            }
        });
        MM.add(DET);

        MODI.setText("Modificar");
        MODI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIActionPerformed(evt);
            }
        });
        MENU_maestro.add(MODI);

        DELETEE.setText("Eliminar");
        DELETEE.setToolTipText("");
        DELETEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEEActionPerformed(evt);
            }
        });
        MENU_maestro.add(DELETEE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Apellido:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Edad:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Genero:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Carrera:");

        TF_EDAD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        BG_SEXO.add(RB_F);
        RB_F.setText("F");

        BG_SEXO.add(RB_M);
        RB_M.setText("M");

        BTN_CREAR_ESTUDIANTE.setText("Crear Estudiante");
        BTN_CREAR_ESTUDIANTE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CREAR_ESTUDIANTEMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CREACION DE ESTUDIANTES");
        jLabel7.setOpaque(true);

        BG_CARRERA.add(RB_LIC);
        RB_LIC.setText("Licenciatura");
        RB_LIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_LICMouseClicked(evt);
            }
        });

        BG_CARRERA.add(RB_ING);
        RB_ING.setText("Ingeneria");
        RB_ING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_INGMouseClicked(evt);
            }
        });

        BG_CARRERA.add(RB_CinciaSalud);
        RB_CinciaSalud.setText("Ciencias de la salud");
        RB_CinciaSalud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_CinciaSaludMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TF_EDAD)
                            .addComponent(TF_NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(TF_APELLIDO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(RB_CinciaSalud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RB_LIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(RB_ING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RB_M)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RB_F)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(CB_LIC, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CB_ING1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CB_SALUD, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(BTN_CREAR_ESTUDIANTE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TF_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(RB_M)
                    .addComponent(RB_F))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TF_APELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(RB_LIC))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TF_EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(RB_ING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RB_CinciaSalud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(BTN_CREAR_ESTUDIANTE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CB_LIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_SALUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_ING1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );

        jTabbedPane2.addTab("Estudiantes", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Facultad:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Jefe de Carrera:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Costo mensual: ");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CREACION DE CARRERA");
        jLabel11.setOpaque(true);

        TF_MENSUALIDADCARRERA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        BTN_CREAR_CARRERA.setText("Crear carrera");
        BTN_CREAR_CARRERA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CREAR_CARRERAMouseClicked(evt);
            }
        });

        BG_CARRERA.add(RB_LIC1);
        RB_LIC1.setText("Licenciatura");
        RB_LIC1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_LIC1MouseClicked(evt);
            }
        });

        BG_CARRERA.add(RB_ING1);
        RB_ING1.setText("Ingeneria");
        RB_ING1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_ING1MouseClicked(evt);
            }
        });

        BG_CARRERA.add(RB_CinciaSalud1);
        RB_CinciaSalud1.setText("Ciencias de la salud");
        RB_CinciaSalud1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RB_CinciaSalud1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TF_NOMBRECARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RB_CinciaSalud1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RB_LIC1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RB_ING1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TF_JEFECARRERA, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                    .addComponent(TF_MENSUALIDADCARRERA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_CREAR_CARRERA)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11)
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TF_NOMBRECARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TF_JEFECARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(TF_MENSUALIDADCARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(BTN_CREAR_CARRERA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RB_LIC1)
                        .addGap(8, 8, 8)
                        .addComponent(RB_ING1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_CinciaSalud1)
                        .addGap(37, 37, 37))))
        );

        jTabbedPane2.addTab("Carrera", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("CREACION DE MAESTROS");
        jLabel12.setOpaque(true);

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Nombre:");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Apellido:");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Edad:");

        TF_EDADMAESTRO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        TF_SALARIOMAESTRO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Salario:");

        BTN_CREAR_MAESTRO.setText("Crear Maestro");
        BTN_CREAR_MAESTRO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CREAR_MAESTROMouseClicked(evt);
            }
        });

        JL_M.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(JL_M);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel23.setText("Clases impartidas:");

        BTN_PASAR.setText(">");
        BTN_PASAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_PASARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TF_EDADMAESTRO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_APELLIDOMAESTRO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(TF_NOMBREMAESTRO, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TF_SALARIOMAESTRO))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(CB_CLASES, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BTN_PASAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(BTN_CREAR_MAESTRO)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(58, 58, 58))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel12)
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TF_NOMBREMAESTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(TF_APELLIDOMAESTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(TF_EDADMAESTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_CLASES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_PASAR))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(TF_SALARIOMAESTRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(BTN_CREAR_MAESTRO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Maestros", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CREACION DE CLASES");
        jLabel17.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("Nombre:");

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel19.setText("Seccion:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel20.setText("Salon:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setText("Edificio:");

        BTN_CLASE.setText("Crear Clase");
        BTN_CLASE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CLASEMouseClicked(evt);
            }
        });
        BTN_CLASE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CLASEActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setText("Aire:");

        RB_SI.setText("Si");

        RB_NO.setText("No");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TF_EDIFICIO, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_Salon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_SECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RB_SI)
                        .addGap(18, 18, 18)
                        .addComponent(RB_NO)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_CLASE)
                .addGap(41, 41, 41))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(TF_CLASE, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(334, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(RB_SI)
                            .addComponent(RB_NO))))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(TF_SECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(TF_Salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TF_EDIFICIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(BTN_CLASE)
                .addGap(18, 18, 18))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(TF_CLASE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Clases", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear", jPanel1);

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("ESTUDIANTEES");
        jLabel22.setOpaque(true);

        JL_ESTUDIANTES.setModel(new DefaultListModel());
        JL_ESTUDIANTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_ESTUDIANTESMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JL_ESTUDIANTES);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel22)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Estudiantes", jPanel7);

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText(" CARRERA");
        jLabel27.setOpaque(true);

        JL_C.setModel(new DefaultListModel());
        JL_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_CMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JL_C);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel27)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Carrera", jPanel8);

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("MAESTROS");
        jLabel28.setOpaque(true);

        JL_C1.setModel(new DefaultListModel());
        JL_C1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_C1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(JL_C1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Maestros", jPanel9);

        jPanel10.setBackground(new java.awt.Color(0, 102, 102));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("CLASES");
        jLabel29.setOpaque(true);

        JL_C2.setModel(new DefaultListModel());
        JL_C2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JL_C2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JL_C2MouseEntered(evt);
            }
        });
        jScrollPane6.setViewportView(JL_C2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane3.addTab("Clases", jPanel10);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Administrar", jPanel6);

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Carreras");
        JT_ESTUDIANTES.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        JT_ESTUDIANTES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JT_ESTUDIANTESMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JT_ESTUDIANTES);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("Arboles", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CREAR_ESTUDIANTEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CREAR_ESTUDIANTEMouseClicked
        String genero, carrera = "";
        Random R = new Random();
        int numCuenta = 0;

        if (RB_F.isSelected()) {
            genero = "F";
        } else {
            genero = "M";
        }

        while (metodoCuenta(numCuenta) == true) {
            numCuenta = 10000 + R.nextInt(100000);
        } // Fin While
        list_NumCuenta.add(numCuenta);

        DefaultListModel modelo = (DefaultListModel) JL_ESTUDIANTES.getModel();

        if (RB_LIC.isSelected()) {
            carrera = CB_LIC.getSelectedItem().toString();
        } else if (RB_ING.isSelected()) {
            carrera = CB_ING1.getSelectedItem().toString();
        } else {
            carrera = CB_SALUD.getSelectedItem().toString();
        }

        try {
            modelo.addElement(new ESTUDIANTES(TF_NOMBRE.getText(), TF_APELLIDO.getText(), numCuenta, genero, Integer.parseInt(TF_EDAD.getText()), carrera));
            JOptionPane.showMessageDialog(this, "Estudiante exitosamente creado!");
            CB_LIC.setVisible(false);
            CB_ING1.setVisible(false);
            CB_SALUD.setVisible(false);

            JL_ESTUDIANTES.setModel(modelo);
            TF_NOMBRE.setText("");
            TF_APELLIDO.setText("");
            RB_M.setSelected(true);
            TF_EDAD.setText("");
            CB_LIC.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salio mal!\nVerifique si lleno todos los campos");
        }//fin de try n catch    
    }//GEN-LAST:event_BTN_CREAR_ESTUDIANTEMouseClicked

    private void RB_LICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_LICMouseClicked
        if (RB_LIC.isSelected()) {
            CB_LIC.setVisible(true);
        }
    }//GEN-LAST:event_RB_LICMouseClicked

    private void RB_INGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_INGMouseClicked
        if (RB_ING.isSelected()) {
            CB_ING1.setVisible(true);
        }
    }//GEN-LAST:event_RB_INGMouseClicked

    private void RB_CinciaSaludMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_CinciaSaludMouseClicked
        if (RB_CinciaSalud.isSelected()) {
            CB_SALUD.setVisible(true);
        }
    }//GEN-LAST:event_RB_CinciaSaludMouseClicked

    private void BTN_CREAR_CARRERAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CREAR_CARRERAMouseClicked

        DefaultListModel modelo = (DefaultListModel) JL_C.getModel();
        DefaultListModel modelo2 = (DefaultListModel) JL_C.getModel();
        DefaultListModel modelo3 = (DefaultListModel) JL_C.getModel();

        if (RB_LIC.isSelected()) {
            LICENCIATURA lic = new LICENCIATURA("Licenciatura", TF_NOMBRECARRERA.getText(), "Licenciatura", TF_JEFECARRERA.getText(), Float.parseFloat(TF_MENSUALIDADCARRERA.getText()));
            JOptionPane.showMessageDialog(this, "Carrera exitosamente creado!");
            modelo.addElement(lic);
            DefaultComboBoxModel lice = (DefaultComboBoxModel) CB_LIC.getModel();
            lice.addElement(lic);
            CB_LIC.setModel(lice);
            TF_NOMBRECARRERA.setText("");
            TF_JEFECARRERA.setText("");
            TF_MENSUALIDADCARRERA.setText("");
            RB_LIC.setSelected(true);
        } else if (RB_ING.isSelected()) {
            ING ingenieria = new ING("ingeneria", TF_NOMBRECARRERA.getText(), "ingeneria", TF_JEFECARRERA.getText(), Float.parseFloat(TF_MENSUALIDADCARRERA.getText()));
            DefaultComboBoxModel inge = (DefaultComboBoxModel) CB_ING1.getModel();
            inge.addElement(ingenieria);
            JOptionPane.showMessageDialog(this, "Carrera exitosamente creado!");
            modelo2.addElement(ingenieria);
            CB_ING1.setModel(inge);
            TF_NOMBRECARRERA.setText("");
            TF_JEFECARRERA.setText("");
            TF_MENSUALIDADCARRERA.setText("");
            RB_LIC.setSelected(true);
        } else {
            CIENCIA_SALUD salud = new CIENCIA_SALUD("Ciencia de la Salud", TF_NOMBRECARRERA.getText(), "Ciencia de la Salud", TF_JEFECARRERA.getText(), Float.parseFloat(TF_MENSUALIDADCARRERA.getText()));
            DefaultComboBoxModel med = (DefaultComboBoxModel) CB_SALUD.getModel();
            med.addElement(salud);
            JOptionPane.showMessageDialog(this, "Carrera exitosamente creado!");
            modelo3.addElement(salud);
            CB_SALUD.setModel(med);
            TF_NOMBRECARRERA.setText("");
            TF_JEFECARRERA.setText("");
            TF_MENSUALIDADCARRERA.setText("");
            RB_LIC.setSelected(true);
        }
    }//GEN-LAST:event_BTN_CREAR_CARRERAMouseClicked

    private void RB_LIC1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_LIC1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_LIC1MouseClicked

    private void RB_ING1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_ING1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_ING1MouseClicked

    private void RB_CinciaSalud1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RB_CinciaSalud1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RB_CinciaSalud1MouseClicked

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        if (JL_ESTUDIANTES.getSelectedIndex() >= 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(this, "Que desea modificar:\n"
                    + "1. Nombre\n2. Apellido\n3.Edad\n4.Carrera"));
            switch (opcion) {
                case 1:
                    DefaultListModel modeloLista = (DefaultListModel) JL_ESTUDIANTES.getModel();
                    ((ESTUDIANTES) modeloLista.get(JL_ESTUDIANTES.getSelectedIndex())).setNombre(JOptionPane.showInputDialog("Nombre"));
                    JL_ESTUDIANTES.setModel(modeloLista);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 2:
                    DefaultListModel modeloLista1 = (DefaultListModel) JL_ESTUDIANTES.getModel();
                    ((ESTUDIANTES) modeloLista1.get(JL_ESTUDIANTES.getSelectedIndex())).setApellido(JOptionPane.showInputDialog("Apellido"));
                    JL_ESTUDIANTES.setModel(modeloLista1);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 3:
                    DefaultListModel modeloLista2 = (DefaultListModel) JL_ESTUDIANTES.getModel();
                    ((ESTUDIANTES) modeloLista2.get(JL_ESTUDIANTES.getSelectedIndex())).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Apellido")));
                    JL_ESTUDIANTES.setModel(modeloLista2);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 4:
                    DefaultListModel modeloLista3 = (DefaultListModel) JL_ESTUDIANTES.getModel();
                    ((ESTUDIANTES) modeloLista3.get(JL_ESTUDIANTES.getSelectedIndex())).setCarrera(JOptionPane.showInputDialog("Carrera"));
                    JL_ESTUDIANTES.setModel(modeloLista3);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Opcion no valida!");
            }

        }
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
        if (JL_ESTUDIANTES.getSelectedIndex() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                DefaultListModel modelo = (DefaultListModel) JL_ESTUDIANTES.getModel();
                modelo.remove(JL_ESTUDIANTES.getSelectedIndex());
                JL_ESTUDIANTES.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente!");
            }
        }
    }//GEN-LAST:event_ELIMINARActionPerformed

    private void MODIFICAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICAR1ActionPerformed

        if (JL_C2.getSelectedIndex() >= 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(this, "Que desea modificar:\n"
                    + "1. Nombre\n2. Seccion\n3.Edificio\n4.Salon"));
            switch (opcion) {
                case 1:
                    DefaultListModel modeloLista = (DefaultListModel) JL_C2.getModel();
                    ((CLASES) modeloLista.get(JL_C2.getSelectedIndex())).setNombre(JOptionPane.showInputDialog("Nombre"));
                    JL_C2.setModel(modeloLista);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 2:
                    DefaultListModel modeloLista1 = (DefaultListModel) JL_C2.getModel();
                    ((CLASES) modeloLista1.get(JL_C2.getSelectedIndex())).setSeccion(JOptionPane.showInputDialog("Seccion"));
                    JL_C2.setModel(modeloLista1);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 3:
                    DefaultListModel modeloLista2 = (DefaultListModel) JL_C2.getModel();
                    ((CLASES) modeloLista2.get(JL_C.getSelectedIndex())).setEdificio(JOptionPane.showInputDialog("Edificio"));
                    JL_C2.setModel(modeloLista2);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 4:
                    DefaultListModel modeloLista3 = (DefaultListModel) JL_C2.getModel();
                    ((CLASES) modeloLista3.get(JL_C.getSelectedIndex())).setSalon(JOptionPane.showInputDialog("Salon"));
                    JL_C2.setModel(modeloLista3);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Opcion no valida!");
            }

        }
    }//GEN-LAST:event_MODIFICAR1ActionPerformed

    private void ELIMINAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINAR1ActionPerformed
        if (JL_C2.getSelectedIndex() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                DefaultListModel modelo = (DefaultListModel) JL_C2.getModel();
                modelo.remove(JL_C2.getSelectedIndex());
                JL_C2.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente!");
            }
        }
    }//GEN-LAST:event_ELIMINAR1ActionPerformed

    private void JTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTreeActionPerformed
        if (JL_ESTUDIANTES.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloARBOL = (DefaultTreeModel) JT_ESTUDIANTES.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modeloARBOL.getRoot();
            DefaultListModel modeloLISTA = (DefaultListModel) JL_ESTUDIANTES.getModel();

            String Carrera;
            ESTUDIANTES e;
            e = ((ESTUDIANTES) modeloLISTA.get(JL_ESTUDIANTES.getSelectedIndex()));
            Carrera = ((ESTUDIANTES) modeloLISTA.get(JL_ESTUDIANTES.getSelectedIndex())).getCarrera();
            int centinela = -1;
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).toString().equals(Carrera)) {
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(e);
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }

            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(Carrera);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(e);
                n.add(p);
                raiz.add(n);
            }
            modeloARBOL.reload();

        } else {
            JOptionPane.showMessageDialog(this,
                    "No hay persona seleccionada");
        }
    }//GEN-LAST:event_JTreeActionPerformed

    private void JL_ESTUDIANTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_ESTUDIANTESMouseClicked
        if (JL_ESTUDIANTES.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                POP_ADMI.show(evt.getComponent(), evt.getX(), evt.getY());
            }//valida que sea click derecho
        }//que seleccione algo
    }//GEN-LAST:event_JL_ESTUDIANTESMouseClicked

    private void BTN_CREAR_MAESTROMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CREAR_MAESTROMouseClicked
        DefaultListModel model = (DefaultListModel) JL_M.getModel();
        ArrayList<CLASES> clasesitas = new ArrayList();
        for (int i = 0; i < model.getSize(); i++) {
            CLASES c = (CLASES)model.getElementAt(i);
            clasesitas.add(c);
        }
        DefaultListModel modelo2 = (DefaultListModel) JL_C1.getModel();
        modelo2.addElement(new MAESTROS(TF_NOMBREMAESTRO.getText(), TF_APELLIDOMAESTRO.getText(), Float.parseFloat(TF_SALARIOMAESTRO.getText()), Integer.parseInt(TF_EDADMAESTRO.getText()),clasesitas));
        JOptionPane.showMessageDialog(this, "Maestro exitosamente creado!");
    }//GEN-LAST:event_BTN_CREAR_MAESTROMouseClicked

    private void BTN_CLASEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CLASEMouseClicked
        DefaultListModel modelo = (DefaultListModel) JL_C2.getModel();
        String aire = "";
        if (RB_SI.isSelected()) {
            aire = "Si";
        } else {
            aire = "no";
        }
        CLASES x = new CLASES(TF_CLASE.getText(), TF_SECCION.getText(), TF_EDIFICIO.getText(), TF_Salon.getText(), aire);
        modelo.addElement(x);
        DefaultComboBoxModel cbm = (DefaultComboBoxModel) CB_CLASES.getModel();
        cbm.addElement(x);
        CB_CLASES.setModel(cbm);

        JOptionPane.showMessageDialog(this, "Clase exitosamente creado!");
        TF_CLASE.setText("");
        TF_SECCION.setText("");
        TF_EDIFICIO.setText("");
        TF_Salon.setText("");

    }//GEN-LAST:event_BTN_CLASEMouseClicked

    private void JL_C2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_C2MouseClicked
        if (JL_C2.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                MENU.show(evt.getComponent(), evt.getX(), evt.getY());
            }//valida que sea click derecho
        }//que seleccione algo
    }//GEN-LAST:event_JL_C2MouseClicked

    private void JL_C2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_C2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JL_C2MouseEntered

    private void BTN_CLASEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CLASEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_CLASEActionPerformed

    private void EDITARRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARRActionPerformed
        DefaultTreeModel m = (DefaultTreeModel) JT_ESTUDIANTES.getModel();
        estudiante_seleccionado.setNombre(JOptionPane.showInputDialog("Ingrese nuevo nombre"));
        m.reload();
    }//GEN-LAST:event_EDITARRActionPerformed

    private void ELIMINARRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARRActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (respuesta == JOptionPane.OK_OPTION) {
            DefaultTreeModel m = (DefaultTreeModel) JT_ESTUDIANTES.getModel();
            m.removeNodeFromParent(nodo_seleccionado);
            m.reload();
        }
    }//GEN-LAST:event_ELIMINARRActionPerformed

    private void JT_ESTUDIANTESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JT_ESTUDIANTESMouseClicked
        if (evt.isMetaDown()) {
            int row = JT_ESTUDIANTES.getClosestRowForLocation(evt.getX(), evt.getY());
            JT_ESTUDIANTES.setSelectionRow(row);
            Object v1 = JT_ESTUDIANTES.getSelectionPath().getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            if (nodo_seleccionado.getUserObject() instanceof ESTUDIANTES) {
                estudiante_seleccionado = (ESTUDIANTES) nodo_seleccionado.getUserObject();
                EDIT_TREE.show(evt.getComponent(), evt.getX(), evt.getY());
            }

        }
    }//GEN-LAST:event_JT_ESTUDIANTESMouseClicked

    private void DETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DETActionPerformed
        if (JL_C.getSelectedIndex() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                DefaultListModel modelo = (DefaultListModel) JL_C.getModel();
                modelo.remove(JL_C.getSelectedIndex());
                JL_C.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente!");
            }
        }
    }//GEN-LAST:event_DETActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed

    }//GEN-LAST:event_DELETEActionPerformed

    private void JL_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_CMouseClicked
        if (JL_C.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                MM.show(evt.getComponent(), evt.getX(), evt.getY());
            }//valida que sea click derecho
        }//que seleccione algo
    }//GEN-LAST:event_JL_CMouseClicked

    private void MODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODActionPerformed
        if (JL_C.getSelectedIndex() >= 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(this, "Que desea modificar:\n"
                    + "1. Nombre\n2.Costo Mensual\n3.Jefe de carrera"));
            switch (opcion) {
                case 1:
                    DefaultListModel modeloLista = (DefaultListModel) JL_C.getModel();
                    ((CARRERA) modeloLista.get(JL_C.getSelectedIndex())).setNombre(JOptionPane.showInputDialog("Nombre"));
                    JL_C.setModel(modeloLista);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 2:
                    DefaultListModel modeloLista1 = (DefaultListModel) JL_C.getModel();
                    ((CARRERA) modeloLista1.get(JL_C.getSelectedIndex())).setCostoMensualidad(Integer.parseInt(JOptionPane.showInputDialog("Costo Menusal")));
                    JL_C.setModel(modeloLista1);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 3:
                    DefaultListModel modeloLista2 = (DefaultListModel) JL_C.getModel();
                    ((CARRERA) modeloLista2.get(JL_C.getSelectedIndex())).setNombre(JOptionPane.showInputDialog("Jefe de carrera"));
                    JL_C.setModel(modeloLista2);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Opcion no valida!");
            }
        }
    }//GEN-LAST:event_MODActionPerformed

    private void BTN_PASARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_PASARMouseClicked
        if (CB_CLASES.getSelectedIndex() >= 0) {
            DefaultComboBoxModel cbc = (DefaultComboBoxModel) CB_CLASES.getModel();
            DefaultListModel modeloA = (DefaultListModel) JL_M.getModel();
            CLASES clase = (CLASES) CB_CLASES.getSelectedItem();
            modeloA.addElement(clase);
            JL_M.setModel(modeloA);
            cbc.removeElement((CLASES) CB_CLASES.getSelectedItem());
            CB_CLASES.setModel(cbc);
        } else {
            JOptionPane.showMessageDialog(null, "Selleccione una clase primero, si no aparecen clases entonces cree una");
        }
    }//GEN-LAST:event_BTN_PASARMouseClicked

    private void JL_C1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JL_C1MouseClicked
         if (JL_C1.getSelectedIndex() >= 0) {
            if (evt.isMetaDown()) {
                MENU_maestro.show(evt.getComponent(), evt.getX(), evt.getY());
            }//valida que sea click derecho
        }//que seleccione algo
    }//GEN-LAST:event_JL_C1MouseClicked

    private void DELETEEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEEActionPerformed
       if (JL_C1.getSelectedIndex() >= 0) {
            int response = JOptionPane.showConfirmDialog(this, "Seguro de Eliminar?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.OK_OPTION) {
                DefaultListModel modelo = (DefaultListModel) JL_C1.getModel();
                modelo.remove(JL_C1.getSelectedIndex());
                JL_C1.setModel(modelo);
                JOptionPane.showMessageDialog(this, "Eliminado exitosamente!");
            }
        }
    }//GEN-LAST:event_DELETEEActionPerformed

    private void MODIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIActionPerformed
        if (JL_C1.getSelectedIndex() >= 0) {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(this, "Que desea modificar:\n"
                    + "1. Nombre\n2. Apellido\n3.Salario\n4.Edad"));
            switch (opcion) {
                case 1:
                    DefaultListModel modeloLista = (DefaultListModel) JL_C1.getModel();
                    ((MAESTROS) modeloLista.get(JL_C1.getSelectedIndex())).setNombre(JOptionPane.showInputDialog("Nombre"));
                    JL_C1.setModel(modeloLista);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 2:
                    DefaultListModel modeloLista1 = (DefaultListModel) JL_C1.getModel();
                    ((MAESTROS) modeloLista1.get(JL_C1.getSelectedIndex())).setApellido(JOptionPane.showInputDialog("Apellido"));
                    JL_C1.setModel(modeloLista1);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 3:
                    DefaultListModel modeloLista2 = (DefaultListModel) JL_C1.getModel();
                    ((MAESTROS) modeloLista2.get(JL_C1.getSelectedIndex())).setSalario(Integer.parseInt(JOptionPane.showInputDialog("Salario")));
                    JL_ESTUDIANTES.setModel(modeloLista2);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                case 4:
                    DefaultListModel modeloLista3 = (DefaultListModel) JL_C1.getModel();
                    ((MAESTROS) modeloLista3.get(JL_C1.getSelectedIndex())).setEdad(Integer.parseInt(JOptionPane.showInputDialog("Edad")));
                    JL_C1.setModel(modeloLista3);
                    JOptionPane.showMessageDialog(this, "Modificacion exitosa!");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Opcion no valida!");
            }

        }
    }//GEN-LAST:event_MODIActionPerformed

    public static boolean metodoCuenta(int numCuenta) {
        for (int i = 0; i < list_NumCuenta.size(); i++) {
            if (list_NumCuenta.get(i) == numCuenta) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_CARRERA;
    private javax.swing.ButtonGroup BG_SEXO;
    private javax.swing.JButton BTN_CLASE;
    private javax.swing.JButton BTN_CREAR_CARRERA;
    private javax.swing.JButton BTN_CREAR_ESTUDIANTE;
    private javax.swing.JButton BTN_CREAR_MAESTRO;
    private javax.swing.JButton BTN_PASAR;
    private javax.swing.JComboBox<String> CB_CLASES;
    private javax.swing.JComboBox<String> CB_ING1;
    private javax.swing.JComboBox<String> CB_LIC;
    private javax.swing.JComboBox<String> CB_SALUD;
    private javax.swing.JMenuItem DELETE;
    private javax.swing.JMenuItem DELETEE;
    private javax.swing.JMenuItem DET;
    private javax.swing.JMenuItem EDIT;
    private javax.swing.JMenuItem EDITARR;
    private javax.swing.JPopupMenu EDIT_TREE;
    private javax.swing.JMenuItem ELIMINAR;
    private javax.swing.JMenuItem ELIMINAR1;
    private javax.swing.JMenuItem ELIMINARR;
    private javax.swing.JList<String> JL_C;
    private javax.swing.JList<String> JL_C1;
    private javax.swing.JList<String> JL_C2;
    private javax.swing.JList<String> JL_ESTUDIANTES;
    private javax.swing.JList<String> JL_M;
    private javax.swing.JTree JT_ESTUDIANTES;
    private javax.swing.JMenuItem JTree;
    private javax.swing.JPopupMenu MENU;
    private javax.swing.JPopupMenu MENU_ARBOL;
    private javax.swing.JPopupMenu MENU_maestro;
    private javax.swing.JPopupMenu MM;
    private javax.swing.JMenuItem MOD;
    private javax.swing.JMenuItem MODI;
    private javax.swing.JMenuItem MODIFICAR;
    private javax.swing.JMenuItem MODIFICAR1;
    private javax.swing.JPopupMenu POP_ADMI;
    private javax.swing.JRadioButton RB_CinciaSalud;
    private javax.swing.JRadioButton RB_CinciaSalud1;
    private javax.swing.JRadioButton RB_F;
    private javax.swing.JRadioButton RB_ING;
    private javax.swing.JRadioButton RB_ING1;
    private javax.swing.JRadioButton RB_LIC;
    private javax.swing.JRadioButton RB_LIC1;
    private javax.swing.JRadioButton RB_M;
    private javax.swing.JRadioButton RB_NO;
    private javax.swing.JRadioButton RB_SI;
    private javax.swing.JTextField TF_APELLIDO;
    private javax.swing.JTextField TF_APELLIDOMAESTRO;
    private javax.swing.JTextField TF_CLASE;
    private javax.swing.JFormattedTextField TF_EDAD;
    private javax.swing.JFormattedTextField TF_EDADMAESTRO;
    private javax.swing.JTextField TF_EDIFICIO;
    private javax.swing.JTextField TF_FACULTADCARRERA1;
    private javax.swing.JTextField TF_JEFECARRERA;
    private javax.swing.JFormattedTextField TF_MENSUALIDADCARRERA;
    private javax.swing.JTextField TF_NOMBRE;
    private javax.swing.JTextField TF_NOMBRECARRERA;
    private javax.swing.JTextField TF_NOMBREMAESTRO;
    private javax.swing.JFormattedTextField TF_SALARIOMAESTRO;
    private javax.swing.JTextField TF_SECCION;
    private javax.swing.JTextField TF_Salon;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
    static ArrayList<Integer> list_NumCuenta = new ArrayList();
    DefaultMutableTreeNode nodo_seleccionado;
    ESTUDIANTES estudiante_seleccionado;
}
