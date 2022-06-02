package telas;

import controlador.ClienteController;
import controlador.LogradouroController;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.Cliente;
import modelos.Logradouro;

public class CadastroCliente extends javax.swing.JFrame {
    private final ClienteController cc;
    private final LogradouroController lc;
    private ArrayList <Logradouro> alLog;
    private Cliente client=new Cliente();
    

    public CadastroCliente() {
        initComponents();
        cc = new ClienteController();
        lc=new LogradouroController();
    }
    public CadastroCliente(long cpf) {
        initComponents();
        jTFCpf.setText(String.valueOf(cpf));
        cc = new ClienteController();
        lc = new LogradouroController();
    }
    public CadastroCliente(Cliente client) {
        initComponents();
        this.client=client;
        setEdicao(client);
        cc = new ClienteController();
        lc=new LogradouroController();
        alLog=lc.consultaLogradouroIC(client.getIdCliente());
        if(!alLog.isEmpty()){
            jTALog.setText(lc.imprimeLog(alLog.get(0)));//imprime todos por aba futuramente
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLCpf = new javax.swing.JLabel();
        jTFCpf = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLTelefone = new javax.swing.JLabel();
        jTFTelefone = new javax.swing.JTextField();
        jLPontos = new javax.swing.JLabel();
        jLBonus = new javax.swing.JLabel();
        jLResgates = new javax.swing.JLabel();
        jTPEnderecos = new javax.swing.JTabbedPane();
        jBEndereco0 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTALog = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jBGravar = new javax.swing.JButton();
        jBEditaEndereco = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CADASTRO CLIENTE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados: "));

        jLCpf.setText("CPF: ");

        jTFCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                validaCpf(evt);
            }
        });
        jTFCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLNome.setText("Nome:");

        jLTelefone.setText("Telefone: ");

        jTFTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnlyTel(evt);
            }
        });

        jLPontos.setText("Pontos: ");

        jLBonus.setText("Bonus: ");

        jLResgates.setText("Resgates: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLCpf)
                            .addComponent(jLNome))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLTelefone)
                        .addGap(36, 36, 36)
                        .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBonus)
                    .addComponent(jLPontos)
                    .addComponent(jLResgates))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLPontos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCpf)
                    .addComponent(jLBonus))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefone)
                    .addComponent(jLResgates))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPEnderecos.setBorder(javax.swing.BorderFactory.createTitledBorder("Enderecos:"));

        jTALog.setColumns(20);
        jTALog.setRows(5);
        jScrollPane1.setViewportView(jTALog);

        javax.swing.GroupLayout jBEndereco0Layout = new javax.swing.GroupLayout(jBEndereco0);
        jBEndereco0.setLayout(jBEndereco0Layout);
        jBEndereco0Layout.setHorizontalGroup(
            jBEndereco0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
        );
        jBEndereco0Layout.setVerticalGroup(
            jBEndereco0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
        );

        jTPEnderecos.addTab("Endereco Principal", jBEndereco0);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBEditaEndereco.setText("Edita Endereco");
        jBEditaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditaEnderecoActionPerformed(evt);
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
                .addComponent(jBGravar)
                .addGap(18, 18, 18)
                .addComponent(jBEditaEndereco)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGravar)
                    .addComponent(jBEditaEndereco)
                    .addComponent(jBCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPEnderecos)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPEnderecos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    
    public void setEdicao(Cliente client){
        jTFCpf.setText(String.valueOf(client.getCpf()));
        jTFNome.setText(client.getNome());
        jTFTelefone.setText(client.getTelefone());
        jLPontos.setText("Pontos: " +String.valueOf(client.getFid().getPontos()));
        jLBonus.setText("Bonus: "+String.valueOf(client.getFid().getBonus()));
        jLResgates.setText("Resgates: "+String.valueOf(client.getFid().getResgates()));
    }
    
    public void setNextEndereco(ArrayList<Logradouro> log){
        
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTFNome.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        String simNao[] = {"Sim", "Nao"};
        long cpf=0;
        String nome, tel;
        if ((jTFCpf.getText().isEmpty())) {//fazer verificacao em evento de perda de foco do campo jFTFCpf
            JOptionPane.showMessageDialog(this, "Preencha seu CPF.", "Aviso", 2);
            jTFCpf.requestFocusInWindow();
            return;
        }
        if (jTFCpf.getText().trim().length() != 11) {
            JOptionPane.showMessageDialog(this, "Preencha o CPF corretamente.", "Aviso", 2);
            jTFCpf.setText("");
            jTFCpf.requestFocusInWindow();
            return;
        } else {
            try {
                cpf = Long.parseLong(jTFCpf.getText().replace(".", "").replace("-", "").trim());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Preencha o CPF corretamente!\n"+nfe.getMessage(), "Aviso", 2);
            }
        }
        if ((jTFNome.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Preencha seu primeiro nome.", "Aviso", 2);
            jTFNome.requestFocusInWindow();
            return;
        } else {
            nome = jTFNome.getText().replace(".", " ").replace("-", " ").trim();
        }
        if ((jTFTelefone.getText().isEmpty())) {
            JOptionPane.showMessageDialog(this, "Preencha seu telefone.", "Aviso", 2);
            jTFTelefone.requestFocusInWindow();
            return;
        } else {
            tel = jTFTelefone.getText().replace("(", "").replace(")", "").trim();
        }
        int grava = JOptionPane.showOptionDialog(this, "Confirma os dados?", "Gravando...",
                JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
        if (grava == 0) {
            cc.salvaCliente(cpf, nome, tel);
        }
        jTFNome.setText(null);
        jTFCpf.setText(null);
        jTFTelefone.setText(null);
        jTFCpf.requestFocusInWindow();
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void validaCpf(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_validaCpf
        if (jTFCpf.getText().trim().length() != 11) {
            JOptionPane.showMessageDialog(this, "Preencha o CPF corretamente.", "Aviso", 2);
            jTFCpf.requestFocusInWindow();
        }else{
            long cpf=Long.parseLong(jTFCpf.getText());
            if(!cc.existeCliente(cpf)){
                JOptionPane.showMessageDialog(this, "CPF ja existe na base de dados!", "Aviso", 2);
                jTFCpf.requestFocusInWindow();
            }
        }
    }//GEN-LAST:event_validaCpf

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }if(jTFCpf.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void numberOnlyTel(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnlyTel
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }if(jTFTelefone.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnlyTel

    private void jBEditaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditaEnderecoActionPerformed
        
        if (!lc.consultaLogradouroIC(client.getIdCliente()).isEmpty()) {//verificar abas quando implementado
            CadastroLogradouro cadLog = new CadastroLogradouro(alLog.get(0));
            cadLog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Sem Endereco!", "Aviso", 2);
        }
    }//GEN-LAST:event_jBEditaEnderecoActionPerformed

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
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditaEndereco;
    private javax.swing.JPanel jBEndereco0;
    private javax.swing.JButton jBGravar;
    private javax.swing.JLabel jLBonus;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPontos;
    private javax.swing.JLabel jLResgates;
    private javax.swing.JLabel jLTelefone;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTALog;
    private javax.swing.JTextField jTFCpf;
    public javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFTelefone;
    private javax.swing.JTabbedPane jTPEnderecos;
    // End of variables declaration//GEN-END:variables
}
