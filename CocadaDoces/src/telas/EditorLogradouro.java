package telas;

import controlador.ImprimeController;
import controlador.LogradouroController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Logradouro;

public class EditorLogradouro extends javax.swing.JFrame {

    private final LogradouroController lc;
    private final ImprimeController ic;

    public EditorLogradouro() {
        initComponents();
        resizeJTable();
        lc = new LogradouroController(this);
        ic=new ImprimeController();
        getRootPane().setDefaultButton(jBPesquisar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFIdLogradouro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFN = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFComplemento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFCep = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFUf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFPais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFIdCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBAdicionar = new javax.swing.JButton();
        jTBEditar = new javax.swing.JToggleButton();
        jBPesquisar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTLogradouros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITOR ENDERECO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de Enderecos: "));

        jLabel1.setText("ID Logradouro: ");

        jTFIdLogradouro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasConsultaMode(evt);
            }
        });
        jTFIdLogradouro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel2.setText("Endereco: ");

        jTFEndereco.setBackground(new java.awt.Color(255, 204, 204));
        jTFEndereco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel3.setText("Nº: ");

        jTFN.setBackground(new java.awt.Color(255, 204, 204));
        jTFN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel6.setText("Complemento: ");

        jTFComplemento.setBackground(new java.awt.Color(255, 204, 204));
        jTFComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel4.setText("Bairro: ");

        jTFBairro.setBackground(new java.awt.Color(255, 204, 204));
        jTFBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel5.setText("CEP: ");

        jTFCep.setBackground(new java.awt.Color(255, 204, 204));
        jTFCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel7.setText("Cidade: ");

        jTFCidade.setBackground(new java.awt.Color(255, 204, 204));
        jTFCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel8.setText("UF: ");

        jTFUf.setBackground(new java.awt.Color(255, 204, 204));
        jTFUf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel9.setText("Pais: ");

        jTFPais.setBackground(new java.awt.Color(255, 204, 204));
        jTFPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel10.setText("ID Cliente: ");

        jTFIdCliente.setBackground(new java.awt.Color(255, 204, 204));
        jTFIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
                Enter(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Enter(evt);
                numberOnly(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBAdicionar.setText("Adicionar");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jTBEditar.setText("Editar");
        jTBEditar.setEnabled(false);
        jTBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTBEditarActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.setMaximumSize(new java.awt.Dimension(78, 25));
        jBLimpar.setMinimumSize(new java.awt.Dimension(78, 25));
        jBLimpar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAdicionar)
                .addGap(18, 18, 18)
                .addComponent(jTBEditar)
                .addGap(18, 18, 18)
                .addComponent(jBPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBAdicionar)
                    .addComponent(jTBEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTLogradouros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Endereco", "Endereco", "N", "Complemento", "Bairro", "CEP", "Cidade", "UF", "Pais", "ID Cliente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTLogradouros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1042, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(jTFCidade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFBairro)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTFIdLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFEndereco)
                                        .addGap(17, 17, 17)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(24, 24, 24))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTFN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFIdLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void recolorBG(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recolorBG
        recolorBG();
    }//GEN-LAST:event_recolorBG

    public final void resizeJTable(){
        jTLogradouros.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTLogradouros.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTLogradouros.getColumnModel().getColumn(2).setPreferredWidth(40);
        jTLogradouros.getColumnModel().getColumn(3).setPreferredWidth(40);
        jTLogradouros.getColumnModel().getColumn(4).setPreferredWidth(150);
        jTLogradouros.getColumnModel().getColumn(5).setPreferredWidth(88);
        jTLogradouros.getColumnModel().getColumn(6).setPreferredWidth(100);
        jTLogradouros.getColumnModel().getColumn(7).setPreferredWidth(40);
        jTLogradouros.getColumnModel().getColumn(8).setPreferredWidth(40);
        jTLogradouros.getColumnModel().getColumn(9).setPreferredWidth(80);
    }

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFIdLogradouro.setText("");
        jTFIdCliente.setText("");
        jTFEndereco.setText("");
        jTFN.setText("");
        jTFComplemento.setText("");
        jTFBairro.setText("");
        jTFCep.setText("");
        jTFCidade.setText("");
        jTFUf.setText("");
        jTFPais.setText("");
        jTFIdLogradouro.requestFocusInWindow();
        jTBEditar.setSelected(false);
        DefaultTableModel dtmEnderecos = (DefaultTableModel) jTLogradouros.getModel();
        dtmEnderecos.setRowCount(0);
        resizeJTable();
        desHabilitaEditar();
    }//GEN-LAST:event_jBLimparActionPerformed


    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        DefaultTableModel dtmEnderecos = (DefaultTableModel) jTLogradouros.getModel();
        dtmEnderecos.setRowCount(0);
        if (jTFIdLogradouro.getText().isEmpty()) {
            if (jTFIdCliente.getText().isEmpty()) {
                if (jTFEndereco.getText().isEmpty()) {
                    if (jTFBairro.getText().isEmpty()) {
                        if (jTFUf.getText().isEmpty()) {
                            if (jTFPais.getText().isEmpty()) {
                                if (jTFCep.getText().isEmpty()) {
                                    if (jTFCidade.getText().isEmpty()) {
                                        JOptionPane.showMessageDialog(this, "Insira um valor a ser pesquisado.", "Aviso", 2);
                                    } else {
                                        String cid = ic.tirarTudoExcetoDigitos(jTFCep.getText());
                                        ArrayList<Logradouro> l = lc.consultaLogradouroCidade(cid);
                                        for (Logradouro logradouro : l) {
                                            lc.preencheTabelaO(logradouro, jTLogradouros);
                                        }
                                    }
                                } else {
                                    String cep = ic.tirarTudoExcetoDigitos(jTFCep.getText());
                                    ArrayList<Logradouro> l = lc.consultaLogradouroCep(cep);
                                    for (Logradouro logradouro : l) {
                                        lc.preencheTabelaO(logradouro, jTLogradouros);
                                    }
                                }
                            } else {
                                String pais = ic.tirarTudoExcetoDigitos(jTFPais.getText());
                                ArrayList<Logradouro> l = lc.consultaLogradouroP(pais);
                                for (Logradouro logradouro : l) {
                                    lc.preencheTabelaO(logradouro, jTLogradouros);
                                }
                            }
                        } else {
                            String uf = ic.tirarTudoExcetoDigitos(jTFUf.getText());
                            ArrayList<Logradouro> l = lc.consultaLogradouroB(uf);
                            for (Logradouro logradouro : l) {
                                lc.preencheTabelaO(logradouro, jTLogradouros);
                            }
                        }
                    } else {
                        String bairro = ic.tirarTudoExcetoDigitos(jTFBairro.getText());
                        ArrayList<Logradouro> l = lc.consultaLogradouroB(bairro);
                        for (Logradouro logradouro : l) {
                            lc.preencheTabelaO(logradouro, jTLogradouros);
                        }
                    }
                } else {
                    String end = ic.tirarTudoExcetoDigitos(jTFEndereco.getText());
                    ArrayList<Logradouro> l = lc.consultaLogradouroEnd(end);
                    for (Logradouro logradouro : l) {
                        lc.preencheTabelaO(logradouro, jTLogradouros);
                    }
                }

            } else {
                int idC = Integer.parseInt(jTFIdCliente.getText());
                ArrayList<Logradouro> l = lc.consultaLogradouroIC(idC);
                for (Logradouro logradouro : l) {
                    lc.preencheTabelaO(logradouro, jTLogradouros);
                }
            }
        } else {
            int idL = Integer.parseInt(jTFIdLogradouro.getText());
            if (lc.existeLogradouro(idL)) {
                Logradouro l = lc.consultaLogradouroIL(idL);
                lc.preencheTabelaO(l, jTLogradouros);
            }else{
                JOptionPane.showMessageDialog(this, "Nenhum Endereco encontrado com este ID.", "Aviso", 2);
            }
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        if (!jTFEndereco.getText().isEmpty()) {
            if (!jTFN.getText().isEmpty()) {
                if (!jTFCep.getText().isEmpty()) {
                    if (!jTFBairro.getText().isEmpty()) {
                        if (!jTFIdCliente.getText().isEmpty()) {
                            int idC = Integer.parseInt(jTFIdCliente.getText());
                            String end = jTFEndereco.getText().replace(".", " ").replace("-", " ").trim();
                            String n = jTFN.getText().replace(".", "").replace("-", "").trim();
                            String comp = jTFComplemento.getText().replace(".", " ").replace("-", " ").trim();
                            String bairro = jTFBairro.getText().replace(".", " ").replace(";", " ").replace("-", " ").trim();
                            String cidade = jTFCidade.getText().replace(".", " ").replace("-", " ").trim();
                            String uf = jTFUf.getText().replace(".", " ").replace("-", " ").trim();
                            String cep = jTFCep.getText().replace(".", "").replace("-", "").trim();
                            String pais = jTFPais.getText().replace(".", " ").replace("-", " ").trim();
                            lc.salvaLogradouro(end, n, comp, bairro, cidade, uf, cep, pais, idC);
                        } else {
                            JOptionPane.showMessageDialog(this, "Associe o Logradouro a um cliente.", "Aviso", 2);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Insira os ingredientes para cadastro.", "Aviso", 2);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira o valor de venda para cadastro.", "Aviso", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira o custo para cadastro.", "Aviso", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira o Nome para cadastro.", "Aviso", 2);
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void apenasConsultaMode(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apenasConsultaMode
        if (!jTFIdLogradouro.getText().isEmpty()) {
            jBAdicionar.setEnabled(false);
        } else {
            jBAdicionar.setEnabled(true);
        }
    }//GEN-LAST:event_apenasConsultaMode

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void recolourBG(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recolourBG
        recolorBG();
    }//GEN-LAST:event_recolourBG

    public void recolorBG() {
        if (!jTFEndereco.getText().isEmpty()) {
            jTFEndereco.setBackground(Color.white);
        } else {
            jTFEndereco.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFN.getText().isEmpty()) {
            jTFN.setBackground(Color.white);
        } else {
            jTFN.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFComplemento.getText().isEmpty()) {
            jTFComplemento.setBackground(Color.white);
        } else {
            jTFComplemento.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFBairro.getText().isEmpty()) {
            jTFBairro.setBackground(Color.white);
        } else {
            jTFBairro.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFCep.getText().isEmpty()) {
            jTFCep.setBackground(Color.white);
        } else {
            jTFCep.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFCidade.getText().isEmpty()) {
            jTFCidade.setBackground(Color.white);
        } else {
            jTFCidade.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFUf.getText().isEmpty()) {
            jTFUf.setBackground(Color.white);
        } else {
            jTFUf.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFPais.getText().isEmpty()) {
            jTFPais.setBackground(Color.white);
        } else {
            jTFPais.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFIdCliente.getText().isEmpty()) {
            jTFIdCliente.setBackground(Color.white);
        } else {
            jTFIdCliente.setBackground(Color.decode("#FFCCCC"));
        }
    }

    private void jTBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBEditarActionPerformed
        DefaultTableModel dtmLogradouros = (DefaultTableModel) jTLogradouros.getModel();
        Logradouro l;
        int idClient, idLog;
        String end, n, compl, bairro, cep, cidade, uf, pais;
        if (jTBEditar.isSelected()) {
            try {
                idLog = Integer.parseInt(String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 0)));
                jTFIdLogradouro.setText(String.valueOf(idLog));
                end = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 1));
                jTFEndereco.setText(end);
                n = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 2));
                jTFN.setText(String.valueOf(n));
                compl = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 3));
                jTFComplemento.setText(String.valueOf(compl));
                bairro = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 4));
                jTFBairro.setText(String.valueOf(bairro));
                cep = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 5));
                jTFCep.setText(String.valueOf(cep));
                cidade = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 6));
                jTFCidade.setText(String.valueOf(cidade));
                uf = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 7));
                jTFUf.setText(String.valueOf(uf));
                pais = String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 8));
                jTFPais.setText(String.valueOf(pais));
                idClient = Integer.parseInt(String.valueOf(dtmLogradouros.getValueAt(jTLogradouros.getSelectedRow(), 9)));
                jTFIdCliente.setText(String.valueOf(idClient));
                
                jTFEndereco.requestFocusInWindow();
                jTBEditar.setText("Salvar");
                jBAdicionar.setEnabled(false);
                jBPesquisar.setEnabled(false);
                jBLimpar.setEnabled(false);
                jTFIdCliente.setEnabled(false);
                jTFIdLogradouro.setEnabled(false);
                recolorBG();
            } catch (ArrayIndexOutOfBoundsException aiob) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 0);
                jTBEditar.setSelected(false);
            }
        } else {
            if (!jTFEndereco.getText().isEmpty()) {
                if (!jTFN.getText().isEmpty()) {
                    if (!jTFComplemento.getText().isEmpty()) {
                        if (!jTFBairro.getText().isEmpty()) {
                            if (!jTFCep.getText().isEmpty()) {
                                if (!jTFCidade.getText().isEmpty()) {
                                    if (!jTFUf.getText().isEmpty()) {
                                        if (!jTFPais.getText().isEmpty()) {
                                            dtmLogradouros.setRowCount(0);
                                            idLog = Integer.parseInt(jTFIdLogradouro.getText());
                                            idClient = Integer.parseInt(jTFIdCliente.getText());
                                            end = jTFEndereco.getText();
                                            n = jTFN.getText();
                                            compl = jTFComplemento.getText();
                                            bairro = jTFBairro.getText();
                                            cep = jTFCep.getText();
                                            cidade = jTFCidade.getText();
                                            uf = jTFUf.getText();
                                            pais = jTFPais.getText();
                                            jTBEditar.setText("Editar");
                                            jBAdicionar.setEnabled(true);
                                            jBPesquisar.setEnabled(true);
                                            jBLimpar.setEnabled(true);
                                            jTFIdCliente.setEnabled(true);
                                            jTFIdLogradouro.setEnabled(true);
                                            l = new Logradouro(end, n, compl, bairro, cidade, uf, cep, pais, idLog, idClient);
                                            lc.updateLogradouro(l);
                                            lc.preencheTabelaO(l, jTLogradouros);
                                            jTFIdCliente.setText("");
                                            jTFIdLogradouro.setText(""); 
                                            jTFEndereco.setText("");
                                            jTFN.setText("");
                                            jTFComplemento.setText("");
                                            jTFBairro.setText("");
                                            jTFCep.setText("");
                                            jTFCidade.setText("");
                                            jTFUf.setText("");
                                            jTFPais.setText("");
                                            jTFIdCliente.setText("");
                                            recolorBG();
                                        } else {
                                            JOptionPane.showMessageDialog(this, "Insira o Pais para cadastro.", "Aviso", 2);
                                            jTFPais.requestFocusInWindow();
                                            jTBEditar.setSelected(true);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Insira a UF para cadastro.", "Aviso", 2);
                                        jTFUf.requestFocusInWindow();
                                        jTBEditar.setSelected(true);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(this, "Insira a Cidade para cadastro.", "Aviso", 2);
                                    jTFCidade.requestFocusInWindow();
                                    jTBEditar.setSelected(true);
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Insira o CEP para cadastro.", "Aviso", 2);
                                jTFCep.requestFocusInWindow();
                                jTBEditar.setSelected(true);
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Insira o Bairro para cadastro.", "Aviso", 2);
                            jTFBairro.requestFocusInWindow();
                            jTBEditar.setSelected(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Insira o Complemento para cadastro.", "Aviso", 2);
                        jTFComplemento.requestFocusInWindow();
                        jTBEditar.setSelected(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira o Numero para cadastro.", "Aviso", 2);
                    jTFN.requestFocusInWindow();
                    jTBEditar.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira o Endereco para cadastro.", "Aviso", 2);
                jTFEndereco.requestFocusInWindow();
                jTBEditar.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTBEditarActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if (evt.getKeyCode() == evt.VK_F7) {
            GetCliente gc = new GetCliente(this, true);
            gc.setVisible(true);
            jTFIdCliente.setText(String.valueOf(gc.getIdCliente()));
            recolorBG();
        }if (evt.getKeyCode() == evt.VK_F3) {
            EditorCliente ediCli=new EditorCliente(jTFIdCliente);
            ediCli.setVisible(true);
        }
    }//GEN-LAST:event_Enter

    private void desHabilitaEditar() {
        DefaultTableModel dtmEnderecos = (DefaultTableModel) jTLogradouros.getModel();
        if (dtmEnderecos.getRowCount() != 0) {
            jTBEditar.setEnabled(true);
        } else {
            jTBEditar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(EditorLogradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorLogradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorLogradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorLogradouro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorLogradouro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBEditar;
    public javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCep;
    public javax.swing.JTextField jTFCidade;
    public javax.swing.JTextField jTFComplemento;
    public javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFIdLogradouro;
    public javax.swing.JTextField jTFN;
    public javax.swing.JTextField jTFPais;
    public javax.swing.JTextField jTFUf;
    private javax.swing.JTable jTLogradouros;
    // End of variables declaration//GEN-END:variables
}