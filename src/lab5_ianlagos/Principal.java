/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_ianlagos;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author ian
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_SuperHeroes = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombre_super = new javax.swing.JTextField();
        tf_edad_super = new javax.swing.JTextField();
        tf_planta_super = new javax.swing.JTextField();
        tf_villanos_encarcelados = new javax.swing.JTextField();
        jb_agregar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_altura_super = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sp_poder = new javax.swing.JSpinner();
        jb_regresar_super = new javax.swing.JToggleButton();
        jd_SuperVillanos = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sp_poder_v = new javax.swing.JSpinner();
        tf_nombe_v = new javax.swing.JTextField();
        tf_edad_v = new javax.swing.JTextField();
        tf_planeta_v = new javax.swing.JTextField();
        tf_casualties = new javax.swing.JTextField();
        tf_altura = new javax.swing.JTextField();
        tf_encarcelado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jb_agregar_V = new javax.swing.JToggleButton();
        jb_regresar_V = new javax.swing.JToggleButton();
        jd_Carcel = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_carcel = new javax.swing.JList<>();
        jd_Listar = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jToggleButton5 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();

        jd_SuperHeroes.setMinimumSize(new java.awt.Dimension(600, 400));
        jd_SuperHeroes.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Edad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Planeta de origen");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Villanos encarcelados");

        jb_agregar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_agregar.setText("Agregar");
        jb_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Altura");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nivel Poder");

        sp_poder.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jb_regresar_super.setText("Regresar");
        jb_regresar_super.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresar_superMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_SuperHeroesLayout = new javax.swing.GroupLayout(jd_SuperHeroes.getContentPane());
        jd_SuperHeroes.getContentPane().setLayout(jd_SuperHeroesLayout);
        jd_SuperHeroesLayout.setHorizontalGroup(
            jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SuperHeroesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SuperHeroesLayout.createSequentialGroup()
                        .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_SuperHeroesLayout.createSequentialGroup()
                                .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tf_nombre_super, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tf_edad_super, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(tf_planta_super)
                                    .addComponent(tf_villanos_encarcelados)
                                    .addComponent(tf_altura_super, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27))
                    .addGroup(jd_SuperHeroesLayout.createSequentialGroup()
                        .addComponent(jb_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(256, 256, 256)))
                .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_regresar_super)
                    .addGroup(jd_SuperHeroesLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(sp_poder, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jd_SuperHeroesLayout.setVerticalGroup(
            jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_SuperHeroesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jd_SuperHeroesLayout.createSequentialGroup()
                        .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nombre_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(sp_poder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_edad_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(24, 24, 24)
                        .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_planta_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_villanos_encarcelados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(20, 20, 20)
                        .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_altura_super, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jd_SuperHeroesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_agregar)
                    .addComponent(jb_regresar_super))
                .addGap(93, 93, 93))
        );

        jd_SuperVillanos.setMinimumSize(new java.awt.Dimension(700, 400));
        jd_SuperVillanos.setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Edad");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Planeta de Origen");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Numero de Muertes Causadas");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Altura");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Encarselado[si/no]");

        sp_poder_v.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Nivel de Poder");

        jb_agregar_V.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_agregar_V.setText("Agregar");
        jb_agregar_V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregar_VMouseClicked(evt);
            }
        });

        jb_regresar_V.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_regresar_V.setText("Regresar");
        jb_regresar_V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_regresar_VMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_SuperVillanosLayout = new javax.swing.GroupLayout(jd_SuperVillanos.getContentPane());
        jd_SuperVillanos.getContentPane().setLayout(jd_SuperVillanosLayout);
        jd_SuperVillanosLayout.setHorizontalGroup(
            jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_SuperVillanosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tf_altura, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                    .addComponent(tf_casualties)
                    .addComponent(tf_planeta_v)
                    .addComponent(tf_edad_v)
                    .addComponent(tf_nombe_v)
                    .addComponent(tf_encarcelado))
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SuperVillanosLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(sp_poder_v, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_SuperVillanosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jb_agregar_V)
                            .addComponent(jb_regresar_V))
                        .addGap(69, 69, 69))))
        );
        jd_SuperVillanosLayout.setVerticalGroup(
            jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SuperVillanosLayout.createSequentialGroup()
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SuperVillanosLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(sp_poder_v, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_SuperVillanosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf_nombe_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jd_SuperVillanosLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9))
                    .addGroup(jd_SuperVillanosLayout.createSequentialGroup()
                        .addComponent(tf_edad_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_planeta_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_agregar_V))))
                .addGap(33, 33, 33)
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_casualties, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_altura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_regresar_V))
                .addGap(23, 23, 23)
                .addGroup(jd_SuperVillanosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_encarcelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jd_Carcel.setMinimumSize(new java.awt.Dimension(530, 420));

        jl_carcel.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_carcel);

        javax.swing.GroupLayout jd_CarcelLayout = new javax.swing.GroupLayout(jd_Carcel.getContentPane());
        jd_Carcel.getContentPane().setLayout(jd_CarcelLayout);
        jd_CarcelLayout.setHorizontalGroup(
            jd_CarcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CarcelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jd_CarcelLayout.setVerticalGroup(
            jd_CarcelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_CarcelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jd_Listar.setMinimumSize(new java.awt.Dimension(700, 500));
        jd_Listar.setPreferredSize(new java.awt.Dimension(700, 500));

        jScrollPane1.setViewportView(jList1);

        jToggleButton5.setText("jToggleButton5");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Villanos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("the dark avengers");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("the sinister six");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Heroes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("the avengers");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("X-men");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane2.setViewportView(jTree1);

        javax.swing.GroupLayout jd_ListarLayout = new javax.swing.GroupLayout(jd_Listar.getContentPane());
        jd_Listar.getContentPane().setLayout(jd_ListarLayout);
        jd_ListarLayout.setHorizontalGroup(
            jd_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ListarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jd_ListarLayout.setVerticalGroup(
            jd_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ListarLayout.createSequentialGroup()
                .addGroup(jd_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ListarLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jToggleButton5))
                    .addGroup(jd_ListarLayout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(jd_ListarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("SuperHeroes");
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton2.setText("SuperVillanos");
        jToggleButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton2MouseClicked(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton3.setText("Carcel");
        jToggleButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton3MouseClicked(evt);
            }
        });

        jToggleButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton4.setText("Listar");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                        .addComponent(jToggleButton4)
                        .addGap(34, 34, 34))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton3)
                            .addComponent(jToggleButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton4))
                .addGap(18, 18, 18)
                .addComponent(jToggleButton2)
                .addGap(18, 18, 18)
                .addComponent(jToggleButton3)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
        // TODO add your handling code here:
        Principal p1 = new Principal();
        p1.setVisible(false);
        dispose();
        jd_SuperHeroes.setVisible(true);
        jd_SuperHeroes.setLocationRelativeTo(this);
    }//GEN-LAST:event_jToggleButton1MouseClicked

    private void jb_agregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarMouseClicked
        // TODO add your handling code here:

        
        Todos.add(Heroes.add(new super_heroes(Integer.parseInt(tf_villanos_encarcelados.getText()), (Integer) sp_poder.getValue(), tf_nombre_super.getText(), Integer.parseInt(tf_edad_super.getText()), tf_planta_super.getText(), Double.parseDouble(tf_altura_super.getText()))));
        //
        sp_poder.setValue(0);
        tf_villanos_encarcelados.setText("");
        tf_nombre_super.setText("");
        tf_edad_super.setText("");
        tf_altura_super.setText("");
        tf_planta_super.setText("");

    }//GEN-LAST:event_jb_agregarMouseClicked

    private void jb_regresar_superMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresar_superMouseClicked
        // TODO add your handling code here:
        jd_SuperHeroes.setVisible(false);
        
        Principal p2 = new Principal();
        p2.setVisible(true);
    }//GEN-LAST:event_jb_regresar_superMouseClicked

    private void jToggleButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton2MouseClicked
        // TODO add your handling code here:
        Principal p3 = new Principal();
        p3.setVisible(false);
        dispose();
        jd_SuperVillanos.setVisible(true);
        jd_SuperVillanos.setLocationRelativeTo(this);
    }//GEN-LAST:event_jToggleButton2MouseClicked

    private void jb_agregar_VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregar_VMouseClicked
        // TODO add your handling code here:
        Villanos.add(new supervillano(tf_encarcelado.getText(), Integer.parseInt(tf_casualties.getText()), (Integer) sp_poder_v.getValue(), tf_nombe_v.getText(), Integer.parseInt(tf_edad_v.getText()), tf_planeta_v.getText(), Double.parseDouble(tf_altura.getText())));
        Todos.add(Villanos);
        
        //
        sp_poder_v.setValue(0);
        tf_encarcelado.setText("");
        tf_nombe_v.setText("");
        tf_edad_v.setText("");
        tf_altura.setText("");
        tf_planeta_v.setText("");
        tf_casualties.setText("");
    }//GEN-LAST:event_jb_agregar_VMouseClicked

    private void jb_regresar_VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_regresar_VMouseClicked
        // TODO add your handling code here:
        jd_SuperVillanos.setVisible(false);
        
        Principal p4 = new Principal();
        p4.setVisible(true);
    }//GEN-LAST:event_jb_regresar_VMouseClicked

    private void jToggleButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton3MouseClicked
        // TODO add your handling code here:
        Principal p5 = new Principal();
        p5.setVisible(false); 
        dispose();
        jd_Carcel.setVisible(true);
        jd_Carcel.setLocationRelativeTo(this);
        DefaultListModel modelo= (DefaultListModel) jl_carcel.getModel();
        modelo.addElement(Villanos.get(0).getNombre());
        jl_carcel.setModel(modelo);
    }//GEN-LAST:event_jToggleButton3MouseClicked

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JTree jTree1;
    private javax.swing.JButton jb_agregar;
    private javax.swing.JToggleButton jb_agregar_V;
    private javax.swing.JToggleButton jb_regresar_V;
    private javax.swing.JToggleButton jb_regresar_super;
    private javax.swing.JDialog jd_Carcel;
    private javax.swing.JDialog jd_Listar;
    private javax.swing.JDialog jd_SuperHeroes;
    private javax.swing.JDialog jd_SuperVillanos;
    private javax.swing.JList<String> jl_carcel;
    private javax.swing.JSpinner sp_poder;
    private javax.swing.JSpinner sp_poder_v;
    private javax.swing.JTextField tf_altura;
    private javax.swing.JTextField tf_altura_super;
    private javax.swing.JTextField tf_casualties;
    private javax.swing.JTextField tf_edad_super;
    private javax.swing.JTextField tf_edad_v;
    private javax.swing.JTextField tf_encarcelado;
    private javax.swing.JTextField tf_nombe_v;
    private javax.swing.JTextField tf_nombre_super;
    private javax.swing.JTextField tf_planeta_v;
    private javax.swing.JTextField tf_planta_super;
    private javax.swing.JTextField tf_villanos_encarcelados;
    // End of variables declaration//GEN-END:variables
    ArrayList<super_heroes> Heroes = new ArrayList();
    ArrayList<supervillano> Villanos = new ArrayList();
    ArrayList Todos = new ArrayList();
    
}
