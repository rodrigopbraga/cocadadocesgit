package telas;
import controlador.LogradouroController;
import javax.swing.JOptionPane;
import modelos.Logradouro;


public class CadastroLogradouro extends javax.swing.JFrame {
    private final LogradouroController controller;
    public CadastroLogradouro() {
        initComponents();
        controller=new LogradouroController(this);
        //jTFIdCliente.setTransferHandler(null);
    }
    public CadastroLogradouro(Logradouro log) {
        initComponents();
        controller=new LogradouroController(this);
        jTFBairro.setText(log.getBairro());
        jTFCep.setText(log.getCep());
        jTFCidade.setText((log.getCidade()));
        jTFComplemento.setText(log.getComplemento());
        jTFEndereco.setText(log.getEndereco());
        jTFN.setText(log.getNum());
        jTFPais.setText((log.getPais()));
        jTFUf.setText(log.getUf());
        jTFIdCliente.setText("");
        jTFEndereco.requestFocusInWindow();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
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
        jLabel1 = new javax.swing.JLabel();
        jTFIdCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jBGravar = new javax.swing.JButton();
        jBCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("CADASTRO ENDERECO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados: "));

        jLabel2.setText("Endereco: ");

        jLabel3.setText("Nº: ");

        jLabel6.setText("Complemento: ");

        jLabel4.setText("Bairro: ");

        jLabel5.setText("CEP: ");

        jTFCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel7.setText("Cidade: ");

        jLabel8.setText("UF: ");

        jLabel9.setText("Pais: ");

        jLabel1.setText("Id Cliente: ");

        jTFIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTFBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                            .addComponent(jTFCidade)
                                            .addComponent(jTFPais)
                                            .addComponent(jTFComplemento)
                                            .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFN, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 191, Short.MAX_VALUE))
                                    .addComponent(jTFEndereco)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTFPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBGravar.setText("Gravar");
        jBGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarActionPerformed(evt);
            }
        });

        jBCancela.setText("Cancelar");
        jBCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelaActionPerformed(evt);
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
                .addComponent(jBCancela)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGravar)
                    .addComponent(jBCancela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTFEndereco.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jBGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarActionPerformed
        String simNao[]={"Sim","Nao"};
        String endereco, num, complemento="", bairro, cidade, uf, cep, pais;
        int idC=0;
        if((jTFEndereco.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha o endereco.","Aviso",2);
            jTFEndereco.requestFocusInWindow();
            return;
        }else endereco=jTFEndereco.getText().trim();
        if((jTFN.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha o numero.","Aviso",2);
            jTFN.requestFocusInWindow();
            return;
        }else num=jTFN.getText();
        complemento=jTFComplemento.getText();
        if((jTFBairro.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha o bairro.","Aviso",2);
            jTFBairro.requestFocusInWindow();
            return;
        }else bairro=jTFBairro.getText().replace(".", " ").replace(";", " ").replace("-", " ");
        if((jTFCep.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha o CEP.","Aviso",2);
            jTFCep.requestFocusInWindow();
            return;
        }else cep=jTFCep.getText().replace(".", "").replace(";", "").replace("-", "");
        if((jTFCidade.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha a cidade.","Aviso",2);
            jTFCidade.requestFocusInWindow();
            return;
        }else cidade=jTFCidade.getText().replace(".", " ").replace(";", " ").replace("-", " ");
        if((jTFUf.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha a Unidade Federativa.","Aviso",2);
            jTFUf.requestFocusInWindow();
            return;
        }else uf=jTFUf.getText().replace(".", "").replace(";", "").replace("-", "");
        if((jTFPais.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Preencha o Pais.","Aviso",2);
            jTFPais.requestFocusInWindow();
            return;
        }else pais=jTFPais.getText().replace(".", " ").replace(";", " ").replace("-", " ");
        if((jTFIdCliente.getText().isEmpty())){
            JOptionPane.showMessageDialog(this,"Associe o Logradouro a um cliente.","Aviso",2);
            jTFIdCliente.requestFocusInWindow();
            return;
        }else {
            try {
                idC = Integer.parseInt(jTFIdCliente.getText().trim());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Preencha o ID do Cliente corretamente!\n"+nfe.getMessage(), "Aviso", 2);
            }
        }
        
        int grava=JOptionPane.showOptionDialog(this,"Confirma os dados?","Gravando...",
                    JOptionPane.YES_NO_OPTION,3,null,simNao,simNao[0]);
            if(grava==0){
                controller.salvaLogradouro(endereco, num, complemento, bairro, cep, cidade, uf, pais, idC);
            }
            jTFEndereco.setText(null);
            jTFN.setText(null);
            jTFComplemento.setText(null);
            jTFBairro.setText(null);
            jTFCep.setText(null);
            jTFCidade.setText(null);
            jTFUf.setText(null);
            jTFPais.setText(null);
            jTFIdCliente.setText(null);
            jTFEndereco.requestFocusInWindow();
    }//GEN-LAST:event_jBGravarActionPerformed

    private void jBCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBCancelaActionPerformed

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if (evt.getKeyCode() == evt.VK_F7) {
            GetCliente gc = new GetCliente(this, true, jTFIdCliente);
            gc.setVisible(true);
        }if (evt.getKeyCode() == evt.VK_F3) {
            EditorCliente ediCli=new EditorCliente(jTFIdCliente);
            ediCli.setVisible(true);
        }
    }//GEN-LAST:event_Enter

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
                new CadastroLogradouro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancela;
    private javax.swing.JButton jBGravar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTFBairro;
    private javax.swing.JTextField jTFCep;
    public javax.swing.JTextField jTFCidade;
    public javax.swing.JTextField jTFComplemento;
    public javax.swing.JTextField jTFEndereco;
    private javax.swing.JTextField jTFIdCliente;
    public javax.swing.JTextField jTFN;
    public javax.swing.JTextField jTFPais;
    public javax.swing.JTextField jTFUf;
    // End of variables declaration//GEN-END:variables
}
