package telas;
import controlador.DoceController;
import controlador.ImprimeController;
import controlador.RelatorioController;
import controlador.PedidoController;
import controlador.VendaController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.MaisVendidos;

public class RelMaisVendidos extends javax.swing.JFrame {

    private ImprimeController ic = new ImprimeController();
    private DefaultTableModel dtmRelatorio;
    private Date dataI;
    private Date dataF;
    private String sdatai="";
    private String sdataf="";
    private int idD;
    private int quantRel;
    private RelatorioController rc=new RelatorioController();

    public RelMaisVendidos() {
        initComponents();
        dtmRelatorio = (DefaultTableModel) jTRelatorio.getModel();
        resizeJTable();
        limpar();
        getRootPane().setDefaultButton(jBConsulta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jBConsulta = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTRelatorio = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDCDataInicial = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jTFIdDoce = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDCDataFinal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTFQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MAIS VENDIDOS");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBConsulta.setText("Consulta");
        jBConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultaActionPerformed(evt);
            }
        });

        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBConsulta)
                    .addComponent(jBLimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados: "));

        jTRelatorio.setBackground(new java.awt.Color(204, 204, 255));
        jTRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Doce", "Doce", "Quant Vendida", "Lucro"
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
        jTRelatorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
        });
        jScrollPane1.setViewportView(jTRelatorio);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Data Inicial: ");

        jDCDataInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateOnly(evt);
            }
        });

        jLabel3.setText("Id Doce: ");

        jTFIdDoce.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                consultaPorDoce(evt);
            }
        });
        jTFIdDoce.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
                consultaPorDoceMode(evt);
            }
        });

        jLabel2.setText("Data Final: ");

        jDCDataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateOnly(evt);
            }
        });

        jLabel4.setText("Quantidade: ");

        jTFQuantidade.setText("10");
        jTFQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                consultaPorDoce(evt);
            }
        });
        jTFQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDCDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFIdDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCDataFinal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDCDataInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFIdDoce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void resizeJTable(){
        jTRelatorio.getColumnModel().getColumn(0).setPreferredWidth(50);
        jTRelatorio.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTRelatorio.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTRelatorio.getColumnModel().getColumn(3).setPreferredWidth(88);
    }
    
    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        try {
            if (evt.getKeyCode() == evt.VK_ENTER) {
                
            }
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha.", "Aviso", 0);
        }
    }//GEN-LAST:event_Enter

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    public final void limpar(){
        jDCDataInicial.setDate(ic.getCurrentDate());
        jDCDataFinal.setDate(ic.getCurrentDate());
        jTFIdDoce.setText("");
        jTFQuantidade.setText("10");
        jDCDataInicial.requestFocusInWindow();
        dtmRelatorio.setRowCount(0);
    }
    
    public void validaDatas(){
    	DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        sdatai = simpleDateFormat.format(jDCDataInicial.getDate());
        sdataf = simpleDateFormat.format(jDCDataFinal.getDate());
        //long ldataI=Long.parseLong(sdataI);
        //System.out.println("long "+ldataI);
        //long ldataF=Long.parseLong(sdataF);
        dataI=Date.valueOf(sdatai);
        dataF=Date.valueOf(sdataf);
    }
    
    private boolean validaPeriodo(Date dataI, Date dataF) {
        return dataI.before(dataF) || dataI.equals(dataF);
    }
    
    private void dateOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateOnly
        evt.consume();
    }//GEN-LAST:event_dateOnly

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void consultaPorDoce(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_consultaPorDoce
        desHabilitaQuantDoce();
    }//GEN-LAST:event_consultaPorDoce
    
    public void desHabilitaQuantDoce(){
        if(jTFIdDoce.getText().isEmpty()){
            jTFQuantidade.setEnabled(true);
        }else{
            jTFQuantidade.setEnabled(false);
            jTFQuantidade.setText("");
        }
    }
    
    private void jBConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultaActionPerformed
        validaDatas();
        dtmRelatorio.setRowCount(0);
        if (validaPeriodo(dataI, dataF)) {
            if(!jTFQuantidade.getText().isEmpty()){
                try {
                    quantRel = Integer.parseInt(jTFQuantidade.getText());
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(this, "Preencha a quantidade corretamente!\n"+nfe.getMessage(), "Aviso", 2);
                }
                //for(MaisVendidos mvX:rc.setQuantDoceVendidoPeriodo(quantRel, sdatai, sdataf)){
                for(MaisVendidos mvX:rc.setQuantDoceVendido(quantRel)){
                    rc.preencheTabelaMV(mvX, jTRelatorio);
                }
            }else{
                if(!jTFIdDoce.getText().isEmpty()){
                    idD=Integer.parseInt(jTFIdDoce.getText());
                    rc.preencheTabelaMV(rc.setDoceVendido(idD), jTRelatorio);
                }else{
                    JOptionPane.showMessageDialog(this, "Preencha a quantidade ou um doce especifico para consulta!", "Aviso", 2);
                    jTFQuantidade.requestFocusInWindow();
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Data Final anterior a Inicial!", "Aviso", 2);
            jDCDataInicial.requestFocusInWindow();
        }
    }//GEN-LAST:event_jBConsultaActionPerformed

    private void consultaPorDoceMode(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consultaPorDoceMode
        desHabilitaQuantDoce();
    }//GEN-LAST:event_consultaPorDoceMode

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
                new RelMaisVendidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsulta;
    private javax.swing.JButton jBLimpar;
    private com.toedter.calendar.JDateChooser jDCDataFinal;
    private com.toedter.calendar.JDateChooser jDCDataInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFIdDoce;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTable jTRelatorio;
    // End of variables declaration//GEN-END:variables
}
