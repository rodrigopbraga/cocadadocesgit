package telas;

import controlador.ClienteController;
import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;

public class EditorCliente extends javax.swing.JFrame {
    private final ClienteController cc;
    private int idC;
    private javax.swing.JTextField jTF;

    public EditorCliente() {
        initComponents();
        resizeJTable();
        cc = new ClienteController(this);
        getRootPane().setDefaultButton(jBPesquisar);
    }
    
    public EditorCliente(javax.swing.JTextField jTF) {
        initComponents();
        resizeJTable();
        cc = new ClienteController(this);
        this.jTF=jTF;
        getRootPane().setDefaultButton(jBPesquisar);
    }
    
    public int getIdC() {
        return idC;
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
        jTFCpf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBAdicionar = new javax.swing.JButton();
        jTBEditar = new javax.swing.JToggleButton();
        jBPesquisar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITOR CLIENTES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de Clientes: "));

        jLabel1.setText("ID: ");

        jTFId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
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
        });
        jTFNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
        });

        jLabel3.setText("CPF: ");

        jTFCpf.setBackground(new java.awt.Color(255, 204, 204));
        jTFCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
                recolourBG(evt);
            }
        });

        jLabel4.setText("Telefone: ");

        jTFTelefone.setBackground(new java.awt.Color(255, 204, 204));
        jTFTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recolourBG(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
                recolourBG(evt);
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
                jTBEditarrActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarrActionPerformed(evt);
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
                    .addComponent(jBAdicionar)
                    .addComponent(jTBEditar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "Pontos", "Bonus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTelefone))
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
                    .addComponent(jLabel4)
                    .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
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

    public final void resizeJTable(){
        jTClientes.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTClientes.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTClientes.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTClientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        jTClientes.getColumnModel().getColumn(5).setPreferredWidth(100);
    }

    public static String tirarTudoExcetoDigitos(String text) {//alterar
        if (text == null || text.length() == 0) {
            return "";
        }
        return text.replaceAll("\\D+", "");
    }

    public String limpaEspacoPorPonto(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.setCharAt(i, '.');
            }
        }
        return sb.toString();
    }
    private void recolorBG(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recolorBG
        recolorBG();
    }//GEN-LAST:event_recolorBG
    public void recolorBG(){
        if (!jTFNome.getText().isEmpty()) {
            jTFNome.setBackground(Color.white);
        } else {
            jTFNome.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFCpf.getText().isEmpty()) {
            jTFCpf.setBackground(Color.white);
        } else {
            jTFCpf.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jTFTelefone.getText().isEmpty()) {
            jTFTelefone.setBackground(Color.white);
        } else {
            jTFTelefone.setBackground(Color.decode("#FFCCCC"));
        }
    }
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFId.setText("");
        jTFNome.setText("");
        jTFCpf.setText("");
        jTFTelefone.setText("");
        jTBEditar.setSelected(false);
        jTFId.requestFocusInWindow();
        DefaultTableModel dtmClientes = (DefaultTableModel) jTClientes.getModel();
        dtmClientes.setRowCount(0);
        resizeJTable();
        desHabilitaEditar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBPesquisarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarrActionPerformed
        DefaultTableModel dtmClientes = (DefaultTableModel) jTClientes.getModel();
        dtmClientes.setRowCount(0);
        if (jTFId.getText().isEmpty()) {
            if (jTFNome.getText().isEmpty()) {
                if (jTFCpf.getText().isEmpty()) {
                    if (jTFTelefone.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Insira um valor a ser pesquisado.", "Aviso", 0);
                    } else {

                        String telefone = jTFTelefone.getText()/*.replace("(", "").replace(")", "")
                                .replace("-", "").replace(".", "").trim()*/;//trocar por metodo

                        //telefone=tirarTudoExcetoDigitos(telefone);
                        ArrayList<Cliente> c = cc.consultaClienteT(telefone);
                        for (Cliente cliente : c) {
                            cc.preencheTabelaO(cliente, jTClientes);
                        }
                        //salvaColunasTabela();
                    }
                } else {
                    String cpfs = jTFCpf.getText().replace(".", "").replace("-", "");
                    long cpf = Long.parseLong(cpfs);
                    Cliente c = cc.consultaClienteC(cpf);
                    cc.preencheTabelaO(c, jTClientes);
                    //salvaColunasTabela();
                }
            } else {
                String nome = jTFNome.getText();
                //nome=tirarTudoExcetoDigitos(nome);
                ArrayList<Cliente> c = cc.consultaClienteN(nome);
                for (Cliente cliente : c) {
                    cc.preencheTabelaO(cliente, jTClientes);
                }
                //salvaColunasTabela();
            }
        } else {
            int id = Integer.parseInt(jTFId.getText());
            Cliente c = cc.consultaClienteI(id);
            cc.preencheTabelaO(c, jTClientes);
            //salvaColunasTabela();
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBPesquisarrActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
         if (!jTFNome.getText().isEmpty()) {
            if (!jTFCpf.getText().isEmpty()) {
                if (!jTFTelefone.getText().isEmpty()) {
                    if (jTFCpf.getText().trim().length() != 11) {
                        JOptionPane.showMessageDialog(this, "Preencha o CPF corretamente.", "Aviso", 2);
                        jTFCpf.requestFocusInWindow();
                        return;
                    } else {
                        String nome = jTFNome.getText().replace(".", " ").replace("-", " ").trim();
                        long cpf = Long.parseLong(jTFCpf.getText().replace(".", "").replace("-", "").trim());
                        String tel = jTFTelefone.getText().replace("(", "").replace(")", "").trim();
                        try {
                            if (cc.novo(cpf)) {
                                Cliente client = cc.salvaCliente(cpf, nome, tel);
                                JOptionPane.showMessageDialog(this, "Cliente salvo com sucesso.");
                                cc.preencheTabelaO(client, jTClientes);
                                jTFNome.setText("");
                                jTFCpf.setText("");
                                jTFTelefone.setText("");
                            }else{
                                JOptionPane.showMessageDialog(this, "CPF ja existente na base de dados!", "Aviso", 2);
                                jTFCpf.requestFocusInWindow();
                                jTFCpf.setSelectionStart(0);
                            }
                        } catch (SQLException ex) {
                            System.out.println("ex Erro\n"+ex.getMessage());
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira o Telefone para cadastro.", "Aviso", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira o CPF para cadastro.", "Aviso", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira o Nome para cadastro.", "Aviso", 2);
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void apenasConsultaMode(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apenasConsultaMode
        if (!jTFId.getText().isEmpty()) {
            jBAdicionar.setEnabled(false);
            jTFNome.setEnabled(false);
            jTFCpf.setEnabled(false);
            jTFTelefone.setEnabled(false);
        } else {
            jBAdicionar.setEnabled(true);
            jTFNome.setEnabled(true);
            jTFCpf.setEnabled(true);
            jTFTelefone.setEnabled(true);
        }
    }//GEN-LAST:event_apenasConsultaMode

    private void desHabilitaEditar() {
        DefaultTableModel dtmClientes = (DefaultTableModel) jTClientes.getModel();
        if (dtmClientes.getRowCount() != 0) {
            jTBEditar.setEnabled(true);
        } else {
            jTBEditar.setEnabled(false);
        }
    }

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }if(jTFCpf.getText().length()>10){
            if(jTFCpf.isFocusOwner())evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void recolourBG(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recolourBG
        recolorBG();
    }//GEN-LAST:event_recolourBG

    private void jTBEditarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBEditarrActionPerformed
        DefaultTableModel dtmClientes = (DefaultTableModel) jTClientes.getModel();
        Cliente c;
        long cpf;
        String nome, tel;
        if (jTBEditar.isSelected()) {
            try{
                idC = getSelectedId();
                jTFId.setText(String.valueOf(idC));
                nome = String.valueOf(dtmClientes.getValueAt(jTClientes.getSelectedRow(), 1));
                jTFNome.setText(nome);
                cpf = Long.parseLong(String.valueOf(dtmClientes.getValueAt(jTClientes.getSelectedRow(), 2)));
                jTFCpf.setText(String.valueOf(cpf));
                tel = String.valueOf(dtmClientes.getValueAt(jTClientes.getSelectedRow(), 3));
                jTFTelefone.setText(String.valueOf(tel));
            }catch (ArrayIndexOutOfBoundsException aiob) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 0);
                jTBEditar.setSelected(false);
            }
            jTFNome.requestFocusInWindow();
            jTBEditar.setText("Salvar");
            jTFId.setEnabled(false);
            jTFNome.setEnabled(true);
            jTFCpf.setEnabled(true);
            jTFTelefone.setEnabled(true);
            jBAdicionar.setEnabled(false);
            jBPesquisar.setEnabled(false);
            jBLimpar.setEnabled(false);
            recolorBG();
        }else{
            if (!jTFNome.getText().isEmpty()) {
                if (!jTFCpf.getText().isEmpty()) {
                    if (!jTFTelefone.getText().isEmpty()) {
                        if (jTFCpf.getText().trim().length() != 11) {
                            JOptionPane.showMessageDialog(this, "Preencha o CPF corretamente.", "Aviso", 1);
                            jTFCpf.requestFocusInWindow();
                            jTBEditar.setSelected(true);
                            return;
                        } else {
                            dtmClientes.setRowCount(0);
                            idC=Integer.parseInt(jTFId.getText());
                            cpf=Long.parseLong(jTFCpf.getText());
                            nome=jTFNome.getText();
                            tel=jTFTelefone.getText();
                            jTBEditar.setText("Editar");
                            jBAdicionar.setEnabled(true);
                            jBPesquisar.setEnabled(true);
                            jBLimpar.setEnabled(true);
                            jTFId.setEnabled(true);
                            c = new Cliente(idC, cpf, nome, tel);
                            cc.updateCliente(c);
                            cc.preencheTabelaO(c, jTClientes);
                            jTFId.setText("");
                            jTFNome.setText("");
                            jTFCpf.setText("");
                            jTFTelefone.setText("");
                            recolorBG();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Insira o Telefone para cadastro.", "Aviso", 1);
                        jTFTelefone.requestFocusInWindow();
                        jTBEditar.setSelected(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Insira o CPF para cadastro.", "Aviso", 1);
                    jTFCpf.requestFocusInWindow();
                    jTBEditar.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira o Nome para cadastro.", "Aviso", 1);
                jTFNome.requestFocusInWindow();
                jTBEditar.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTBEditarrActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        try {
            if (evt.getKeyCode() == evt.VK_ENTER) {
                idC=getSelectedId();
                Cliente cli=cc.consultaClienteI(idC);
                CadastroCliente cadCli=new CadastroCliente(cli);
                cadCli.setVisible(true);
            }
            if (evt.getKeyCode() == evt.VK_ESCAPE && jTF!=null) {
                idC=getSelectedId();
                jTF.setText(String.valueOf(idC));
                dispose();
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_Enter

    public int getSelectedId() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTClientes.getModel();
        return Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(jTClientes.getSelectedRow(), 0)));
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
            java.util.logging.Logger.getLogger(EditorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorCliente().setVisible(true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBEditar;
    private javax.swing.JTable jTClientes;
    public javax.swing.JTextField jTFCpf;
    private javax.swing.JTextField jTFId;
    public javax.swing.JTextField jTFNome;
    public javax.swing.JTextField jTFTelefone;
    // End of variables declaration//GEN-END:variables
}
