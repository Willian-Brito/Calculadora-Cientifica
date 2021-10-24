package telas;

import classes.Calculadora;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class telaCalculadora extends javax.swing.JFrame {

    Calculadora calc = new Calculadora();

    double n1 = 0;
    double n2 = 0;
    double total = 0;
    double cos, acos, sin, asin, tan, atan;
    String funcoes = "";

    char sinal;
    String sinal2;

    public telaCalculadora() {
        initComponents();

        painel2.setFocusable(true);
       
        lblMemo.setVisible(false);
        setIcone();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grbTrigonometria = new javax.swing.ButtonGroup();
        txtTotal = new javax.swing.JTextField();
        painel = new javax.swing.JPanel();
        btnLimpar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btnPorcento = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btnMemoMais = new javax.swing.JButton();
        btnMostrarMemo = new javax.swing.JButton();
        btnLimparMemo = new javax.swing.JButton();
        btnMemoMenos = new javax.swing.JButton();
        btnElevadoCubo = new javax.swing.JButton();
        btnFatorial = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnParenteses1 = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnParenteses2 = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnRaizQuadrada = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnElevadaDecima = new javax.swing.JButton();
        btnTrocarSinal = new javax.swing.JButton();
        btnElevado = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnAsin = new javax.swing.JButton();
        btnAcos = new javax.swing.JButton();
        btnAtan = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        lblTemp = new javax.swing.JTextField();
        painel2 = new javax.swing.JPanel();
        lblMemo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rbSexages = new javax.swing.JRadioButton();
        rbRadianos = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora Ciêntifica");
        setResizable(false);

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setText("0");
        txtTotal.setBorder(null);
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        painel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                painelKeyPressed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 0, 0));
        btnLimpar.setText("C");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(0, 0, 204));
        btnDividir.setText("/");
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnDel.setForeground(new java.awt.Color(0, 0, 204));
        btnDel.setText("DEL");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnVezes.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnVezes.setForeground(new java.awt.Color(0, 0, 204));
        btnVezes.setText("x");
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });

        btnPorcento.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnPorcento.setForeground(new java.awt.Color(0, 0, 204));
        btnPorcento.setText("%");
        btnPorcento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorcentoActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(0, 0, 204));
        btnMenos.setText("-");
        btnMenos.setMaximumSize(new java.awt.Dimension(41, 25));
        btnMenos.setMinimumSize(new java.awt.Dimension(41, 25));
        btnMenos.setPreferredSize(new java.awt.Dimension(41, 25));
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnPonto.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        btnPonto.setForeground(new java.awt.Color(0, 0, 204));
        btnPonto.setText(".");
        btnPonto.setMaximumSize(new java.awt.Dimension(41, 25));
        btnPonto.setMinimumSize(new java.awt.Dimension(41, 25));
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 0, 0));
        btnIgual.setText("=");
        btnIgual.setMaximumSize(new java.awt.Dimension(41, 25));
        btnIgual.setMinimumSize(new java.awt.Dimension(41, 25));
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnMais.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnMais.setForeground(new java.awt.Color(0, 0, 204));
        btnMais.setText("+");
        btnMais.setMaximumSize(new java.awt.Dimension(41, 25));
        btnMais.setMinimumSize(new java.awt.Dimension(41, 25));
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        btnMemoMais.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnMemoMais.setForeground(new java.awt.Color(0, 0, 204));
        btnMemoMais.setText("M+");
        btnMemoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoMaisActionPerformed(evt);
            }
        });

        btnMostrarMemo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnMostrarMemo.setForeground(new java.awt.Color(0, 0, 204));
        btnMostrarMemo.setText("MC");
        btnMostrarMemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMemoActionPerformed(evt);
            }
        });

        btnLimparMemo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnLimparMemo.setForeground(new java.awt.Color(0, 0, 204));
        btnLimparMemo.setText("MR");
        btnLimparMemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparMemoActionPerformed(evt);
            }
        });

        btnMemoMenos.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnMemoMenos.setForeground(new java.awt.Color(0, 0, 204));
        btnMemoMenos.setText("M-");
        btnMemoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoMenosActionPerformed(evt);
            }
        });

        btnElevadoCubo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElevadoCubo.setForeground(new java.awt.Color(0, 0, 204));
        btnElevadoCubo.setText("x³");
        btnElevadoCubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevadoCuboActionPerformed(evt);
            }
        });

        btnFatorial.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFatorial.setForeground(new java.awt.Color(0, 0, 204));
        btnFatorial.setText("n!");
        btnFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatorialActionPerformed(evt);
            }
        });

        btnPotencia.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnPotencia.setForeground(new java.awt.Color(0, 0, 204));
        btnPotencia.setText("x^y");
        btnPotencia.setMaximumSize(new java.awt.Dimension(41, 25));
        btnPotencia.setMinimumSize(new java.awt.Dimension(41, 25));
        btnPotencia.setPreferredSize(new java.awt.Dimension(41, 25));
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTan.setForeground(new java.awt.Color(0, 0, 204));
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnParenteses1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnParenteses1.setForeground(new java.awt.Color(0, 0, 204));
        btnParenteses1.setText("(");
        btnParenteses1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParenteses1ActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLog.setForeground(new java.awt.Color(0, 0, 204));
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnParenteses2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnParenteses2.setForeground(new java.awt.Color(0, 0, 204));
        btnParenteses2.setText(")");
        btnParenteses2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParenteses2ActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnMod.setForeground(new java.awt.Color(0, 0, 204));
        btnMod.setText("mod");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnRaizQuadrada.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnRaizQuadrada.setForeground(new java.awt.Color(0, 0, 204));
        btnRaizQuadrada.setText("√");
        btnRaizQuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizQuadradaActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCos.setForeground(new java.awt.Color(0, 0, 204));
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSin.setForeground(new java.awt.Color(0, 0, 204));
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnElevadaDecima.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnElevadaDecima.setForeground(new java.awt.Color(0, 0, 204));
        btnElevadaDecima.setText("x^10");
        btnElevadaDecima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevadaDecimaActionPerformed(evt);
            }
        });

        btnTrocarSinal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrocarSinal.setForeground(new java.awt.Color(0, 0, 204));
        btnTrocarSinal.setText("+/-");
        btnTrocarSinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarSinalActionPerformed(evt);
            }
        });

        btnElevado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnElevado.setForeground(new java.awt.Color(0, 0, 204));
        btnElevado.setText("x²");
        btnElevado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElevadoActionPerformed(evt);
            }
        });

        btnPi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPi.setForeground(new java.awt.Color(0, 0, 204));
        btnPi.setText(" π");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });

        btnAsin.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAsin.setForeground(new java.awt.Color(0, 0, 204));
        btnAsin.setText("sin -1");
        btnAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsinActionPerformed(evt);
            }
        });

        btnAcos.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAcos.setForeground(new java.awt.Color(0, 0, 204));
        btnAcos.setText("cos -1");
        btnAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcosActionPerformed(evt);
            }
        });

        btnAtan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnAtan.setForeground(new java.awt.Color(0, 0, 204));
        btnAtan.setText("tan -1");
        btnAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtanActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnE.setForeground(new java.awt.Color(0, 0, 204));
        btnE.setText("e");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnExp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExp.setForeground(new java.awt.Color(0, 0, 204));
        btnExp.setText("EXP");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParenteses1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParenteses2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btnTrocarSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btnElevado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnElevadoCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnElevadaDecima, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btnAsin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAcos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btnMostrarMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnLimparMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnMemoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnMemoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMostrarMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimparMemo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMemoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnAcos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAsin, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAtan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnElevado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnElevadoCubo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnElevadaDecima, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnRaizQuadrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnParenteses1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnParenteses2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTrocarSinal, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelLayout.createSequentialGroup()
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnPorcento, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(4, 4, 4)
                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(painelLayout.createSequentialGroup()
                                                        .addGap(1, 1, 1)
                                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)
                                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(painelLayout.createSequentialGroup()
                                                .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(7, 7, 7)
                                                .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblTemp.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        lblTemp.setForeground(new java.awt.Color(255, 0, 51));
        lblTemp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lblTemp.setText("  ");
        lblTemp.setBorder(null);
        lblTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTempActionPerformed(evt);
            }
        });

        painel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                painel2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout painel2Layout = new javax.swing.GroupLayout(painel2);
        painel2.setLayout(painel2Layout);
        painel2Layout.setHorizontalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        painel2Layout.setVerticalGroup(
            painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 16, Short.MAX_VALUE)
        );

        lblMemo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMemo.setForeground(new java.awt.Color(0, 0, 204));
        lblMemo.setText("M");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Calculadora Ciêntifica");

        grbTrigonometria.add(rbSexages);
        rbSexages.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        rbSexages.setSelected(true);
        rbSexages.setText("Sexagesimal ");

        grbTrigonometria.add(rbRadianos);
        rbRadianos.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        rbRadianos.setText("Radianos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblMemo))
                    .addComponent(lblTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(rbSexages))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(rbRadianos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMemo)
                    .addComponent(lblTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbSexages)
                    .addComponent(rbRadianos)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed


    private void painel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_painel2KeyPressed

        if (evt.getKeyChar() == '0'
                || evt.getKeyChar() == '1'
                || evt.getKeyChar() == '2'
                || evt.getKeyChar() == '3'
                || evt.getKeyChar() == '4'
                || evt.getKeyChar() == '5'
                || evt.getKeyChar() == '6'
                || evt.getKeyChar() == '7'
                || evt.getKeyChar() == '8'
                || evt.getKeyChar() == '9') {

            setarTxtTotal(evt.getKeyChar());
        } else if (evt.getKeyChar() == '-'
                || evt.getKeyChar() == '+'
                || evt.getKeyChar() == '/'
                || evt.getKeyChar() == '*') {

            pegarN1();
            sinal = evt.getKeyChar();
            setarLblTemp();
        } else if (evt.getKeyCode() == 10) {
            pegarN2();
            calcular();
        } else if (evt.getKeyCode() == 8) {
            backspace();
        }
        //System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_painel2KeyPressed

    private void painelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_painelKeyPressed

    }//GEN-LAST:event_painelKeyPressed

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed

        pegarN1();
        sinal = '+';
        setarLblTemp();
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed

        pegarN2();
        calcular();

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnRaizQuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizQuadradaActionPerformed

        pegarN1();
        sinal = '√';
        calcular();
        setarLblTemp();
    }//GEN-LAST:event_btnRaizQuadradaActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed

        setarTxtTotal('.');
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed

        if ("0".equals(txtTotal.getText())) {
            txtTotal.setText("");
        }
        txtTotal.setText(txtTotal.getText() + "0");


    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        pegarN1();
        sinal = '^';
        setarLblTemp();
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed

        pegarN1();
        sinal = '-';
        setarLblTemp();
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

        setarTxtTotal('9');
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        setarTxtTotal('8');
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        setarTxtTotal('7');
    }//GEN-LAST:event_btn7ActionPerformed

    private void btnPorcentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorcentoActionPerformed

        pegarN2();
        sinal2 = String.valueOf(sinal);
        sinal = '%';
        double porcento = (n1 * n2) / 100;
        n2 = porcento;
        txtTotal.setText(Double.toString(porcento));
        lblTemp.setText(lblTemp.getText() + " " + porcento);
        calcular();
    }//GEN-LAST:event_btnPorcentoActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed

        pegarN1();
        sinal = '*';
        setarLblTemp();
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        setarTxtTotal('6');
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        setarTxtTotal('5');
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        setarTxtTotal('4');
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        setarTxtTotal('3');
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        setarTxtTotal('2');
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        setarTxtTotal('1');
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        backspace();
    }//GEN-LAST:event_btnDelActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed

        pegarN1();
        sinal = '/';
        setarLblTemp();
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMemoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoMaisActionPerformed

        total = Double.parseDouble(txtTotal.getText());
        calc.memoMais(total);
        mostrarMemo();
        limparCalc();
    }//GEN-LAST:event_btnMemoMaisActionPerformed

    private void btnLimparMemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparMemoActionPerformed
        
        txtTotal.setText(Double.toString(calc.limparMemo()));
        lblMemo.setVisible(false);
    }//GEN-LAST:event_btnLimparMemoActionPerformed

    private void btnMostrarMemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMemoActionPerformed
        
        txtTotal.setText(Double.toString(calc.mostrarMemo()));
        mostrarMemo();
    }//GEN-LAST:event_btnMostrarMemoActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCalc();
        painel2.requestFocus();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnMemoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoMenosActionPerformed

        total = Double.parseDouble(txtTotal.getText());
        calc.memoMenos(total);
        mostrarMemo();
        limparCalc();
    }//GEN-LAST:event_btnMemoMenosActionPerformed

    private void btnElevadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevadoActionPerformed

        pegarN1();
        sinal = '²';
        calcular();
        setarLblTemp();
        painel2.requestFocus();
    }//GEN-LAST:event_btnElevadoActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed

        pegarN1();
        sinal2 = "(mod)";
        calcular();
        setarLblTemp();
        painel2.requestFocus();
    }//GEN-LAST:event_btnModActionPerformed

    private void btnFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatorialActionPerformed

        pegarN1();
        sinal = '!';
        calcular();

        String seq = "";
        int num = (int) n1;

        for (int cont1 = num; cont1 > 1; cont1--) {

            seq += cont1 + " x ";
        }

        seq += "1";
        lblTemp.setText(seq);
        painel2.requestFocus();
    }//GEN-LAST:event_btnFatorialActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed

        sinal2 = String.valueOf(sinal);
        sinal = 'π';
        lblTemp.setText(lblTemp.getText() + " " + "π");
        double pi = Math.PI;
        txtTotal.setText(String.valueOf(pi));

    }//GEN-LAST:event_btnPiActionPerformed

    private void btnTrocarSinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarSinalActionPerformed

        double num = Double.parseDouble(txtTotal.getText());
        if (num != 0) {

            num *= -1;
            txtTotal.setText(Double.toString(num));
        }
        painel2.requestFocus();

    }//GEN-LAST:event_btnTrocarSinalActionPerformed

    private void lblTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTempActionPerformed

    private void btnParenteses1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParenteses1ActionPerformed

        if ("0".equals(txtTotal.getText()) || "0.0".equals(txtTotal.getText())) {
            txtTotal.setText("");
            txtTotal.setText("(");
        } else {
            txtTotal.setText(txtTotal.getText() + "(");
        }

    }//GEN-LAST:event_btnParenteses1ActionPerformed

    private void btnParenteses2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParenteses2ActionPerformed

        txtTotal.setText(txtTotal.getText() + ")");
    }//GEN-LAST:event_btnParenteses2ActionPerformed

    private void btnElevadoCuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevadoCuboActionPerformed

        pegarN1();
        sinal = '³';
        calcular();
        setarLblTemp();
        painel2.requestFocus();
    }//GEN-LAST:event_btnElevadoCuboActionPerformed

    private void btnElevadaDecimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElevadaDecimaActionPerformed

        pegarN1();
        sinal2 = "^10";
        calcular();
        setarLblTemp();
        painel2.requestFocus();
    }//GEN-LAST:event_btnElevadaDecimaActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed

        funcoes = "sin";
        trigonometria();
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed

        funcoes = "cos";
        trigonometria();
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed

        funcoes = "tan";
        trigonometria();
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnAsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsinActionPerformed

        funcoes = "asin";
        trigonometria();
    }//GEN-LAST:event_btnAsinActionPerformed

    private void btnAcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcosActionPerformed

        funcoes = "acos";
        trigonometria();
    }//GEN-LAST:event_btnAcosActionPerformed

    private void btnAtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtanActionPerformed

        funcoes = "atan";
        trigonometria();
    }//GEN-LAST:event_btnAtanActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
            
        sinal2 = String.valueOf(sinal);
        sinal = 'e';
        lblTemp.setText(lblTemp.getText() + " " + "e");
        double e = Math.E;
        txtTotal.setText(String.valueOf(e));
    }//GEN-LAST:event_btnEActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
            
        pegarN1();
        sinal2 = "EXP";
        calcular();
        setarLblTemp();
        painel2.requestFocus();
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
            
        pegarN1();
        sinal2 = "log";
        calcular();
        setarLblTemp();
        painel2.requestFocus();
    }//GEN-LAST:event_btnLogActionPerformed

    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (UnsupportedLookAndFeelException exc) {
            exc.printStackTrace();
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();
        } catch (InstantiationException exc) {
            exc.printStackTrace();
        } catch (IllegalAccessException exc) {
            exc.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new telaCalculadora().setVisible(true);
            }
        });

        // restante do método main aqui...
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAcos;
    private javax.swing.JButton btnAsin;
    private javax.swing.JButton btnAtan;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnElevadaDecima;
    private javax.swing.JButton btnElevado;
    private javax.swing.JButton btnElevadoCubo;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnFatorial;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparMemo;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMemoMais;
    private javax.swing.JButton btnMemoMenos;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMostrarMemo;
    private javax.swing.JButton btnParenteses1;
    private javax.swing.JButton btnParenteses2;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorcento;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaizQuadrada;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnTrocarSinal;
    private javax.swing.JButton btnVezes;
    private javax.swing.ButtonGroup grbTrigonometria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMemo;
    private javax.swing.JTextField lblTemp;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel painel2;
    private javax.swing.JRadioButton rbRadianos;
    private javax.swing.JRadioButton rbSexages;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

