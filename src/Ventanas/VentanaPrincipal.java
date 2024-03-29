/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import jdk.internal.dynalink.beans.StaticClass;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Elvis
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    int auxilX;
    int auxilY;
    int m = 0;
    int x[] = new int[1000];
    int y[] = new int[1000];

    static int hora = 0, minuto = 0, segundo = 0;
    static int steps = 0;
    static boolean iniciaHilo = true;
    static boolean iniciaPasos = true;
    boolean corriendo = false;
    boolean corriendoPasos = false;
    
    static String velocidadReporte;
    static String tipoReporte;
    static String ordenamientoReporte;
    
    static String pasosReporte;
    static String tiempoReporte;
    

    static String titulos = "";

    public VentanaPrincipal() {

        initComponents();

        /*
        
         jTextArea1.setBackground(new Color(0, 0, 0, 0));
          jTextArea1.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1));
        jTextArea1.setEditable(false);//editar el area de texto
         */
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        ruta = new javax.swing.JTextField();
        cargar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ejecutar = new javax.swing.JButton();
        TipoAlgoritmo1 = new javax.swing.JComboBox<>();
        TipoOrden1 = new javax.swing.JComboBox<>();
        TipoVelocidad1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelGrafica = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tipoDeVelocidad = new javax.swing.JLabel();
        tipoDeOrden = new javax.swing.JLabel();
        tipoDeAlgoritmo = new javax.swing.JLabel();
        cronometro = new javax.swing.JLabel();
        labelPasos = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        setPreferredSize(new java.awt.Dimension(1600, 1000));
        setResizable(false);

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setBorder(new javax.swing.border.MatteBorder(null));
        panel.setForeground(new java.awt.Color(51, 51, 51));
        panel.setOpaque(false);
        panel.setPreferredSize(new java.awt.Dimension(1600, 1000));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel2.setText("Ruta del archivo");

        titulo.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloActionPerformed(evt);
            }
        });

        ruta.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutaActionPerformed(evt);
            }
        });

        cargar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cargar.setText("Cargar");
        cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 21)); // NOI18N
        jLabel9.setText("Panel de Opciones");

        jLabel10.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel10.setText("Velocidad");

        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel11.setText("Tipo");

        jLabel12.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel12.setText("Algoritmo");

        ejecutar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ejecutar.setText("Ejecutar");
        ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TipoAlgoritmo1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        TipoAlgoritmo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Burbuja", "Por Selección", "Por Inserción" }));
        TipoAlgoritmo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TipoAlgoritmo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoAlgoritmoActionPerformed(evt);
            }
        });

        TipoOrden1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        TipoOrden1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente" }));
        TipoOrden1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        TipoVelocidad1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        TipoVelocidad1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Media", "Rápida", "Lenta" }));
        TipoVelocidad1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoVelocidad1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoOrden1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoAlgoritmo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoAlgoritmo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TipoOrden1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TipoVelocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addComponent(ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        TipoAlgoritmo1.getAccessibleContext().setAccessibleParent(panel);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 21)); // NOI18N
        jLabel1.setText("Gráfica");

        javax.swing.GroupLayout PanelGraficaLayout = new javax.swing.GroupLayout(PanelGrafica);
        PanelGrafica.setLayout(PanelGraficaLayout);
        PanelGraficaLayout.setHorizontalGroup(
            PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelGraficaLayout.setVerticalGroup(
            PanelGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(752, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Ejecución");

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel17.setText("Caracteristicas del Algoritmo");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel3.setText("Algoritmo");

        jLabel19.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel19.setText("Pasos");

        jLabel20.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel20.setText("Tipo");

        jLabel21.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel21.setText("Velocidad");

        jLabel22.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel22.setText("Tiempo");

        tipoDeVelocidad.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N

        tipoDeOrden.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N

        tipoDeAlgoritmo.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N

        cronometro.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        cronometro.setText("00:00:00");

        labelPasos.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        labelPasos.setText("0");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel4))
                    .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoDeAlgoritmo)
                            .addComponent(tipoDeVelocidad)
                            .addComponent(tipoDeOrden, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelPasos))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(109, 109, 109)
                                .addComponent(cronometro)))
                        .addGap(24, 24, 24)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoDeAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoDeOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipoDeVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPasos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        jLabel18.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel18.setText("Título de la Gráfica");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ruta, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE)
                            .addComponent(titulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1629, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 931, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TipoAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoAlgoritmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoAlgoritmoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cronometro.setText("00:00:00");
        labelPasos.setText("0");
        iniciaHilo = true;
        corriendo = false;
        iniciaPasos = true;
        corriendoPasos = false;
        cronometro.setText("00:00:00");
        labelPasos.setText("0");
        String rutas = ruta.getText();
        PanelGrafica.removeAll();
        String nombreGrafico = titulo.getText();
        Object object = TipoAlgoritmo1.getSelectedItem();
        String algoritmo = String.valueOf(object);
        Object object1 = TipoOrden1.getSelectedItem();
        String orden = String.valueOf(object1);
        Object object2 = TipoVelocidad1.getSelectedItem();
        String velocidad = String.valueOf(object2);
        
        velocidadReporte=velocidad;
        tipoReporte=orden;
        ordenamientoReporte=algoritmo;
        

        if (rutas.length() != 0) {
            tipoDeAlgoritmo.setText(algoritmo);
            tipoDeOrden.setText(orden);
            tipoDeVelocidad.setText(velocidad);
        } else {
            System.out.println("no funciono");
        }
        
        


        int speed=0;
         if (velocidad.equals("Media")) {
            speed=500;

            } else if (velocidad.equals("Rápida")) {
                speed=100;
            
            }else if(velocidad.equals("Lenta")){
                speed=1260;
            }
         
         
        if (algoritmo.equals("Burbuja")) {
            if (orden.equals("Ascendente")) {
                MetodoBurbuja burb = new MetodoBurbuja(PanelGrafica,speed);
                burb.start();

            } else if (orden.equals("Descendente")) {

                MetodoBurbujaDescendente bd = new MetodoBurbujaDescendente(PanelGrafica,speed);
                bd.start();
            }
        } else if (algoritmo.equals("Por Inserción")) {
            if (orden.equals("Ascendente")) {
                
                   InsercionAscendente ia = new InsercionAscendente(PanelGrafica,speed);
                ia.start();

            } else if (orden.equals("Descendente")) {

                InsercionDescendente id = new InsercionDescendente(PanelGrafica,speed);
                id.start();
            }

        }else if(algoritmo.equals("Por Selección")){
            if (orden.equals("Ascendente")) {
                
                SeleccionAscendente sa =new SeleccionAscendente(PanelGrafica,speed);
            sa.start();

            } else if (orden.equals("Descendente")) {

              SeleccionDescendente sd = new SeleccionDescendente(PanelGrafica,speed);
              sd.start();
            }
           
        }

        if (corriendo == false) {
            iniciaHilo = true;
            corriendo = true;
            iniciarHiloCronometro();

        }
        if (corriendoPasos == false) {
            iniciaPasos = true;
            corriendoPasos = true;
            iniciarPasos();
        }
        // String te="";
        //  te+=steps;
        //  labelPasos.setText(te);

        //  Pasos pasoss = new Pasos(labelPasos);
        //pasoss.start();
    }//GEN-LAST:event_jButton3ActionPerformed
    private void iniciarPasos() {
        if (iniciaPasos == true) {
            Pasos miContadorPasos = new Pasos(labelPasos);
            miContadorPasos.start();

        }
    }

    private void iniciarHiloCronometro() {
        if (iniciaHilo == true) {
            System.out.println("inicia hilo");
            Cronometro miCronometro = new Cronometro(cronometro);
            miCronometro.start();
        }
    }


    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        labelPasos.setText("0");
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(this);
        File archivo = jf.getSelectedFile();
        if (archivo != null) {
            ruta.setText(archivo.getAbsolutePath());

        }


    }//GEN-LAST:event_buscarActionPerformed

    private void cargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarActionPerformed
        //MetodosSueltos admin = new MetodosSueltos();
        //   String rutas = admin.obtenerTexto(ruta.getText());
        // System.out.println(texto);
        tipoDeAlgoritmo.setText("");
        tipoDeOrden.setText("");
        tipoDeVelocidad.setText("");
        cronometro.setText("00:00:00");
        labelPasos.setText("0");

        iniciaHilo = true;
        corriendo = false;
        iniciaPasos = true;
        corriendoPasos = false;
        cronometro.setText("00:00:00");
        labelPasos.setText("0");
        PanelGrafica.removeAll();
        String rutas = ruta.getText();
        titulos = titulo.getText();
        MetodosSueltos a = new MetodosSueltos(rutas, PanelGrafica, titulos);
        repaint();

        

    }//GEN-LAST:event_cargarActionPerformed

    private void rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutaActionPerformed

    private void tituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tituloActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
                new VentanaPrincipal().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelGrafica;
    private javax.swing.JComboBox<String> TipoAlgoritmo1;
    private javax.swing.JComboBox<String> TipoOrden1;
    private javax.swing.JComboBox<String> TipoVelocidad1;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cargar;
    private javax.swing.JLabel cronometro;
    private javax.swing.JButton ejecutar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelPasos;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField ruta;
    private javax.swing.JLabel tipoDeAlgoritmo;
    private javax.swing.JLabel tipoDeOrden;
    private javax.swing.JLabel tipoDeVelocidad;
    private javax.swing.JTextField titulo;
    // End of variables declaration//GEN-END:variables
}
