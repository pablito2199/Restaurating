/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Menu;
import clases.ProductoCarta;
import java.awt.Color;
import java.awt.Image;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pabli
 */
public class pago extends javax.swing.JFrame {

    private final String ventana;
    private final String ventanac;
    private final restaurating sesion;
    private Double precio;
    private final Calendar calendario;
    private int hora;
    private int minuto;

    /**
     * Creates new form principal
     *
     * @param ventana
     * @param ventanac
     * @param sesion
     */
    public pago(String ventana, String ventanac, restaurating sesion) {
        initComponents();
        escalarImagenTarjeta();
        escalarImagenSalir();
        escalarImagenAnadir();

        this.ventana = ventana;
        this.ventanac = ventanac;
        this.sesion = sesion;
        this.precio = 0.0;
        this.calendario = new GregorianCalendar();

        tablaCarrito.getColumn("Tipo").setMaxWidth(120);
        tablaCarrito.getColumn("Cantidad").setMaxWidth(500);
        tablaCarrito.getColumn("Cantidad").setPreferredWidth(120);
        tablaCarrito.getColumn("Precio").setPreferredWidth(120);
        tablaCarrito.getColumn("Precio").setMaxWidth(200);
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        tablaCarrito.getColumn("Precio").setCellRenderer(rightRenderer);
        DefaultTableCellRenderer render = (DefaultTableCellRenderer) tablaCarrito.getTableHeader().getDefaultRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        tablaCarrito.getTableHeader().setReorderingAllowed(false);
        tablaCarrito.setRowHeight(30);
        tablaCarrito.getTableHeader().setFont(new java.awt.Font("DIalog", 0, 18));
        actualizarTabla();

        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH");
        this.hora = Integer.parseInt(hourFormat.format(date));
        this.minuto = calendario.get(Calendar.MINUTE);
        if (hora < 17) {
            if (hora < 13) {
                if (hora < 12) {
                    hora = 12;
                    minuto = 30;
                } else {
                    if (minuto < 30) {
                        if (minuto > 10) {
                            hora++;
                            minuto = 0;
                        } else {
                            minuto = 30;
                        }
                    } else {
                        if (minuto > 40) {
                            hora++;
                            minuto = 30;
                        } else {
                            hora++;
                            minuto = 0;
                        }
                    }
                }
            } else {
                if (minuto < 30) {
                    if (minuto > 10) {
                        hora++;
                        minuto = 0;
                    } else {
                        minuto = 30;
                    }
                } else {
                    if (minuto > 40) {
                        hora++;
                        minuto = 30;
                    } else {
                        hora++;
                        minuto = 0;
                    }
                }
            }
            btnManana.setSelected(true);
            btnNoche.setSelected(false);
            btnManana.setBackground(new Color(0, 153, 0));
            btnNoche.setBackground(Color.WHITE);
        } else {
            if (hora < 20) {
                if (hora < 19) {
                    hora = 19;
                    minuto = 30;
                } else {
                    if (minuto < 30) {
                        if (minuto > 10) {
                            hora++;
                            minuto = 0;
                        } else {
                            minuto = 30;
                        }
                    } else {
                        if (minuto > 40) {
                            hora++;
                            minuto = 30;
                        } else {
                            hora++;
                            minuto = 0;
                        }
                    }
                }
            }
            btnNoche.setSelected(true);
            btnManana.setSelected(false);
            btnNoche.setBackground(new Color(0, 153, 0));
            btnManana.setBackground(Color.WHITE);
        }
        actualizarHora();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloPagina = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnAnadir = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        precioCambiado = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnMenosHora = new javax.swing.JButton();
        btnMasHora = new javax.swing.JButton();
        horaRecogida = new javax.swing.JTextField();
        btnManana = new javax.swing.JToggleButton();
        btnNoche = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        horaActual = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caja");

        tituloPagina.setBackground(new java.awt.Color(255, 102, 102));
        tituloPagina.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloPagina.setForeground(new java.awt.Color(255, 102, 102));
        tituloPagina.setText("Caja");

        btnVolver.setBackground(new java.awt.Color(255, 102, 102));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVolverMouseExited(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnAnadir.setBackground(new java.awt.Color(255, 102, 102));
        btnAnadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAnadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAnadir.setText("Añadir más productos al pedido");
        btnAnadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnadirMouseExited(evt);
            }
        });
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnInsertar.setBackground(new java.awt.Color(255, 102, 102));
        btnInsertar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInsertar.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar.setText("Inserte su tarjeta para continuar");
        btnInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertarMouseExited(evt);
            }
        });
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        tablaCarrito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Productos", "Cantidad", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaCarrito.setEnabled(false);
        tablaCarrito.setRowSelectionAllowed(false);
        tablaCarrito.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(tablaCarrito);

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Resumen del Pedido");

        precioCambiado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        precioCambiado.setForeground(new java.awt.Color(0, 0, 0));
        precioCambiado.setText("0.00 €");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("IMPORTE TOTAL:");

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Seleccionar Hora de Recogida");

        btnMenosHora.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosHora.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosHora.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosHora.setText("-");
        btnMenosHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosHoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosHoraMouseExited(evt);
            }
        });
        btnMenosHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosHoraActionPerformed(evt);
            }
        });

        btnMasHora.setBackground(new java.awt.Color(0, 153, 0));
        btnMasHora.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasHora.setForeground(new java.awt.Color(255, 255, 255));
        btnMasHora.setText("+");
        btnMasHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasHoraActionPerformed(evt);
            }
        });

        horaRecogida.setEditable(false);
        horaRecogida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        horaRecogida.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnManana.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnManana.setText("Mediodía");
        btnManana.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMananaActionPerformed(evt);
            }
        });

        btnNoche.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnNoche.setText("Noche");
        btnNoche.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNocheActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 3, 30)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Horarios Disponibles");

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("12:30 - 16:30");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("19:30 - 23:30");

        horaActual.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        horaActual.setForeground(new java.awt.Color(0, 0, 255));
        horaActual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        horaActual.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel1.setText("Hora Actual:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Observaciones");

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(153, 153, 153));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Si tienes algo que comentarnos  con respecto al pedido, escríbalo en este cuadro de texto.");
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(835, 835, 835)
                .addComponent(tituloPagina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(horaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(layout.createSequentialGroup()
                .addGap(582, 582, 582)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioCambiado)))
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addGap(100, 100, 100))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnManana)
                                .addGap(18, 18, 18)
                                .addComponent(btnNoche)
                                .addGap(97, 97, 97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(36, 36, 36))
                            .addComponent(btnInsertar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMenosHora, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(horaRecogida, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMasHora)
                                .addGap(123, 123, 123)))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tituloPagina))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(precioCambiado)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManana)
                            .addComponent(btnNoche))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenosHora)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMasHora)
                                .addComponent(horaRecogida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        regresoVentana(ventana);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAnadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseEntered
        btnAnadir.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnAnadirMouseEntered

    private void btnAnadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseExited
        btnAnadir.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnAnadirMouseExited

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        principal vent = new principal(sesion);
        vent.comprobarProductos();
        vent.setLocationRelativeTo(null);
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnInsertarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseEntered
        btnInsertar.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnInsertarMouseEntered

    private void btnInsertarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertarMouseExited
        btnInsertar.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnInsertarMouseExited

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        pin vent = new pin(this, horaRecogida.getText());
        vent.setLocationRelativeTo(null);
        vent.setVisible(true);
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnMenosHoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosHoraMouseEntered
        btnMenosHora.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosHoraMouseEntered

    private void btnMenosHoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosHoraMouseExited
        btnMenosHora.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosHoraMouseExited

    private void btnMenosHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosHoraActionPerformed
        int horaAux = hora;
        int minutoAux = minuto - 30;
        Date date = new Date();
        DateFormat hourFormat = new SimpleDateFormat("HH");
        Integer horaComp = Integer.parseInt(hourFormat.format(date));
        if (minutoAux < 0) {
            horaAux--;
            minutoAux = 30;
        }
        if (horaComp < horaAux) {
            if (hora < 18) {
                if (horaAux < 13 && minutoAux != 30) {
                } else {
                    minuto = minutoAux;
                }
            } else {
                if (horaAux < 20 && minutoAux != 30) {
                } else {
                    minuto = minutoAux;
                }
            }
            hora = horaAux;
        } else if (horaComp == horaAux) {
            if (minutoAux < 11) {
                minuto = minutoAux;
                hora = horaAux;
            }
        }
        actualizarHora();
    }//GEN-LAST:event_btnMenosHoraActionPerformed

    private void btnMasHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasHoraActionPerformed
        int horaAux = hora;
        int minutoAux = minuto + 30;
        if (minutoAux > 30) {
            if (minutoAux > 60) {
                minutoAux = 00;
            }
        }
        if (hora < 18) {
            if (horaAux > 15 && minutoAux != 30) {
            } else {
                minuto = minutoAux;
            }
        } else {
            if (horaAux > 22 && minutoAux != 30) {
            } else {
                minuto = minutoAux;
            }
        }
        hora = horaAux;
        actualizarHora();
    }//GEN-LAST:event_btnMasHoraActionPerformed

    private void btnMananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMananaActionPerformed
        btnManana.setSelected(true);
        btnNoche.setSelected(false);
        btnManana.setBackground(new Color(0, 153, 0));
        btnNoche.setBackground(Color.WHITE);
        if (hora > 18) {
            hora = 12;
            minuto = 30;
        }
        actualizarHora();
    }//GEN-LAST:event_btnMananaActionPerformed

    private void btnNocheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNocheActionPerformed
        btnNoche.setSelected(true);
        btnManana.setSelected(false);
        btnNoche.setBackground(new Color(0, 153, 0));
        btnManana.setBackground(Color.WHITE);
        if (hora < 18) {
            hora = 19;
            minuto = 30;
        }
        actualizarHora();
    }//GEN-LAST:event_btnNocheActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        jTextArea1.setText("");
        jTextArea1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jTextArea1MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JToggleButton btnManana;
    private javax.swing.JButton btnMasHora;
    private javax.swing.JButton btnMenosHora;
    private javax.swing.JToggleButton btnNoche;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel horaActual;
    private javax.swing.JTextField horaRecogida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel precioCambiado;
    private javax.swing.JTable tablaCarrito;
    private javax.swing.JLabel tituloPagina;
    // End of variables declaration//GEN-END:variables

    private void escalarImagenTarjeta() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/tarjeta.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnInsertar.setIcon(icon);
    }

    private void escalarImagenSalir() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/return.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnVolver.setIcon(icon);
    }

    private void escalarImagenAnadir() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/anadir.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnAnadir.setIcon(icon);
    }

    public void regresoVentana(String ventana) {
        switch (ventana) {
            case "carrito": {
                carrito vent = new carrito(ventanac, sesion);
                vent.setLocationRelativeTo(null);
                vent.setVisible(true);
                break;
            }
            case "principal": {
                principal vent = new principal(sesion);
                vent.comprobarProductos();
                vent.setLocationRelativeTo(null);
                vent.setVisible(true);
                break;
            }
            default:
                break;
        }
    }

    public void cerrarVentana() {
        this.dispose();
    }

    private void actualizarTabla() {
        precio = 0.0;

        DefaultTableModel modelo = (DefaultTableModel) tablaCarrito.getModel();
        for (Menu m : sesion.menu) {
            String menu = "";
            if (m.getEnsaladilla() != null) {
                menu += "Ensaladilla Rusa";
                if (m.getPostre() != null || m.getCachopo() != null || m.getSalmon() != null || m.getCafe() != null) {
                    menu += " + ";
                }
            }
            if (m.getCroquetas() != null) {
                menu += "Croquetas de Atún";
                if (m.getPostre() != null || m.getCachopo() != null || m.getSalmon() != null || m.getCafe() != null) {
                    menu += " + ";
                }
            }
            if (m.getCachopo() != null) {
                menu += "Cachopo de Ternera";
                if (m.getPostre() != null || m.getCafe() != null) {
                    menu += " + ";
                }
            }
            if (m.getSalmon() != null) {
                menu += "Salmón al Horno";
                if (m.getPostre() != null || m.getCafe() != null) {
                    menu += " + ";
                }
            }
            if (m.getPostre() != null) {
                menu += "Postre Sorpresa";
            }
            if (m.getCafe() != null) {
                menu += "Café";
            }
            Object[] fila = {"Menú", menu, m.getCantidad(), getTwoDecimals(m.getPrecio()) + " €"};
            modelo.addRow(fila);

            precio += m.getPrecio();
        }

        for (ProductoCarta p : sesion.productosCarta) {
            if (p.getCantidad() != 0) {
                Double pr = p.getCantidad() * p.getPrecio();
                pr = Math.round(pr * 100.0) / 100.0;
                Object[] fila = {"Carta", p.getProducto(), p.getCantidad(), getTwoDecimals(pr) + " €"};
                modelo.addRow(fila);

                precio += p.getCantidad() * p.getPrecio();
            }
        }

        precio = Math.round(precio * 100.0) / 100.0;
        precioCambiado.setText(getTwoDecimals(precio) + " €");

        modelo.fireTableDataChanged();
    }

    private void actualizarHora() {
        String min;
        switch (minuto) {
            case 0:
                min = "00";
                break;
            case 1:
                min = "01";
                break;
            case 2:
                min = "02";
                break;
            case 3:
                min = "03";
                break;
            case 4:
                min = "04";
                break;
            case 5:
                min = "05";
                break;
            case 6:
                min = "06";
                break;
            case 7:
                min = "07";
                break;
            case 8:
                min = "08";
                break;
            case 9:
                min = "09";
                break;
            case 10:
                min = "10";
                break;
            case 20:
                min = "20";
                break;
            case 30:
                min = "30";
                break;
            case 40:
                min = "40";
                break;
            case 50:
                min = "50";
                break;
            case 60:
                min = "00";
                minuto = 0;
                hora++;
                break;
            default:
                min = String.valueOf(minuto);
                break;
        }
        horaRecogida.setText(String.valueOf(hora) + ":" + min);
        Date date1 = new Date();
        DateFormat hourFormat1 = new SimpleDateFormat("HH:mm");
        horaActual.setText(hourFormat1.format(date1));
    }

    private static String getTwoDecimals(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }
}