//MÉTODOS
    public void calcular() {

        if (n2 == 0 || n2 == 0.0) {
            lblTemp.setText("");
        } else if (sinal == '%') {

        } else if (sinal == 'π') {

        }else if (sinal == 'e') {

        }else {
            lblTemp.setText(lblTemp.getText() + " " + n2);
        }
        //OPERAÇÕES BASICAS
        if (sinal == '+') {
            total = calc.somar(n1, n2);
        } else if (sinal == '-') {
            total = calc.subtrair(n1, n2);
        } else if (sinal == '/') {
            total = calc.dividir(n1, n2);
        } else if (sinal == '*') {
            total = calc.multiplicar(n1, n2);
        } else if (sinal == '√') {
            total = calc.raizQuadrada(n1);
        } else if (sinal == '^') {
            total = calc.potencia(n1, n2);
        } else if (sinal == '%') {
            total = calc.porcentagem(n1, n2, sinal2);
            sinal2 = "";
        } else if (sinal == '²') {
            total = calc.elevadoQuadrado(n1);
        } else if (sinal == '!') {
            total = calc.fatorial(n1);
        } else if ("(mod)".equals(sinal2)) {
            total = calc.resto(n1);
        } else if (sinal == 'π') {
            total = calc.pi(n1, n2, sinal2);
        } else if (sinal == '³') {
            total = calc.elevadoCubo(n1);
        } else if ("^10".equals(sinal2)) {
            total = calc.elevadoDecima(n1);
        } else if (sinal == 'e') {
            total = calc.e(n1, n2, sinal2);      
        } else if ("EXP".equals(sinal2)) {
            total = calc.exp(n1);
        } else if ("log".equals(sinal2)) {
            total = calc.log(n1);          
        } 
        
        txtTotal.setText(String.valueOf(total));

    }

    public void setarTxtTotal(char num) {

        if (("0".equals(txtTotal.getText()) && !".".equals(String.valueOf(num))) || "0.0".equals(txtTotal.getText())) {
            txtTotal.setText("");
        }

        String texto = txtTotal.getText();

        if (texto.length() <= 22) {

            texto = texto + num;
            txtTotal.setText(texto);
        }
        painel2.requestFocus();
    }

    public void setarLblTemp() {
        if ("(mod)".equals(sinal2)) {
            lblTemp.setText(n1 + " " + sinal2);
            sinal2 = "";
        } else if ("^10".equals(sinal2)) {
            lblTemp.setText(n1 + " " + sinal2);
            sinal2 = "";
        }else if("log".equals(sinal2)){
            lblTemp.setText("log ( " + n1 + " )");
            sinal2 = "";
        }else if("EXP".equals(sinal2)){
            lblTemp.setText("EXP ( " + n1 + " )");
            sinal2 = "";
        }else {
            lblTemp.setText(n1 + " " + sinal);
        }
    }

    public void pegarN1() {
        n1 = Double.parseDouble(txtTotal.getText());
        txtTotal.setText("0");
        painel2.requestFocus();
    }

    public void pegarN2() {
        if (sinal == 'π') {
            n2 = Double.parseDouble(txtTotal.getText());
        }
        n2 = Double.parseDouble(txtTotal.getText());
        txtTotal.setText("0");

    }

    public void limparCalc() {
        n1 = 0;
        n2 = 0;
        total = 0;
        txtTotal.setText("0");
        lblTemp.setText("");
        sinal = ' ';

    }

    public void backspace() {
        String valor_display = txtTotal.getText();

        if (valor_display.length() > 0) {
            valor_display = valor_display.substring(0, valor_display.length() - 1);

            txtTotal.setText(valor_display);

            if (valor_display.length() == 0) {
                txtTotal.setText("0");
            }
        } else {
            txtTotal.setText("0");
        }

        painel2.requestFocus();
    }

    public void trigonometria() {

        if (rbSexages.isSelected()) {
            switch (funcoes) {

                // SENO
                case "sin":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("sen ( " + n1 + " )");
                    sin = Math.sin(Math.PI * (n1) / 180);
                    txtTotal.setText(String.valueOf(sin));
                    break;

                // SENO INVERSO
                case "asin":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("asen ( " + n1 + " )");
                    asin = Math.asin(n1) * 180 / Math.PI;
                    txtTotal.setText(String.valueOf(asin));
                    break;

                // COSENO 
                case "cos":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("cos ( " + n1 + " )");
                    cos = Math.cos(Math.PI * (n1) / 180);
                    txtTotal.setText(String.valueOf(cos));
                    break;

                // COSENO INVERSO
                case "acos":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("acos ( " + n1 + " )");
                    acos = Math.acos(n1) * 180 / Math.PI;
                    txtTotal.setText(String.valueOf(acos));
                    break;

                // TANGENTE 
                case "tan":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("tan ( " + n1 + " )");
                    tan = Math.tan(Math.PI * (n1) / 180);
                    txtTotal.setText(String.valueOf(tan));
                    break;

                // TANGENTE INVERSO
                case "atan":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("atan ( " + n1 + " )");
                    atan = Math.atan(n1) * 180 / Math.PI;
                    txtTotal.setText(String.valueOf(atan));
                    break;

            }
            }else{
                  
            if(rbRadianos.isSelected()){
            switch(funcoes){
                
                // SENO
                case "sin":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("senR ( " + n1 + " )");
                    sin = Math.sin(n1);
                    txtTotal.setText(String.valueOf(sin));
                    break;
                
                // SENO INVERSO
                case "asin":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("asenR ( " + n1 + " )");
                    asin = Math.asin(n1);
                    txtTotal.setText(String.valueOf(asin));  
                    break;
                
                // COSENO 
                case "cos":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("cosR ( " + n1 + " )");
                    cos = Math.cos(n1);
                    txtTotal.setText(String.valueOf(cos));
                    break;
               
                // COSENO INVERSO
                case "acos":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("acosR ( " + n1 + " )");
                    acos = Math.acos(n1);
                    txtTotal.setText(String.valueOf(acos));
                    break;
                 
                // TANGENTE 
                case "tan":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("tanR ( " + n1 + " )");
                    tan = Math.tan(n1);
                    txtTotal.setText(String.valueOf(tan));
                    break;
               
                // TANGENTE INVERSO
                case "atan":
                    n1 = Double.parseDouble(txtTotal.getText());
                    lblTemp.setText("atanR ( " + n1 + " )");
                    atan = Math.atan(n1);
                    txtTotal.setText(String.valueOf(atan));
                    break;
         
            }
        }
        }
    }
    
    public void mostrarMemo(){
        
        String memo = String.valueOf(calc.mostrarMemo());
        
        if("0.0".equals(memo) || "0".equals(memo)){
            lblMemo.setVisible(false);
   
        }else{
            lblMemo.setVisible(true);
            lblMemo.setText("M (" + calc.mostrarMemo() + ")");
        }
    }

    private void setIcone() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/calc.png")));
    
    }
}
