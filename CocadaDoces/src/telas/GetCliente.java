package telas;

import controlador.ClienteController;
import javax.swing.JOptionPane;

public class GetCliente extends javax.swing.JDialog {
    private int idC;
    private long cpf;
    private javax.swing.JTextField jTF;
    
    public GetCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
    }
    
    public GetCliente(java.awt.Frame parent, boolean modal, javax.swing.JTextField jTF) {
        super(parent, modal);
        initComponents();
        this.jTF=jTF;
        setLocationRelativeTo(parent);
    }
    
    public int getIdCliente() {
        return idC;
    }

    public long getCpf() {
        return cpf;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTFCpf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTE");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados:"));

        jLabel4.setText("CPF: ");

        jTFCpf.addKeyListener(new java.awt.event.KeyAdapter() {
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
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTFCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTFCpf.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }if(jTFCpf.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        idC=0;
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jTFCpf.getText().trim().length() != 11) {
                JOptionPane.showMessageDialog(this, "Preencha o CPF corretamente.", "Aviso", 2);
                jTFCpf.requestFocusInWindow();
            }else{
                cpf=Long.parseLong(jTFCpf.getText());
                dispose();
                CadastroCliente cadCliente=new CadastroCliente(cpf);
                ClienteController cc=new ClienteController();
                if(cc.existeCliente(cpf)){
                    idC=cc.consultaClienteC(cpf).getIdCliente();
                    /*UsuarioController usuCon= new UsuarioController();
                    try {
                    if(!usuCon.possuiUsuario(idC)){
                    String simNao[] = {"Sim", "Nao"};
                    int grava = JOptionPane.showOptionDialog(this, "Cliente ainda nao e um Visitante.\nDeseja cadastra-lo?", "Bem vindo",
                    JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
                    if (grava == 0) {
                    CadastroUsuario cadUsu=new CadastroUsuario(cc.consultaClienteC(cpf));
                    cadUsu.setVisible(true);
                    dispose();
                    }
                    }else{
                    JOptionPane.showMessageDialog(this, "Cliente ja possui acesso", "Aviso", 1);
                    }
                    } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Erro usuario/cliente\n"+ex.getMessage(), "Aviso", 2);
                    }*/
                    if (jTF!=null) {
                        jTF.setText(String.valueOf(idC));
                    }
                }
                if(idC==0){
                    String simNao[] = {"Sim", "Nao"};
                    int grava = JOptionPane.showOptionDialog(this, "CPF nao encontrado na base de dados.\nDeseja cadastra-lo?", "Bem vindo",
                    JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
                    if (grava == 0) {
                        cadCliente.setVisible(true);
                    }else jTFCpf.requestFocusInWindow();jTFCpf.setSelectionStart(0);
                }
            }
        }
    }//GEN-LAST:event_Enter


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFCpf;
    // End of variables declaration//GEN-END:variables
}
