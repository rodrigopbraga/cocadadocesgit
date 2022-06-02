package telas;

import controlador.PedidoController;
import controlador.VendaController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Pedido;
import modelos.Venda;

public class EditorPedido extends javax.swing.JFrame {
    private final PedidoController pc;
    private final VendaController vc;
    
    public EditorPedido(Menu menu) {
        initComponents();
        resizeJTable();
        pc=new PedidoController();
        vc=new VendaController();
        setLocationRelativeTo(menu);
        vc.setPedidoPendente(jTPedidos);
        desHabilitaEditar();
        getRootPane().setDefaultButton(jBPesquisar);
    }
    public EditorPedido(){
        initComponents();
        resizeJTable();
        pc=new PedidoController();
        vc=new VendaController();
        vc.setPedidoPendente(jTPedidos);
        desHabilitaEditar();
        getRootPane().setDefaultButton(jBPesquisar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFIdPedido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFIdCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTFIdDoce = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBLimpar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBFinalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EDITOR PEDIDOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editor de Pedidos"));

        jLabel1.setText("ID Pedido: ");

        jTFIdPedido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                recolorBG(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasConsultaMode(evt);
            }
        });
        jTFIdPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel7.setText("ID Cliente: ");

        jTFIdCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasConsultaMode(evt);
            }
        });
        jTFIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel2.setText("ID Doce: ");

        jTFIdDoce.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apenasConsultaMode(evt);
            }
        });
        jTFIdDoce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jTPedidos.setBackground(new java.awt.Color(204, 204, 255));
        jTPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pedido", "Doces", "Valor Total", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPedidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        jScrollPane1.setViewportView(jTPedidos);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.setEnabled(false);
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBFinalizar.setText("Finalizar");
        jBFinalizar.setEnabled(false);
        jBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFinalizar)
                .addGap(18, 18, 18)
                .addComponent(jBCancelar)
                .addGap(18, 18, 18)
                .addComponent(jBPesquisar)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPesquisar)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar)
                    .addComponent(jBFinalizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389))
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
                    .addComponent(jTFIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTFIdDoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
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
        //recolorBG();
    }//GEN-LAST:event_recolorBG

    public final void resizeJTable(){
        jTPedidos.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTPedidos.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTPedidos.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTPedidos.getColumnModel().getColumn(3).setPreferredWidth(50);
    }
    
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        jTFIdPedido.setText("");
        jTFIdCliente.setText("");
        jBFinalizar.setSelected(false);
        jBCancelar.setSelected(false);
        jTFIdPedido.requestFocusInWindow();
        DefaultTableModel dtmPedidos=(DefaultTableModel) jTPedidos.getModel();
        dtmPedidos.setRowCount(0);
        resizeJTable();
        desHabilitaEditar();
    }//GEN-LAST:event_jBLimparActionPerformed

    
    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        DefaultTableModel dtmPedidos=(DefaultTableModel) jTPedidos.getModel();
        dtmPedidos.setRowCount(0);
        if(jTFIdPedido.getText().isEmpty()){
            if(jTFIdDoce.getText().isEmpty()){
                if(jTFIdCliente.getText().isEmpty()){
                    JOptionPane.showMessageDialog(this, "Insira um valor a ser pesquisado.","Aviso", 0);
                }else{
                    int idC=Integer.parseInt(jTFIdCliente.getText().trim());
                    ArrayList<Venda> v = vc.consultaVendaC(idC);
                    for (Venda venda : v) {
                        vc.preencheTabelaO(venda, jTPedidos);
                    }
                }
            }else{
                int idD=Integer.parseInt(jTFIdDoce.getText().trim());
                ArrayList<Pedido> p = pc.consultaPedidoDAny(idD);
                ArrayList<Venda> v=vc.getVendasP(p);
                for (Venda venda : v) {
                    vc.preencheTabelaO(venda, jTPedidos);
                }
            }
        }else{
            int idP=Integer.parseInt(jTFIdPedido.getText().trim());
            Venda v=vc.consultaVendaP(idP);
            vc.preencheTabelaO(v, jTPedidos);
        }
        desHabilitaEditar();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarActionPerformed
        desHabilitaEditar();
    }//GEN-LAST:event_jBFinalizarActionPerformed

    private void apenasConsultaMode(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apenasConsultaMode
        if(!jTFIdPedido.getText().isEmpty()){
            jBFinalizar.setEnabled(false);
        }else jBFinalizar.setEnabled(true);
    }//GEN-LAST:event_apenasConsultaMode

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    
    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        DefaultTableModel dtmPedidos = (DefaultTableModel) jTPedidos.getModel();
        int idP;
        try{
            idP = Integer.parseInt(String.valueOf(dtmPedidos.getValueAt(jTPedidos.getSelectedRow(), 0)));
            vc.cancelaVenda(idP);
            vc.setPedidoPendente(jTPedidos);
        }catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para Cancelamento.", "Aviso", 0);
        }
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        try {
            if (evt.getKeyCode() == evt.VK_ENTER) {
                DefaultTableModel dtmPedido = (DefaultTableModel) jTPedidos.getModel();
                int idP=Integer.parseInt(String.valueOf(dtmPedido.getValueAt(jTPedidos.getSelectedRow(), 0)));
                JOptionPane.showMessageDialog(this, pc.imprimePedido(idP), "Pedido:", 1);
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_Enter
    
    public static String tirarTudoExcetoDigitos(String text) {
       if (text == null || text.length() == 0) {
           return "";
       }
       return text.replaceAll("\\D+", "");
    }
    
    private void desHabilitaEditar(){
        if(jTPedidos.getModel().getRowCount()!=0){
            jBCancelar.setEnabled(true);
            jBFinalizar.setEnabled(true);
        }else{
            jBCancelar.setEnabled(false);
            jBFinalizar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(EditorPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EditorPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFIdCliente;
    private javax.swing.JTextField jTFIdDoce;
    private javax.swing.JTextField jTFIdPedido;
    private javax.swing.JTable jTPedidos;
    // End of variables declaration//GEN-END:variables
}
