package telas;

import controlador.VendaController;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.MetodoPagamento;

public class EditorMetodoPagamento extends javax.swing.JFrame {
    private int idP;
    private final VendaController vc;
    private MetodoPagamento mp=new MetodoPagamento(0);
    private javax.swing.JLabel jlmp;
    
    public EditorMetodoPagamento(javax.swing.JLabel jlmp, int idP) {
        initComponents();
        vc=new VendaController();
        this.idP=idP;
        this.jlmp=jlmp;
        vc.setMetodoPagamento(jTMetodoPagamento);
        resizeJTable();
    }
    public EditorMetodoPagamento(){
        initComponents();
        vc=new VendaController();
        vc.setMetodoPagamento(jTMetodoPagamento);
        resizeJTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMetodoPagamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("METODOS PAGAMENTO");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodos de Pagamento: "));

        jTMetodoPagamento.setBackground(new java.awt.Color(204, 204, 255));
        jTMetodoPagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Metodo Pagamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMetodoPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        jScrollPane1.setViewportView(jTMetodoPagamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
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

    public void resizeJTable(){
        jTMetodoPagamento.getColumnModel().getColumn(0).setPreferredWidth(15);
        jTMetodoPagamento.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    
    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        try {
            if (evt.getKeyCode() == evt.VK_ESCAPE || evt.getKeyCode() == evt.VK_ENTER) {
                int linha=jTMetodoPagamento.getSelectedRow();
                if(jTMetodoPagamento.getValueAt(linha, 0)!=null){
                    DefaultTableModel dtmPedido = (DefaultTableModel) jTMetodoPagamento.getModel();
                    mp.setCodMetodo(Integer.parseInt(String.valueOf(dtmPedido.getValueAt(jTMetodoPagamento.getSelectedRow(), 0))));
                    mp = vc.attMetodoPagamento(mp.getCodMetodo(), idP);
                    jlmp.setText(mp.getDescMetodo());
                    dispose();
                }
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_Enter
    
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditorMetodoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorMetodoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorMetodoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorMetodoPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorMetodoPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMetodoPagamento;
    // End of variables declaration//GEN-END:variables
}
