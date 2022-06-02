package telas;

import controlador.ClienteController;
import controlador.DoceController;
import controlador.ImprimeController;
import controlador.PedidoController;
import controlador.VendaController;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cliente;
import modelos.Pedido;
import modelos.Usuario;
import modelos.Venda;

public class Menu extends javax.swing.JFrame {
    private ClienteController cc=new ClienteController();
    private PedidoController pc = new PedidoController();
    private ImprimeController ic = new ImprimeController();
    private Login login = new Login();
    private Cliente client=new Cliente();
    private Usuario currentUser;
    private ArrayList<Pedido> pediAL;
    private int idP;
    private double desc, bruto;

    public Menu() {
        initComponents();
        resizeJTable();
        pediAL =new ArrayList<>();
    }
    
    public Menu(Usuario u) {
        initComponents();
        resizeJTable();
        this.currentUser=u;
        pediAL =new ArrayList<>();
        jLRodape.setText("Usuario: "+currentUser.getUsuario());
        
        setViewPerUser(currentUser);
    }
    
    public Menu(ArrayList <Pedido> pediAL, int idP, Cliente client, Usuario u) {
        initComponents();
        resizeJTable();
        this.pediAL=pediAL;
        this.idP=idP;
        this.client=client;
        this.currentUser=u;
        editaPedido(pediAL);
        
        setViewPerUser(currentUser);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPVenda = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jBSoma = new javax.swing.JButton();
        jBSubtrai = new javax.swing.JButton();
        jBRemove = new javax.swing.JButton();
        jBLimpa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTCarrinho = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLCliente = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLQuant = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLTotal = new javax.swing.JLabel();
        jPOperacoes = new javax.swing.JPanel();
        jBCliente = new javax.swing.JButton();
        jBResgatarVale = new javax.swing.JButton();
        jBConcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLRodape = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMOperar = new javax.swing.JMenu();
        jMIOperarCaixa = new javax.swing.JMenuItem();
        jMIOperarCozinha = new javax.swing.JMenuItem();
        jMCadastrar = new javax.swing.JMenu();
        jMICadastrarDoce = new javax.swing.JMenuItem();
        jMICadastrarCliente = new javax.swing.JMenuItem();
        jMICadastrarLogradouro = new javax.swing.JMenuItem();
        jMICadastrarUsuario = new javax.swing.JMenuItem();
        jMEditor = new javax.swing.JMenu();
        jMIEditorDoces = new javax.swing.JMenuItem();
        jMIEditorClientes = new javax.swing.JMenuItem();
        jMIEditorLogradouros = new javax.swing.JMenuItem();
        jMIEditorPedidos = new javax.swing.JMenuItem();
        jMIEditorUsuario = new javax.swing.JMenuItem();
        jMRelatorio = new javax.swing.JMenu();
        jMIMaisVendidos = new javax.swing.JMenuItem();
        jMIVendasFaturamento = new javax.swing.JMenuItem();
        jMOpcoes = new javax.swing.JMenu();
        jMILimpar = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COCADAS E DOCES 1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                ExitConfirmation(evt);
            }
        });

        jPVenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Venda:"));

        jLabel4.setText("Id Doce: ");

        jTFId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Enter(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberOnly(evt);
            }
        });

        jLabel5.setText("(F3 para Lista de Doces)");

        jBSoma.setText("+");
        jBSoma.setEnabled(false);
        jBSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSomaActionPerformed(evt);
            }
        });

        jBSubtrai.setText("-");
        jBSubtrai.setEnabled(false);
        jBSubtrai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSubtraiActionPerformed(evt);
            }
        });

        jBRemove.setText("Remove");
        jBRemove.setEnabled(false);
        jBRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoveActionPerformed(evt);
            }
        });

        jBLimpa.setText("Limpa");
        jBLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpaActionPerformed(evt);
            }
        });

        jTCarrinho.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTCarrinho);

        jLabel1.setText("Cliente:");

        jLabel2.setText("Quantidade:");

        jLabel3.setText("Total:");

        javax.swing.GroupLayout jPVendaLayout = new javax.swing.GroupLayout(jPVenda);
        jPVenda.setLayout(jPVendaLayout);
        jPVendaLayout.setHorizontalGroup(
            jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPVendaLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(32, 32, 32)
                        .addComponent(jBSoma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBSubtrai)
                        .addGap(18, 18, 18)
                        .addComponent(jBRemove)
                        .addGap(18, 18, 18)
                        .addComponent(jBLimpa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPVendaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPVendaLayout.setVerticalGroup(
            jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jBSoma)
                    .addComponent(jBSubtrai)
                    .addComponent(jBRemove)
                    .addComponent(jBLimpa))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLQuant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );

        jPOperacoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBCliente.setText("Cliente");
        jBCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteActionPerformed(evt);
            }
        });

        jBResgatarVale.setText("Resgatar Vale");
        jBResgatarVale.setEnabled(false);
        jBResgatarVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBResgatarValeActionPerformed(evt);
            }
        });

        jBConcluir.setText("Concluir");
        jBConcluir.setEnabled(false);
        jBConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConcluirActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPOperacoesLayout = new javax.swing.GroupLayout(jPOperacoes);
        jPOperacoes.setLayout(jPOperacoesLayout);
        jPOperacoesLayout.setHorizontalGroup(
            jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBResgatarVale, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPOperacoesLayout.setVerticalGroup(
            jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOperacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBResgatarVale, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLRodape.setForeground(new java.awt.Color(102, 102, 102));
        jLRodape.setText("Usuario: ");
        jLRodape.setEnabled(false);

        jMOperar.setText("Operar");

        jMIOperarCaixa.setText("Caixa");
        jMIOperarCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOperarCaixaActionPerformed(evt);
            }
        });
        jMOperar.add(jMIOperarCaixa);

        jMIOperarCozinha.setText("Cozinha");
        jMIOperarCozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIOperarCozinhaActionPerformed(evt);
            }
        });
        jMOperar.add(jMIOperarCozinha);

        jMenuBar1.add(jMOperar);

        jMCadastrar.setText("Cadastrar");

        jMICadastrarDoce.setText("Doce");
        jMICadastrarDoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarDoceActionPerformed(evt);
            }
        });
        jMCadastrar.add(jMICadastrarDoce);

        jMICadastrarCliente.setText("Cliente");
        jMICadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarClienteActionPerformed(evt);
            }
        });
        jMCadastrar.add(jMICadastrarCliente);

        jMICadastrarLogradouro.setText("Endereco");
        jMICadastrarLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarLogradouroActionPerformed(evt);
            }
        });
        jMCadastrar.add(jMICadastrarLogradouro);

        jMICadastrarUsuario.setText("Usuario");
        jMICadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastrarUsuarioActionPerformed(evt);
            }
        });
        jMCadastrar.add(jMICadastrarUsuario);

        jMenuBar1.add(jMCadastrar);

        jMEditor.setText("Editor");

        jMIEditorDoces.setText("Doces");
        jMIEditorDoces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditorDocesActionPerformed(evt);
            }
        });
        jMEditor.add(jMIEditorDoces);

        jMIEditorClientes.setText("Clientes");
        jMIEditorClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditorClientesActionPerformed(evt);
            }
        });
        jMEditor.add(jMIEditorClientes);

        jMIEditorLogradouros.setText("Enderecos");
        jMIEditorLogradouros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditorLogradourosActionPerformed(evt);
            }
        });
        jMEditor.add(jMIEditorLogradouros);

        jMIEditorPedidos.setText("Pedidos");
        jMIEditorPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditorPedidosActionPerformed(evt);
            }
        });
        jMEditor.add(jMIEditorPedidos);

        jMIEditorUsuario.setText("Usuario");
        jMIEditorUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEditorUsuarioActionPerformed(evt);
            }
        });
        jMEditor.add(jMIEditorUsuario);

        jMenuBar1.add(jMEditor);

        jMRelatorio.setText("Relatorio");

        jMIMaisVendidos.setText("Mais Vendidos");
        jMIMaisVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIMaisVendidosActionPerformed(evt);
            }
        });
        jMRelatorio.add(jMIMaisVendidos);

        jMIVendasFaturamento.setText("Vendas Faturamento");
        jMIVendasFaturamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIVendasFaturamentoActionPerformed(evt);
            }
        });
        jMRelatorio.add(jMIVendasFaturamento);

        jMenuBar1.add(jMRelatorio);

        jMOpcoes.setText("Opcoes");

        jMILimpar.setText("Limpar");
        jMILimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMILimparActionPerformed(evt);
            }
        });
        jMOpcoes.add(jMILimpar);

        jMISair.setText("Sair");
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMOpcoes.add(jMISair);

        jMenuBar1.add(jMOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPOperacoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLRodape)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void setViewPerUser(Usuario user){
        int lv=user.getLv();
        if(lv==1){//cozinha
            jMCadastrar.setEnabled(false);
            jMEditor.setEnabled(false);
            jMIOperarCaixa.setEnabled(false);
        }if(lv<=2){//caixa
            jMICadastrarDoce.setEnabled(false);
            jMIEditorDoces.setEnabled(false);
        }if(lv<=3){//coordenador
            jMRelatorio.setEnabled(false);
        }if(lv<=4){//gerente
            
        }
    }
    
    private void ExitConfirmation(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ExitConfirmation
        int conf = JOptionPane.showConfirmDialog(this, "Quer mesmo sair do sistema?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            login.setVisible(true);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_ExitConfirmation

    private void jMICadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarClienteActionPerformed
        CadastroCliente cadCli = new CadastroCliente();
        cadCli.setVisible(true);
    }//GEN-LAST:event_jMICadastrarClienteActionPerformed

    private void jMICadastrarDoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarDoceActionPerformed
        CadastroDoce cadDoc = new CadastroDoce();
        cadDoc.setVisible(true);
    }//GEN-LAST:event_jMICadastrarDoceActionPerformed

    private void jMIEditorClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditorClientesActionPerformed
        EditorCliente ediCli = new EditorCliente();
        ediCli.setVisible(true);
    }//GEN-LAST:event_jMIEditorClientesActionPerformed

    private void jMIEditorDocesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditorDocesActionPerformed
        EditorDoce consDoce = new EditorDoce(this);
        consDoce.setVisible(true);
    }//GEN-LAST:event_jMIEditorDocesActionPerformed

    private void jBClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteActionPerformed
        VendaController vc=new VendaController();
        int idC=0;
        try {
            idC = client.getIdCliente();
        } catch (NullPointerException npe) {
            
        }
        if(idC!=0){
            int conf = JOptionPane.showConfirmDialog(this, "Retira cliente?", "Confirma...", JOptionPane.YES_NO_OPTION);
            if (conf == JOptionPane.YES_OPTION) {
                client=new Cliente(0);
                vc.attClienteVenda(idP, client.getIdCliente());
                jLCliente.setText("");
            }
        }else{
            GetCliente gc = new GetCliente(this, true);
            gc.setVisible(true);
            if (cc.existeCliente(gc.getCpf())) {
                client=cc.consultaClienteI(gc.getIdCliente());
                vc.attClienteVenda(idP, client.getIdCliente());
                jLCliente.setText(client.getNome());
            }
        }
        desHabilitaVale();
    }//GEN-LAST:event_jBClienteActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        int conf = JOptionPane.showConfirmDialog(this, "Quer mesmo sair do sistema?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            dispose();
            login.setVisible(true);
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jBSairActionPerformed

    private void jMILimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMILimparActionPerformed
        String simNao[] = {"Sim", "Nao"};
        int grava = JOptionPane.showOptionDialog(this, "Limpar tudo?", "Limpar",
                JOptionPane.YES_NO_OPTION, 3, null, simNao, simNao[0]);
        if (grava == 0) {
            limpar();
        }
    }//GEN-LAST:event_jMILimparActionPerformed

    public void limpar() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        pediAL=new ArrayList<>();
        client=new Cliente();
        idP = 0;
        desc=0;
        bruto=0;
        dtmCarrinho.setRowCount(0);
        jTFId.setText("");
        jTFId.requestFocusInWindow();
        jLCliente.setText("");
        jLQuant.setText("");
        jLTotal.setText("");
        desHabilitaEdicao();
        desHabilitaVale();
        desHabilitaConcluir();
        resizeJTable();
        setViewPerUser(currentUser);
    }
    
    public final void editaPedido(ArrayList <Pedido> pediAL){
        VendaController vc=new VendaController();
        if(!vc.clienteNull(vc.consultaVendaP(idP).getIdVenda())){
            int idC=vc.consultaVendaP(idP).getIdCliente();
            client=cc.consultaClienteI(idC);
            jLCliente.setText(client.getNome());
            desHabilitaVale();
        }
        for(Pedido p:pediAL){
            pc.preencheTabelaO(p, jTCarrinho);
        }
        desHabilitaEdicao();
        desHabilitaConcluir();
    }

    public void desHabilitaEdicao() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        if (dtmCarrinho.getRowCount() == 0) {
            jBSoma.setEnabled(false);
            jBSubtrai.setEnabled(false);
            jBRemove.setEnabled(false);
        } else {
            jBSoma.setEnabled(true);
            jBSubtrai.setEnabled(true);
            jBRemove.setEnabled(true);
        }
    }

    public void desHabilitaVale() {
        if (client.getIdCliente()!=0) {
            jBResgatarVale.setEnabled(true);
        } else {
            jBResgatarVale.setEnabled(false);
        }
    }
    
    public void desHabilitaConcluir() {
        if (jTCarrinho.getRowCount() != 0) {
            jBConcluir.setEnabled(true);
        } else {
            jBConcluir.setEnabled(false);
        }
    }

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        int conf = JOptionPane.showConfirmDialog(this, "Quer mesmo sair do sistema?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.dispose();
            login.setVisible(true);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jMISairActionPerformed

    private void jBLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpaActionPerformed
        int conf = JOptionPane.showConfirmDialog(this, "Limpa pedido?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            limpar();
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_jBLimpaActionPerformed

    private void jBRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoveActionPerformed
        if (!jTCarrinho.hasFocus()) {
            try {
                removeDoce();
            } catch (ArrayIndexOutOfBoundsException aiob) {
                JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 2);
            }
        }
    }//GEN-LAST:event_jBRemoveActionPerformed

    public int getSelectedId() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        return Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 0)));
    }

    public int getSelectedQuant() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        return Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 2)));
    }

    public int getRowIdD(int linha) {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        return Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(linha, 0)));
    }
    
    public String getRowNomeD(int linha) {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        return String.valueOf(dtmCarrinho.getValueAt(linha, 1));
    }
    
    public int getRowQuant(int linha) {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        return Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(linha, 2)));
    }
    
    public Double getRowPVenda(int linha) {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        return Double.parseDouble(String.valueOf(dtmCarrinho.getValueAt(linha, 3)));
    }

    public void removeDoce() {
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        Pedido pedido = new Pedido(getSelectedId());
        if(pc.deletePedidoD(pedido)){
            dtmCarrinho.removeRow(jTCarrinho.getSelectedRow());
            attQuantTotal();
            desHabilitaEdicao();
            desHabilitaConcluir();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao remover Doce.", "Aviso", 2);
        }
    }

    private void Enter(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Enter
        int idD=0;
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                idD = Integer.parseInt(jTFId.getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Preencha o id corretamente!\n"+nfe.getMessage(), "Aviso", 2);
                jTFId.requestFocusInWindow();
                jTFId.setSelectionStart(0);
            }
            //if (jTCarrinho.getRowCount() == 0) {
                int linha = doceExistenteJTCarrinho(idD);
                if (linha != -1) {
                    DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
                    dtmCarrinho.setValueAt(getRowQuant(linha) + 1, linha, 2);
                    jTFId.requestFocusInWindow();
                    jTFId.setSelectionStart(0);
                    attQuantTotal();
                } else {
                    DoceController dc = new DoceController();
                    if (dc.existeDoce(idD)) {
                        addDoce(idD);
                    } else {
                        JOptionPane.showMessageDialog(this, "Doce nao encontrado!", "Aviso!", 1);
                        jTFId.requestFocusInWindow();
                        jTFId.setSelectionStart(0);
                    }
                }
                /*} else {
                DoceController dc = new DoceController();
                if (dc.existeDoce(idD)) {
                addDoce(idD);
                } else {
                JOptionPane.showMessageDialog(this, "Doce nao encontrado!", "Aviso!", 1);
                jTFId.requestFocusInWindow();
                jTFId.setSelectionStart(0);
                }
                }*/
        } else if (evt.getKeyCode() == evt.VK_F3) {
            EditorDoce ed = new EditorDoce(this);
            ed.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_Enter

    public int doceExistenteJTCarrinho(int idD) {
        int linha = -1;
        for (int i = 0; i < jTCarrinho.getRowCount(); i++) {
            if (idD == Integer.parseInt(String.valueOf(jTCarrinho.getValueAt(i, 0)))) {
                linha = i;
                return linha;
            }
        }
        System.out.println("linha: " + linha);
        return linha;
    }

    public void addDoce(int idD) {
        if (idP != 0) {
            idP = pc.salvaPedidoExistente(idP, idD).getIdPedido();//utilizar Pedido, ao inves dos atributos de Pedido
            pediAL.add(new Pedido(idP, idD));
        } else {
            idP = pc.salvaPedidoNovo(idD).getIdPedido();
            pediAL.add(new Pedido(idP, idD));
        }
        pc.preencheTabelaO(pc.consultaPedidoD(idP, idD), jTCarrinho);
        attQuantTotal();
        desHabilitaEdicao();
        desHabilitaConcluir();
        jTFId.requestFocusInWindow();
        jTFId.setSelectionStart(0);
    }

    public int getIdDInTable(Pedido p){
        int i =0;
        for (i = 0; i < jTCarrinho.getRowCount(); i++) {
            if(getRowIdD(i)==p.getIdDoce()){
                return i;
            }
        }return -1;
    }
    
    public double getBruto(){
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        for(int i=0;i<jTCarrinho.getRowCount();i++){
            bruto+=Double.parseDouble(String.valueOf(dtmCarrinho.getValueAt(i, 3)))*getRowQuant(i);
        }return bruto;
    }

    private void jBConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConcluirActionPerformed
        VendaController vc=new VendaController();
        int conf = JOptionPane.showConfirmDialog(this, "Conclui pedido?", "Confirma...", JOptionPane.YES_NO_OPTION);
        if (conf == JOptionPane.YES_OPTION) {
            DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
            for(Pedido p:pediAL){
                p.setQntDoce(Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(getIdDInTable(p), 2))));
                pc.updatePedido(p);
            }
            if(vc.pedidoPronto(idP)){
                vc.concluiVenda(idP, client.getIdCliente(), ic.getCurrentDate(), getBruto(), desc);
                Venda v=vc.consultaVendaP(idP);
                JOptionPane.showMessageDialog(this, "Pedido "+idP+" atualizado com sucesso!\n\n"
                    +"   Total: "+v.getValorBruto()
                    +"\n   Sub-total: "+(v.getValorBruto()-v.getDesconto()));
            }else{
                Venda v=vc.salvaVenda(idP, client.getIdCliente(), ic.getCurrentDate(), getBruto(), desc, currentUser);
                JOptionPane.showMessageDialog(this, "Pedido "+idP+" criado com sucesso!\n\n"
                    + "   Total: "+v.getValorBruto()
                    +"\n   Sub-total: "+(v.getValorBruto()-v.getDesconto()));
            }
            limpar();
        }
    }//GEN-LAST:event_jBConcluirActionPerformed

    private void jBSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSomaActionPerformed
        try {
            DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
            dtmCarrinho.setValueAt(getSelectedQuant() + 1, jTCarrinho.getSelectedRow(), 2);
            attQuantTotal();
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 2);
        }
    }//GEN-LAST:event_jBSomaActionPerformed

    private void jBSubtraiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSubtraiActionPerformed
        DefaultTableModel dtmCarrinho = (DefaultTableModel) jTCarrinho.getModel();
        try {
            Integer.parseInt(String.valueOf(dtmCarrinho.getValueAt(jTCarrinho.getSelectedRow(), 2)));
            dtmCarrinho.setValueAt(getSelectedQuant() - 1, jTCarrinho.getSelectedRow(), 2);
            if (getSelectedQuant() <= 0) {
                int conf = JOptionPane.showConfirmDialog(this, "Retira doce?", "Confirma...", JOptionPane.YES_NO_OPTION);
                if (conf == JOptionPane.YES_OPTION) {
                    removeDoce();
                }else{
                    dtmCarrinho.setValueAt(getSelectedQuant() + 1, jTCarrinho.getSelectedRow(), 2);
                }
            }attQuantTotal();
        } catch (ArrayIndexOutOfBoundsException aiob) {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para Edicao.", "Aviso", 2);
        }
    }//GEN-LAST:event_jBSubtraiActionPerformed

    private void jMIEditorPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditorPedidosActionPerformed
        EditorPedido ediPedi=new EditorPedido(this);
        ediPedi.setVisible(true);
    }//GEN-LAST:event_jMIEditorPedidosActionPerformed

    private void jMIEditorLogradourosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditorLogradourosActionPerformed
        EditorLogradouro ediLog=new EditorLogradouro();
        ediLog.setVisible(true);
    }//GEN-LAST:event_jMIEditorLogradourosActionPerformed

    private void jBResgatarValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBResgatarValeActionPerformed
        if(client.getFid().getBonus()>0){
            String qBS = JOptionPane.showInputDialog(this, "Possui "
                    + client.getFid().getBonus() + " Vales!\nQuantos deseja resgatar?", 
                    "Fidelidade de " + client.getPrimeiroNome(),
                    JOptionPane.QUESTION_MESSAGE);
            int quantBonus=0;
            desc=0;
            try {
                quantBonus = Integer.parseInt(qBS);
                client.getFid().setBonus(client.getFid().getBonus()-quantBonus);
                desc+=5*quantBonus;
                attQuantTotal();
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Insira a quantidade para resgatar!", "Erro", 2);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Cliente nao possui Bonus.", "Aviso", 1);
        }
    }//GEN-LAST:event_jBResgatarValeActionPerformed

    private void jMIOperarCozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOperarCozinhaActionPerformed
        Cozinha coz=new Cozinha(this, true);
        coz.setVisible(true);
    }//GEN-LAST:event_jMIOperarCozinhaActionPerformed

    private void jMIOperarCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIOperarCaixaActionPerformed
        Caixa cx=new Caixa(currentUser, this);
        cx.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMIOperarCaixaActionPerformed

    private void numberOnly(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberOnly
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_numberOnly

    private void jMIMaisVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIMaisVendidosActionPerformed
        RelMaisVendidos maisVend=new RelMaisVendidos();
        maisVend.setVisible(true);
    }//GEN-LAST:event_jMIMaisVendidosActionPerformed

    private void jMICadastrarLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarLogradouroActionPerformed
        CadastroLogradouro cadLog=new CadastroLogradouro();
        cadLog.setVisible(true);
    }//GEN-LAST:event_jMICadastrarLogradouroActionPerformed

    private void jMIEditorUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEditorUsuarioActionPerformed
        EditorUsuario ediUsu=new EditorUsuario(currentUser);
        ediUsu.setVisible(true);
    }//GEN-LAST:event_jMIEditorUsuarioActionPerformed

    private void jMIVendasFaturamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIVendasFaturamentoActionPerformed
        RelVendasFaturamento venFat=new RelVendasFaturamento();
        venFat.setVisible(true);
    }//GEN-LAST:event_jMIVendasFaturamentoActionPerformed

    private void jMICadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastrarUsuarioActionPerformed
        CadastroUsuario cadUsu=new CadastroUsuario();
        cadUsu.setVisible(true);
    }//GEN-LAST:event_jMICadastrarUsuarioActionPerformed

    public void attQuantTotal(){
        int quant[]=new int [jTCarrinho.getRowCount()], quantT=0;
        double total=0;
        for (int i = 0; i < jTCarrinho.getRowCount(); i++) {
            quant[i]+=getRowQuant(i);
            total+=quant[i]*getRowPVenda(i);
        }
        for(int t=0; t<quant.length;t++){
            quantT+=quant[t];
        }
        jLQuant.setText(quantT+"");
        jLTotal.setText((total-desc)+"");
    }
    
    public final void resizeJTable(){
        jTCarrinho.getColumnModel().getColumn(0).setPreferredWidth(15);
        jTCarrinho.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTCarrinho.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTCarrinho.getColumnModel().getColumn(3).setPreferredWidth(30);
    }

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCliente;
    private javax.swing.JButton jBConcluir;
    private javax.swing.JButton jBLimpa;
    private javax.swing.JButton jBRemove;
    private javax.swing.JButton jBResgatarVale;
    private javax.swing.JButton jBSair;
    private javax.swing.JButton jBSoma;
    private javax.swing.JButton jBSubtrai;
    private javax.swing.JLabel jLCliente;
    private javax.swing.JLabel jLQuant;
    private javax.swing.JLabel jLRodape;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMCadastrar;
    private javax.swing.JMenu jMEditor;
    private javax.swing.JMenuItem jMICadastrarCliente;
    private javax.swing.JMenuItem jMICadastrarDoce;
    private javax.swing.JMenuItem jMICadastrarLogradouro;
    private javax.swing.JMenuItem jMICadastrarUsuario;
    private javax.swing.JMenuItem jMIEditorClientes;
    private javax.swing.JMenuItem jMIEditorDoces;
    private javax.swing.JMenuItem jMIEditorLogradouros;
    private javax.swing.JMenuItem jMIEditorPedidos;
    private javax.swing.JMenuItem jMIEditorUsuario;
    private javax.swing.JMenuItem jMILimpar;
    private javax.swing.JMenuItem jMIMaisVendidos;
    private javax.swing.JMenuItem jMIOperarCaixa;
    private javax.swing.JMenuItem jMIOperarCozinha;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenuItem jMIVendasFaturamento;
    private javax.swing.JMenu jMOpcoes;
    private javax.swing.JMenu jMOperar;
    private javax.swing.JMenu jMRelatorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPOperacoes;
    private javax.swing.JPanel jPVenda;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTCarrinho;
    private javax.swing.JTextField jTFId;
    // End of variables declaration//GEN-END:variables
}
