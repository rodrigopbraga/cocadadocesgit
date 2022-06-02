package telas;

import controlador.ImprimeController;
import controlador.UsuarioController;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Usuario;

public class EditorUsuario extends javax.swing.JFrame {
    private final UsuarioController uc;
    private final ImprimeController ic;
    private SetSenha setS;
    private int idU;
    private Usuario currentUser;

    public int getIdU() {
        return idU;
    }
    
    public EditorUsuario() {
        initComponents();
        resizeJTable();
        uc=new UsuarioController(this);
        ic=new ImprimeController();
        getRootPane().setDefaultButton(jBPesquisar);
    }
    
    public EditorUsuario(Usuario user) {
        initComponents();
        resizeJTable();
        this.currentUser=user;
        setViewPerUser(user);
        uc=new UsuarioController(this);
        ic=new ImprimeController();
        getRootPane().setDefaultButton(jBPesquisar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jCBFuncao = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jBAdicionar = new javax.swing.JButton();
        jTBEditar = new javax.swing.JToggleButton();
        jBPesquisar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITOR USUARIOS");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de Usuarios"));

        jLabel1.setText("ID: ");

        jTFId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasConsultaMode(evt);
            }
        });
        jTFId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel2.setText("Usuario: ");

        jTFUsuario.setBackground(new java.awt.Color(255, 204, 204));
        jTFUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
        });
        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jLabel4.setText("Senha: ");

        jPFSenha.setBackground(new java.awt.Color(255, 204, 204));
        jPFSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                setSenha(evt);
            }
        });
        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
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

        jLabel3.setText("Funcao: ");

        jCBFuncao.setBackground(new java.awt.Color(255, 204, 204));
        jCBFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "GERENTE", "COORDENADOR", "CAIXA", "COZINHA" }));
        jCBFuncao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                recolorCB(evt);
            }
        });
        jCBFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recolourCB(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Funcao"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
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

    public void setViewPerUser(Usuario user){
        int lv=user.getLv();
        if(lv==1){
            
        }if(lv<=2){
            
        }if(lv<=3){
            
        }if(lv<=4){
            
        }
    }
    
    public final void resizeJTable(){
        jTUsuarios.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTUsuarios.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
    }
    
    private void recolorBG(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recolorBG
        recolorBG();
    }//GEN-LAST:event_recolorBG
    
    public void recolorBG(){
        if (!jTFUsuario.getText().isEmpty()) {
            jTFUsuario.setBackground(Color.white);
        } else {
            jTFUsuario.setBackground(Color.decode("#FFCCCC"));
        }
        if (!jPFSenha.getText().isEmpty()) {
            jPFSenha.setBackground(Color.white);
        } else {
            jPFSenha.setBackground(Color.decode("#FFCCCC"));
        }
        if (jCBFuncao.getSelectedIndex()!=0) {
            jCBFuncao.setBackground(Color.white);
        } else {
            jCBFuncao.setBackground(Color.decode("#FFCCCC"));
        }
    }
    
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFId.setText("");
        jTFUsuario.setText("");
        jPFSenha.setText("");
        jCBFuncao.setSelectedIndex(0);
        jTBEditar.setSelected(false);
        jTFId.requestFocusInWindow();
        idU=0;
        DefaultTableModel dtmUsuarios = (DefaultTableModel) jTUsuarios.getModel();
        dtmUsuarios.setRowCount(0);
        resizeJTable();
        desHabilitaEditar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBPesquisarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarrActionPerformed
        DefaultTableModel dtmUsuarios = (DefaultTableModel) jTUsuarios.getModel();
        dtmUsuarios.setRowCount(0);
        if (jTFId.getText().isEmpty()) {
            if (jTFUsuario.getText().isEmpty()) {
                    if (jCBFuncao.getSelectedIndex()==0) {
                        JOptionPane.showMessageDialog(this, "Insira um valor a ser pesquisado.", "Aviso", 0);
                    } else {
                        String funcaoS = String.valueOf(jCBFuncao.getSelectedItem());
                        ArrayList<Usuario> u = uc.consultaUsuarioF(funcaoS);
                        for (Usuario usuario : u) {
                            uc.preencheTabelaO(usuario, jTUsuarios);
                        }
                    }
            } else {
                String usuarioS = jTFUsuario.getText();
                ArrayList<Usuario> u = uc.consultaUsuarioU(usuarioS);
                for (Usuario usuario : u) {
                    uc.preencheTabelaO(usuario, jTUsuarios);
                }
            }
        } else {
            int id = 0;
            try {
                id = Integer.parseInt(jTFId.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, nfe.getMessage()+"\nPreencha o id corretamente!", "Aviso", 2);
            }
            Usuario u = uc.consultaUsuarioI(id);
            uc.preencheTabelaO(u, jTUsuarios);
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBPesquisarrActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        if (!jTFUsuario.getText().isEmpty()) {
            if (!jPFSenha.getText().isEmpty()) {
                if (jCBFuncao.getSelectedIndex()!=0) {
                    if (!uc.validaSenha(jPFSenha.getText())) {
                        JOptionPane.showMessageDialog(this, "Senha deve ter 4 caracteres ou mais!", "Aviso", 2);
                        jPFSenha.setSelectionStart(0);
                        return;
                    } else {
                        String usuario = jTFUsuario.getText().replace(".", " ").replace("-", " ").trim();
                        String senha = jPFSenha.getText().trim();
                        String func = String.valueOf(jCBFuncao.getSelectedItem());
                        Usuario newUser=new Usuario(usuario, senha, func);
                        try {
                            if(uc.salvaUsuario(newUser)){
                                JOptionPane.showMessageDialog(this, "Usuario adicionado com sucesso!", "Sucesso!", 1);
                            }else{
                                JOptionPane.showMessageDialog(this, "Usuario ja existe!", "Aviso", 2);
                            }
                        } catch (IOException ex) {
                            
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Selecione uma funcao para cadastro.", "Aviso", 2);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira a Senha para cadastro.", "Aviso", 2);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Insira o Usuario para cadastro.", "Aviso", 2);
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void apenasConsultaMode(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apenasConsultaMode
        if (!jTFId.getText().isEmpty()) {
            jBAdicionar.setEnabled(false);
        } else {
            jBAdicionar.setEnabled(true);
        }
    }//GEN-LAST:event_apenasConsultaMode

    private void desHabilitaEditar() {
        DefaultTableModel dtmUsuarios = (DefaultTableModel) jTUsuarios.getModel();
        if (dtmUsuarios.getRowCount() != 0) {
            jTBEditar.setEnabled(true);
        } else {
            jTBEditar.setEnabled(false);
        }
    }

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void recolourBG(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recolourBG
        recolorBG();
    }//GEN-LAST:event_recolourBG

    private void jTBEditarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTBEditarrActionPerformed
        DefaultTableModel dtmUsuarios = (DefaultTableModel) jTUsuarios.getModel();
        Usuario u;
        String usuario, func;
        if (jTBEditar.isSelected()) {
            try{
                idU = getSelectedId();
                jTFId.setText(String.valueOf(idU));
                usuario = getSelectedUsuario();
                jTFUsuario.setText(usuario);
                jPFSenha.setText("");
                func = getSelectedFuncao();
                jCBFuncao.setSelectedIndex(uc.indexOf(func, jCBFuncao));
                jTFUsuario.requestFocusInWindow();
                jTBEditar.setText("Salvar");
                jBAdicionar.setEnabled(false);
                jBPesquisar.setEnabled(false);
                jBLimpar.setEnabled(false);
                jTFId.setEnabled(false);
                recolorBG();
            }catch (ArrayIndexOutOfBoundsException aiob) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 0);
                jTBEditar.setSelected(false);
            }
        }else{
            if (!jTFUsuario.getText().isEmpty()) {
                if (jCBFuncao.getSelectedIndex()!=0) {
                    dtmUsuarios.setRowCount(0);
                    usuario=jTFUsuario.getText();
                    func=String.valueOf(jCBFuncao.getSelectedItem());
                    jTBEditar.setText("Editar");
                    jBAdicionar.setEnabled(true);
                    jBPesquisar.setEnabled(true);
                    jBLimpar.setEnabled(true);
                    jTFId.setEnabled(true);
                    u = new Usuario(idU, usuario, func);
                    uc.updateUsuario(u);
                    uc.preencheTabelaO(u, jTUsuarios);
                    jTFId.setText("");
                    jTFUsuario.setText("");
                    jPFSenha.setText("");
                    jCBFuncao.setSelectedIndex(0);
                    recolorBG();
                } else {
                    JOptionPane.showMessageDialog(this, "Insira uma Funcao para cadastro.", "Aviso", 1);
                    jCBFuncao.requestFocusInWindow();
                    jTBEditar.setSelected(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Insira o Nome para cadastro.", "Aviso", 1);
                jTFUsuario.requestFocusInWindow();
                jTBEditar.setSelected(true);
            }
        }
    }//GEN-LAST:event_jTBEditarrActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        try {
            if (evt.getKeyCode() == evt.VK_ENTER) {
                idU=getSelectedId();
                Usuario usuario=uc.consultaUsuarioI(idU);
                CadastroUsuario cadUsu=new CadastroUsuario(usuario);
                cadUsu.setVisible(true);
            }
            if (evt.getKeyCode() == evt.VK_ESCAPE) {
                idU=getSelectedId();
                dispose();
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_Enter

    private void recolorCB(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_recolorCB
        recolorBG();
    }//GEN-LAST:event_recolorCB

    private void recolourCB(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recolourCB
        recolorBG();
    }//GEN-LAST:event_recolourCB

    private void setSenha(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setSenha
        if(idU!=0){
            jCBFuncao.requestFocusInWindow();
            int conf = JOptionPane.showConfirmDialog(this, "Deseja alterar a senha?", "Confirma...", JOptionPane.YES_NO_OPTION);
            if (conf == JOptionPane.YES_OPTION) {
                setS=new SetSenha(this, true, uc.consultaUsuarioI(idU));
                setS.setVisible(true);
            }
        }
    }//GEN-LAST:event_setSenha

    public int getSelectedId() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTUsuarios.getModel();
        return Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(jTUsuarios.getSelectedRow(), 0)));
    }
    
    public String getSelectedUsuario() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTUsuarios.getModel();
        return String.valueOf(dtmCarrinho.getValueAt(jTUsuarios.getSelectedRow(), 1));
    }
    
    public String getSelectedFuncao() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTUsuarios.getModel();
        return String.valueOf(dtmCarrinho.getValueAt(jTUsuarios.getSelectedRow(), 2));
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
            java.util.logging.Logger.getLogger(EditorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox<String> jCBFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jTBEditar;
    private javax.swing.JTextField jTFId;
    public javax.swing.JTextField jTFUsuario;
    private javax.swing.JTable jTUsuarios;
    // End of variables declaration//GEN-END:variables
}
