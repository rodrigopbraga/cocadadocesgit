package telas;

import controlador.ImprimeController;
import controlador.PedidoController;
import controlador.VendaController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cozinha extends javax.swing.JDialog {

    private final PedidoController pc;
    private final VendaController vc;
    ImprimeController ic = new ImprimeController();

    public Cozinha(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        pc = new PedidoController();
        vc = new VendaController();
        vc.setPedidoPendente(jTPedidos);
        resizeJTable();
    }

    public Cozinha() {
        initComponents();
        pc = new PedidoController();
        vc = new VendaController();
        vc.setPedidoPendente(jTPedidos);
        resizeJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedidos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jBFinalizaPedido = new javax.swing.JButton();
        jBCancelarPedido = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("COZINHA");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos: "));

        jTPedidos.setBackground(new java.awt.Color(204, 204, 255));
        jTPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Pedido", "Doces", "Quantidade Total", "Status"
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBFinalizaPedido.setText("Finaliza Pedido");
        jBFinalizaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizaPedidoActionPerformed(evt);
            }
        });

        jBCancelarPedido.setText("Cancelar Pedido");
        jBCancelarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarPedidoActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBFinalizaPedido)
                .addGap(18, 18, 18)
                .addComponent(jBCancelarPedido)
                .addGap(18, 18, 18)
                .addComponent(jBSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBFinalizaPedido)
                    .addComponent(jBCancelarPedido))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void resizeJTable(){
        jTPedidos.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTPedidos.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTPedidos.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTPedidos.getColumnModel().getColumn(3).setPreferredWidth(50);
    }
    
    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        try {
            if (evt.getKeyCode() == evt.VK_ENTER) {
                DefaultTableModel dtmPedido = (DefaultTableModel) jTPedidos.getModel();
                int idP = Integer.parseInt(String.valueOf(dtmPedido.getValueAt(jTPedidos.getSelectedRow(), 0)));
                JOptionPane.showMessageDialog(this, pc.imprimePedido(idP), "Pedido:", 1);
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_Enter

    private void jBFinalizaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizaPedidoActionPerformed
        try {
            int conf = JOptionPane.showConfirmDialog(this, "Conclui pedido?", "Confirma...", JOptionPane.YES_NO_OPTION);
            if (conf == JOptionPane.YES_OPTION) {
                DefaultTableModel dtmPedidos = (DefaultTableModel) jTPedidos.getModel();
                int idP = Integer.parseInt(String.valueOf(dtmPedidos.getValueAt(jTPedidos.getSelectedRow(), 0)));
                vc.finalizaPedido(idP);
                Notificacao noti = new Notificacao("Pedido "
                        + vc.consultaVendaP(idP).getIdPedido() + " esta pronto!");
                noti.setVisible(true);//apenas teste; fazer aparecer apenas para o caixa
                dtmPedidos.setRowCount(0);
                vc.setPedidoPendente(jTPedidos);

            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_jBFinalizaPedidoActionPerformed

    private void jBCancelarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarPedidoActionPerformed
        int conf = JOptionPane.showConfirmDialog(this, "Cancela pedido?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            DefaultTableModel dtmPedidos = (DefaultTableModel) jTPedidos.getModel();
            int idP;
            try {
                idP = Integer.parseInt(String.valueOf(dtmPedidos.getValueAt(jTPedidos.getSelectedRow(), 0)));
                vc.cancelaVenda(idP);
                Notificacao noti = new Notificacao("Pedido " + idP + " cancelado!");
                noti.setVisible(true);
                dtmPedidos.setRowCount(0);
                vc.setPedidoPendente(jTPedidos);
            } catch (ArrayIndexOutOfBoundsException aiob) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
            }
        }
    }//GEN-LAST:event_jBCancelarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelarPedido;
    private javax.swing.JButton jBFinalizaPedido;
    private javax.swing.JButton jBSair;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTPedidos;
    // End of variables declaration//GEN-END:variables
}
