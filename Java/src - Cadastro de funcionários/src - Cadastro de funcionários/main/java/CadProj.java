//NOME: JEAN ALVES ROCHA - RA: 2313057


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CadProj extends javax.swing.JFrame {

    private Projeto projeto = new Projeto();
    private BdProj bdProj = new BdProj();
    private static CadProj cadProjUnico;
    
     private CadProj() {
        initComponents();
    }
    //Padrão singleton
     public static CadProj getCadProj(){
     
         if(cadProjUnico == null){
             cadProjUnico = new CadProj();
         }
         return cadProjUnico;
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSair = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        btCadastro = new javax.swing.JButton();
        rtCabecarioProj = new javax.swing.JLabel();
        rtNomeProj = new javax.swing.JLabel();
        cxNomeProj = new javax.swing.JTextField();
        rtCodProj = new javax.swing.JLabel();
        cxCodProj = new javax.swing.JTextField();
        rtCidadeProj = new javax.swing.JLabel();
        cxCidadeProj = new javax.swing.JTextField();
        rtDataInicio = new javax.swing.JLabel();
        cxDataInicio = new javax.swing.JTextField();
        rtDataPrevista = new javax.swing.JLabel();
        cxDataPrevista = new javax.swing.JTextField();
        rtRuaCliente = new javax.swing.JLabel();
        cxRuaCliente = new javax.swing.JTextField();
        rtCidadeCliente = new javax.swing.JLabel();
        rtCepCliente = new javax.swing.JLabel();
        cxCepCliente = new javax.swing.JTextField();
        rtCabecarioCliente = new javax.swing.JLabel();
        rtNomeCliente = new javax.swing.JLabel();
        cxNomeCliente = new javax.swing.JTextField();
        cxCidadeCliente = new javax.swing.JTextField();
        rtCpfCnpj = new javax.swing.JLabel();
        cxCpfCnpjCliente = new javax.swing.JTextField();
        cxNumCliente = new javax.swing.JTextField();
        rtNumCliente = new javax.swing.JLabel();
        rtTelefoneCliente = new javax.swing.JLabel();
        cxTelefoneCliente = new javax.swing.JTextField();
        cxTelefoneEng = new javax.swing.JTextField();
        rtRuaEng = new javax.swing.JLabel();
        cxRuaEng = new javax.swing.JTextField();
        rtEspecializacaoEng = new javax.swing.JLabel();
        rtSalarioEng = new javax.swing.JLabel();
        cxSalarioEng = new javax.swing.JTextField();
        rtCabecarioEng = new javax.swing.JLabel();
        rtNomeEng = new javax.swing.JLabel();
        cxNomeEng = new javax.swing.JTextField();
        cxEspecializacaoEng = new javax.swing.JTextField();
        rtCreaEng = new javax.swing.JLabel();
        cxCreaEng = new javax.swing.JTextField();
        cxNumEng = new javax.swing.JTextField();
        rtNumEng = new javax.swing.JLabel();
        rtTelefoneEng = new javax.swing.JLabel();
        cxTelefonePe = new javax.swing.JTextField();
        rtRuaPe = new javax.swing.JLabel();
        cxRuaPe = new javax.swing.JTextField();
        rtFuncaoPe = new javax.swing.JLabel();
        rtSalarioPe = new javax.swing.JLabel();
        cxSalarioPe = new javax.swing.JTextField();
        rtCabecarioPe = new javax.swing.JLabel();
        rtNomePe = new javax.swing.JLabel();
        cxNomePe = new javax.swing.JTextField();
        cxFuncaoPe = new javax.swing.JTextField();
        rtCodigoPe = new javax.swing.JLabel();
        cxCodigoPe = new javax.swing.JTextField();
        cxNumPe = new javax.swing.JTextField();
        rtNumPe = new javax.swing.JLabel();
        rtTelefonePe = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProj = new javax.swing.JTable();
        rtCabecarioEng1 = new javax.swing.JLabel();
        btConsProjCod = new javax.swing.JButton();
        btAtualizaProjCod = new javax.swing.JButton();
        btRemoveProjCod = new javax.swing.JButton();
        rtSalBonusEng = new javax.swing.JLabel();
        cxBonusEng = new javax.swing.JTextField();
        rtBonusEng = new javax.swing.JLabel();
        cxSalBonusEng = new javax.swing.JTextField();
        rtSalBonusPe = new javax.swing.JLabel();
        cxBonusPe = new javax.swing.JTextField();
        rtBonusPe = new javax.swing.JLabel();
        cxSalBonusPe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Projetos");
        setBackground(new java.awt.Color(0, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        btCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btCadastro.setText("Cadastrar");
        btCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastroActionPerformed(evt);
            }
        });

        rtCabecarioProj.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtCabecarioProj.setText("Projeto");

        rtNomeProj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNomeProj.setText("Nome do Projeto:");

        cxNomeProj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNomeProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeProjActionPerformed(evt);
            }
        });

        rtCodProj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCodProj.setText("Codigo do Projeto:");

        cxCodProj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCodProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodProjActionPerformed(evt);
            }
        });

        rtCidadeProj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCidadeProj.setText("Cidade: ");

        cxCidadeProj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCidadeProj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeProjActionPerformed(evt);
            }
        });

        rtDataInicio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtDataInicio.setText("Data Inicio:");

        cxDataInicio.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxDataInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataInicioActionPerformed(evt);
            }
        });

        rtDataPrevista.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtDataPrevista.setText("Data Prevista:");

        cxDataPrevista.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxDataPrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxDataPrevistaActionPerformed(evt);
            }
        });

        rtRuaCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtRuaCliente.setText("Rua:");

        cxRuaCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxRuaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRuaClienteActionPerformed(evt);
            }
        });

        rtCidadeCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCidadeCliente.setText("Cidade: ");

        rtCepCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCepCliente.setText("CEP");

        cxCepCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCepCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCepClienteActionPerformed(evt);
            }
        });

        rtCabecarioCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtCabecarioCliente.setText("Cliente");

        rtNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNomeCliente.setText("Nome:");

        cxNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeClienteActionPerformed(evt);
            }
        });

        cxCidadeCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCidadeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeClienteActionPerformed(evt);
            }
        });

        rtCpfCnpj.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCpfCnpj.setText("CPF/CNPJ");

        cxCpfCnpjCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCpfCnpjCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCpfCnpjClienteActionPerformed(evt);
            }
        });

        cxNumCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNumCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumClienteActionPerformed(evt);
            }
        });

        rtNumCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNumCliente.setText("N:");

        rtTelefoneCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtTelefoneCliente.setText("Telefone:");

        cxTelefoneCliente.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxTelefoneCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneClienteActionPerformed(evt);
            }
        });

        cxTelefoneEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxTelefoneEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefoneEngActionPerformed(evt);
            }
        });

        rtRuaEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtRuaEng.setText("Rua:");

        cxRuaEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxRuaEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRuaEngActionPerformed(evt);
            }
        });

        rtEspecializacaoEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtEspecializacaoEng.setText("Especializacao:");

        rtSalarioEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtSalarioEng.setText("Salario:");

        cxSalarioEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxSalarioEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSalarioEngActionPerformed(evt);
            }
        });

        rtCabecarioEng.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtCabecarioEng.setText("Engenheiro");

        rtNomeEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNomeEng.setText("Nome:");

        cxNomeEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNomeEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomeEngActionPerformed(evt);
            }
        });

        cxEspecializacaoEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxEspecializacaoEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEspecializacaoEngActionPerformed(evt);
            }
        });

        rtCreaEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCreaEng.setText("CREA:");

        cxCreaEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCreaEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCreaEngActionPerformed(evt);
            }
        });

        cxNumEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNumEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumEngActionPerformed(evt);
            }
        });

        rtNumEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNumEng.setText("N:");

        rtTelefoneEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtTelefoneEng.setText("Telefone:");

        cxTelefonePe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxTelefonePe.setAlignmentX(0.0F);
        cxTelefonePe.setAlignmentY(0.0F);
        cxTelefonePe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxTelefonePeActionPerformed(evt);
            }
        });

        rtRuaPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtRuaPe.setText("Rua:");

        cxRuaPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxRuaPe.setAlignmentX(0.0F);
        cxRuaPe.setAlignmentY(0.0F);
        cxRuaPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxRuaPeActionPerformed(evt);
            }
        });

        rtFuncaoPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtFuncaoPe.setText("Funcao:");

        rtSalarioPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtSalarioPe.setText("Salario:");

        cxSalarioPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxSalarioPe.setAlignmentX(0.0F);
        cxSalarioPe.setAlignmentY(0.0F);
        cxSalarioPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSalarioPeActionPerformed(evt);
            }
        });

        rtCabecarioPe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        rtCabecarioPe.setText("Pedreiro");

        rtNomePe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNomePe.setText("Nome:");

        cxNomePe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNomePe.setAlignmentX(0.0F);
        cxNomePe.setAlignmentY(0.0F);
        cxNomePe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNomePeActionPerformed(evt);
            }
        });

        cxFuncaoPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxFuncaoPe.setAlignmentX(0.0F);
        cxFuncaoPe.setAlignmentY(0.0F);
        cxFuncaoPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxFuncaoPeActionPerformed(evt);
            }
        });

        rtCodigoPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtCodigoPe.setText("Codigo:");

        cxCodigoPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxCodigoPe.setAlignmentX(0.0F);
        cxCodigoPe.setAlignmentY(0.0F);
        cxCodigoPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCodigoPeActionPerformed(evt);
            }
        });

        cxNumPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        cxNumPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxNumPeActionPerformed(evt);
            }
        });

        rtNumPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtNumPe.setText("N:");

        rtTelefonePe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtTelefonePe.setText("Telefone:");
        rtTelefonePe.setAlignmentY(0.0F);

        tblProj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Projeto", "Codigo", "Nome do Cliente", "CPF"
            }
        ));
        jScrollPane1.setViewportView(tblProj);

        rtCabecarioEng1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        rtCabecarioEng1.setForeground(new java.awt.Color(255, 153, 0));
        rtCabecarioEng1.setText("CADASTRO");

        btConsProjCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btConsProjCod.setText("Consultar");
        btConsProjCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsProjCodActionPerformed(evt);
            }
        });

        btAtualizaProjCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAtualizaProjCod.setText("Atualizar ");
        btAtualizaProjCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizaProjCodActionPerformed(evt);
            }
        });

        btRemoveProjCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btRemoveProjCod.setText("Remover");
        btRemoveProjCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoveProjCodActionPerformed(evt);
            }
        });

        rtSalBonusEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtSalBonusEng.setText("Salario + 15%:");

        cxBonusEng.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        cxBonusEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBonusEngActionPerformed(evt);
            }
        });

        rtBonusEng.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtBonusEng.setText("Bonus:");

        cxSalBonusEng.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        cxSalBonusEng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSalBonusEngActionPerformed(evt);
            }
        });

        rtSalBonusPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtSalBonusPe.setText("Salario + 10%:");
        rtSalBonusPe.setAlignmentY(0.0F);

        cxBonusPe.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        cxBonusPe.setAlignmentX(0.0F);
        cxBonusPe.setAlignmentY(0.0F);
        cxBonusPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxBonusPeActionPerformed(evt);
            }
        });

        rtBonusPe.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        rtBonusPe.setText("Bonus:");
        rtBonusPe.setAlignmentY(0.0F);

        cxSalBonusPe.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        cxSalBonusPe.setAlignmentX(0.0F);
        cxSalBonusPe.setAlignmentY(0.0F);
        cxSalBonusPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxSalBonusPeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsProjCod, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAtualizaProjCod, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(196, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btRemoveProjCod, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(rtCabecarioEng1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(rtCabecarioProj)
                        .addGap(389, 389, 389)
                        .addComponent(rtCabecarioCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(rtNomeProj)
                        .addGap(27, 27, 27)
                        .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(rtNomeCliente)
                        .addGap(27, 27, 27)
                        .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rtCodProj)
                        .addGap(27, 27, 27)
                        .addComponent(cxCodProj, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209)
                        .addComponent(rtCpfCnpj)
                        .addGap(27, 27, 27)
                        .addComponent(cxCpfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(rtCidadeProj)
                        .addGap(27, 27, 27)
                        .addComponent(cxCidadeProj, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221)
                        .addComponent(rtCidadeCliente)
                        .addGap(27, 27, 27)
                        .addComponent(cxCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(rtDataInicio)
                        .addGap(27, 27, 27)
                        .addComponent(cxDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(rtCepCliente)
                        .addGap(27, 27, 27)
                        .addComponent(cxCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(rtDataPrevista)
                        .addGap(27, 27, 27)
                        .addComponent(cxDataPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)
                        .addComponent(rtRuaCliente)
                        .addGap(27, 27, 27)
                        .addComponent(cxRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rtNumCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cxNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(rtTelefoneCliente)
                        .addGap(23, 23, 23)
                        .addComponent(cxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtCabecarioEng)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(rtNomeEng)))
                        .addGap(18, 18, 18)
                        .addComponent(cxNomeEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtCabecarioPe)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(rtNomePe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(cxNomePe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(rtCreaEng)
                        .addGap(18, 18, 18)
                        .addComponent(cxCreaEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224)
                        .addComponent(rtCodigoPe)
                        .addGap(23, 23, 23)
                        .addComponent(cxCodigoPe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(rtEspecializacaoEng)
                        .addGap(18, 18, 18)
                        .addComponent(cxEspecializacaoEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224)
                        .addComponent(rtFuncaoPe)
                        .addGap(22, 22, 22)
                        .addComponent(cxFuncaoPe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rtRuaEng)
                            .addComponent(rtSalarioEng)
                            .addComponent(rtTelefoneEng)
                            .addComponent(rtSalBonusEng))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cxSalarioEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cxTelefoneEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cxRuaEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rtNumEng)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cxNumEng, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rtTelefonePe)
                                    .addComponent(rtRuaPe)
                                    .addComponent(rtSalarioPe))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cxSalBonusEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rtSalBonusPe, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cxSalarioPe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxTelefonePe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cxSalBonusPe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cxRuaPe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rtNumPe)
                                .addGap(12, 12, 12)
                                .addComponent(cxNumPe, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(rtBonusEng)
                        .addGap(18, 18, 18)
                        .addComponent(cxBonusEng, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(rtBonusPe)
                        .addGap(18, 18, 18)
                        .addComponent(cxBonusPe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(rtCabecarioEng1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtCabecarioProj, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtCabecarioCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxNomeProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtNomeProj)
                            .addComponent(rtNomeCliente))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCodProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCpfCnpjCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtCodProj)
                            .addComponent(rtCpfCnpj))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxCidadeProj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCidadeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtCidadeProj)
                            .addComponent(rtCidadeCliente))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxCepCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtDataInicio)
                            .addComponent(rtCepCliente))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cxDataPrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cxRuaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxNumCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtNumCliente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rtDataPrevista)
                            .addComponent(rtRuaCliente))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rtTelefoneCliente)
                    .addComponent(cxTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rtCabecarioEng)
                        .addGap(2, 2, 2)
                        .addComponent(rtNomeEng))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(cxNomeEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rtCabecarioPe)
                        .addGap(8, 8, 8)
                        .addComponent(rtNomePe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(cxNomePe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(rtCreaEng))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cxCreaEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rtCodigoPe)
                    .addComponent(cxCodigoPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rtEspecializacaoEng))
                    .addComponent(cxEspecializacaoEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(rtFuncaoPe))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cxFuncaoPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(rtSalarioEng))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cxSalarioEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxRuaEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtRuaEng)
                            .addComponent(cxNumEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtNumEng))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxTelefoneEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtTelefoneEng))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxSalBonusEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtSalBonusEng)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxSalarioPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtSalarioPe))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxRuaPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtRuaPe)
                            .addComponent(rtNumPe)
                            .addComponent(cxNumPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxTelefonePe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtTelefonePe))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxSalBonusPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtSalBonusPe))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cxBonusEng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rtBonusEng))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cxBonusPe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rtBonusPe))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastro)
                        .addGap(11, 11, 11)
                        .addComponent(btConsProjCod)
                        .addGap(11, 11, 11)
                        .addComponent(btAtualizaProjCod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btRemoveProjCod)
                            .addComponent(btLimpar)
                            .addComponent(btSair)))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmacao de saida", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            sair();
        }
    }//GEN-LAST:event_btSairActionPerformed

    private void btCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastroActionPerformed
        if (cxCodProj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cade codigo?", "ERROR", 0);
        } else {
            cadastro();
            listarTab();
        }


    }//GEN-LAST:event_btCadastroActionPerformed

    private void cxNomeProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeProjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeProjActionPerformed

    private void cxCidadeProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeProjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCidadeProjActionPerformed

    private void cxCodProjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodProjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodProjActionPerformed

    private void cxDataPrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataPrevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDataPrevistaActionPerformed

    private void cxDataInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxDataInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxDataInicioActionPerformed

    private void cxRuaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRuaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxRuaClienteActionPerformed

    private void cxCepClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCepClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCepClienteActionPerformed

    private void cxNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeClienteActionPerformed

    private void cxCidadeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCidadeClienteActionPerformed

    private void cxCpfCnpjClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCpfCnpjClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCpfCnpjClienteActionPerformed

    private void cxNumClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumClienteActionPerformed

    private void cxTelefoneClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefoneClienteActionPerformed

    private void cxTelefoneEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefoneEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefoneEngActionPerformed

    private void cxRuaEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRuaEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxRuaEngActionPerformed

    private void cxSalarioEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSalarioEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSalarioEngActionPerformed

    private void cxNomeEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomeEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomeEngActionPerformed

    private void cxEspecializacaoEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEspecializacaoEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEspecializacaoEngActionPerformed

    private void cxCreaEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCreaEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCreaEngActionPerformed

    private void cxNumEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumEngActionPerformed

    private void cxTelefonePeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxTelefonePeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxTelefonePeActionPerformed

    private void cxRuaPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxRuaPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxRuaPeActionPerformed

    private void cxSalarioPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSalarioPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSalarioPeActionPerformed

    private void cxNomePeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNomePeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNomePeActionPerformed

    private void cxFuncaoPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxFuncaoPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxFuncaoPeActionPerformed

    private void cxCodigoPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCodigoPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCodigoPeActionPerformed

    private void cxNumPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxNumPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxNumPeActionPerformed

    private void btConsProjCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsProjCodActionPerformed
        if (cxCodProj.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cade codigo?", "ERROR", 0);
        } else {
            consultar();
        }
    }//GEN-LAST:event_btConsProjCodActionPerformed

    private void btAtualizaProjCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizaProjCodActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, "A atualizacao atualizarah todos os campos. Deseja realmente Atualizar? ", "Confirmacao de Atualizacao", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            if (cxCodProj.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Cade codigo?", "ERROR", 0);
            } else {
                atualizaProjCod();
                listarTab();
                limpar();
                              
            }
        }


    }//GEN-LAST:event_btAtualizaProjCodActionPerformed

    private void btRemoveProjCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoveProjCodActionPerformed

        int resp = JOptionPane.showConfirmDialog(null, " Deseja realmente Remover? ", "Confirmacao da Remocao", JOptionPane.YES_NO_CANCEL_OPTION);
        if (resp == 0) {
            if (cxCodProj.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Cade codigo?", "ERROR", 0);
            } else {
                removeProjCod();
                listarTab();
            }
        }

    }//GEN-LAST:event_btRemoveProjCodActionPerformed

    private void cxBonusEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBonusEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxBonusEngActionPerformed

    private void cxSalBonusEngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSalBonusEngActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSalBonusEngActionPerformed

    private void cxBonusPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxBonusPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxBonusPeActionPerformed

    private void cxSalBonusPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxSalBonusPeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxSalBonusPeActionPerformed

    public void removeProjCod() {

        projeto = new Projeto();

        projeto.setCodigoProjeto(cxCodProj.getText());

        projeto = bdProj.removeProjCod(projeto);

        if (projeto != null) {
            JOptionPane.showMessageDialog(null, "A Remocao foi um sucesso!", "Remover", 1);
            

        } else {
            JOptionPane.showMessageDialog(null, "Nao existe Projeto com esse codigo", "ERROR", 0);
        }
    }//FIM REMOVER

    public void atualizaProjCod() {

        projeto = new Projeto(cxNomeProj.getText(), cxCodProj.getText(), cxCidadeProj.getText(), new Cliente(), new Engenheiro(), new Pedreiro(), cxDataInicio.getText(), cxDataPrevista.getText());

        projeto.getCliente().setNomeCliente(cxNomeCliente.getText());
        projeto.getCliente().setCpfOrCnpj(cxCpfCnpjCliente.getText());
        projeto.getCliente().setCidadeCliente(cxCidadeCliente.getText());
        projeto.getCliente().setCep(cxCepCliente.getText());
        //Endereço
        projeto.getCliente().setEndRuaCliente(cxRuaCliente.getText());
        projeto.getCliente().setEndNumCliente(cxNumCliente.getText());
        projeto.getCliente().setTelefoneCliente(cxTelefoneCliente.getText());

        //DADOS DE ENTRADA DO ENGENHEIRO -> INICIALIZA��O ATRAV�S DOS M�TODO GETTERS E SETTERS -> Não deu tempo de aplicar array dinamico no engenheiro e pedreiro, fiz array dinamico só no projeto.
        projeto.getEng().setNomeDoFuncionario(cxNomeEng.getText());
        projeto.getEng().setCrea(cxCreaEng.getText());
        projeto.getEng().setEspecializacao(cxEspecializacaoEng.getText());

        //Tratamento de exce��o para o salario do engenherio -> Exemplo b�sico
        try {
            projeto.getEng().setSalario(Float.parseFloat(cxSalarioEng.getText()));

        } catch (SalGrdPeqException sgpe) {
            JOptionPane.showMessageDialog(null, "(ENGENHEIRO) O salario deve ser maior que R$ 1.100,00 e menor que 10.000,00!!!<Atualize o Projeto>", "ERROR", 0);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "(ENGENHEIRO) O salario deve ser um numero!!!<Atualize o Projeto>", "ERROR", 0);
        }

        projeto.getEng().setEndNomeRua(cxRuaEng.getText());
        projeto.getEng().setEndNum(cxNumEng.getText());
        projeto.getEng().setTelefone(cxTelefoneEng.getText());

        //Pedreiro
        //DADOS DE ENTRADA DO PEDREIRO -> INICIALIZA��O ATRAV�S DOS M�TODOS GETTERS E SETTERS
        projeto.getP1().setNomeDoFuncionario(cxNomePe.getText());
        projeto.getP1().setCodigo(cxCodigoPe.getText());
        projeto.getP1().setFuncaoNoProjeto(cxFuncaoPe.getText());

        //Tratamento de exce��o para o salario do pedreiro -> Exemplo b�sico
        try {
            projeto.getP1().setSalario(Float.parseFloat(cxSalarioPe.getText()));

        } catch (SalGrdPeqException sgpe) {
            JOptionPane.showMessageDialog(null, "(PEDREIRO) O salario deve ser maior que R$ 1.100,00 e menor que 10.000,00!!!<Atualize o Projeto>", "ERROR", 0);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "(PEDREIRO) O salario deve ser um numero!!!<Atualize o Projeto>", "ERROR", 0);
        }

        System.out.println("\nENDERECO");
        projeto.getP1().setEndNomeRua(cxRuaPe.getText());
        projeto.getP1().setEndNum(cxNumPe.getText());
        projeto.getP1().setTelefone(cxTelefonePe.getText());

        projeto = bdProj.atualizaProjCod(projeto);
        if (projeto != null) {
            JOptionPane.showMessageDialog(null, "A atualizacao foi um sucesso!", "Atualizar", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Nao existe projeto com esse codigo", "ERROR", 0);
        }

    }//FIM ATUALIZAR

    public void listarTab() {
        //Deixar a tabela flexível/expansível com base nos dados que entram.
        DefaultTableModel modelo = (DefaultTableModel) tblProj.getModel();
        int posLin = 0;
        modelo.setRowCount(posLin);
        //for alternativo
        for (Projeto proj : bdProj.getBdproj()) {
            modelo.insertRow(posLin, new Object[]{ proj.getNomeProjeto(), proj.getCodigoProjeto(), proj.getCliente().getNomeCliente(), proj.getCliente().getCpfOrCnpj()});
            posLin++;
        }

    }//FIM LISTAR

    public void consultar() {
        projeto = new Projeto();

        projeto.setCodigoProjeto(cxCodProj.getText());

        projeto = bdProj.consProjCod(projeto);

        if (projeto != null) {
            //Projeto
            cxNomeProj.setText(projeto.getNomeProjeto());
            cxCodProj.setText(projeto.getCodigoProjeto());
            cxCidadeProj.setText(projeto.getCidadeProjeto());
            cxDataInicio.setText(projeto.getDataInicio());
            cxDataPrevista.setText(projeto.getDataFinal());

            //Cliente
            cxNomeCliente.setText(projeto.getCliente().getNomeCliente());
            cxCpfCnpjCliente.setText(projeto.getCliente().getCpfOrCnpj());
            cxCidadeCliente.setText(projeto.getCliente().getCidadeCliente());
            cxCepCliente.setText(projeto.getCliente().getCep());
            cxRuaCliente.setText(projeto.getCliente().getEndRuaCliente());
            cxNumCliente.setText(projeto.getCliente().getEndNumCliente());
            cxTelefoneCliente.setText(projeto.getCliente().getTelefoneCliente());

            //Engenheiro
            cxNomeEng.setText(projeto.getEng().getNomeDoFuncionario());
            cxCreaEng.setText(projeto.getEng().getCrea());
            cxEspecializacaoEng.setText(projeto.getEng().getEspecializacao());
            cxSalarioEng.setText(Float.toString((projeto.getEng().getSalario())));
            cxRuaEng.setText(projeto.getEng().getEndNomeRua());
            cxNumEng.setText(projeto.getEng().getEndNum());
            cxTelefoneEng.setText(projeto.getEng().getTelefone());
            cxSalBonusEng.setText(Float.toString(projeto.getEng().calcular()));
            cxBonusEng.setText(Float.toString(projeto.getEng().verificaAumento()));

            //Pedreiro
            cxNomePe.setText(projeto.getP1().getNomeDoFuncionario());
            cxCodigoPe.setText(projeto.getP1().getCodigo());
            cxFuncaoPe.setText(projeto.getP1().getFuncaoNoProjeto());
            cxSalarioPe.setText(Float.toString(projeto.getP1().getSalario()));
            cxRuaPe.setText(projeto.getP1().getEndNomeRua());
            cxNumPe.setText(projeto.getP1().getEndNum());
            cxTelefonePe.setText(projeto.getP1().getTelefone());
            cxSalBonusPe.setText(Float.toString(projeto.getP1().calcular()));
            cxBonusPe.setText(Float.toString(projeto.getP1().verificaAumento()));

            JOptionPane.showMessageDialog(null, "Projeto " + projeto.getNomeProjeto(), "Dados Especificos do Projeto Cadastratado", 1);
            limpar();

        } else {

            JOptionPane.showMessageDialog(null, "Nao existe esse projeto", "ERROR", 0);

        }

    }//FIM CONSULTAR

    public void cadastro() {

        projeto = new Projeto(cxNomeProj.getText(), cxCodProj.getText(), cxCidadeProj.getText(), new Cliente(), new Engenheiro(), new Pedreiro(), cxDataInicio.getText(), cxDataPrevista.getText());

        projeto.getCliente().setNomeCliente(cxNomeCliente.getText());
        projeto.getCliente().setCpfOrCnpj(cxCpfCnpjCliente.getText());
        projeto.getCliente().setCidadeCliente(cxCidadeCliente.getText());
        projeto.getCliente().setCep(cxCepCliente.getText());
        //Endereço
        projeto.getCliente().setEndRuaCliente(cxRuaCliente.getText());
        projeto.getCliente().setEndNumCliente(cxNumCliente.getText());
        projeto.getCliente().setTelefoneCliente(cxTelefoneCliente.getText());

        //DADOS DE ENTRADA DO ENGENHEIRO -> INICIALIZA��O ATRAV�S DOS M�TODO GETTERS E SETTERS -> Não deu tempo de aplicar array dinamico no engenheiro e pedreiro, fiz array dinamico só no projeto.
        projeto.getEng().setNomeDoFuncionario(cxNomeEng.getText());
        projeto.getEng().setCrea(cxCreaEng.getText());
        projeto.getEng().setEspecializacao(cxEspecializacaoEng.getText());

        //Tratamento de exce��o para o salario do engenherio -> Exemplo b�sico
        try {
            projeto.getEng().setSalario(Float.parseFloat(cxSalarioEng.getText()));

        } catch (SalGrdPeqException sgpe) {
            JOptionPane.showMessageDialog(null, "(ENGENHEIRO) O salario deve ser maior que R$ 1.100,00 e menor que 10.000,00!!!<Atualize o Projeto>", "ERROR", 0);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "(ENGENHEIRO) O salario deve ser um numero!!! <Atualize o Projeto>", "ERROR", 0);
        }

        projeto.getEng().setEndNomeRua(cxRuaEng.getText());
        projeto.getEng().setEndNum(cxNumEng.getText());
        projeto.getEng().setTelefone(cxTelefoneEng.getText());

        //Pedreiro
        //DADOS DE ENTRADA DO PEDREIRO -> INICIALIZA��O ATRAV�S DOS M�TODOS GETTERS E SETTERS
        projeto.getP1().setNomeDoFuncionario(cxNomePe.getText());
        projeto.getP1().setCodigo(cxCodigoPe.getText());
        projeto.getP1().setFuncaoNoProjeto(cxFuncaoPe.getText());

        //Tratamento de exce��o para o salario do pedreiro -> Exemplo b�sico
        try {
            projeto.getP1().setSalario(Float.parseFloat(cxSalarioPe.getText()));

        } catch (SalGrdPeqException sgpe) {
            JOptionPane.showMessageDialog(null, "(PEDREIRO) O salario deve ser maior que R$ 1.100,00 e menor que 10.000,00!!!<Atualize o Projeto>", "ERROR", 0);
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "(PEDREIRO) O salario deve ser um numero!!!<Atualize o Projeto>", "ERROR", 0);
        }

        System.out.println("\nENDERECO");
        projeto.getP1().setEndNomeRua(cxRuaPe.getText());
        projeto.getP1().setEndNum(cxNumPe.getText());
        projeto.getP1().setTelefone(cxTelefonePe.getText());

        //Inserindo o projeto no array
        projeto = bdProj.cadProj(projeto);
        //Verificação para saber se o código já foi cadastrado.
        if (projeto != null) {

            JOptionPane.showMessageDialog(null, "CADASTRADO!!!", "Cadastro de Projeto", 1);
            limpar();
        } else {

            JOptionPane.showMessageDialog(null, "Codigo ja registrado", "ERROR", 0);

            cxCodProj.setText("");
            cxCodProj.requestFocus();
        }

    }//Fim cadastro

    public void sair() {
        this.dispose();
    }

    public void limpar() {
        //Projeto
        cxNomeProj.setText("");
        cxCodProj.setText("");
        cxCidadeProj.setText("");
        cxDataInicio.setText("");
        cxDataPrevista.setText("");
        //Cliente
        cxNomeCliente.setText("");

        cxCpfCnpjCliente.setText("");
        cxCidadeCliente.setText("");
        cxCepCliente.setText("");
        cxRuaCliente.setText("");
        cxNumCliente.setText("");
        cxTelefoneCliente.setText("");

        //Engenheiro
        cxNomeEng.setText("");

        cxCreaEng.setText("");
        cxEspecializacaoEng.setText("");
        cxSalarioEng.setText("");
        cxRuaEng.setText("");
        cxNumEng.setText("");
        cxTelefoneEng.setText("");
        cxSalBonusEng.setText("");
        cxBonusEng.setText("");

        //Pedreiro
        cxNomePe.setText("");

        cxCodigoPe.setText("");
        cxFuncaoPe.setText("");
        cxSalarioPe.setText("");
        cxRuaPe.setText("");
        cxNumPe.setText("");
        cxTelefonePe.setText("");
        cxSalBonusPe.setText("");
        cxBonusPe.setText("");

        cxNomeProj.requestFocus();
    }//FIM LIMPAR

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
            java.util.logging.Logger.getLogger(CadProj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProj.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new CadProj().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizaProjCod;
    private javax.swing.JButton btCadastro;
    private javax.swing.JButton btConsProjCod;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRemoveProjCod;
    private javax.swing.JButton btSair;
    private javax.swing.JTextField cxBonusEng;
    private javax.swing.JTextField cxBonusPe;
    private javax.swing.JTextField cxCepCliente;
    private javax.swing.JTextField cxCidadeCliente;
    private javax.swing.JTextField cxCidadeProj;
    private javax.swing.JTextField cxCodProj;
    private javax.swing.JTextField cxCodigoPe;
    private javax.swing.JTextField cxCpfCnpjCliente;
    private javax.swing.JTextField cxCreaEng;
    private javax.swing.JTextField cxDataInicio;
    private javax.swing.JTextField cxDataPrevista;
    private javax.swing.JTextField cxEspecializacaoEng;
    private javax.swing.JTextField cxFuncaoPe;
    private javax.swing.JTextField cxNomeCliente;
    private javax.swing.JTextField cxNomeEng;
    private javax.swing.JTextField cxNomePe;
    private javax.swing.JTextField cxNomeProj;
    private javax.swing.JTextField cxNumCliente;
    private javax.swing.JTextField cxNumEng;
    private javax.swing.JTextField cxNumPe;
    private javax.swing.JTextField cxRuaCliente;
    private javax.swing.JTextField cxRuaEng;
    private javax.swing.JTextField cxRuaPe;
    private javax.swing.JTextField cxSalBonusEng;
    private javax.swing.JTextField cxSalBonusPe;
    private javax.swing.JTextField cxSalarioEng;
    private javax.swing.JTextField cxSalarioPe;
    private javax.swing.JTextField cxTelefoneCliente;
    private javax.swing.JTextField cxTelefoneEng;
    private javax.swing.JTextField cxTelefonePe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel rtBonusEng;
    private javax.swing.JLabel rtBonusPe;
    private javax.swing.JLabel rtCabecarioCliente;
    private javax.swing.JLabel rtCabecarioEng;
    private javax.swing.JLabel rtCabecarioEng1;
    private javax.swing.JLabel rtCabecarioPe;
    private javax.swing.JLabel rtCabecarioProj;
    private javax.swing.JLabel rtCepCliente;
    private javax.swing.JLabel rtCidadeCliente;
    private javax.swing.JLabel rtCidadeProj;
    private javax.swing.JLabel rtCodProj;
    private javax.swing.JLabel rtCodigoPe;
    private javax.swing.JLabel rtCpfCnpj;
    private javax.swing.JLabel rtCreaEng;
    private javax.swing.JLabel rtDataInicio;
    private javax.swing.JLabel rtDataPrevista;
    private javax.swing.JLabel rtEspecializacaoEng;
    private javax.swing.JLabel rtFuncaoPe;
    private javax.swing.JLabel rtNomeCliente;
    private javax.swing.JLabel rtNomeEng;
    private javax.swing.JLabel rtNomePe;
    private javax.swing.JLabel rtNomeProj;
    private javax.swing.JLabel rtNumCliente;
    private javax.swing.JLabel rtNumEng;
    private javax.swing.JLabel rtNumPe;
    private javax.swing.JLabel rtRuaCliente;
    private javax.swing.JLabel rtRuaEng;
    private javax.swing.JLabel rtRuaPe;
    private javax.swing.JLabel rtSalBonusEng;
    private javax.swing.JLabel rtSalBonusPe;
    private javax.swing.JLabel rtSalarioEng;
    private javax.swing.JLabel rtSalarioPe;
    private javax.swing.JLabel rtTelefoneCliente;
    private javax.swing.JLabel rtTelefoneEng;
    private javax.swing.JLabel rtTelefonePe;
    private javax.swing.JTable tblProj;
    // End of variables declaration//GEN-END:variables
}
