/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.ProductoCarta;
import java.awt.Color;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author pabli
 */
public class configuracion extends javax.swing.JFrame {

    private final String ventana;
    private final String ventana1;
    private final restaurating sesion;
    private Double precio;
    private final ProductoCarta milanesa;
    private Double precioMilanesa;
    private final ProductoCarta conejo;
    private Double precioConejo;
    private final ProductoCarta calamares;
    private Double precioCalamares;
    private final ProductoCarta dorada;
    private Double precioDorada;
    private final ProductoCarta tarta;
    private Double precioTarta;
    private final ProductoCarta macedonia;
    private Double precioMacedonia;
    private final ProductoCarta agua;
    private Double precioAgua;
    private final ProductoCarta refresco;
    private Double precioRefresco;
    private final ProductoCarta cerveza;
    private Double precioCerveza;
    private final ProductoCarta vino;
    private Double precioVino;

    /**
     * Creates new form principal
     *
     * @param sesion
     * @param ventana
     * @param ventana1
     */
    public configuracion(restaurating sesion, String ventana, String ventana1) {
        initComponents();
        escalarImagenCarrito();
        escalarImagenSalir();
        escalarImagenGuardar();
        escalarImagenInfo();
        escalarImagenMilanesa();
        escalarImagenConejo();
        escalarImagenCalamares();
        escalarImagenDorada();
        escalarImagenTarta();
        escalarImagenMacedonia();
        escalarImagenAgua();
        escalarImagenRefresco();
        escalarImagenCerveza();
        escalarImagenVino();

        this.ventana = ventana;
        this.ventana1 = ventana1;
        this.sesion = sesion;
        this.precio = 0.0;
        this.milanesa = new ProductoCarta("Milanesa de Ternera", 5.20);
        this.conejo = new ProductoCarta("Conejo Asado", 6.35);
        this.calamares = new ProductoCarta("Calamares Fritos", 7.60);
        this.dorada = new ProductoCarta("Dorada al Horno", 7.15);
        this.tarta = new ProductoCarta("Tarta de la Abuela", 3.30);
        this.macedonia = new ProductoCarta("Macedonia", 2.65);
        this.agua = new ProductoCarta("Agua", 1.20);
        this.refresco = new ProductoCarta("Refresco", 2.00);
        this.cerveza = new ProductoCarta("Cerveza", 1.80);
        this.vino = new ProductoCarta("Copa de Vino", 2.30);

        for (ProductoCarta prod : sesion.productosCarta) {
            switch (prod.getProducto()) {
                case "Milanesa de Ternera":
                    this.milanesa.setCantidad(prod.getCantidad());
                    cantidadMilanesa.setText(milanesa.getCantidad().toString());
                    break;
                case "Conejo Asado":
                    this.conejo.setCantidad(prod.getCantidad());
                    cantidadConejo.setText(conejo.getCantidad().toString());
                    break;
                case "Calamares Fritos":
                    this.calamares.setCantidad(prod.getCantidad());
                    cantidadCalamares.setText(calamares.getCantidad().toString());
                    break;
                case "Dorada al Horno":
                    this.dorada.setCantidad(prod.getCantidad());
                    cantidadDorada.setText(dorada.getCantidad().toString());
                    break;
                case "Tarta de la Abuela":
                    this.tarta.setCantidad(prod.getCantidad());
                    cantidadTarta.setText(tarta.getCantidad().toString());
                    break;
                case "Macedonia":
                    this.macedonia.setCantidad(prod.getCantidad());
                    cantidadMacedonia.setText(macedonia.getCantidad().toString());
                    break;
                case "Agua":
                    this.agua.setCantidad(prod.getCantidad());
                    cantidadAgua.setText(agua.getCantidad().toString());
                    break;
                case "Refresco":
                    this.refresco.setCantidad(prod.getCantidad());
                    cantidadRefresco.setText(refresco.getCantidad().toString());
                    break;
                case "Cerveza":
                    this.cerveza.setCantidad(prod.getCantidad());
                    cantidadCerveza.setText(cerveza.getCantidad().toString());
                    break;
                default:
                    this.vino.setCantidad(prod.getCantidad());
                    cantidadVino.setText(vino.getCantidad().toString());
                    break;
            }
        }
        this.precioMilanesa = milanesa.getCantidad() * milanesa.getPrecio();
        this.precioConejo = conejo.getCantidad() * conejo.getPrecio();
        this.precioCalamares = calamares.getCantidad() * calamares.getPrecio();
        this.precioDorada = dorada.getCantidad() * dorada.getPrecio();
        this.precioTarta = tarta.getCantidad() * tarta.getPrecio();
        this.precioMacedonia = macedonia.getCantidad() * macedonia.getPrecio();
        this.precioAgua = agua.getCantidad() * agua.getPrecio();
        this.precioRefresco = refresco.getCantidad() * refresco.getPrecio();
        this.precioCerveza = cerveza.getCantidad() * cerveza.getPrecio();
        this.precioVino = vino.getCantidad() * vino.getPrecio();

        cambioPrecio();
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
        btnCarrito = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        milanesaIMG = new javax.swing.JLabel();
        cantidadMilanesa = new javax.swing.JTextField();
        btnMasMilanesa = new javax.swing.JButton();
        btnMenosMilanesa = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnAnadir = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        precioCambiado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnMenosConejo = new javax.swing.JButton();
        cantidadConejo = new javax.swing.JTextField();
        btnMasConejo = new javax.swing.JButton();
        conejoIMG = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        calamaresIMG = new javax.swing.JLabel();
        btnMenosCalamares = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cantidadCalamares = new javax.swing.JTextField();
        btnMasCalamares = new javax.swing.JButton();
        doradaIMG = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnMenosDorada = new javax.swing.JButton();
        cantidadDorada = new javax.swing.JTextField();
        btnMasDorada = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tartaIMG = new javax.swing.JLabel();
        btnMenosTarta = new javax.swing.JButton();
        cantidadTarta = new javax.swing.JTextField();
        btnMasTarta = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        macedoniaIMG = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnMenosMacedonia = new javax.swing.JButton();
        cantidadMacedonia = new javax.swing.JTextField();
        btnMasMacedonia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        aguaIMG = new javax.swing.JLabel();
        btnMenosAgua = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnMasAgua = new javax.swing.JButton();
        cantidadAgua = new javax.swing.JTextField();
        vinoIMG = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnMenosRefresco = new javax.swing.JButton();
        cantidadRefresco = new javax.swing.JTextField();
        btnMasRefresco = new javax.swing.JButton();
        refrescoIMG = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnMenosCerveza = new javax.swing.JButton();
        cantidadCerveza = new javax.swing.JTextField();
        btnMasCerveza = new javax.swing.JButton();
        btnMenosVino = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        cantidadVino = new javax.swing.JTextField();
        btnMasVino = new javax.swing.JButton();
        cervezaIMG = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pedir a la Carta");

        tituloPagina.setBackground(new java.awt.Color(255, 102, 102));
        tituloPagina.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        tituloPagina.setForeground(new java.awt.Color(255, 102, 102));
        tituloPagina.setText("Pedir a la Carta");

        btnCarrito.setBackground(new java.awt.Color(255, 102, 102));
        btnCarrito.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCarrito.setForeground(new java.awt.Color(255, 255, 255));
        btnCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/carrito.png"))); // NOI18N
        btnCarrito.setText("Ver pedido actual");
        btnCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCarritoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCarritoMouseExited(evt);
            }
        });
        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("CARNE");

        milanesaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        milanesaIMG.setText("jLabel5");

        cantidadMilanesa.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadMilanesa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadMilanesa.setText("0");
        cantidadMilanesa.setEnabled(false);

        btnMasMilanesa.setBackground(new java.awt.Color(0, 153, 0));
        btnMasMilanesa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasMilanesa.setForeground(new java.awt.Color(255, 255, 255));
        btnMasMilanesa.setText("+");
        btnMasMilanesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasMilanesa.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasMilanesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasMilanesaActionPerformed(evt);
            }
        });

        btnMenosMilanesa.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosMilanesa.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosMilanesa.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosMilanesa.setText("-");
        btnMenosMilanesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosMilanesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosMilanesaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosMilanesaMouseExited(evt);
            }
        });
        btnMenosMilanesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosMilanesaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Milanesa de Ternera (5,20 €/plato)");

        btnAnadir.setBackground(new java.awt.Color(255, 102, 102));
        btnAnadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAnadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAnadir.setText("Guardar Pedido");
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

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("PRECIO:");

        precioCambiado.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        precioCambiado.setForeground(new java.awt.Color(0, 0, 0));
        precioCambiado.setText("0.00 €");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Conejo Asado (6,35 €/plato)");

        btnMenosConejo.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosConejo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosConejo.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosConejo.setText("-");
        btnMenosConejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosConejo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosConejoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosConejoMouseExited(evt);
            }
        });
        btnMenosConejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosConejoActionPerformed(evt);
            }
        });

        cantidadConejo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadConejo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadConejo.setText("0");
        cantidadConejo.setEnabled(false);

        btnMasConejo.setBackground(new java.awt.Color(0, 153, 0));
        btnMasConejo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasConejo.setForeground(new java.awt.Color(255, 255, 255));
        btnMasConejo.setText("+");
        btnMasConejo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasConejo.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasConejo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasConejoActionPerformed(evt);
            }
        });

        conejoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        conejoIMG.setText("jLabel5");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jLabel2.setText("PESCADO/MARISCO");

        calamaresIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        calamaresIMG.setText("jLabel5");

        btnMenosCalamares.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosCalamares.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosCalamares.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosCalamares.setText("-");
        btnMenosCalamares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosCalamares.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosCalamaresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosCalamaresMouseExited(evt);
            }
        });
        btnMenosCalamares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosCalamaresActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Calamares (7,60 €/plato)");

        cantidadCalamares.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadCalamares.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadCalamares.setText("0");
        cantidadCalamares.setEnabled(false);

        btnMasCalamares.setBackground(new java.awt.Color(0, 153, 0));
        btnMasCalamares.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasCalamares.setForeground(new java.awt.Color(255, 255, 255));
        btnMasCalamares.setText("+");
        btnMasCalamares.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasCalamares.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasCalamares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCalamaresActionPerformed(evt);
            }
        });

        doradaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        doradaIMG.setText("jLabel5");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Dorada al Horno (7,15 €/plato)");

        btnMenosDorada.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosDorada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosDorada.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosDorada.setText("-");
        btnMenosDorada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosDorada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosDoradaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosDoradaMouseExited(evt);
            }
        });
        btnMenosDorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosDoradaActionPerformed(evt);
            }
        });

        cantidadDorada.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadDorada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadDorada.setText("0");
        cantidadDorada.setEnabled(false);

        btnMasDorada.setBackground(new java.awt.Color(0, 153, 0));
        btnMasDorada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasDorada.setForeground(new java.awt.Color(255, 255, 255));
        btnMasDorada.setText("+");
        btnMasDorada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasDorada.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasDorada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasDoradaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 102));
        jLabel3.setText("POSTRES");

        tartaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        tartaIMG.setText("jLabel5");

        btnMenosTarta.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosTarta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosTarta.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosTarta.setText("-");
        btnMenosTarta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosTarta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosTartaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosTartaMouseExited(evt);
            }
        });
        btnMenosTarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosTartaActionPerformed(evt);
            }
        });

        cantidadTarta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadTarta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadTarta.setText("0");
        cantidadTarta.setEnabled(false);

        btnMasTarta.setBackground(new java.awt.Color(0, 153, 0));
        btnMasTarta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasTarta.setForeground(new java.awt.Color(255, 255, 255));
        btnMasTarta.setText("+");
        btnMasTarta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasTarta.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasTarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasTartaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Tarta de la Abuela (3,30 €/ud.)");

        macedoniaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        macedoniaIMG.setText("jLabel5");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Macedonia (2,65 €/ud.)");

        btnMenosMacedonia.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosMacedonia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosMacedonia.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosMacedonia.setText("-");
        btnMenosMacedonia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosMacedonia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosMacedoniaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosMacedoniaMouseExited(evt);
            }
        });
        btnMenosMacedonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosMacedoniaActionPerformed(evt);
            }
        });

        cantidadMacedonia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadMacedonia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadMacedonia.setText("0");
        cantidadMacedonia.setEnabled(false);

        btnMasMacedonia.setBackground(new java.awt.Color(0, 153, 0));
        btnMasMacedonia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasMacedonia.setForeground(new java.awt.Color(255, 255, 255));
        btnMasMacedonia.setText("+");
        btnMasMacedonia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasMacedonia.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasMacedonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasMacedoniaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("BEBIDAS");

        aguaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        aguaIMG.setText("jLabel5");

        btnMenosAgua.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosAgua.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosAgua.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosAgua.setText("-");
        btnMenosAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosAgua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosAguaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosAguaMouseExited(evt);
            }
        });
        btnMenosAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosAguaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Agua (1,20 €/ud.)");

        btnMasAgua.setBackground(new java.awt.Color(0, 153, 0));
        btnMasAgua.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasAgua.setForeground(new java.awt.Color(255, 255, 255));
        btnMasAgua.setText("+");
        btnMasAgua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasAgua.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasAguaActionPerformed(evt);
            }
        });

        cantidadAgua.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadAgua.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadAgua.setText("0");
        cantidadAgua.setEnabled(false);

        vinoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        vinoIMG.setText("jLabel5");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setText("Refresco (2,00 €/ud.)");

        btnMenosRefresco.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosRefresco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosRefresco.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosRefresco.setText("-");
        btnMenosRefresco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosRefresco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosRefrescoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosRefrescoMouseExited(evt);
            }
        });
        btnMenosRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosRefrescoActionPerformed(evt);
            }
        });

        cantidadRefresco.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadRefresco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadRefresco.setText("0");
        cantidadRefresco.setEnabled(false);

        btnMasRefresco.setBackground(new java.awt.Color(0, 153, 0));
        btnMasRefresco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasRefresco.setForeground(new java.awt.Color(255, 255, 255));
        btnMasRefresco.setText("+");
        btnMasRefresco.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasRefresco.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasRefresco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasRefrescoActionPerformed(evt);
            }
        });

        refrescoIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        refrescoIMG.setText("jLabel5");

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setText("Cerveza (1,80 €/ud.)");

        btnMenosCerveza.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosCerveza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosCerveza.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosCerveza.setText("-");
        btnMenosCerveza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosCerveza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosCervezaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosCervezaMouseExited(evt);
            }
        });
        btnMenosCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosCervezaActionPerformed(evt);
            }
        });

        cantidadCerveza.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadCerveza.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadCerveza.setText("0");
        cantidadCerveza.setEnabled(false);

        btnMasCerveza.setBackground(new java.awt.Color(0, 153, 0));
        btnMasCerveza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasCerveza.setForeground(new java.awt.Color(255, 255, 255));
        btnMasCerveza.setText("+");
        btnMasCerveza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasCerveza.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasCerveza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasCervezaActionPerformed(evt);
            }
        });

        btnMenosVino.setBackground(new java.awt.Color(255, 102, 102));
        btnMenosVino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMenosVino.setForeground(new java.awt.Color(255, 255, 255));
        btnMenosVino.setText("-");
        btnMenosVino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenosVino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenosVinoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenosVinoMouseExited(evt);
            }
        });
        btnMenosVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosVinoActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setText("Vino (2,30 €/copa)");

        cantidadVino.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cantidadVino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadVino.setText("0");
        cantidadVino.setEnabled(false);

        btnMasVino.setBackground(new java.awt.Color(0, 153, 0));
        btnMasVino.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnMasVino.setForeground(new java.awt.Color(255, 255, 255));
        btnMasVino.setText("+");
        btnMasVino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasVino.setPreferredSize(new java.awt.Dimension(40, 40));
        btnMasVino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasVinoActionPerformed(evt);
            }
        });

        cervezaIMG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"))); // NOI18N
        cervezaIMG.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("*el refresco se indica al dependiente al recoger el pedido");

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("SOBRE ALERGIAS Y GLUTEN");

        btnInfo.setBackground(new java.awt.Color(255, 102, 102));
        btnInfo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("Ver Información");
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
        });
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(milanesaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(tartaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(conejoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(macedoniaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel8))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(27, 27, 27)
                                    .addComponent(jLabel10)
                                    .addGap(105, 105, 105))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(65, 65, 65)
                                    .addComponent(btnMenosTarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cantidadTarta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMasTarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(147, 147, 147)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(btnMenosMacedonia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cantidadMacedonia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnMasMacedonia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addGap(109, 109, 109))
                                .addComponent(jLabel11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnMenosMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMasMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(btnMenosConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cantidadConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMasConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnMenosAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMasAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMenosRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(cantidadRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMasRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMenosCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnMasCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMenosVino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cantidadVino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnMasVino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel16))
                        .addGap(112, 112, 112))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(134, 134, 134))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(calamaresIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(doradaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(374, 374, 374)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnMenosCalamares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cantidadCalamares, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnMasCalamares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(134, 134, 134)
                                                        .addComponent(btnMenosDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(cantidadDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnMasDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(80, 80, 80)
                                                        .addComponent(jLabel9))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(aguaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(refrescoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cervezaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(vinoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(tituloPagina)
                                .addGap(501, 501, 501)
                                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(precioCambiado)
                .addGap(1062, 1062, 1062))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloPagina))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(precioCambiado)))
                            .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(milanesaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(conejoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(calamaresIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(doradaIMG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMenosMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasMilanesa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenosConejo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMenosCalamares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadCalamares, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasCalamares, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMenosDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasDorada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vinoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnMenosVino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cantidadVino, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMasVino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(macedoniaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(tartaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnMenosTarta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cantidadTarta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMasTarta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMenosMacedonia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cantidadMacedonia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMasMacedonia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(refrescoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cervezaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cantidadRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnMasRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMenosCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cantidadCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMasCerveza, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnMenosRefresco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(aguaIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 183, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMenosAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMasAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarritoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarritoMouseEntered
        btnCarrito.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnCarritoMouseEntered

    private void btnCarritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarritoMouseExited
        btnCarrito.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnCarritoMouseExited

    private void btnVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseEntered
        btnVolver.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnVolverMouseEntered

    private void btnVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseExited
        btnVolver.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnVolverMouseExited

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        regresoVentana();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        carrito vent = new carrito("configuracion", sesion);
        vent.comprobarProductos();
        vent.setLocationRelativeTo(null);
        vent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void btnMenosMilanesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosMilanesaActionPerformed
        if (Integer.parseInt(cantidadMilanesa.getText()) > 0) {
            cantidadMilanesa.setText(String.valueOf((Integer.parseInt(cantidadMilanesa.getText()) - 1)));
        }
        if (milanesa.getCantidad() > 0) {
            milanesa.setCantidad(Integer.parseInt(cantidadMilanesa.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosMilanesaActionPerformed

    private void btnMasMilanesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasMilanesaActionPerformed
        cantidadMilanesa.setText(String.valueOf((Integer.parseInt(cantidadMilanesa.getText()) + 1)));
        milanesa.setCantidad(Integer.parseInt(cantidadMilanesa.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasMilanesaActionPerformed

    private void btnMenosMilanesaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMilanesaMouseEntered
        btnMenosMilanesa.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosMilanesaMouseEntered

    private void btnMenosMilanesaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMilanesaMouseExited
        btnMenosMilanesa.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosMilanesaMouseExited

    private void btnAnadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseEntered
        btnAnadir.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnAnadirMouseEntered

    private void btnAnadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnadirMouseExited
        btnAnadir.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnAnadirMouseExited

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        sesion.productosCarta = new ArrayList<>();

        sesion.productosCarta.add(milanesa);
        sesion.productosCarta.add(conejo);
        sesion.productosCarta.add(calamares);
        sesion.productosCarta.add(dorada);
        sesion.productosCarta.add(tarta);
        sesion.productosCarta.add(macedonia);
        sesion.productosCarta.add(agua);
        sesion.productosCarta.add(refresco);
        sesion.productosCarta.add(cerveza);
        sesion.productosCarta.add(vino);

        regresoVentana();
        JOptionPane.showMessageDialog(null, "Su pedido a la carta ha sido actualizado.");
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnMenosConejoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosConejoMouseEntered
        btnMenosConejo.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosConejoMouseEntered

    private void btnMenosConejoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosConejoMouseExited
        btnMenosConejo.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosConejoMouseExited

    private void btnMenosConejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosConejoActionPerformed
        if (Integer.parseInt(cantidadConejo.getText()) > 0) {
            cantidadConejo.setText(String.valueOf((Integer.parseInt(cantidadConejo.getText()) - 1)));
        }
        if (conejo.getCantidad() > 0) {
            conejo.setCantidad(Integer.parseInt(cantidadConejo.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosConejoActionPerformed

    private void btnMasConejoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasConejoActionPerformed
        cantidadConejo.setText(String.valueOf((Integer.parseInt(cantidadConejo.getText()) + 1)));
        conejo.setCantidad(Integer.parseInt(cantidadConejo.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasConejoActionPerformed

    private void btnMenosCalamaresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosCalamaresMouseEntered
        btnMenosCalamares.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosCalamaresMouseEntered

    private void btnMenosCalamaresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosCalamaresMouseExited
        btnMenosCalamares.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosCalamaresMouseExited

    private void btnMenosCalamaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosCalamaresActionPerformed
        if (Integer.parseInt(cantidadCalamares.getText()) > 0) {
            cantidadCalamares.setText(String.valueOf((Integer.parseInt(cantidadCalamares.getText()) - 1)));
        }
        if (calamares.getCantidad() > 0) {
            calamares.setCantidad(Integer.parseInt(cantidadCalamares.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosCalamaresActionPerformed

    private void btnMasCalamaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCalamaresActionPerformed
        cantidadCalamares.setText(String.valueOf((Integer.parseInt(cantidadCalamares.getText()) + 1)));
        calamares.setCantidad(Integer.parseInt(cantidadCalamares.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasCalamaresActionPerformed

    private void btnMenosDoradaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosDoradaMouseEntered
        btnMenosDorada.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosDoradaMouseEntered

    private void btnMenosDoradaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosDoradaMouseExited
        btnMenosDorada.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosDoradaMouseExited

    private void btnMenosDoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosDoradaActionPerformed
        if (Integer.parseInt(cantidadDorada.getText()) > 0) {
            cantidadDorada.setText(String.valueOf((Integer.parseInt(cantidadDorada.getText()) - 1)));
        }
        if (dorada.getCantidad() > 0) {
            dorada.setCantidad(Integer.parseInt(cantidadDorada.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosDoradaActionPerformed

    private void btnMasDoradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasDoradaActionPerformed
        cantidadDorada.setText(String.valueOf((Integer.parseInt(cantidadDorada.getText()) + 1)));
        dorada.setCantidad(Integer.parseInt(cantidadDorada.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasDoradaActionPerformed

    private void btnMenosTartaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosTartaMouseEntered
        btnMenosTarta.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosTartaMouseEntered

    private void btnMenosTartaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosTartaMouseExited
        btnMenosTarta.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosTartaMouseExited

    private void btnMenosTartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosTartaActionPerformed
        if (Integer.parseInt(cantidadTarta.getText()) > 0) {
            cantidadTarta.setText(String.valueOf((Integer.parseInt(cantidadTarta.getText()) - 1)));
        }
        if (tarta.getCantidad() > 0) {
            tarta.setCantidad(Integer.parseInt(cantidadTarta.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosTartaActionPerformed

    private void btnMasTartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasTartaActionPerformed
        cantidadTarta.setText(String.valueOf((Integer.parseInt(cantidadTarta.getText()) + 1)));
        tarta.setCantidad(Integer.parseInt(cantidadTarta.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasTartaActionPerformed

    private void btnMenosMacedoniaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMacedoniaMouseEntered
        btnMenosMacedonia.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosMacedoniaMouseEntered

    private void btnMenosMacedoniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMacedoniaMouseExited
        btnMenosMacedonia.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosMacedoniaMouseExited

    private void btnMenosMacedoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosMacedoniaActionPerformed
        if (Integer.parseInt(cantidadMacedonia.getText()) > 0) {
            cantidadMacedonia.setText(String.valueOf((Integer.parseInt(cantidadMacedonia.getText()) - 1)));
        }
        if (macedonia.getCantidad() > 0) {
            macedonia.setCantidad(Integer.parseInt(cantidadMacedonia.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosMacedoniaActionPerformed

    private void btnMasMacedoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasMacedoniaActionPerformed
        cantidadMacedonia.setText(String.valueOf((Integer.parseInt(cantidadMacedonia.getText()) + 1)));
        macedonia.setCantidad(Integer.parseInt(cantidadMacedonia.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasMacedoniaActionPerformed

    private void btnMenosAguaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosAguaMouseEntered
        btnMenosAgua.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosAguaMouseEntered

    private void btnMenosAguaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosAguaMouseExited
        btnMenosAgua.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosAguaMouseExited

    private void btnMenosAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosAguaActionPerformed
        if (Integer.parseInt(cantidadAgua.getText()) > 0) {
            cantidadAgua.setText(String.valueOf((Integer.parseInt(cantidadAgua.getText()) - 1)));
        }
        if (agua.getCantidad() > 0) {
            agua.setCantidad(Integer.parseInt(cantidadAgua.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosAguaActionPerformed

    private void btnMasAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasAguaActionPerformed
        cantidadAgua.setText(String.valueOf((Integer.parseInt(cantidadAgua.getText()) + 1)));
        agua.setCantidad(Integer.parseInt(cantidadAgua.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasAguaActionPerformed

    private void btnMenosRefrescoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosRefrescoMouseEntered
        btnMenosRefresco.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosRefrescoMouseEntered

    private void btnMenosRefrescoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosRefrescoMouseExited
        btnMenosRefresco.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosRefrescoMouseExited

    private void btnMenosRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosRefrescoActionPerformed
        if (Integer.parseInt(cantidadRefresco.getText()) > 0) {
            cantidadRefresco.setText(String.valueOf((Integer.parseInt(cantidadRefresco.getText()) - 1)));
        }
        if (refresco.getCantidad() > 0) {
            refresco.setCantidad(Integer.parseInt(cantidadRefresco.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosRefrescoActionPerformed

    private void btnMasRefrescoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasRefrescoActionPerformed
        cantidadRefresco.setText(String.valueOf((Integer.parseInt(cantidadRefresco.getText()) + 1)));
        refresco.setCantidad(Integer.parseInt(cantidadRefresco.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasRefrescoActionPerformed

    private void btnMenosCervezaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosCervezaMouseEntered
        btnMenosCerveza.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosCervezaMouseEntered

    private void btnMenosCervezaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosCervezaMouseExited
        btnMenosCerveza.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosCervezaMouseExited

    private void btnMenosCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosCervezaActionPerformed
        if (Integer.parseInt(cantidadCerveza.getText()) > 0) {
            cantidadCerveza.setText(String.valueOf((Integer.parseInt(cantidadCerveza.getText()) - 1)));
        }
        if (cerveza.getCantidad() > 0) {
            cerveza.setCantidad(Integer.parseInt(cantidadCerveza.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosCervezaActionPerformed

    private void btnMasCervezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasCervezaActionPerformed
        cantidadCerveza.setText(String.valueOf((Integer.parseInt(cantidadCerveza.getText()) + 1)));
        cerveza.setCantidad(Integer.parseInt(cantidadCerveza.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasCervezaActionPerformed

    private void btnMenosVinoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosVinoMouseEntered
        btnMenosVino.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnMenosVinoMouseEntered

    private void btnMenosVinoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosVinoMouseExited
        btnMenosVino.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnMenosVinoMouseExited

    private void btnMenosVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosVinoActionPerformed
        if (Integer.parseInt(cantidadVino.getText()) > 0) {
            cantidadVino.setText(String.valueOf((Integer.parseInt(cantidadVino.getText()) - 1)));
        }
        if (vino.getCantidad() > 0) {
            vino.setCantidad(Integer.parseInt(cantidadVino.getText()));
        }
        cambioPrecio();
    }//GEN-LAST:event_btnMenosVinoActionPerformed

    private void btnMasVinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasVinoActionPerformed
        cantidadVino.setText(String.valueOf((Integer.parseInt(cantidadVino.getText()) + 1)));
        vino.setCantidad(Integer.parseInt(cantidadVino.getText()));
        cambioPrecio();
    }//GEN-LAST:event_btnMasVinoActionPerformed

    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        btnInfo.setBackground(new Color(255, 51, 51));
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
        btnInfo.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnInfoMouseExited

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Los siguientes platos contienen gluten:\n - Milanesa de Ternera\n - Calamares Fritos\n - Tarta de la Abuela\n - Cerveza\n\nCualquier otra alergia o comentario, hagánoslo saber en la sección de observaciones en la página de pago.\nAdaptaremos el plato a sus necesidades.");
    }//GEN-LAST:event_btnInfoActionPerformed

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
            java.util.logging.Logger.getLogger(configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aguaIMG;
    private javax.swing.JButton btnAnadir;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnMasAgua;
    private javax.swing.JButton btnMasCalamares;
    private javax.swing.JButton btnMasCerveza;
    private javax.swing.JButton btnMasConejo;
    private javax.swing.JButton btnMasDorada;
    private javax.swing.JButton btnMasMacedonia;
    private javax.swing.JButton btnMasMilanesa;
    private javax.swing.JButton btnMasRefresco;
    private javax.swing.JButton btnMasTarta;
    private javax.swing.JButton btnMasVino;
    private javax.swing.JButton btnMenosAgua;
    private javax.swing.JButton btnMenosCalamares;
    private javax.swing.JButton btnMenosCerveza;
    private javax.swing.JButton btnMenosConejo;
    private javax.swing.JButton btnMenosDorada;
    private javax.swing.JButton btnMenosMacedonia;
    private javax.swing.JButton btnMenosMilanesa;
    private javax.swing.JButton btnMenosRefresco;
    private javax.swing.JButton btnMenosTarta;
    private javax.swing.JButton btnMenosVino;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel calamaresIMG;
    private javax.swing.JTextField cantidadAgua;
    private javax.swing.JTextField cantidadCalamares;
    private javax.swing.JTextField cantidadCerveza;
    private javax.swing.JTextField cantidadConejo;
    private javax.swing.JTextField cantidadDorada;
    private javax.swing.JTextField cantidadMacedonia;
    private javax.swing.JTextField cantidadMilanesa;
    private javax.swing.JTextField cantidadRefresco;
    private javax.swing.JTextField cantidadTarta;
    private javax.swing.JTextField cantidadVino;
    private javax.swing.JLabel cervezaIMG;
    private javax.swing.JLabel conejoIMG;
    private javax.swing.JLabel doradaIMG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel macedoniaIMG;
    private javax.swing.JLabel milanesaIMG;
    private javax.swing.JLabel precioCambiado;
    private javax.swing.JLabel refrescoIMG;
    private javax.swing.JLabel tartaIMG;
    private javax.swing.JLabel tituloPagina;
    private javax.swing.JLabel vinoIMG;
    // End of variables declaration//GEN-END:variables

    private void escalarImagenCarrito() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/carrito.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnCarrito.setIcon(icon);
    }

    private void escalarImagenMilanesa() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/milanesa.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(milanesaIMG.getWidth(), milanesaIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        milanesaIMG.setIcon(icon);
    }

    private void escalarImagenConejo() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/conejo.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(conejoIMG.getWidth(), conejoIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        conejoIMG.setIcon(icon);
    }

    private void escalarImagenCalamares() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/calamares.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(calamaresIMG.getWidth(), calamaresIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        calamaresIMG.setIcon(icon);
    }

    private void escalarImagenDorada() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/dorada.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(doradaIMG.getWidth(), doradaIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        doradaIMG.setIcon(icon);
    }

    private void escalarImagenTarta() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/tartaabuela.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(tartaIMG.getWidth(), tartaIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        tartaIMG.setIcon(icon);
    }

    private void escalarImagenMacedonia() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/macedonia.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(macedoniaIMG.getWidth(), macedoniaIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        macedoniaIMG.setIcon(icon);
    }

    private void escalarImagenAgua() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/agua.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(aguaIMG.getWidth(), aguaIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        aguaIMG.setIcon(icon);
    }

    private void escalarImagenRefresco() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/refresco.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(refrescoIMG.getWidth(), refrescoIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        refrescoIMG.setIcon(icon);
    }

    private void escalarImagenCerveza() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/cerveza.jpg"));
        Image img = icon.getImage();
        img = img.getScaledInstance(cervezaIMG.getWidth(), cervezaIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        cervezaIMG.setIcon(icon);
    }

    private void escalarImagenVino() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/vino.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(vinoIMG.getWidth(), vinoIMG.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        vinoIMG.setIcon(icon);
    }

    private void escalarImagenSalir() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/return.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnVolver.setIcon(icon);
    }

    private void escalarImagenInfo() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/info.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnInfo.setIcon(icon);
    }

    private void escalarImagenGuardar() {
        ImageIcon icon = new ImageIcon(getClass().getResource("/práctica/pkg4/imagenes/save.png"));
        Image img = icon.getImage();
        img = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);
        btnAnadir.setIcon(icon);
    }

    public void regresoVentana() {
        switch (ventana) {
            case "carrito": {
                carrito vent = new carrito(ventana1, sesion);
                vent.setLocationRelativeTo(null);
                vent.setVisible(true);
                this.dispose();
                break;
            }
            case "principal": {
                principal vent = new principal(sesion);
                vent.comprobarProductos();
                vent.setLocationRelativeTo(null);
                vent.setVisible(true);
                this.dispose();
                break;
            }
            default:
                break;
        }
    }

    private void cambioPrecio() {
        precioMilanesa = milanesa.getCantidad() * milanesa.getPrecio();
        precioConejo = conejo.getCantidad() * conejo.getPrecio();
        precioCalamares = calamares.getCantidad() * calamares.getPrecio();
        precioDorada = dorada.getCantidad() * dorada.getPrecio();
        precioTarta = tarta.getCantidad() * tarta.getPrecio();
        precioMacedonia = macedonia.getCantidad() * macedonia.getPrecio();
        precioAgua = agua.getCantidad() * agua.getPrecio();
        precioRefresco = refresco.getCantidad() * refresco.getPrecio();
        precioCerveza = cerveza.getCantidad() * cerveza.getPrecio();
        precioVino = vino.getCantidad() * vino.getPrecio();
        precio = precioMilanesa + precioConejo + precioCalamares + precioDorada + precioTarta + precioMacedonia + precioAgua + precioRefresco + precioCerveza + precioVino;
        precio = Math.round(precio * 100.0) / 100.0;
        precioCambiado.setText(getTwoDecimals(precio) + " €");
    }

    private static String getTwoDecimals(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }
}
