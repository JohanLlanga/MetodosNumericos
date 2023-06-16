/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import metodosnumericos.Conversiones;

/**
 *
 * @author pablo
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Conversiones Conver = new Conversiones();
    public Main() {
        initComponents();
        Limpiar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CONVERSIONES = new javax.swing.JTabbedPane();
        PanConver = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cajaTxtConver = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelTxtBinAdec = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        BTcalBinAdec = new javax.swing.JButton();
        BTlimpiarBinAdec = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BTcalDecAbin = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelTxtDecAbin = new javax.swing.JLabel();
        BTcalOcAdeci = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        labelTxtOcAdec = new javax.swing.JLabel();
        BTcalHexaAdeci = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        labelTxtHexaAdeci = new javax.swing.JLabel();
        PanErrores = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cajaTxtErrN1 = new javax.swing.JTextField();
        cajaTxtErrN2 = new javax.swing.JTextField();
        btErrAbs = new javax.swing.JButton();
        btErrRe = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("METODOS NÚMERICOS");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        PanConver.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("INGRESA EL NUMERO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("RESULTADOS:");

        labelTxtBinAdec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTxtBinAdec.setText("--");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONVERSIONES");

        BTcalBinAdec.setBackground(new java.awt.Color(153, 255, 153));
        BTcalBinAdec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTcalBinAdec.setText("BINARIO A DECIMAL");
        BTcalBinAdec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcalBinAdecActionPerformed(evt);
            }
        });

        BTlimpiarBinAdec.setBackground(new java.awt.Color(153, 255, 153));
        BTlimpiarBinAdec.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTlimpiarBinAdec.setText("LIMPIAR");
        BTlimpiarBinAdec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlimpiarBinAdecActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("BINARIO A DECIMAL:");

        BTcalDecAbin.setBackground(new java.awt.Color(153, 255, 153));
        BTcalDecAbin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTcalDecAbin.setText("DECIMAL A BINARIO");
        BTcalDecAbin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcalDecAbinActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("DECIMAL A BINARIO:");

        labelTxtDecAbin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTxtDecAbin.setText("--");

        BTcalOcAdeci.setBackground(new java.awt.Color(153, 255, 153));
        BTcalOcAdeci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTcalOcAdeci.setText("OCTAL A DECIMAL");
        BTcalOcAdeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcalOcAdeciActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("OCTAL A DECIMAL:");

        labelTxtOcAdec.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTxtOcAdec.setText("--");

        BTcalHexaAdeci.setBackground(new java.awt.Color(153, 255, 153));
        BTcalHexaAdeci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BTcalHexaAdeci.setText("HEXADECIMAL A DECIMAL");
        BTcalHexaAdeci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTcalHexaAdeciActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("HEXADECIMAL A DECIMAL:");

        labelTxtHexaAdeci.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTxtHexaAdeci.setText("--");

        javax.swing.GroupLayout PanConverLayout = new javax.swing.GroupLayout(PanConver);
        PanConver.setLayout(PanConverLayout);
        PanConverLayout.setHorizontalGroup(
            PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanConverLayout.createSequentialGroup()
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanConverLayout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanConverLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTxtBinAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTxtDecAbin, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTxtOcAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTxtHexaAdeci, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanConverLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2)
                        .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanConverLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BTcalHexaAdeci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BTcalDecAbin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(PanConverLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cajaTxtConver, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanConverLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTcalOcAdeci, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTcalBinAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanConverLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BTlimpiarBinAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanConverLayout.setVerticalGroup(
            PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanConverLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTxtConver, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTcalBinAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTcalDecAbin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTcalOcAdeci, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTcalHexaAdeci, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(BTlimpiarBinAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTxtBinAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTxtDecAbin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTxtOcAdec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanConverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTxtHexaAdeci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        CONVERSIONES.addTab("CONVERSIONES", PanConver);

        PanErrores.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ERRORES");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("NUMERO 2:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("NUMERO 1:");

        btErrAbs.setBackground(new java.awt.Color(153, 255, 204));
        btErrAbs.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btErrAbs.setText("ERROR ABSOLUTO");

        btErrRe.setBackground(new java.awt.Color(153, 255, 204));
        btErrRe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btErrRe.setText("ERROR RELATIVO");
        btErrRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btErrReActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("RESULTADOS:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("ERROR ABSOLUTO:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("ERROR RELATIVO:");

        javax.swing.GroupLayout PanErroresLayout = new javax.swing.GroupLayout(PanErrores);
        PanErrores.setLayout(PanErroresLayout);
        PanErroresLayout.setHorizontalGroup(
            PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanErroresLayout.createSequentialGroup()
                .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanErroresLayout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addComponent(btErrAbs)
                            .addGap(45, 45, 45)
                            .addComponent(btErrRe, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanErroresLayout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanErroresLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cajaTxtErrN2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanErroresLayout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cajaTxtErrN1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(PanErroresLayout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanErroresLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanErroresLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        PanErroresLayout.setVerticalGroup(
            PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanErroresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTxtErrN1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaTxtErrN2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(PanErroresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btErrAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btErrRe, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        CONVERSIONES.addTab("ERRORES", PanErrores);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        CONVERSIONES.addTab("tab3", jPanel5);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        CONVERSIONES.addTab("tab4", jPanel6);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        CONVERSIONES.addTab("tab5", jPanel7);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONVERSIONES, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONVERSIONES)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTcalBinAdecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcalBinAdecActionPerformed
        // TODO add your handling code here:
        String BinAdeci = cajaTxtConver.getText();
        Conver.BinarioAdecimal(BinAdeci);
        
        labelTxtBinAdec.setText(String.valueOf(Conver.BinarioAdecimal(BinAdeci)));
    }//GEN-LAST:event_BTcalBinAdecActionPerformed

    private void BTlimpiarBinAdecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlimpiarBinAdecActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_BTlimpiarBinAdecActionPerformed

    private void BTcalDecAbinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcalDecAbinActionPerformed
        // TODO add your handling code here:
        double deciAbin=0;
        deciAbin = Double.parseDouble(cajaTxtConver.getText());
        int PartEntera = (int) deciAbin;
        double PartFrac = deciAbin - PartEntera;
        
        String PartEnteraBinaria = Integer.toBinaryString(PartEntera);
        String PartFactBinaria = Conver.DecimalAbinario(PartFrac);
        
        String NumeroBinario = PartEnteraBinaria + "." + PartFactBinaria;
        
        labelTxtDecAbin.setText(String.valueOf(NumeroBinario));
    }//GEN-LAST:event_BTcalDecAbinActionPerformed

    private void BTcalOcAdeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcalOcAdeciActionPerformed
        // TODO add your handling code here:
        String octalAdeci = cajaTxtConver.getText();
        Conver.OctalAdecimal(octalAdeci);
        
        labelTxtOcAdec.setText(String.valueOf(Conver.OctalAdecimal(octalAdeci)));
    }//GEN-LAST:event_BTcalOcAdeciActionPerformed

    private void BTcalHexaAdeciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTcalHexaAdeciActionPerformed
        // TODO add your handling code here:
        String HexaAdeci = cajaTxtConver.getText();
        
        int decimal = Integer.parseInt(HexaAdeci,16);
        
        labelTxtHexaAdeci.setText(String.valueOf(decimal));
    }//GEN-LAST:event_BTcalHexaAdeciActionPerformed

    private void btErrReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btErrReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btErrReActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTcalBinAdec;
    private javax.swing.JButton BTcalDecAbin;
    private javax.swing.JButton BTcalHexaAdeci;
    private javax.swing.JButton BTcalOcAdeci;
    private javax.swing.JButton BTlimpiarBinAdec;
    private javax.swing.JTabbedPane CONVERSIONES;
    private javax.swing.JPanel PanConver;
    private javax.swing.JPanel PanErrores;
    private javax.swing.JButton btErrAbs;
    private javax.swing.JButton btErrRe;
    private javax.swing.JTextField cajaTxtConver;
    private javax.swing.JTextField cajaTxtErrN1;
    private javax.swing.JTextField cajaTxtErrN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelTxtBinAdec;
    private javax.swing.JLabel labelTxtDecAbin;
    private javax.swing.JLabel labelTxtHexaAdeci;
    private javax.swing.JLabel labelTxtOcAdec;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        cajaTxtConver.setText("");
        labelTxtBinAdec.setText("--");
        labelTxtDecAbin.setText("--");
        labelTxtOcAdec.setText("--");
        labelTxtHexaAdeci.setText("--");
        
    }
}