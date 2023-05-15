package practica6;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class Main extends javax.swing.JFrame implements KeyListener {
    Random random = new Random();
    private int randomProductor=0;
    private int randomConsumidor=0;
    private int producido=0;
    private Timer mTimer;
    private int it=1;
    private int itProductor=1;
    private int itConsumidor=1;
    ImageIcon imageIconMario= new ImageIcon("mario.png");
    Image imageMario = imageIconMario.getImage();
    Image modMario = imageMario.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMarioGigante= new ImageIcon("mario.png");
    Image imageMarioGigante = imageIconMarioGigante.getImage();
    Image modMarioGigante = imageMarioGigante.getScaledInstance(150, 225, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconTinyMario= new ImageIcon("mario.png");
    Image imageTinyMario = imageIconTinyMario.getImage();
    Image modTinyMario = imageTinyMario.getScaledInstance(20, 30, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMarioOro= new ImageIcon("marioOro.png");
    Image imageMarioOro = imageIconMarioOro.getImage();
    Image modMarioOro = imageMarioOro.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMarioFuego= new ImageIcon("marioFuego.png");
    Image imageMarioFuego = imageIconMarioFuego.getImage();
    Image modMarioFuego = imageMarioFuego.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMarioHielo= new ImageIcon("marioHielo.png");
    Image imageMarioHielo = imageIconMarioHielo.getImage();
    Image modMarioHielo = imageMarioHielo.getScaledInstance(150, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMarioAbeja= new ImageIcon("marioAbeja.png");
    Image imageMarioAbeja = imageIconMarioAbeja.getImage();
    Image modMarioAbeja = imageMarioAbeja.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMarioYoshi= new ImageIcon("marioYoshi.png");
    Image imageMarioYoshi = imageIconMarioYoshi.getImage();
    Image modMarioYoshi = imageMarioYoshi.getScaledInstance(100, 150, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconBloque= new ImageIcon("bloque.png");
    Image imageBloque = imageIconBloque.getImage();
    Image modBloque = imageBloque.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconBloque2= new ImageIcon("bloque2.png");
    Image imageBloque2 = imageIconBloque2.getImage();
    Image modBloque2 = imageBloque2.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconHongo= new ImageIcon("hongoRojo.png");
    Image imageHongo = imageIconHongo.getImage();
    Image modHongo = imageHongo.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconFlorFuego= new ImageIcon("florFuego.png");
    Image imageFlorFuego = imageIconFlorFuego.getImage();
    Image modFlorFuego = imageFlorFuego.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconFlorHielo= new ImageIcon("florHielo.png");
    Image imageFlorHielo = imageIconFlorHielo.getImage();
    Image modFlorHielo = imageFlorHielo.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconHongoGigante= new ImageIcon("hongoGigante.png");
    Image imageHongoGigante = imageIconHongoGigante.getImage();
    Image modHongoGigante = imageHongoGigante.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconHongoAzul= new ImageIcon("hongoAzul.png");
    Image imageHongoAzul = imageIconHongoAzul.getImage();
    Image modHongoAzul = imageHongoAzul.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconHongoAbeja= new ImageIcon("hongoAbeja.png");
    Image imageHongoAbeja = imageIconHongoAbeja.getImage();
    Image modHongoAbeja = imageHongoAbeja.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconHuevoYoshi= new ImageIcon("huevoYoshi.png");
    Image imageHuevoYoshi = imageIconHuevoYoshi.getImage();
    Image modHuevoYoshi = imageHuevoYoshi.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    ImageIcon imageIconMonedaMario= new ImageIcon("monedaMario.png");
    Image imageMonedaMario = imageIconMonedaMario.getImage();
    Image modMonedaMario = imageMonedaMario.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
    
    public Main() {
        imageIconBloque = new ImageIcon(modBloque);
        imageIconBloque2 = new ImageIcon(modBloque2);
        
        imageIconHongo = new ImageIcon(modHongo);
        imageIconFlorFuego = new ImageIcon(modFlorFuego);
        imageIconFlorHielo = new ImageIcon(modFlorHielo);
        imageIconHongoGigante = new ImageIcon(modHongoGigante);  
        imageIconHongoAzul = new ImageIcon(modHongoAzul);  
        imageIconHongoAbeja = new ImageIcon(modHongoAbeja);
        imageIconHuevoYoshi = new ImageIcon(modHuevoYoshi);
        imageIconMonedaMario = new ImageIcon(modMonedaMario);  
        
        imageIconMario = new ImageIcon(modMario);
        imageIconTinyMario= new ImageIcon(modTinyMario);
        imageIconMarioGigante= new ImageIcon(modMarioGigante);
        imageIconMarioOro= new ImageIcon(modMarioOro);
        imageIconMarioFuego= new ImageIcon(modMarioFuego);
        imageIconMarioHielo= new ImageIcon(modMarioHielo);
        imageIconMarioAbeja= new ImageIcon(modMarioAbeja);
        imageIconMarioYoshi= new ImageIcon(modMarioYoshi);
        
        initComponents();
        mTimer = new Timer(1000, (ActionEvent e) -> {
                iniciarCronometro();  
            });
        
        addKeyListener(this);
        setFocusable(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        btnPrepararse = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        lblBloque9 = new javax.swing.JLabel();
        lblBloque17 = new javax.swing.JLabel();
        lblBloque18 = new javax.swing.JLabel();
        lblBloque11 = new javax.swing.JLabel();
        lblBloque10 = new javax.swing.JLabel();
        lblBloque19 = new javax.swing.JLabel();
        lblBloque20 = new javax.swing.JLabel();
        lblBloque12 = new javax.swing.JLabel();
        lblBloque13 = new javax.swing.JLabel();
        lblBloque21 = new javax.swing.JLabel();
        lblBloque14 = new javax.swing.JLabel();
        lblBloque22 = new javax.swing.JLabel();
        lblBloque15 = new javax.swing.JLabel();
        lblBloque23 = new javax.swing.JLabel();
        lblBloque16 = new javax.swing.JLabel();
        lblBloque24 = new javax.swing.JLabel();
        lblBloque1 = new javax.swing.JLabel();
        lblBloque2 = new javax.swing.JLabel();
        lblBloque3 = new javax.swing.JLabel();
        lblBloque4 = new javax.swing.JLabel();
        lblBloque5 = new javax.swing.JLabel();
        lblBloque6 = new javax.swing.JLabel();
        lblBloque7 = new javax.swing.JLabel();
        lblBloque8 = new javax.swing.JLabel();
        lblEstado1 = new javax.swing.JLabel();
        lblEstado2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        lblTiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 153));

        lblTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("PRODUCTOR - CONSUMIDOR");

        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("jLabel1");

        btnPrepararse.setText("PREPARARSE");
        btnPrepararse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrepararseActionPerformed(evt);
            }
        });

        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("jLabel2");

        lblBloque9.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque9.setText("jLabel2");

        lblBloque17.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque17.setText("jLabel2");

        lblBloque18.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque18.setText("jLabel2");

        lblBloque11.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque11.setText("jLabel2");

        lblBloque10.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque10.setText("jLabel2");

        lblBloque19.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque19.setText("jLabel2");

        lblBloque20.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque20.setText("jLabel2");

        lblBloque12.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque12.setText("jLabel2");

        lblBloque13.setText("jLabel1");

        lblBloque21.setText("jLabel2");

        lblBloque14.setText("jLabel3");

        lblBloque22.setText("jLabel4");

        lblBloque15.setText("jLabel1");

        lblBloque23.setText("jLabel2");

        lblBloque16.setText("jLabel5");

        lblBloque24.setText("jLabel6");

        lblBloque1.setForeground(new java.awt.Color(255, 255, 255));
        lblBloque1.setText("jLabel7");

        lblBloque2.setText("jLabel8");

        lblBloque3.setText("jLabel9");

        lblBloque4.setText("jLabel10");

        lblBloque5.setText("jLabel11");

        lblBloque6.setText("jLabel12");

        lblBloque7.setText("jLabel13");

        lblBloque8.setText("jLabel14");

        lblEstado1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblEstado1.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado1.setText("DURMIENDO");

        lblEstado2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblEstado2.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado2.setText("DURMIENDO");

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblTiempo.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBloque1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBloque9)
                            .addComponent(lblBloque17))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBloque18)
                            .addComponent(lblBloque10)
                            .addComponent(lblBloque2))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBloque11)
                            .addComponent(lblBloque19)
                            .addComponent(lblBloque3))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTiempo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBloque4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBloque5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBloque20)
                                        .addGap(78, 78, 78)
                                        .addComponent(lblBloque21))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblBloque12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblBloque13)))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBloque14)
                                        .addComponent(lblBloque22))
                                    .addComponent(lblBloque6))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblBloque23)
                                        .addComponent(lblBloque15))
                                    .addComponent(lblBloque7))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBloque16)
                                    .addComponent(lblBloque24)
                                    .addComponent(lblBloque8))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblEstado1)
                        .addGap(150, 150, 150)
                        .addComponent(lblTitulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lbl1)
                        .addGap(278, 278, 278)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPrepararse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEstado2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(201, 201, 201))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(lblTitulo)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEstado1)
                            .addComponent(lblEstado2))
                        .addGap(27, 27, 27)))
                .addComponent(btnPrepararse)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl2)
                            .addComponent(lbl1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTiempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloque1)
                    .addComponent(lblBloque2)
                    .addComponent(lblBloque3)
                    .addComponent(lblBloque4)
                    .addComponent(lblBloque5)
                    .addComponent(lblBloque6)
                    .addComponent(lblBloque7)
                    .addComponent(lblBloque8))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloque9)
                    .addComponent(lblBloque10)
                    .addComponent(lblBloque11)
                    .addComponent(lblBloque12)
                    .addComponent(lblBloque13)
                    .addComponent(lblBloque14)
                    .addComponent(lblBloque15)
                    .addComponent(lblBloque16))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloque17)
                    .addComponent(lblBloque18)
                    .addComponent(lblBloque19)
                    .addComponent(lblBloque20)
                    .addComponent(lblBloque21)
                    .addComponent(lblBloque22)
                    .addComponent(lblBloque23)
                    .addComponent(lblBloque24))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrepararseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrepararseActionPerformed
        lbl2.setText("");
        lbl2.setIcon(imageIconMario);
        lbl1.setText("");
        lbl1.setIcon(imageIconBloque);
        lblBloque1.setText("");
        lblBloque1.setIcon(imageIconBloque2);
        lblBloque2.setText("");
        lblBloque2.setIcon(imageIconBloque2);
        lblBloque3.setText("");
        lblBloque3.setIcon(imageIconBloque2);
        lblBloque4.setText("");
        lblBloque4.setIcon(imageIconBloque2);
        lblBloque5.setText("");
        lblBloque5.setIcon(imageIconBloque2);
        lblBloque6.setText("");
        lblBloque6.setIcon(imageIconBloque2);
        lblBloque7.setText("");
        lblBloque7.setIcon(imageIconBloque2);
        lblBloque8.setText("");
        lblBloque8.setIcon(imageIconBloque2);
        lblBloque9.setText("");
        lblBloque9.setIcon(imageIconBloque2);
        lblBloque10.setText("");
        lblBloque10.setIcon(imageIconBloque2);
        lblBloque11.setText("");
        lblBloque11.setIcon(imageIconBloque2);
        lblBloque12.setText("");
        lblBloque12.setIcon(imageIconBloque2);
        lblBloque13.setText("");
        lblBloque13.setIcon(imageIconBloque2);
        lblBloque14.setText("");
        lblBloque14.setIcon(imageIconBloque2);
        lblBloque15.setText("");
        lblBloque15.setIcon(imageIconBloque2);
        lblBloque16.setText("");
        lblBloque16.setIcon(imageIconBloque2);
        lblBloque17.setText("");
        lblBloque17.setIcon(imageIconBloque2);
        lblBloque18.setText("");
        lblBloque18.setIcon(imageIconBloque2);
        lblBloque19.setText("");
        lblBloque19.setIcon(imageIconBloque2);
        lblBloque20.setText("");
        lblBloque20.setIcon(imageIconBloque2);
        lblBloque21.setText("");
        lblBloque21.setIcon(imageIconBloque2);
        lblBloque22.setText("");
        lblBloque22.setIcon(imageIconBloque2);
        lblBloque23.setText("");
        lblBloque23.setIcon(imageIconBloque2);
        lblBloque24.setText("");
        lblBloque24.setIcon(imageIconBloque2);
        
    }//GEN-LAST:event_btnPrepararseActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        mTimer.start();
    }//GEN-LAST:event_btnIniciarActionPerformed

     public void keyPressed(KeyEvent e){
        System.out.println("Tecla: "+ e.getKeyChar()+"\n");

    }
    public void keyTyped(KeyEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void keyReleased(KeyEvent arg0) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    private void iniciarCronometro(){
        lblTiempo.setText(String.valueOf(it));
        
         ////////////CONSUMIR////////////
        if (randomProductor==0&&randomConsumidor==0&&it!=1){//CUANTO SE VA A CONSUMIR
            lblEstado1.setText("DURMIENDO");
            lblEstado2.setText("CONSUMIENDO...");
            randomConsumidor = random.nextInt((producido - 2) + 1) + 2;//numero aleatorio entre 1 y lo producido la vez anterior
            System.out.println("A consumir: "+randomConsumidor);
        }
        if(randomConsumidor!=0&&randomProductor==0&&it!=1){//CONSUMIR CADA SEGUNDO
            int aux2=0;
            if(itConsumidor>24)
                aux2=itConsumidor-24;    
            if(itConsumidor>48)
                aux2=itConsumidor-48;
            if(itConsumidor>72)
                aux2=itConsumidor-72;
            if(itConsumidor<=24)
                aux2=itConsumidor;
            
            switch(aux2){
                case 1:lbl2.setIcon(imageIconMarioFuego);
                    lblBloque1.setIcon(imageIconBloque2);
                    break;
                case 2:lbl2.setIcon(imageIconMarioHielo);
                    lblBloque2.setIcon(imageIconBloque2);
                    break;
                case 3:lbl2.setIcon(imageIconMarioOro);
                    lblBloque3.setIcon(imageIconBloque2);
                    break;
                case 4:lbl2.setIcon(imageIconMario);
                    lblBloque4.setIcon(imageIconBloque2);
                    break;
                case 5:lbl2.setIcon(imageIconMarioGigante);
                    lblBloque5.setIcon(imageIconBloque2);
                    break;
                case 6:lbl2.setIcon(imageIconTinyMario);
                    lblBloque6.setIcon(imageIconBloque2);
                    break;
                case 7:lbl2.setIcon(imageIconMarioAbeja);
                    lblBloque7.setIcon(imageIconBloque2);
                    break;
                case 8:lbl2.setIcon(imageIconMarioYoshi);
                    lblBloque8.setIcon(imageIconBloque2);
                    break;
                case 9:lbl2.setIcon(imageIconTinyMario);
                    lblBloque9.setIcon(imageIconBloque2);
                    break;
                case 10:lbl2.setIcon(imageIconMario);
                    lblBloque10.setIcon(imageIconBloque2);
                    break;
                case 11:lbl2.setIcon(imageIconMarioGigante);
                    lblBloque11.setIcon(imageIconBloque2);
                    break;
                case 12:lbl2.setIcon(imageIconMarioFuego);
                    lblBloque12.setIcon(imageIconBloque2);
                    break;
                case 13:lbl2.setIcon(imageIconMarioAbeja);
                    lblBloque13.setIcon(imageIconBloque2);
                    break;
                case 14:lbl2.setIcon(imageIconMarioYoshi);
                    lblBloque14.setIcon(imageIconBloque2);
                    break;
                case 15:lbl2.setIcon(imageIconMarioOro);
                    lblBloque15.setIcon(imageIconBloque2);
                    break;
                case 16:lbl2.setIcon(imageIconMarioHielo);
                    lblBloque16.setIcon(imageIconBloque2);
                    break;
                case 17:lbl2.setIcon(imageIconMarioYoshi);
                    lblBloque17.setIcon(imageIconBloque2);
                    break;
                case 18:lbl2.setIcon(imageIconMarioFuego);
                    lblBloque18.setIcon(imageIconBloque2);
                    break;
                case 19:lbl2.setIcon(imageIconTinyMario);
                    lblBloque19.setIcon(imageIconBloque2);
                    break;
                case 20:lbl2.setIcon(imageIconMarioAbeja);
                    lblBloque20.setIcon(imageIconBloque2);
                    break;
                case 21:lbl2.setIcon(imageIconMarioOro);
                    lblBloque21.setIcon(imageIconBloque2);
                    break;
                case 22:lbl2.setIcon(imageIconMario);
                    lblBloque22.setIcon(imageIconBloque2);
                    break;
                case 23:lbl2.setIcon(imageIconMarioHielo);
                    lblBloque23.setIcon(imageIconBloque2);
                    break;
                case 24:lbl2.setIcon(imageIconMarioGigante);
                    lblBloque24.setIcon(imageIconBloque2);
                    break;
            }
            randomConsumidor--;
            itConsumidor++;
        }
        
        ////////////PRODUCIR////////////
        if (randomConsumidor==0&&randomProductor==0){//CUANTO SE VA A PRODUCIR
            lblEstado1.setText("PRODUCIENDO...");
            lblEstado2.setText("DURMIENDO");
            randomProductor = random.nextInt((6 - 2) + 1) + 2;//numero aleatorio entre 2 y 6
            producido=randomProductor;
            System.out.println("Produciendo: "+randomProductor);
        }
        if(randomProductor!=0){//PRODUCIR CADA SEGUNDO
            int aux1=0;
            if(itProductor>24)
                aux1=itProductor-24;    
            if(itProductor>48)
                aux1=itProductor-48;
            if(itProductor>72)
                aux1=itProductor-72;
            if(itProductor<=24)
                aux1=itProductor;
            
            switch(aux1){
                case 1:lblBloque1.setIcon(imageIconFlorFuego);
                    break;
                case 2:lblBloque2.setIcon(imageIconFlorHielo);
                    break;
                case 3:lblBloque3.setIcon(imageIconMonedaMario);
                    break;
                case 4:lblBloque4.setIcon(imageIconHongo);
                    break;
                case 5:lblBloque5.setIcon(imageIconHongoGigante);
                    break;
                case 6:lblBloque6.setIcon(imageIconHongoAzul);
                    break;
                case 7:lblBloque7.setIcon(imageIconHongoAbeja);
                    break;
                case 8:lblBloque8.setIcon(imageIconHuevoYoshi);
                    break;
                case 9:lblBloque9.setIcon(imageIconHongoAzul);
                    break;
                case 10:lblBloque10.setIcon(imageIconHongo);
                    break;
                case 11:lblBloque11.setIcon(imageIconHongoGigante);
                    break;
                case 12:lblBloque12.setIcon(imageIconFlorFuego);
                    break;
                case 13:lblBloque13.setIcon(imageIconHongoAbeja);
                    break;
                case 14:lblBloque14.setIcon(imageIconHuevoYoshi);
                    break;
                case 15:lblBloque15.setIcon(imageIconMonedaMario);
                    break;
                case 16:lblBloque16.setIcon(imageIconFlorHielo);
                    break;
                case 17:lblBloque17.setIcon(imageIconHuevoYoshi);
                    break;
                case 18:lblBloque18.setIcon(imageIconFlorFuego);
                    break;
                case 19:lblBloque19.setIcon(imageIconHongoAzul);
                    break;
                case 20:lblBloque20.setIcon(imageIconHongoAbeja);
                    break;
                case 21:lblBloque21.setIcon(imageIconMonedaMario);
                    break;
                case 22:lblBloque22.setIcon(imageIconHongo);
                    break;
                case 23:lblBloque23.setIcon(imageIconFlorHielo);
                    break;
                case 24:lblBloque24.setIcon(imageIconHongoGigante);
                    break;
            }
            itProductor++;
            randomProductor--;
        }
        
        ////////////////////////////////////
        it++;
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
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnPrepararse;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblBloque1;
    private javax.swing.JLabel lblBloque10;
    private javax.swing.JLabel lblBloque11;
    private javax.swing.JLabel lblBloque12;
    private javax.swing.JLabel lblBloque13;
    private javax.swing.JLabel lblBloque14;
    private javax.swing.JLabel lblBloque15;
    private javax.swing.JLabel lblBloque16;
    private javax.swing.JLabel lblBloque17;
    private javax.swing.JLabel lblBloque18;
    private javax.swing.JLabel lblBloque19;
    private javax.swing.JLabel lblBloque2;
    private javax.swing.JLabel lblBloque20;
    private javax.swing.JLabel lblBloque21;
    private javax.swing.JLabel lblBloque22;
    private javax.swing.JLabel lblBloque23;
    private javax.swing.JLabel lblBloque24;
    private javax.swing.JLabel lblBloque3;
    private javax.swing.JLabel lblBloque4;
    private javax.swing.JLabel lblBloque5;
    private javax.swing.JLabel lblBloque6;
    private javax.swing.JLabel lblBloque7;
    private javax.swing.JLabel lblBloque8;
    private javax.swing.JLabel lblBloque9;
    private javax.swing.JLabel lblEstado1;
    private javax.swing.JLabel lblEstado2;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
