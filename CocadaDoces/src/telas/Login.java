package telas;

import controlador.UsuarioController;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import modelos.FontManager;
public class Login extends javax.swing.JFrame {

    private final UsuarioController uc;
    
    public Login() {
        initComponents();
        uc=new UsuarioController(this);
        FontManager fontManager = new FontManager();
        Font trebuchetFont =fontManager.loadFont("/fonts/trebuc.ttf", Font.PLAIN, 15);
        UIManager.put("Button.font", trebuchetFont);
        UIManager.put("ToggleButton.font", trebuchetFont);
        UIManager.put("RadioButton.font", trebuchetFont);
        UIManager.put("CheckBox.font", trebuchetFont);
        UIManager.put("ColorChooser.font", trebuchetFont);
        UIManager.put("ComboBox.font", trebuchetFont);
        UIManager.put("Label.font", trebuchetFont);
        UIManager.put("List.font", trebuchetFont);
        UIManager.put("MenuBar.font", trebuchetFont);
        UIManager.put("MenuItem.font", trebuchetFont);
        UIManager.put("RadioButtonMenuItem.font", trebuchetFont);
        UIManager.put("CheckBoxMenuItem.font", trebuchetFont);
        UIManager.put("Menu.font", trebuchetFont);
        UIManager.put("PopupMenu.font", trebuchetFont);
        UIManager.put("OptionPane.font", trebuchetFont);
        UIManager.put("Panel.font", trebuchetFont);
        UIManager.put("ProgressBar.font", trebuchetFont);
        UIManager.put("ScrollPane.font", trebuchetFont);
        UIManager.put("Viewport.font", trebuchetFont);
        UIManager.put("TabbedPane.font", trebuchetFont);
        UIManager.put("Table.font", trebuchetFont);
        UIManager.put("TableHeader.font", trebuchetFont);
        UIManager.put("TextField.font", trebuchetFont);
        UIManager.put("FormattedTextField.font", trebuchetFont);
        UIManager.put("PasswordField.font", trebuchetFont);
        UIManager.put("TextArea.font", trebuchetFont);
        UIManager.put("TextPane.font", trebuchetFont);
        UIManager.put("EditorPane.font", trebuchetFont);
        UIManager.put("TitledBorder.font", trebuchetFont);
        UIManager.put("ToolBar.font", trebuchetFont);
        UIManager.put("ToolTip.font", trebuchetFont);
        UIManager.put("Tree.font", trebuchetFont);
        getRootPane().setDefaultButton(jBEntrar);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPFSenha = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habilitaEntrar(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jTFUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jTFUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habilitaEntrar(evt);
            }
        });
        getContentPane().add(jTFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 121, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jPFSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jPFSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                habilitaEntrar(evt);
            }
        });
        getContentPane().add(jPFSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 121, -1));

        jBEntrar.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jBEntrar.setText("Entrar");
        jBEntrar.setEnabled(false);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 120, -1));

        jBCadastrar.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 120, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telas/imagens/bg.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        try {
            String user=jTFUsuario.getText();
            String password=jPFSenha.getText();
            uc.autenticar(user, password);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Falha ao entrar com essas credenciais.\n"+ex.getMessage(), "Erro", 0);
            jTFUsuario.setSelectionStart(0);            
        }
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        CadastroUsuario teladecadastro = new CadastroUsuario(this);
        teladecadastro.setVisible(true);
        //setVisible(false);
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void habilitaEntrar(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_habilitaEntrar
        if(!jTFUsuario.getText().isEmpty() && !jPFSenha.getText().isEmpty()){
            jBEntrar.setEnabled(true);
        }else jBEntrar.setEnabled(false);
    }//GEN-LAST:event_habilitaEntrar

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPFSenha;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables
}
