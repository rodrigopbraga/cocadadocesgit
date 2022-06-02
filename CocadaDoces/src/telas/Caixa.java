package telas;

import controlador.ClienteController;
import controlador.DoceController;
import controlador.PedidoController;
import controlador.UsuarioController;
import controlador.VendaController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.Fidelidade;
import modelos.MetodoPagamento;
import modelos.Pedido;
import modelos.Usuario;
import modelos.Venda;

public class Caixa extends javax.swing.JFrame {

    private PedidoController pc;
    private ClienteController cc;
    private VendaController vc;
    private UsuarioController uc;
    private Menu menu;
    private Usuario currentUser;
    private MetodoPagamento mp=new MetodoPagamento(0);
    private ArrayList<Pedido> pediAL;
    private Venda vend=new Venda();
    private Cliente client = new Cliente(0);
    //private int idP, idV;

    public Caixa() {
        initComponents();
        pc = new PedidoController();
        cc = new ClienteController();
        vc = new VendaController();
        uc = new UsuarioController(this);
    }

    public Caixa(Usuario user, Menu menu) {
        initComponents();
        pc = new PedidoController();
        cc = new ClienteController();
        vc = new VendaController();
        uc = new UsuarioController(this);
        this.currentUser = user;
        this.menu=menu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPedido = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTFIdPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLMetodoPagamento = new javax.swing.JLabel();
        jBLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPedido = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBMetodoPagamento = new javax.swing.JButton();
        jBFinaliza = new javax.swing.JButton();
        jBEditaPedido = new javax.swing.JButton();
        jBCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CAIXA");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ExitConfirmation(evt);
            }
        });

        jPPedido.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido: "));

        jLabel1.setText("Nº do Pedido: ");

        jTFIdPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel2.setText("Forma de pagamento (F3): ");

        jLMetodoPagamento.setText("<indefinido>");

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jTPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Doce", "Quant", "Preco"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(jTPedido);

        javax.swing.GroupLayout jPPedidoLayout = new javax.swing.GroupLayout(jPPedido);
        jPPedido.setLayout(jPPedidoLayout);
        jPPedidoLayout.setHorizontalGroup(
            jPPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPedidoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(jBLimpar)
                        .addGap(25, 25, 25))))
        );
        jPPedidoLayout.setVerticalGroup(
            jPPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFIdPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBMetodoPagamento.setText("Metodo de Pagamento");
        jBMetodoPagamento.setEnabled(false);
        jBMetodoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMetodoPagamentoActionPerformed(evt);
            }
        });

        jBFinaliza.setText("Finaliza");
        jBFinaliza.setEnabled(false);
        jBFinaliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizaActionPerformed(evt);
            }
        });

        jBEditaPedido.setText("Edita Pedido");
        jBEditaPedido.setEnabled(false);
        jBEditaPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditaPedidoActionPerformed(evt);
            }
        });

        jBCliente.setText("Cliente");
        jBCliente.setEnabled(false);
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBEditaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jBMetodoPagamento)
                .addGap(18, 18, 18)
                .addComponent(jBFinaliza, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBMetodoPagamento)
                    .addComponent(jBFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEditaPedido)
                    .addComponent(jBCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBEditaPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditaPedidoActionPerformed
        menu = new Menu(pediAL, vend.getIdPedido(), client, currentUser);
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBEditaPedidoActionPerformed

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                vend.setIdPedido(Integer.parseInt(jTFIdPedido.getText()));
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Preencha o Pedido corretamente!\n"+nfe.getMessage(), "Aviso", 0);
                jTFIdPedido.requestFocusInWindow();
                jTFIdPedido.setSelectionStart(0);
            }
            if (!vc.pedidoPronto(vend.getIdPedido())) {
                JOptionPane.showMessageDialog(this, "Pedido com situacao conluido ou cancelado!", "Aviso", 2);
                jTFIdPedido.requestFocusInWindow();
                jTFIdPedido.setSelectionStart(0);
            } else {
                DefaultTableModel dtmPedido = (DefaultTableModel) jTPedido.getModel();
                dtmPedido.setRowCount(0);
                pediAL = pc.consultaPedidoP(vend.getIdPedido());
                vend = vc.consultaVendaP(vend.getIdPedido());
                mp=vend.getMetPag();
                if (mp.getCodMetodo()!=0) {
                    jLMetodoPagamento.setText(mp.getDescMetodo());
                }
                if (!vc.clienteNull(vend.getIdVenda())) {
                    client = cc.consultaClienteI(vend.getIdCliente());
                }
                for (Pedido p : pediAL) {
                    pc.preencheTabelaO(p, jTPedido);
                }
                jTFIdPedido.requestFocusInWindow();
                jTFIdPedido.setSelectionStart(0);
                desHabilitaEdita();
            }
        }
        if (evt.getKeyCode() == evt.VK_F3) {
            if (vend.getIdVenda() != 0) {
                EditorMetodoPagamento ediMetPag = new EditorMetodoPagamento(jLMetodoPagamento, vend.getIdPedido());
                ediMetPag.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Insira um pedido primeiramente.", "Aviso", 1);
                jTFIdPedido.requestFocusInWindow();
                jTFIdPedido.setSelectionStart(0);
            }
        }
    }//GEN-LAST:event_Enter

    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
        if (client.getIdCliente() != 0) {
            int conf = JOptionPane.showConfirmDialog(this, "Retira cliente?", "Confirma...", JOptionPane.YES_NO_OPTION);
            if (conf == JOptionPane.YES_OPTION) {
                client = new Cliente(0);
            }
        } else {
            GetCliente gc = new GetCliente(this, true);
            gc.setVisible(true);
            if (cc.existeCliente(gc.getCpf())) {
                client = cc.consultaClienteI(gc.getIdCliente());
                vc.attClienteVenda(vend.getIdPedido(), client.getIdCliente());
            }
        }
    }//GEN-LAST:event_jBClienteActionPerformed

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void jBMetodoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMetodoPagamentoActionPerformed
        GetMetodoPagamento getMetPag = new GetMetodoPagamento(this, true, vend.getIdPedido(), jLMetodoPagamento);
        getMetPag.setVisible(true);
    }//GEN-LAST:event_jBMetodoPagamentoActionPerformed

    private void jBFinalizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizaActionPerformed
        vend=vc.consultaVendaP(vend.getIdPedido());
        if (vend.getMetPag().getCodMetodo()!=0) {
            int conf = JOptionPane.showConfirmDialog(this, "Conclui a Venda?", "Confirma...", JOptionPane.YES_NO_OPTION);
            if (conf == JOptionPane.YES_OPTION) {
                if (client.getIdCliente() != 0) {
                    client.setFid(pontua(client.getFid()));
                    cc.attFidelidade(client.getFid());
                }
                vc.finalizaVenda(vend.getIdVenda(), currentUser);
                JOptionPane.showMessageDialog(this, "Venda " + vend.getIdVenda() + " concluida!\nMuito bem!", "Sucesso!", 1);
                limpar();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Forma de pagamento indefinida.", "Aviso", 2);
        }
    }//GEN-LAST:event_jBFinalizaActionPerformed

    public Fidelidade pontua(Fidelidade fid){
        int quantB=0;
        fid.setPontos(fid.getPontos()+getPontuacao());
        if(fid.getPontos()>6){
            quantB=fid.getPontos()/7;
            fid.setPontos(fid.getPontos()%7);
        }
        fid.setBonus((fid.getBonus()+quantB)-getResgaste());
        fid.setResgates(fid.getResgates()+getResgaste());
        return fid;
    }
    
    public int getResgaste(){
        int quant=0;
        quant=(int) (vend.getDesconto()/5);
        return quant; 
    }
    
    public int getPontuacao(){
        int quant=0;
        DefaultTableModel dtmPedido = (DefaultTableModel) jTPedido.getModel();
        for(int i=0;i<jTPedido.getRowCount();i++){
            quant+=Integer.parseInt(String.valueOf(dtmPedido.getValueAt(i, 2)));
        }
        quant=quant-getResgaste();
        return quant;
    }
    
    public int getRowQuant(int linha) {
        DefaultTableModel dtmPedido = (DefaultTableModel) jTPedido.getModel();
        return Integer.parseInt(String.valueOf(dtmPedido.getValueAt(linha, 2)));
    }
    
    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void ExitConfirmation(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ExitConfirmation
        int conf = JOptionPane.showConfirmDialog(this, "Sair do Caixa?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            menu.setVisible(true);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_ExitConfirmation

    public void limpar() {
        pediAL = null;
        vend.setIdPedido(0);
        vend.setIdVenda(0);
        client = new Cliente();
        jTFIdPedido.setText("");
        jLMetodoPagamento.setText("<indefinido>");
        DefaultTableModel dtmPedido = (DefaultTableModel) jTPedido.getModel();
        dtmPedido.setRowCount(0);
        desHabilitaEdita();
    }

    public void desHabilitaEdita() {
        if (vend.getIdPedido()== 0) {
            jBCliente.setEnabled(false);
            jBEditaPedido.setEnabled(false);
            jBMetodoPagamento.setEnabled(false);
            jBFinaliza.setEnabled(false);
        } else {
            jBCliente.setEnabled(true);
            jBEditaPedido.setEnabled(true);
            jBMetodoPagamento.setEnabled(true);
            jBFinaliza.setEnabled(true);
        }
    }

    public String imprimePedi(Pedido pedi) {
        Cliente cli = new Cliente();
        StringBuilder sb = new StringBuilder("\nPedido: " + pedi.getIdPedido());
        if (cli.getIdCliente() != 0) {
            sb.append("\n").append(cli.getNome());
        }
        sb.append("\n");
        return sb.toString();
    }

    public String preenchePedido(int idP) {
        DoceController dc = new DoceController();
        Venda vend = vc.consultaVendaP(idP);
        StringBuilder sb = new StringBuilder("Quant       Doce                                                        Preco\n ");
        for (Pedido p : pediAL) {
            sb.append(p.getQntDoce()).append("             ");
            sb.append(dc.consultaDoceI(p.getIdDoce()).getNomedoce());
            sb.append("                                         ");
            sb.append(dc.consultaDoceI(p.getIdDoce()).getPvenda());
            sb.append("\n ");
        }
        sb.append("\nTotal: ").append(vend.getValorBruto()).append("       Desconto: ");
        sb.append(vend.getDesconto()).append("\nSub-total: ");
        sb.append(vc.getTotalPagar(vend.getValorBruto(), vend.getDesconto()));
        return sb.toString();
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBEditaPedido;
    private javax.swing.JButton jBFinaliza;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBMetodoPagamento;
    private javax.swing.JLabel jLMetodoPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPPedido;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFIdPedido;
    private javax.swing.JTable jTPedido;
    // End of variables declaration//GEN-END:variables
}
