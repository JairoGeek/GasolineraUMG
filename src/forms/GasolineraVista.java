/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import Threads.Bomba1;
import Threads.CarWashThead;
import Threads.MovimientoCar;
import gasolinera.ColaN;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author JairoDev
 */
public class GasolineraVista extends javax.swing.JFrame {

    /**
     * Creates new form GasolineraVista
     */
    ColaN fifo = new ColaN();
    ColaN fifoCar = new ColaN();

    private final int sizeP = 5;
    private int con = 0;
    private int conCar = 0;
    private int derecho=150;
    private int tiempoCarWash=10;

    ArrayList<JLabel> autosL = new ArrayList<>();
    ArrayList<JLabel> autosB = new ArrayList<>();
    ArrayList<JLabel> autosW = new ArrayList<>();

    private boolean bomba1 = false;
    private boolean bomba2 = false;
    private boolean bomba3 = false;
    private boolean bomba4 = false;
    Bomba1 bombaTread1;
    CarWashThead carThread;
    MovimientoCar carMov;

    public GasolineraVista() {

        initComponents();
        ocultarCarros();
        insertarCarrosL();
        insertarCarrosB();
        insertarCarrosW();
        this.carM1.setVisible(false);
        this.carM2.setVisible(false);
        this.carM3.setVisible(false);
        this.carM4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPrecio1 = new javax.swing.JLabel();
        txtPrecio2 = new javax.swing.JLabel();
        txtPrecio3 = new javax.swing.JLabel();
        txtPrecio4 = new javax.swing.JLabel();
        carF3 = new javax.swing.JLabel();
        carF6 = new javax.swing.JLabel();
        carF5 = new javax.swing.JLabel();
        carF1 = new javax.swing.JLabel();
        carF4 = new javax.swing.JLabel();
        carB4 = new javax.swing.JLabel();
        carF2 = new javax.swing.JLabel();
        carB1 = new javax.swing.JLabel();
        carB2 = new javax.swing.JLabel();
        carB3 = new javax.swing.JLabel();
        carW1 = new javax.swing.JLabel();
        carW2 = new javax.swing.JLabel();
        carW3 = new javax.swing.JLabel();
        carW4 = new javax.swing.JLabel();
        labelParche = new javax.swing.JLabel();
        carM1 = new javax.swing.JLabel();
        carM2 = new javax.swing.JLabel();
        carM3 = new javax.swing.JLabel();
        carM4 = new javax.swing.JLabel();
        btnWash = new javax.swing.JButton();
        panelB4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCantB4 = new javax.swing.JTextField();
        btnB4 = new javax.swing.JButton();
        progress4 = new javax.swing.JProgressBar();
        panelB1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtCantB1 = new javax.swing.JTextField();
        btnB1 = new javax.swing.JButton();
        progress1 = new javax.swing.JProgressBar();
        panelB2 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtCantB2 = new javax.swing.JTextField();
        btnB2 = new javax.swing.JButton();
        progress2 = new javax.swing.JProgressBar();
        panelB3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtCantB3 = new javax.swing.JTextField();
        btnB3 = new javax.swing.JButton();
        progress3 = new javax.swing.JProgressBar();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        gas1 = new javax.swing.JLabel();
        gas2 = new javax.swing.JLabel();
        gas3 = new javax.swing.JLabel();
        gas4 = new javax.swing.JLabel();
        progress5 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gasolinera");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPrecio1.setBackground(new java.awt.Color(0, 0, 0));
        txtPrecio1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        txtPrecio1.setForeground(new java.awt.Color(0, 102, 0));
        txtPrecio1.setText(txtPrecio1.getText());
        getContentPane().add(txtPrecio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        txtPrecio2.setFont(txtPrecio1.getFont());
        txtPrecio2.setForeground(txtPrecio1.getForeground());
        txtPrecio2.setText(txtPrecio1.getText());
        getContentPane().add(txtPrecio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        txtPrecio3.setFont(txtPrecio1.getFont());
        txtPrecio3.setForeground(txtPrecio1.getForeground());
        txtPrecio3.setText(txtPrecio1.getText());
        getContentPane().add(txtPrecio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        txtPrecio4.setFont(txtPrecio1.getFont());
        txtPrecio4.setForeground(txtPrecio1.getForeground());
        txtPrecio4.setText(txtPrecio1.getText());
        getContentPane().add(txtPrecio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 60, -1, -1));

        carF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 210, 90));

        carF6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 400, 210, 90));

        carF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 400, 210, 90));

        carF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 210, 90));

        carF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 400, 210, 90));

        carB4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 270, 210, 90));

        carF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 210, 90));

        carB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, 90));

        carB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 210, 90));

        carB3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 210, 90));

        carW1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carW1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 210, 90));

        carW2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carW2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 540, 210, 90));

        carW3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carW3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 540, 210, 90));

        carW4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carW4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 540, 210, 90));

        labelParche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(labelParche, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 640, -1, 160));

        carM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 670, 210, 90));

        carM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 670, 210, 90));

        carM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 670, 210, 90));

        carM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carro.png"))); // NOI18N
        getContentPane().add(carM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 670, 210, 90));

        btnWash.setText("Lavar Carro");
        btnWash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWashActionPerformed(evt);
            }
        });
        getContentPane().add(btnWash, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, -1, -1));

        panelB4.setBorder(javax.swing.BorderFactory.createTitledBorder("Bomba4"));
        panelB4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Q.");
        panelB4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        txtCantB4.setFont(new java.awt.Font("Engravers MT", 2, 18)); // NOI18N
        txtCantB4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantB4.setBorder(null);
        txtCantB4.setEnabled(false);
        panelB4.add(txtCantB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        btnB4.setText("Iniciar");
        btnB4.setEnabled(false);
        btnB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB4ActionPerformed(evt);
            }
        });
        panelB4.add(btnB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        panelB4.add(progress4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 162, 150, 20));

        getContentPane().add(panelB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, 200, 220));

        panelB1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bomba1"));
        panelB1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Q.");
        panelB1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        txtCantB1.setFont(new java.awt.Font("Engravers MT", 2, 18)); // NOI18N
        txtCantB1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantB1.setBorder(null);
        txtCantB1.setEnabled(false);
        panelB1.add(txtCantB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        btnB1.setText("Iniciar");
        btnB1.setEnabled(false);
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });
        panelB1.add(btnB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        panelB1.add(progress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 20));

        getContentPane().add(panelB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 200, 220));

        panelB2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bomba2"));
        panelB2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Q.");
        panelB2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        txtCantB2.setFont(txtCantB1.getFont());
        txtCantB2.setHorizontalAlignment(txtCantB1.getHorizontalAlignment());
        txtCantB2.setBorder(null);
        txtCantB2.setEnabled(false);
        panelB2.add(txtCantB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        btnB2.setText("Iniciar");
        btnB2.setEnabled(false);
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });
        panelB2.add(btnB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        panelB2.add(progress2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 20));

        getContentPane().add(panelB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 200, 220));

        panelB3.setBorder(javax.swing.BorderFactory.createTitledBorder("Bomba3"));
        panelB3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setText("Q.");
        panelB3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 20, 20));

        txtCantB3.setFont(txtCantB1.getFont());
        txtCantB3.setHorizontalAlignment(txtCantB1.getHorizontalAlignment());
        txtCantB3.setBorder(null);
        txtCantB3.setEnabled(false);
        panelB3.add(txtCantB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        btnB3.setText("Iniciar");
        btnB3.setEnabled(false);
        btnB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB3ActionPerformed(evt);
            }
        });
        panelB3.add(btnB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));
        panelB3.add(progress3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 162, 150, 20));

        getContentPane().add(panelB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, 200, 220));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrtera.jpg"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 280, 660, 110));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrtera.jpg"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, 110));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrtera.jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, -1, 110));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrtera.jpg"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 410, 660, 110));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrtera.jpg"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, 110));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carrtera.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, -1, 110));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, -1, 240));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, -1, 240));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 240));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, -1, 430));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 370, -1, 430));

        jButton5.setText("Nuevo Carro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 660, -1, -1));

        jButton6.setText("Verificar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 720, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gramaH.jpg"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, 430));

        gas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dispensario2.png"))); // NOI18N
        getContentPane().add(gas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        gas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dispensario2.png"))); // NOI18N
        gas2.setText(" ");
        getContentPane().add(gas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        gas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dispensario2.png"))); // NOI18N
        getContentPane().add(gas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        gas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dispensario2.png"))); // NOI18N
        getContentPane().add(gas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, -1));
        getContentPane().add(progress5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 150, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/carwash.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 320, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (fifo.size() > sizeP) {
            System.out.println("Ya no se permiten carros");
        } else {
            fifo.push(con);
            for (int i = 0; i < fifo.size(); i++) {
                if (autosL.get(i).isVisible() == false) {
                    autosL.get(i).setVisible(true);
                    break;
                }
            }
            //autosL.get(con).setVisible(true);
            System.out.println(con);
            con++;

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (fifo.size() == 0) {
            System.out.println("No hay carros en la fila");
        } else {
            if (this.carM1.isVisible() && carM2.isVisible() && carM3.isVisible() && carM4.isVisible()) {
                System.out.println("Todas estan ocupadas");
            } else {
                int i = fifo.pop();
                System.out.println("Se saco el elemento" + i);
                con--;
                
                verificarBomba();
                this.autosL.get(con).setVisible(false);

            }

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        try {
            if (txtCantB1.getText().equals("")) {
                System.out.println("Ingrese un valor ");
            } else {
                int cant = Integer.parseInt(txtCantB1.getText());
                bombaTread1 = new Bomba1(this.txtPrecio1, this.progress1, cant, this.carB1, 0, fifoCar, this.conCar, autosW,carM1);
                this.bombaTread1.start();
                this.desabilitarCampos(0);
                if (cant > derecho) {
                    conCar++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        try {
            if (txtCantB2.getText().equals("")) {
                System.out.println("Ingrese un valor ");
            } else {
                int cant = Integer.parseInt(txtCantB2.getText());
                bombaTread1 = new Bomba1(this.txtPrecio2, this.progress2, cant, this.carB2, 1, fifoCar, this.conCar, autosW,carM2);
                this.bombaTread1.start();
                this.desabilitarCampos(1);
                if (cant > derecho) {
                    conCar++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        try {
            if (txtCantB3.getText().equals("")) {
                System.out.println("Ingrese un valor ");
            } else {
                int cant = Integer.parseInt(txtCantB3.getText());
                bombaTread1 = new Bomba1(this.txtPrecio3, this.progress3, cant, this.carB3, 2, fifoCar, this.conCar, autosW,carM3);
                this.bombaTread1.start();
                this.desabilitarCampos(2);
                if (cant > derecho) {
                    conCar++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnB3ActionPerformed

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
        try {
            if (txtCantB4.getText().equals("")) {
                System.out.println("Ingrese un valor ");
            } else {
                int cant = Integer.parseInt(txtCantB4.getText());
                bombaTread1 = new Bomba1(this.txtPrecio4, this.progress4, cant, this.carB4, 3, fifoCar, this.conCar, autosW,carM4);
                this.bombaTread1.start();
                this.desabilitarCampos(3);
                if (cant > derecho) {
                    conCar++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnB4ActionPerformed

    private void btnWashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWashActionPerformed
        if (fifoCar.size() == 0) {
            System.out.println("No hay Carros en el carWash");
        } else {
            int i = fifoCar.pop();
            System.out.println("Se saco el elemento del CarWash: " + i);
            btnWash.setEnabled(false);
            this.carThread = new CarWashThead(this.progress5, this.tiempoCarWash,btnWash);
            carThread.start();
            conCar--;
            this.autosW.get(conCar).setVisible(false);
            
        }
    }//GEN-LAST:event_btnWashActionPerformed

    private int verificarBomba() {
        int pos = 0;
        if (!carM1.isVisible()) {
            pos = 0;
            bomba1 = true;
            habilitarCampos(pos);
            carM1.setLocation(1270, 270);
            carM1.setVisible(true);
            this.carMov = new MovimientoCar(carM1,this.autosB.get(pos),90,btnB1);
            carMov.start();
            return pos;
        }
        if (!carM2.isVisible()) {
            pos = 1;
            bomba2 = true;
            habilitarCampos(pos);
            carM2.setLocation(1270, 270);
            carM2.setVisible(true);
            this.carMov = new MovimientoCar(carM2,this.autosB.get(pos),430,btnB2);
            carMov.start();
            return pos;
        }

        if (!carM3.isVisible()) {
            pos = 2;
            bomba3 = true;
            habilitarCampos(pos);
            carM3.setLocation(1270, 270);
            carM3.setVisible(true);
            this.carMov = new MovimientoCar(carM3,this.autosB.get(pos),790,btnB3);
            carMov.start();
            return pos;
        }
        if (!carM4.isVisible()) {
            pos = 3;
            bomba4 = true;
            habilitarCampos(pos);
            carM4.setLocation(1270, 270);
            carM4.setVisible(true);
            this.carMov = new MovimientoCar(carM4,this.autosB.get(pos),1150,btnB4);
            carMov.start();
            return pos;
        } else {
            pos = 4;

            System.out.println("Todas las bombas estan ocupadas. porfavor espere....");
            return pos;
        }

    }

    private void habilitarCampos(int bomba) {
        try {
            switch (bomba) {
                case 0:
                    this.txtCantB1.setEnabled(true);
                    
                    this.txtPrecio1.setText("0.0");
                    this.progress1.setValue(0);
                    break;
                case 1:
                    this.txtCantB2.setEnabled(true);
                    
                    this.txtPrecio2.setText("0.0");
                    this.progress2.setValue(0);
                    break;

                case 2:
                    this.txtCantB3.setEnabled(true);
                    
                    this.txtPrecio3.setText("0.0");
                    this.progress3.setValue(0);
                    break;
                case 3:
                    this.txtCantB4.setEnabled(true);
                    
                    this.txtPrecio4.setText("0.0");
                    this.progress4.setValue(0);
                    break;

                default:

                    break;

            }
        } catch (Exception e) {
        }
    }

    public void desabilitarCampos(int bomba) {
        try {
            switch (bomba) {
                case 0:
                    this.txtCantB1.setEnabled(false);
                    this.txtCantB1.setText("");
                    btnB1.setEnabled(false);
                    bomba1 = false;
                    //this.autosB.get(bomba).setVisible(false);
                    break;
                case 1:
                    this.txtCantB2.setEnabled(false);
                    this.txtCantB2.setText("");
                    btnB2.setEnabled(false);
                    bomba2 = false;
                    break;
                case 2:
                    this.txtCantB3.setEnabled(false);
                    this.txtCantB3.setText("");

                    btnB3.setEnabled(false);
                    bomba3 = false;
                    break;
                case 3:
                    this.txtCantB4.setEnabled(false);
                    this.txtCantB4.setText("");
                    btnB4.setEnabled(false);
                    bomba4 = false;
                    break;
                default:
                    break;

            }
        } catch (Exception e) {
        }
    }

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
            java.util.logging.Logger.getLogger(GasolineraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GasolineraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GasolineraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GasolineraVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GasolineraVista().setVisible(true);
            }
        });
    }

    private void ocultarCarros() {
        carB1.setVisible(false);
        carB2.setVisible(false);
        carB3.setVisible(false);
        carB4.setVisible(false);
        carF1.setVisible(false);
        carF2.setVisible(false);
        carF3.setVisible(false);
        carF4.setVisible(false);
        carF5.setVisible(false);
        carF6.setVisible(false);
        carW1.setVisible(false);
        carW2.setVisible(false);
        carW3.setVisible(false);
        carW4.setVisible(false);
    }

    private void insertarCarrosL() {

        autosL.add(carF1);
        autosL.add(carF2);
        autosL.add(carF3);
        autosL.add(carF4);
        autosL.add(carF5);
        autosL.add(carF6);

    }

    private void insertarCarrosB() {
        autosB.add(carB1);
        autosB.add(carB2);
        autosB.add(carB3);
        autosB.add(carB4);
    }

    private void insertarCarrosW() {
        autosW.add(carW1);
        autosW.add(carW2);
        autosW.add(carW3);
        autosW.add(carW4);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnB1;
    private javax.swing.JButton btnB2;
    private javax.swing.JButton btnB3;
    private javax.swing.JButton btnB4;
    private javax.swing.JButton btnWash;
    private javax.swing.JLabel carB1;
    private javax.swing.JLabel carB2;
    private javax.swing.JLabel carB3;
    private javax.swing.JLabel carB4;
    private javax.swing.JLabel carF1;
    private javax.swing.JLabel carF2;
    private javax.swing.JLabel carF3;
    private javax.swing.JLabel carF4;
    private javax.swing.JLabel carF5;
    private javax.swing.JLabel carF6;
    private javax.swing.JLabel carM1;
    private javax.swing.JLabel carM2;
    private javax.swing.JLabel carM3;
    private javax.swing.JLabel carM4;
    private javax.swing.JLabel carW1;
    private javax.swing.JLabel carW2;
    private javax.swing.JLabel carW3;
    private javax.swing.JLabel carW4;
    private javax.swing.JLabel gas1;
    private javax.swing.JLabel gas2;
    private javax.swing.JLabel gas3;
    private javax.swing.JLabel gas4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel labelParche;
    private javax.swing.JPanel panelB1;
    private javax.swing.JPanel panelB2;
    private javax.swing.JPanel panelB3;
    private javax.swing.JPanel panelB4;
    private javax.swing.JProgressBar progress1;
    private javax.swing.JProgressBar progress2;
    private javax.swing.JProgressBar progress3;
    private javax.swing.JProgressBar progress4;
    private javax.swing.JProgressBar progress5;
    private javax.swing.JTextField txtCantB1;
    private javax.swing.JTextField txtCantB2;
    private javax.swing.JTextField txtCantB3;
    private javax.swing.JTextField txtCantB4;
    private javax.swing.JLabel txtPrecio1;
    private javax.swing.JLabel txtPrecio2;
    private javax.swing.JLabel txtPrecio3;
    private javax.swing.JLabel txtPrecio4;
    // End of variables declaration//GEN-END:variables

    public boolean isBomba1() {
        return bomba1;
    }

    public void setBomba1(boolean bomba1) {
        this.bomba1 = bomba1;
    }

    public boolean isBomba2() {
        return bomba2;
    }

    public void setBomba2(boolean bomba2) {
        this.bomba2 = bomba2;
    }

    public boolean isBomba3() {
        return bomba3;
    }

    public void setBomba3(boolean bomba3) {
        this.bomba3 = bomba3;
    }

    public boolean isBomba4() {
        return bomba4;
    }

    public void setBomba4(boolean bomba4) {
        this.bomba4 = bomba4;
    }
}
