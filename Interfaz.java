/*
 * ESTRUCTURAS DE DATOS - 1 Cuatrimeste 2023
   Floricela Arguedas Z
 */
package proyecto1_floricela_arguedas;

import java.sql.Array;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;//Para usar la clase random
import javax.swing.table.DefaultTableModel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
    
        //Creacion de coleccion HashSet
        this.Equipos = new HashSet<>(); 
        initComponents();
        this.setLocationRelativeTo(null);//Ventana en el centro
        this.setTitle("Mundial Qatar 2022");//Título de ventana
        //Construcción tablas con el modelo
        JTa_Listado.setModel(tabla_listado);
        tabla_listado.addColumn("ID del Equipo");
        tabla_listado.addColumn("Nombre del Equipo");
        tabla_listado.addColumn("Fundación");
        tabla_listado.addColumn("Posición Ranking FIFA");
        
        JT_TablaOrdenar.setModel(tabla_ordenarLista);
        
        tabla_ordenarLista.addColumn("ID EQUIPO");
        tabla_ordenarLista.addColumn("NOMBRE");
        tabla_ordenarLista.addColumn("AÑO DE FUNDACIÓN");
        tabla_ordenarLista.addColumn("POSICIÓN EN RANKING FIFA");

    }

    //Declaraciones 
    static int IDe;
    static String nombreE;
    static int posicion;
    static int year;
    HashSet<Equipo> Equipos;
    private static DefaultTableModel tabla_listado = new DefaultTableModel();
    private static DefaultTableModel tabla_ordenarLista = new DefaultTableModel();



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_base = new javax.swing.JPanel();
        TittleMain = new javax.swing.JLabel();
        PanelPestañas = new javax.swing.JTabbedPane();
        PRegistro = new javax.swing.JPanel();
        TittleRegistro = new javax.swing.JLabel();
        L_Equipo_Generado = new javax.swing.JLabel();
        L_NombreEquipo = new javax.swing.JLabel();
        JT_NombreEquipo = new javax.swing.JTextField();
        L_AñoFundacion = new javax.swing.JLabel();
        JT_yearF = new javax.swing.JTextField();
        L_Posicion = new javax.swing.JLabel();
        JT_PosicionRanking = new javax.swing.JTextField();
        Btn_Registrar = new javax.swing.JButton();
        L_messagesRegistro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PListaE = new javax.swing.JPanel();
        TittleListado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTa_Listado = new javax.swing.JTable();
        PByE = new javax.swing.JPanel();
        L_textosolicitdID = new javax.swing.JLabel();
        JT_IDbuscar = new javax.swing.JTextField();
        JBu_buscar = new javax.swing.JButton();
        jButton_GuardarCambios = new javax.swing.JButton();
        JL_IDb = new javax.swing.JLabel();
        JL_NombreB = new javax.swing.JLabel();
        JL_FundacionB = new javax.swing.JLabel();
        JL_RankingB = new javax.swing.JLabel();
        JT_FundacionEncontrado = new javax.swing.JTextField();
        JT_RankingEncontrado = new javax.swing.JTextField();
        JL_IDEncontrado = new javax.swing.JLabel();
        JL_NombreEncontrado = new javax.swing.JLabel();
        JL_EdicionExitosa = new javax.swing.JLabel();
        JL_ImageByE = new javax.swing.JLabel();
        POdL = new javax.swing.JPanel();
        JL_TittleOrdenar = new javax.swing.JLabel();
        JL_OrdenarSegun = new javax.swing.JLabel();
        JCheck_fundacion = new javax.swing.JCheckBox();
        JCheck_PosiciónRanking = new javax.swing.JCheckBox();
        JL_OrdenarCon = new javax.swing.JLabel();
        JCheck_Burbuja = new javax.swing.JCheckBox();
        JCheck_QuickSort = new javax.swing.JCheckBox();
        JSeparador = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        JT_TablaOrdenar = new javax.swing.JTable();
        JBu_Ordenar = new javax.swing.JButton();
        JL_AvisoOrden = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_base.setForeground(new java.awt.Color(134, 0, 55));

        TittleMain.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        TittleMain.setForeground(new java.awt.Color(134, 0, 55));
        TittleMain.setText("                                   COPA MUNDIAL FIFA QATAR 2022");
        TittleMain.setName(""); // NOI18N

        PanelPestañas.setForeground(new java.awt.Color(134, 0, 55));
        PanelPestañas.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        PanelPestañas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelPestañasMouseClicked(evt);
            }
        });

        PRegistro.setForeground(new java.awt.Color(134, 0, 55));

        TittleRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TittleRegistro.setText("Realice el registro del equipo al mundial llenando los siguientes datos");

        L_Equipo_Generado.setForeground(new java.awt.Color(0, 102, 102));
        L_Equipo_Generado.setToolTipText("Generado Automáticamente");

        L_NombreEquipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_NombreEquipo.setText("Nombre del Equipo:");

        JT_NombreEquipo.setToolTipText("Escriba el nombre del equipo, no más de 20 Caracteres");
        JT_NombreEquipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_NombreEquipoKeyTyped(evt);
            }
        });

        L_AñoFundacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_AñoFundacion.setText("Año de Fundación:");
        L_AñoFundacion.setToolTipText("");

        JT_yearF.setToolTipText("No debe ser mayor a 4 dígitos, ejemplo 1953");
        JT_yearF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_yearFKeyTyped(evt);
            }
        });

        L_Posicion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        L_Posicion.setText("Posición actual en el Ranking de FIFA:");
        L_Posicion.setToolTipText("");

        JT_PosicionRanking.setToolTipText("Digite la posición entre 1 y 100.");
        JT_PosicionRanking.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JT_PosicionRankingKeyTyped(evt);
            }
        });

        Btn_Registrar.setBackground(new java.awt.Color(134, 0, 55));
        Btn_Registrar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Btn_Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Registrar.setText("REGISTRAR EQUIPO");
        Btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegistrarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/56df4b6e27a6fa3f6bd013452c27681d.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout PRegistroLayout = new javax.swing.GroupLayout(PRegistro);
        PRegistro.setLayout(PRegistroLayout);
        PRegistroLayout.setHorizontalGroup(
            PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRegistroLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TittleRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addComponent(L_Equipo_Generado, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(L_messagesRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(L_AñoFundacion)
                                .addComponent(L_Posicion, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(L_NombreEquipo))
                        .addGap(18, 18, 18)
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(JT_PosicionRanking, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(JT_yearF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(JT_NombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Registrar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PRegistroLayout.setVerticalGroup(
            PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRegistroLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TittleRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_NombreEquipo)
                            .addComponent(JT_NombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_AñoFundacion)
                            .addComponent(JT_yearF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_Posicion)
                            .addComponent(JT_PosicionRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(Btn_Registrar))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(L_messagesRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(L_Equipo_Generado, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        L_Equipo_Generado.getAccessibleContext().setAccessibleDescription("");

        PanelPestañas.addTab("REGISTRO", PRegistro);

        TittleListado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TittleListado.setText("LISTADO DE EQUIPOS REGISTRADOS EN EL MUNDIAL QATAR 2022");

        JTa_Listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID EQUIPO", "NOMBRE", "AÑO FUNDACIÓN", "POSICIÓN en RANKING"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTa_Listado);

        javax.swing.GroupLayout PListaELayout = new javax.swing.GroupLayout(PListaE);
        PListaE.setLayout(PListaELayout);
        PListaELayout.setHorizontalGroup(
            PListaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PListaELayout.createSequentialGroup()
                .addGroup(PListaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PListaELayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(TittleListado))
                    .addGroup(PListaELayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        PListaELayout.setVerticalGroup(
            PListaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PListaELayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(TittleListado)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        PanelPestañas.addTab("LISTADO de EQUIPOS", PListaE);

        L_textosolicitdID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        L_textosolicitdID.setText("Digite el ID del equipo que desea editar: ");

        JBu_buscar.setBackground(new java.awt.Color(134, 0, 55));
        JBu_buscar.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        JBu_buscar.setForeground(new java.awt.Color(255, 255, 255));
        JBu_buscar.setText("Buscar Equipo");
        JBu_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBu_buscarMouseClicked(evt);
            }
        });

        jButton_GuardarCambios.setBackground(new java.awt.Color(134, 0, 55));
        jButton_GuardarCambios.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jButton_GuardarCambios.setForeground(new java.awt.Color(255, 255, 255));
        jButton_GuardarCambios.setText("Guardar Cambios");
        jButton_GuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GuardarCambiosActionPerformed(evt);
            }
        });

        JL_IDb.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JL_IDb.setText("ID:");

        JL_NombreB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JL_NombreB.setText("Nombre:");

        JL_FundacionB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JL_FundacionB.setText("Fundado en:");

        JL_RankingB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JL_RankingB.setText("Ranking en FIFA:");

        JL_EdicionExitosa.setForeground(new java.awt.Color(134, 0, 55));

        JL_ImageByE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pngtree-fifa-world-cup-2022-text-png-image_6442482.png"))); // NOI18N
        JL_ImageByE.setText("jLabel1");

        javax.swing.GroupLayout PByELayout = new javax.swing.GroupLayout(PByE);
        PByE.setLayout(PByELayout);
        PByELayout.setHorizontalGroup(
            PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PByELayout.createSequentialGroup()
                .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PByELayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_textosolicitdID)
                            .addGroup(PByELayout.createSequentialGroup()
                                .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PByELayout.createSequentialGroup()
                                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JL_FundacionB)
                                            .addComponent(JL_NombreB)
                                            .addComponent(JL_IDb))
                                        .addGap(63, 63, 63))
                                    .addGroup(PByELayout.createSequentialGroup()
                                        .addComponent(JL_RankingB)
                                        .addGap(37, 37, 37)))
                                .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JT_RankingEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JL_IDEncontrado)
                                    .addComponent(JT_FundacionEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JL_NombreEncontrado))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JT_IDbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PByELayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JL_EdicionExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PByELayout.createSequentialGroup()
                        .addComponent(jButton_GuardarCambios)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PByELayout.createSequentialGroup()
                        .addComponent(JBu_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JL_ImageByE, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        PByELayout.setVerticalGroup(
            PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PByELayout.createSequentialGroup()
                .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PByELayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_textosolicitdID)
                            .addComponent(JT_IDbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBu_buscar))
                        .addGap(45, 45, 45)
                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_IDb)
                            .addComponent(JL_IDEncontrado))
                        .addGap(43, 43, 43)
                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_NombreB)
                            .addComponent(JL_NombreEncontrado))
                        .addGap(55, 55, 55)
                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_FundacionB)
                            .addComponent(JT_FundacionEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JL_RankingB)
                            .addComponent(JT_RankingEncontrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PByELayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(JL_ImageByE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addGroup(PByELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_EdicionExitosa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_GuardarCambios))
                .addGap(51, 51, 51))
        );

        JT_IDbuscar.getAccessibleContext().setAccessibleDescription("Ecriba el ID, ejemplo: 123");

        PanelPestañas.addTab("BÚSQUEDA y EDICIÓN", PByE);

        JL_TittleOrdenar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JL_TittleOrdenar.setText("ORDENE DE ACUERDO A SU PREFERENCIA");

        JL_OrdenarSegun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JL_OrdenarSegun.setText("Ordenar según:");

        JCheck_fundacion.setText("Año de Fundación");

        JCheck_PosiciónRanking.setText("Posición en el Ranking");

        JL_OrdenarCon.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JL_OrdenarCon.setText("Ordenar con: ");

        JCheck_Burbuja.setText("Método Burbuja");
        JCheck_Burbuja.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        JCheck_QuickSort.setText("Método QuickSort");

        JT_TablaOrdenar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID Equipo", "Nombre", "Año de Fundación", "Posición en el Ranking FIFA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JT_TablaOrdenar);

        JBu_Ordenar.setBackground(new java.awt.Color(134, 0, 55));
        JBu_Ordenar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        JBu_Ordenar.setForeground(new java.awt.Color(255, 255, 255));
        JBu_Ordenar.setText("ORDENAR");
        JBu_Ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBu_OrdenarActionPerformed(evt);
            }
        });

        JL_AvisoOrden.setForeground(new java.awt.Color(134, 0, 55));
        JL_AvisoOrden.setText("Aviso");

        javax.swing.GroupLayout POdLLayout = new javax.swing.GroupLayout(POdL);
        POdL.setLayout(POdLLayout);
        POdLLayout.setHorizontalGroup(
            POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JSeparador, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(POdLLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(JL_OrdenarSegun)
                .addGap(34, 34, 34)
                .addGroup(POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JCheck_PosiciónRanking)
                    .addComponent(JCheck_fundacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(JL_OrdenarCon)
                .addGap(64, 64, 64)
                .addGroup(POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(POdLLayout.createSequentialGroup()
                        .addComponent(JCheck_QuickSort)
                        .addGap(201, 201, 201))
                    .addGroup(POdLLayout.createSequentialGroup()
                        .addComponent(JCheck_Burbuja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBu_Ordenar)
                        .addGap(50, 50, 50))))
            .addGroup(POdLLayout.createSequentialGroup()
                .addGroup(POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(POdLLayout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(JL_TittleOrdenar))
                    .addGroup(POdLLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 727, Short.MAX_VALUE)
                            .addComponent(JL_AvisoOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        POdLLayout.setVerticalGroup(
            POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(POdLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_TittleOrdenar)
                .addGap(25, 25, 25)
                .addGroup(POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JL_OrdenarSegun)
                    .addComponent(JCheck_fundacion)
                    .addComponent(JL_OrdenarCon)
                    .addComponent(JCheck_Burbuja)
                    .addComponent(JBu_Ordenar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(POdLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCheck_PosiciónRanking)
                    .addComponent(JCheck_QuickSort))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JSeparador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(JL_AvisoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        PanelPestañas.addTab("ORDENAMIENTO de LISTA", POdL);

        javax.swing.GroupLayout Panel_baseLayout = new javax.swing.GroupLayout(Panel_base);
        Panel_base.setLayout(Panel_baseLayout);
        Panel_baseLayout.setHorizontalGroup(
            Panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_baseLayout.createSequentialGroup()
                .addGroup(Panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_baseLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(TittleMain, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_baseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_baseLayout.setVerticalGroup(
            Panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_baseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TittleMain, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelPestañas, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        TittleMain.getAccessibleContext().setAccessibleName("");
        TittleMain.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_base, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//REGISTRO 
    private void Btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegistrarActionPerformed
        // Con el boton de registrar creo el objeto equipo y lo agrego a coleccion
        try {
            //Se extraen los datos
            nombreE = JT_NombreEquipo.getText();
            String Year;
            Year = JT_yearF.getText(); 
            year = Integer.parseInt(Year);
            String Posicion;
            Posicion = JT_PosicionRanking.getText();
            posicion = Integer.parseInt(Posicion);
            //creacion ID aleatorio
            Random aleatorio = new Random(System.currentTimeMillis());
            IDe = aleatorio.nextInt(1000);
            String ID = String.valueOf(IDe);
            L_Equipo_Generado.setText(ID);

        } catch (NumberFormatException ERROR) {
        }
        //creacion objeto equipo
        Equipo equipo = new Equipo(IDe, nombreE, posicion, year);

        this.Equipos.add(equipo); //Agrego objeto a la coleccion HashSet


        //Limpieza de casillas
        JT_NombreEquipo.setText(null);
        JT_yearF.setText(null);
        JT_PosicionRanking.setText(null);
        
        //Muestro confirmacion al usuario
        L_Equipo_Generado.setText("A creado el equipo con éxito: "+"ID: "+IDe+" "+"Nombre: "+nombreE+" "+"\nPosición: "+posicion+" "+"\nAño de Fundación: "+year+" ");
        
    }//GEN-LAST:event_Btn_RegistrarActionPerformed

//LISTADO  
    //Funcion para iterar la coleccion y meter los objetos a un arreglo
    private Equipo[] HashSetToArray(HashSet<Equipo> Equipos) {
        Equipo[] array = new Equipo[Equipos.size()];
        //recorrer colleccion con Iterator 
        Iterator<Equipo> iter = Equipos.iterator();
        int i = 0;
        while (iter.hasNext()) {
            Equipo tmp = iter.next();
            array[i] = tmp;
            i++;
        }
        return array;
    }

    //Funcion para extraer los atributos de cada objeto y cargar la tabla
    private void CargarLista(Equipo[] array, DefaultTableModel tabla) {

        tabla.setRowCount(0);//Limpio tabla para que se cargue de nuevo.
        //Extraigo los parametros de cada Objeto Equipo
        for (int i = 0; i < array.length; i++) {
            String[] parametros = new String[4];
            parametros[0] = Integer.toString(array[i].id_equipo);
            parametros[1] = array[i].nombre_equipo;
            parametros[2] = Integer.toString(array[i].year_fundacion);
            parametros[3] = Integer.toString(array[i].posicion);
            tabla.addRow(parametros);   //agrego a la tabla los atributos  
        }
    }
    
//BÚSQUEDA Y EDICIÓN
    //Funcion para crear array con los IDs de cada objeto en la coleccion
private int[] ArrayIDs(Equipo[] array) {
        int[] Aids = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            Aids[i] = (array[i].id_equipo);
        }
        return Aids;
    }   

    //Funcion para buscar el ID con recursividad

    private int buscarIDrecursivo(int[] arrayids, int IDbuscar, int indice) {
 
        if (indice < arrayids.length) {
            int buscando = arrayids[indice];
            if (buscando == IDbuscar) {
                return indice;
            } else {
                indice = indice + 1;
                return buscarIDrecursivo(arrayids, IDbuscar, indice);
            }
        } else {
            JL_EdicionExitosa.setText("El ID especificado no existe");
            return -1;
        }
    }
    
    //Funcion para mostrar los parámetros del equipo encontrado
    
    private void Extraeryllenar(Equipo[] array, int posicion) {
        //Extraigo los atributos del objeto que esta en esa posicion
        if (posicion >= 0) {          
            int IDb = array[posicion].id_equipo;
            String ID = String.valueOf(IDb);
            String name = array[posicion].nombre_equipo;
            int fundationb = array[posicion].year_fundacion;
            String fundation = String.valueOf(fundationb);
            int positionb = array[posicion].posicion;
            String position = String.valueOf(positionb);
            //Muestro los atributos en las cajas de texto 
            JL_IDEncontrado.setText(ID);
            JL_NombreEncontrado.setText(name);
            JT_FundacionEncontrado.setText(fundation);
            JT_RankingEncontrado.setText(position);                 
        }
    }
    
    
    //Funcion para extraer datos modificados y llenar coleccion
    
    public void ModificaryGuardar() {
    
        String NewYear = JT_FundacionEncontrado.getText();
        String NewRanking = JT_RankingEncontrado.getText();
        //Llamo funcion para iterar la coleccion de nuevo
        Equipo[] array = HashSetToArray(this.Equipos);
        // Llamo a la funcion para hacer array de IDs
        int[] arrayids = ArrayIDs(array);
        String IDdigitado = JT_IDbuscar.getText();
        int IDbuscar = Integer.parseInt(IDdigitado);
        //Llamo a la funcion para buscar el indice donde esta el ID.
        int posiciondelID = buscarIDrecursivo(arrayids, IDbuscar, 0);
        //Actualizo los atributos del equipo.
        array[posiciondelID].year_fundacion = Integer.parseInt(NewYear);
        array[posiciondelID].posicion = Integer.parseInt(NewRanking);
        //Llamo de nuevo a la funcion para actualizar la tabla de listado.
        CargarLista(array, tabla_listado);
        JL_EdicionExitosa.setText("Equipo Editado con Éxito");
    }
 
//ORDENAMIENTO LISTA DE EQUIPOS
    
    //Funciones para pasar los datos a ordenar a sus respectivos arrays
    
    private int[] ArrayFundacion(Equipo[] array) {
        int[] ArrayFunda = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            ArrayFunda[i] = (array[i].year_fundacion);
        }
        return ArrayFunda;
    } 
    
     private int[] ArrayRanking(Equipo[] array) {
        int[] ArrayRank = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            ArrayRank[i] = (array[i].posicion);
        }
        return ArrayRank;  
    } 
    //ORDENAMIENTO POR BURBUJA
    public void Ordenar(int[] array, Equipo[] arrayEquipos) {
        int aux;
        Equipo aux2;

        //Se condiciona segun lo indicado por el usuario   
        //BURBUJA
        try {
            //Condicion metodo burbuja
            for (int i = 0; i < (array.length - 1); i++) {

                for (int j = 0; j < (array.length - 1); j++) {

                    if (array[j] > array[j + 1]) {
                        aux = array[j];
                        aux2 = arrayEquipos[j];
                        array[j] = array[j + 1];
                        arrayEquipos[j] = arrayEquipos[j + 1];
                        array[j + 1] = aux;
                        arrayEquipos[j + 1] = aux2;
                    }

                }
            }
        } catch (Exception e) {
            JL_AvisoOrden.setText("ERROR Inesperado, por favor intente de nuevo");
        }
    }
     
    //ORDENAMIENTO POR QUICKSORT
    public void OrdQuickSort(int[] array_ordenar, Equipo[] arrayEquipos, int izq, int der) {
        int aux;
        Equipo aux2;
        //QUICKSORT

        int pivote, i, j;
        Equipo pivote2;
        pivote = array_ordenar[izq];
        pivote2 = arrayEquipos[izq];
        i = izq;
        j = der;


        while (i < j) {
            while (array_ordenar[i] <= pivote && i < j) {
                i++;
            }
            while (array_ordenar[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = array_ordenar[i];
                aux2 = arrayEquipos[i];
                array_ordenar[i] = array_ordenar[j];
                arrayEquipos[i] = arrayEquipos[j];
                array_ordenar[j] = aux;
                arrayEquipos[j] = aux2;
            }
        }
        array_ordenar[izq] = array_ordenar[j];
        arrayEquipos[izq] = arrayEquipos[j];
        array_ordenar[j] = pivote;
        arrayEquipos[j] = pivote2;

        if (izq < j - 1) {
            OrdQuickSort(array_ordenar, arrayEquipos, izq, j - 1);
        }

        if (j + 1 < der) {
            OrdQuickSort(array_ordenar, arrayEquipos, j + 1, der);
        }
    } 
    
//EVENTOS DE CASILLAS
    private void JT_NombreEquipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_NombreEquipoKeyTyped
        // limitar cantidad de caracteres del nombre del equipo
        if (JT_NombreEquipo.getText().length() >= 20) {
            evt.consume();
        }
    }//GEN-LAST:event_JT_NombreEquipoKeyTyped

    private void JT_yearFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_yearFKeyTyped
        // Limitar que sea de 4 digitos
        if (JT_yearF.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_JT_yearFKeyTyped

    private void JT_PosicionRankingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JT_PosicionRankingKeyTyped
        // Limitar digitos

        if (JT_PosicionRanking.getText().length() >= 3) {
            String Ob_Pos;
            Ob_Pos = JT_PosicionRanking.getText();
            int numPos = Integer.parseInt(Ob_Pos);
            System.out.print("El numero digitado es: " + numPos);
            if (numPos < 1 || numPos > 100) {
                JT_PosicionRanking.setText(null);

                evt.consume();
            }

        }
    }//GEN-LAST:event_JT_PosicionRankingKeyTyped

    private void PanelPestañasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelPestañasMouseClicked
        // Evento de clic en pestanas de listado
        //Llamado a las funciones para listar los equipos que se van creando
        Equipo[] array = HashSetToArray(this.Equipos);

        CargarLista(array, tabla_listado);
        CargarLista(array, tabla_ordenarLista);
        JL_EdicionExitosa.setText(null);
        L_Equipo_Generado.setText(null);

    }//GEN-LAST:event_PanelPestañasMouseClicked

    private void JBu_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBu_buscarMouseClicked
        // Boton para accionar los metodos necesarios para buscar el ID
        Equipo[] array = HashSetToArray(this.Equipos);
        int[] arrayids = ArrayIDs(array);
        String IDdigitado = JT_IDbuscar.getText();
        int IDbuscar = Integer.parseInt(IDdigitado);
        int IDEncontrado = buscarIDrecursivo(arrayids, IDbuscar, 0);
        //Llamar a funcion para llenar cajas de texto.
        Extraeryllenar(array, IDEncontrado);
    }//GEN-LAST:event_JBu_buscarMouseClicked

    private void jButton_GuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GuardarCambiosActionPerformed
        // Acciones que ocurren al accionar el boton de guardar.
        //Llamo a la funcion para modificar los atributos y guardar en la coleccion el objeto actualizado.
        ModificaryGuardar();
        JT_FundacionEncontrado.setText(null);
        JT_RankingEncontrado.setText(null);
        JL_IDEncontrado.setText(null);
        JL_NombreEncontrado.setText(null);
        JT_IDbuscar.setText(null);
        
    }//GEN-LAST:event_jButton_GuardarCambiosActionPerformed

    private void JBu_OrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBu_OrdenarActionPerformed
        // Mostrar error si se seleccionan ambos tipos de ordenamiento o dato a ordenar
        if (JCheck_PosiciónRanking.isSelected() && JCheck_fundacion.isSelected()) {
            JL_AvisoOrden.setText("ERROR No es posible ordenar con varios métodos seleccionados, por favor eliga únicamente un orden");
        }

        if (JCheck_Burbuja.isSelected() && JCheck_QuickSort.isSelected()) {
            JL_AvisoOrden.setText("ERROR No es posible ordenar con varios métodos seleccionados, por favor eliga únicamente un método");
        }

        // Métodos para ejecutar todo lo correspondiente al ordenamiento de la lista
        //Llamo a la funcion para crear array de equipos basada en la colección
        Equipo[] array = HashSetToArray(this.Equipos);
        int[] array_ordenar;
        //Llamado a funciones para ordenar segun selecciones del usuario
        if (JCheck_fundacion.isSelected()) {
            array_ordenar = ArrayFundacion(array);
        } else {
            array_ordenar = ArrayRanking(array);
        }
                       
        if (JCheck_Burbuja.isSelected()) {
            Ordenar(array_ordenar, array);
        }

        if (JCheck_QuickSort.isSelected()) {
            //Previo a la funcion defino los indices del arreglo para usarlos como parametros.
            int izq = 0;
            int der = array_ordenar.length - 1;
            OrdQuickSort(array_ordenar, array, izq, der);
        }
        CargarLista(array, tabla_ordenarLista);
    }//GEN-LAST:event_JBu_OrdenarActionPerformed


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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Registrar;
    private javax.swing.JButton JBu_Ordenar;
    private javax.swing.JButton JBu_buscar;
    private javax.swing.JCheckBox JCheck_Burbuja;
    private javax.swing.JCheckBox JCheck_PosiciónRanking;
    private javax.swing.JCheckBox JCheck_QuickSort;
    private javax.swing.JCheckBox JCheck_fundacion;
    private javax.swing.JLabel JL_AvisoOrden;
    private javax.swing.JLabel JL_EdicionExitosa;
    private javax.swing.JLabel JL_FundacionB;
    private javax.swing.JLabel JL_IDEncontrado;
    private javax.swing.JLabel JL_IDb;
    private javax.swing.JLabel JL_ImageByE;
    private javax.swing.JLabel JL_NombreB;
    private javax.swing.JLabel JL_NombreEncontrado;
    private javax.swing.JLabel JL_OrdenarCon;
    private javax.swing.JLabel JL_OrdenarSegun;
    private javax.swing.JLabel JL_RankingB;
    private javax.swing.JLabel JL_TittleOrdenar;
    private javax.swing.JSeparator JSeparador;
    private javax.swing.JTextField JT_FundacionEncontrado;
    private javax.swing.JTextField JT_IDbuscar;
    private javax.swing.JTextField JT_NombreEquipo;
    private javax.swing.JTextField JT_PosicionRanking;
    private javax.swing.JTextField JT_RankingEncontrado;
    private javax.swing.JTable JT_TablaOrdenar;
    private javax.swing.JTextField JT_yearF;
    private javax.swing.JTable JTa_Listado;
    private javax.swing.JLabel L_AñoFundacion;
    private javax.swing.JLabel L_Equipo_Generado;
    private javax.swing.JLabel L_NombreEquipo;
    private javax.swing.JLabel L_Posicion;
    private javax.swing.JLabel L_messagesRegistro;
    private javax.swing.JLabel L_textosolicitdID;
    private javax.swing.JPanel PByE;
    private javax.swing.JPanel PListaE;
    private javax.swing.JPanel POdL;
    private javax.swing.JPanel PRegistro;
    private javax.swing.JTabbedPane PanelPestañas;
    private javax.swing.JPanel Panel_base;
    private javax.swing.JLabel TittleListado;
    private javax.swing.JLabel TittleMain;
    private javax.swing.JLabel TittleRegistro;
    private javax.swing.JButton jButton_GuardarCambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
