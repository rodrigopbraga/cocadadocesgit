package telas;

import controlador.UsuarioController;
import javax.swing.JOptionPane;
import modelos.Usuario;

public class CadastroUsuario extends javax.swing.JFrame {
    private UsuarioController uc;
    private SetSenha setS;
    private Usuario user=new Usuario(0);
    
    public CadastroUsuario() {
        initComponents();
        uc=new UsuarioController(this);
        getRootPane().setDefaultButton(jBSalvar);
    }
    public CadastroUsuario(Login login) {
        initComponents();
        uc=new UsuarioController(this);
        getRootPane().setDefaultButton(jBSalvar);
        jCBFuncao.setEnabled(false);
        jCBFuncao.setSelectedIndex(4);
    }
    public CadastroUsuario(Usuario user) {
        initComponents();
        this.user=user;
        uc=new UsuarioController(this);
        getRootPane().setDefaultButton(jBSalvar);
        setEdicao(this.user);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jCBFuncao = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jBSalvar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CADASTRO USUARIO");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro de Usuario"));

        jLabel2.setText("Usuario");

        jLabel3.setText("Senha");

        jPFSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                setSenha(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                validaSenha(evt);
            }
        });

        jLabel1.setText("Funcao");

        jCBFuncao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "GERENTE", "COORDENADOR", "CAIXA", "COZINHA" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jTFUsuario)
                    .addComponent(jLabel3)
                    .addComponent(jPFSenha)
                    .addComponent(jLabel1)
                    .addComponent(jCBFuncao, 0, 207, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPFSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBSalvar.setText("Salvar");
        jBSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalvarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalvar)
                    .addComponent(jBCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void setEdicao(Usuario user){
        jTFUsuario.setText(String.valueOf(user.getUsuario()));
        jCBFuncao.setSelectedIndex(uc.indexOf(user.getFunc(), jCBFuncao));
    }
    
    private void jBSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalvarActionPerformed
        String usuario=jTFUsuario.getText();
        String password=jPFSenha.getText();
        String func=String.valueOf(jCBFuncao.getSelectedItem());
        user=new Usuario(usuario, password, func);
        if(!uc.validaSenha(jPFSenha.getText())){
            JOptionPane.showMessageDialog(this, "Senha deve ter 4 caracteres ou mais!", "Aviso", 2);
            jPFSenha.requestFocusInWindow();
            jPFSenha.setSelectionStart(0);
        }else{
            try {
                if(uc.salvaUsuario(user)){
                    JOptionPane.showMessageDialog(this, "Usuario adicionado com sucesso!", "Aviso", 1);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(this, "Usuario ja existe!", "Aviso", 2);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Falha ao adicionar usuario.\n"+e.getMessage(), "Aviso", 0);
                jTFUsuario.requestFocusInWindow();
                jTFUsuario.setSelectionStart(0);  
            }
        }
    }//GEN-LAST:event_jBSalvarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void validaSenha(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validaSenha
        
    }//GEN-LAST:event_validaSenha

    private void setSenha(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_setSenha
        if(user.getId()!=0){
            jCBFuncao.requestFocusInWindow();
            int conf = JOptionPane.showConfirmDialog(this, "Deseja alterar a senha?", "Confirma...", JOptionPane.YES_NO_OPTION);
            if (conf == JOptionPane.YES_OPTION) {
                setS=new SetSenha(this, true, uc.consultaUsuarioI(user.getId()));
                setS.setVisible(true);
            }
        }
    }//GEN-LAST:event_setSenha

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBSalvar;
    private javax.swing.JComboBox<String> jCBFuncao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
