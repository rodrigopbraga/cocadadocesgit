package telas;
import controlador.VendaController;
import javax.swing.JOptionPane;
import modelos.MetodoPagamento;

public class GetMetodoPagamento extends javax.swing.JDialog {
    private int idP;
    private MetodoPagamento mp=new MetodoPagamento(0);
    private javax.swing.JLabel jlmp;
    
    public GetMetodoPagamento(java.awt.Frame parent, boolean modal, int idP, javax.swing.JLabel jlmp) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        this.jlmp=jlmp;
        this.idP=idP;
        setLocationRelativeTo(jlmp);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTFFormaPagamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("METODO PAGAMENTO");
        setType(java.awt.Window.Type.POPUP);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados:"));

        jLabel4.setText("Forma de Pagamento: ");

        jTFFormaPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTFFormaPagamento.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }if(jTFFormaPagamento.getText().length()>10){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if (evt.getKeyCode() == evt.VK_ENTER) {
            if (jTFFormaPagamento.getText().trim().length() < 1 || jTFFormaPagamento.getText().trim().length()>15) {
                JOptionPane.showMessageDialog(this, "Preencha corretamente.", "Aviso", 2);
                jTFFormaPagamento.setSelectionStart(0);
            }else{
                VendaController vc=new VendaController();
                mp.setCodMetodo(Integer.parseInt(jTFFormaPagamento.getText()));
                mp=vc.attMetodoPagamento(mp.getCodMetodo(), idP);
                jlmp.setText(mp.getDescMetodo());
                dispose();
            }
        }
    }//GEN-LAST:event_Enter


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTFFormaPagamento;
    // End of variables declaration//GEN-END:variables
}
