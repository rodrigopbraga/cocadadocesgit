package telas;

import controlador.DoceController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Doce;

public class EditorDoce extends javax.swing.JFrame {
    private final DoceController dc;
    private Menu menu;
    private int idD=0;
    
    public EditorDoce(Menu menu) {
        initComponents();
        resizeJTable();
        this.menu=menu;
        dc=new DoceController(this);
        setLocationRelativeTo(menu);
        getRootPane().setDefaultButton(jBPesquisar);
    }
    public EditorDoce(){
        initComponents();
        resizeJTable();
        dc=new DoceController(this);
        getRootPane().setDefaultButton(jBPesquisar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFCusto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFVenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFIngredientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTDoces = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBAdicionar = new javax.swing.JButton();
        jTBEditar = new javax.swing.JToggleButton();
        jBPesquisar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITOR DOCES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de Doces"));

        jLabel1.setText("ID: ");

        jTFId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
                apenasConsultaMode(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasConsultaMode(evt);
            }
        });
        jTFId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel2.setText("Nome: ");

        jTFNome.setBackground(new java.awt.Color(255, 204, 204));
        jTFNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel3.setText("Custo Medio: ");

        jTFCusto.setBackground(new java.awt.Color(255, 204, 204));
        jTFCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasInsertMode(evt);
                recolorBG(evt);
            }
        });
        jTFCusto.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jLabel5.setText("Venda: ");

        jTFVenda.setBackground(new java.awt.Color(255, 204, 204));
        jTFVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasInsertMode(evt);
                recolorBG(evt);
            }
        });
        jTFVenda.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jLabel4.setText("Ingredientes: ");

        jTFIngredientes.setBackground(new java.awt.Color(255, 204, 204));
        jTFIngredientes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFIngredientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("(Separados com ', ')");
        jLabel6.setEnabled(false);

        jTDoces.setBackground(new java.awt.Color(204, 204, 255));
        jTDoces.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Doce", "Ingredientes", "P. Custo", "P. Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTDoces.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                retornaDoce(evt);
            }
        });
        jScrollPane1.setViewportView(jTDoces);

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
                apenasConsultaMode(evt);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                    .addComponent(jTBEditar)
                    .addComponent(jBAdicionar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFIngredientes)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTFCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTFVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jTDoces.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTDoces.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTDoces.getColumnModel().getColumn(2).setPreferredWidth(300);
        jTDoces.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTDoces.getColumnModel().getColumn(4).setPreferredWidth(50);
    }
    
    public void recolorBG(){
        if(!jTFNome.getText().isEmpty()){
            jTFNome.setBackground(Color.white);
        }else{
            jTFNome.setBackground(Color.decode("#FFCCCC"));
        }if(!jTFIngredientes.getText().isEmpty()){
            jTFIngredientes.setBackground(Color.white);
        }else{
            jTFIngredientes.setBackground(Color.decode("#FFCCCC"));
        }if(!jTFCusto.getText().isEmpty()){
            jTFCusto.setBackground(Color.white);
        }else{
            jTFCusto.setBackground(Color.decode("#FFCCCC"));
        }if(!jTFVenda.getText().isEmpty()){
            jTFVenda.setBackground(Color.white);
        }else{
            jTFVenda.setBackground(Color.decode("#FFCCCC"));
        }
    }
    
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFId.setText("");
        jTFNome.setText("");
        jTFIngredientes.setText("");
        jTFCusto.setText("");
        jTFVenda.setText("");
        jTBEditar.setSelected(false);
        jTFId.requestFocusInWindow();
        DefaultTableModel dtmDoces=(DefaultTableModel) jTDoces.getModel();
        dtmDoces.setRowCount(0);
        resizeJTable();
        desHabilitaEditar();
    }//GEN-LAST:event_jBLimparActionPerformed

    
    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        DefaultTableModel dtmDoces=(DefaultTableModel) jTDoces.getModel();
        dtmDoces.setRowCount(0);
        if(jTFId.getText().isEmpty()){
            if(jTFNome.getText().isEmpty()){
                if(jTFIngredientes.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Insira um valor a ser pesquisado.","Aviso", 0);
                }else{
                    String ing=jTFIngredientes.getText().trim();
                    ArrayList<Doce> d = dc.consultaDoceIng(ing);
                    for (Doce doce : d) {
                        dc.preencheTabelaO(doce, jTDoces);
                    }
                }
            }else{
                String nome=jTFNome.getText().trim();
                ArrayList<Doce> d = dc.consultaDoceN(nome);
                for (Doce doce : d) {
                    dc.preencheTabelaO(doce, jTDoces);
                }
            }
        }else{
            int id=Integer.parseInt(jTFId.getText());
            Doce d = dc.consultaDoceI(id);
            dc.preencheTabelaO(d, jTDoces);
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        if(!jTFNome.getText().isEmpty()){
            if(!jTFCusto.getText().isEmpty()){
                if(!jTFVenda.getText().isEmpty()){
                    if(!jTFIngredientes.getText().isEmpty()){
                        String ing=jTFIngredientes.getText().replace(".", " ").replace(";", " ").replace("-", " ").trim();
                        String nome=jTFNome.getText().replace(".", " ").replace("-", " ").trim();
                        double custo=Double.parseDouble(jTFCusto.getText());
                        double venda=Double.parseDouble(jTFVenda.getText());
                        try {
                            if (dc.novo(nome)) {
                                Doce d = dc.salvaDoce(nome, ing, custo, venda);
                                JOptionPane.showMessageDialog(this, "Doce salvo com sucesso.");
                                dc.preencheTabelaO(d, jTDoces);
                                jTFNome.setText("");
                                jTFIngredientes.setText("");
                                jTFCusto.setText("");
                                jTFVenda.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nome de doce ja existente na base de dados!", "Aviso", 2);
                                jTFNome.requestFocusInWindow();
                                jTFNome.setSelectionStart(0);
                            }
                        } catch (SQLException ex) {
                        }
                    }else JOptionPane.showMessageDialog(this, "Insira os ingredientes para cadastro.", "Aviso", 2);
                }else JOptionPane.showMessageDialog(this, "Insira o valor de venda para cadastro.", "Aviso", 2);
            }else JOptionPane.showMessageDialog(this, "Insira o custo para cadastro.", "Aviso", 2);
        }else JOptionPane.showMessageDialog(this, "Insira o Nome para cadastro.", "Aviso", 2);
        desHabilitaEditar();
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void apenasConsultaMode(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apenasConsultaMode
        if(!jTFId.getText().isEmpty()){
            jBAdicionar.setEnabled(false);
            jTFNome.setEnabled(false);
            jTFIngredientes.setEnabled(false);
            jTFCusto.setEnabled(false);
            jTFVenda.setEnabled(false);
        }else {
            jBAdicionar.setEnabled(true);
            jTFNome.setEnabled(true);
            jTFIngredientes.setEnabled(true);
            jTFCusto.setEnabled(true);
            jTFVenda.setEnabled(true);
        }
    }//GEN-LAST:event_apenasConsultaMode

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void recolourBG(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recolourBG
        if(!jTFNome.getText().isEmpty()){
            jTFNome.setBackground(Color.white);
        }else{
            jTFNome.setBackground(Color.decode("#FFCCCC"));
        }if(!jTFIngredientes.getText().isEmpty()){
            jTFIngredientes.setBackground(Color.white);
        }else{
            jTFIngredientes.setBackground(Color.decode("#FFCCCC"));
        }if(!jTFCusto.getText().isEmpty()){
            jTFCusto.setBackground(Color.white);
        }else{
            jTFCusto.setBackground(Color.decode("#FFCCCC"));
        }if(!jTFVenda.getText().isEmpty()){
            jTFVenda.setBackground(Color.white);
        }else{
            jTFVenda.setBackground(Color.decode("#FFCCCC"));
        }
    }//GEN-LAST:event_recolourBG

    private void jTBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBEditarActionPerformed
        DefaultTableModel dtmDoces = (DefaultTableModel) jTDoces.getModel();
        Doce d;
        int id;
        double custo, venda;
        String nome, ing;
        if (jTBEditar.isSelected()) {
            try {
                id = Integer.parseInt(String.valueOf(dtmDoces.getValueAt(jTDoces.getSelectedRow(), 0)));
                jTFId.setText(String.valueOf(id));
                nome = String.valueOf(dtmDoces.getValueAt(jTDoces.getSelectedRow(), 1));
                jTFNome.setText(nome);
                ing = String.valueOf(dtmDoces.getValueAt(jTDoces.getSelectedRow(), 2));
                jTFIngredientes.setText(String.valueOf(ing));
                custo = Double.parseDouble(String.valueOf(dtmDoces.getValueAt(jTDoces.getSelectedRow(), 3)));
                jTFCusto.setText(String.valueOf(custo));
                venda = Double.parseDouble(String.valueOf(dtmDoces.getValueAt(jTDoces.getSelectedRow(), 4)));
                jTFVenda.setText(String.valueOf(venda));
                jTFNome.requestFocusInWindow();
                jTBEditar.setText("Salvar");
                jBAdicionar.setEnabled(false);
                jBPesquisar.setEnabled(false);
                jBLimpar.setEnabled(false);
                jTFId.setEnabled(false);
                jBAdicionar.setEnabled(true);
                jTFNome.setEnabled(true);
                jTFIngredientes.setEnabled(true);
                jTFCusto.setEnabled(true);
                jTFVenda.setEnabled(true);
                recolorBG();
            } catch (ArrayIndexOutOfBoundsException aiob) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 0);
                jTBEditar.setSelected(false);
            }
        }else{
            if (!jTFNome.getText().isEmpty()) {
                if (!jTFVenda.getText().isEmpty()) {
                    if (!jTFCusto.getText().isEmpty()) {
                        if (!jTFIngredientes.getText().isEmpty()) {
                            dtmDoces.setRowCount(0);
                            id=Integer.parseInt(jTFId.getText());
                            nome=jTFNome.getText();
                            custo=Double.parseDouble(jTFCusto.getText());
                            venda=Double.parseDouble(jTFVenda.getText());
                            ing=jTFIngredientes.getText();
                            jTBEditar.setText("Editar");
                            jBAdicionar.setEnabled(true);
                            jBPesquisar.setEnabled(true);
                            jBLimpar.setEnabled(true);
                            jTFId.setEnabled(true);
                            d = new Doce(id, nome, ing, custo, venda);
                            dc.updateDoce(d);
                            dc.preencheTabelaO(d, jTDoces);
                            jTFId.setText("");
                            jTFNome.setText("");
                            jTFCusto.setText("");
                            jTFVenda.setText("");
                            jTFIngredientes.setText("");
                            JOptionPane.showMessageDialog(this, "Doce salvo com sucesso!", "Salvo", 1);
                            recolorBG();
                        } else {
                            JOptionPane.showMessageDialog(this, "Insira ao menos um Ingrediente para cadastro.", "Aviso", 2);
                            jTFIngredientes.requestFocusInWindow();
                            jTBEditar.setSelected(true);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Insira o Custo para cadastro.", "Aviso", 2);
                        jTFCusto.requestFocusInWindow();
                        jTBEditar.setSelected(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira o valor de Venda para cadastro.", "Aviso", 2);
                    jTFVenda.requestFocusInWindow();
                    jTBEditar.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira o Nome para cadastro.", "Aviso", 2);
                jTFNome.requestFocusInWindow();
                jTBEditar.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTBEditarActionPerformed

    private void apenasInsertMode(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apenasInsertMode
        if(!jTFCusto.getText().isEmpty()){
            jBPesquisar.setEnabled(false);
        }else {
            jBPesquisar.setEnabled(true);
        }
        if(!jTFVenda.getText().isEmpty()){
            jBPesquisar.setEnabled(false);
        }else{
            jBPesquisar.setEnabled(true);
        }
    }//GEN-LAST:event_apenasInsertMode

    private void retornaDoce(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retornaDoce
        if (evt.getKeyCode() == evt.VK_ESCAPE || evt.getKeyCode() == evt.VK_ENTER) {
            int linha=jTDoces.getSelectedRow();
            if(jTDoces.getValueAt(linha, 0)!=null){
                DefaultTableModel dtmDoces = (DefaultTableModel) jTDoces.getModel();
                idD=Integer.parseInt(String.valueOf(dtmDoces.getValueAt(linha, 0)));
                menu.setVisible(true);
                if (menu.doceExistenteJTCarrinho(idD) != -1) {
                    DefaultTableModel dtmPedi = (DefaultTableModel) menu.jTCarrinho.getModel();
                    dtmPedi.setValueAt(menu.getRowQuant(linha) + 1, linha, 2);
                    jTFId.setSelectionStart(0);
                    menu.attQuantTotal();
                }else{
                    menu.addDoce(idD);
                }
                dispose();
            }
        }
    }//GEN-LAST:event_retornaDoce

    /*public Doce getDoce(){
    DoceController dc=new DoceController(this);
    DefaultTableModel dtmDoces = (DefaultTableModel) jTDoces.getModel();
    id = Integer.parseInt(String.valueOf(dtmDoces.getValueAt(jTDoces.getSelectedRow(), 0)));
    menu.setVisible(true);
    return dc.consultaDoceI(id);
    }*/
    
    
    private void desHabilitaEditar(){
        if(jTDoces.getModel().getRowCount()!=0){
            jTBEditar.setEnabled(true);
        }else jTBEditar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(EditorDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorDoce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorDoce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBEditar;
    private javax.swing.JTable jTDoces;
    public javax.swing.JTextField jTFCusto;
    private javax.swing.JTextField jTFId;
    public javax.swing.JTextField jTFIngredientes;
    public javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFVenda;
    // End of variables declaration//GEN-END:variables
}
