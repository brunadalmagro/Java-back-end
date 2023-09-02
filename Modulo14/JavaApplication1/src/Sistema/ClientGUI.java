package Sistema;

import java.util.Collection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
  @author bruna
 */

public class ClientGUI extends javax.swing.JFrame {
    private String nomeCliente;
    private String sobrenomeCliente;
    private String cpfCliente;
    private String telefoneCliente;
    private String enderecoCliente;
    private String cepCliente;
    private String cidadeCliente;
    private String paisCliente;

    public ClientGUI() {
        initComponents();
        botaoSalvar.addActionListener(this::botaoSalvarActionPerformed);
        botaoAtualizar.addActionListener(this::botaoAtualizarActionPerformed); 
        botaoConsultar.addActionListener(this::botaoConsultarActionPerformed);
    }

   ClienteMapDAO clienteMapDAO = new ClienteMapDAO();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        entradaNome = new javax.swing.JTextField();
        entradaSobrenome = new javax.swing.JTextField();
        entradaTelefone = new javax.swing.JTextField();
        sobrenome = new javax.swing.JLabel();
        telefone = new javax.swing.JLabel();
        endereco = new javax.swing.JLabel();
        entradaEndereco = new javax.swing.JTextField();
        botaoLimpar = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        cpf = new javax.swing.JLabel();
        entradaCpf = new javax.swing.JTextField();
        entradaCidade = new javax.swing.JTextField();
        entradaPais = new javax.swing.JTextField();
        pais = new javax.swing.JLabel();
        cidade = new javax.swing.JLabel();
        cep = new javax.swing.JLabel();
        entradaCep = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        atualizarTabela = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nome.setText("Nome");

        entradaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaNomeActionPerformed(evt);
            }
        });

        entradaSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaSobrenomeActionPerformed(evt);
            }
        });

        entradaTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaTelefoneActionPerformed(evt);
            }
        });

        sobrenome.setText("Sobrenome");

        telefone.setText("Telefone");

        endereco.setText("Endereço");

        entradaEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaEnderecoActionPerformed(evt);
            }
        });

        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        botaoLimpar.setText("Consulte para excluir (CPF)");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        botaoConsultar.setText("Consulta cadastro (CPF)");

        botaoAtualizar.setText("Atualizar tabela");

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        cpf.setText("CPF");

        pais.setText("País");

        cidade.setText("Cidade/EF");

        cep.setText("CEP");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sistema/profile.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel2.setText("Client Area");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Telefone", "Endereço", "CEP", "Cidade/EF", "País"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        atualizarTabela.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sobrenome)
                                    .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entradaSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endereco)
                                    .addComponent(cidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entradaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entradaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(cpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entradaCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cep)
                                            .addComponent(pais)))
                                    .addComponent(telefone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(entradaPais, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                    .addComponent(entradaCep)
                                    .addComponent(entradaTelefone)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(262, 262, 262)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(23, 23, 23))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(botaoConsultar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botaoLimpar)
                            .addGap(74, 74, 74)
                            .addComponent(botaoAtualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(botaoSalvar)))
                    .addComponent(atualizarTabela))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(141, 141, 141))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome)
                    .addComponent(cpf)
                    .addComponent(entradaCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sobrenome)
                    .addComponent(entradaTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endereco)
                    .addComponent(entradaEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entradaCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entradaPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cidade)
                    .addComponent(pais))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoConsultar))
                .addGap(18, 18, 18)
                .addComponent(atualizarTabela, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private final ClienteMapDAO clienteDAO = new ClienteMapDAO(); //Instância da classe de gerenciamento de clientes em memória
    
    
    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
    String cpfExclusao = JOptionPane.showInputDialog(this, "Digite o CPF do cliente para exclusão:", "Excluir por CPF", JOptionPane.QUESTION_MESSAGE);

    // Verifica se o usuário inseriu um CPF válido
    if (cpfExclusao != null && !cpfExclusao.isEmpty()) {
        try {
            Long cpfNumber = Long.valueOf(cpfExclusao);

            // Chama o método de exclusão no DAO
            clienteDAO.excluir(cpfNumber);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

            // Percorre as linhas da tabela e remove a linha com o CPF correspondente
            for (int i = 0; i < model.getRowCount(); i++) {
                Long cpfTabela = (Long) model.getValueAt(i, 2); // Coluna do CPF

                if (cpfTabela.equals(cpfNumber)) {
                    model.removeRow(i);
                    JOptionPane.showMessageDialog(this, "Cliente excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    return; // Sai do método após a exclusão bem-sucedida
                }
            }

            // Se não encontrar o cliente na tabela
            JOptionPane.showMessageDialog(this, "Cliente não encontrado na tabela", "Erro", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException e) {
            // Tratamento de erro se o CPF não for um número válido
            JOptionPane.showMessageDialog(this, "CPF inválido. Certifique-se de inserir apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "CPF de exclusão inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_botaoLimparActionPerformed
    
    private void entradaEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaEnderecoActionPerformed
        entradaEndereco.setText("");
    }//GEN-LAST:event_entradaEnderecoActionPerformed

    private void entradaTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaTelefoneActionPerformed
        entradaTelefone.setText("");
    }//GEN-LAST:event_entradaTelefoneActionPerformed

    private void entradaSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaSobrenomeActionPerformed
        entradaSobrenome.setText("");
    }//GEN-LAST:event_entradaSobrenomeActionPerformed

    private void entradaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaNomeActionPerformed
        entradaNome.setText("");
    }//GEN-LAST:event_entradaNomeActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        nomeCliente = entradaNome.getText();
        sobrenomeCliente = entradaSobrenome.getText();
        cpfCliente = entradaCpf.getText(); // Armazenar como String
        telefoneCliente = entradaTelefone.getText();
        enderecoCliente = entradaEndereco.getText();
        cepCliente = entradaCep.getText();
        cidadeCliente = entradaCidade.getText();
        paisCliente = entradaPais.getText();

        Cliente cliente = new Cliente(cpfCliente, nomeCliente, sobrenomeCliente, telefoneCliente, enderecoCliente, cepCliente, cidadeCliente, paisCliente);
        clienteDAO.cadastrar(cliente); // Cadastrar cliente na memória

        //Limpar os campos após salvar
        entradaNome.setText("");
        entradaSobrenome.setText("");
        entradaCpf.setText("");
        entradaTelefone.setText("");
        entradaEndereco.setText("");
        entradaCep.setText("");
        entradaCidade.setText("");
        entradaPais.setText("");
    }//GEN-LAST:event_botaoSalvarActionPerformed
           
    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            // Habilitar o botão "Excluir" quando um registro estiver selecionado
            botaoLimpar.setEnabled(true);
        }
    }
});
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0); //Limpar os dados atuais da tabela
    
    //Buscar todos os clientes do DAO
    Collection<Cliente> clientes = clienteDAO.buscarTodos();
    
    //Preencher a tabela com os dados dos clientes
    for (Cliente cliente : clientes) {
        model.addRow(new Object[] {
            cliente.getNome(),
            cliente.getSobrenome(),
            cliente.getCpf(),
            cliente.getTelefone(),
            cliente.getEndereco(),
            cliente.getCep(),
            cliente.getCidade(),
            cliente.getPais(),
        });
    }
}
   private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {
    String cpfPesquisa = JOptionPane.showInputDialog(this, "Digite o CPF do cliente para pesquisa:", "Consultar por CPF", JOptionPane.QUESTION_MESSAGE);

    //Verifica se o usuário inseriu um CPF válido
    if (cpfPesquisa != null && !cpfPesquisa.isEmpty()) {
        try {
            Long cpfNumber = Long.valueOf(cpfPesquisa);

            Cliente clienteEncontrado = clienteDAO.consultar(cpfNumber);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            //Limpa a tabela deixando apenas o resultado encontrado
            model.setRowCount(0);

            if (clienteEncontrado != null) {
                //Adicione o cliente à tabela
                model.addRow(new Object[] {
                    clienteEncontrado.getNome(),
                    clienteEncontrado.getSobrenome(),
                    clienteEncontrado.getCpf(),
                    clienteEncontrado.getTelefone(),
                    clienteEncontrado.getEndereco(),
                    clienteEncontrado.getCep(),
                    clienteEncontrado.getCidade(),
                    clienteEncontrado.getPais()
                });

                JOptionPane.showMessageDialog(this, "Cliente encontrado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado", "ERRO", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException e) {
            //Tratamento de erro se o CPF não for um número válido
            JOptionPane.showMessageDialog(this, "CPF inválido. Certifique-se de inserir apenas números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "CPF de pesquisa inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane atualizarTabela;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel cep;
    private javax.swing.JLabel cidade;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel endereco;
    private javax.swing.JTextField entradaCep;
    private javax.swing.JTextField entradaCidade;
    private javax.swing.JTextField entradaCpf;
    private javax.swing.JTextField entradaEndereco;
    private javax.swing.JTextField entradaNome;
    private javax.swing.JTextField entradaPais;
    private javax.swing.JTextField entradaSobrenome;
    private javax.swing.JTextField entradaTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel pais;
    private javax.swing.JLabel sobrenome;
    private javax.swing.JLabel telefone;
    // End of variables declaration//GEN-END:variables
}