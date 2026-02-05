
package Telas;

import Classes.Conexao.Conexao;
import Classes.Conexao.Dados;
import dao.FilmeDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import tabela.ListaFilmes;


public class Cadastro extends javax.swing.JFrame {
    
    private Tabela tabela;

    public Cadastro() { // classe que lida com JTextField, String e validação
        initComponents();
        
        Conexao conectar = new Conexao();
    }
    
    public Cadastro(Tabela tabela) {
    initComponents();
    this.tabela = tabela; // guarda a referência
    }      
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nome_text = new javax.swing.JTextField();
        data_text = new javax.swing.JTextField();
        categoria_text = new javax.swing.JTextField();
        cadastrar_botao = new javax.swing.JButton();
        limpar_botao = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        id_text = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id_pesquisa = new javax.swing.JTextField();
        pesquisar_botao = new javax.swing.JButton();
        editar_botao = new javax.swing.JButton();
        tabela_botao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("CENAFLIX");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("CADASTRO DE FILME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Nome do Filme:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Data de lançamento:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Categoria: ");

        nome_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        data_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        categoria_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        cadastrar_botao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        cadastrar_botao.setText("Cadastrar");
        cadastrar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_botaoActionPerformed(evt);
            }
        });

        limpar_botao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        limpar_botao.setText("Limpar");
        limpar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar_botaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Identificação numérica:");

        id_text.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Procurar por ID:");

        id_pesquisa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        pesquisar_botao.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pesquisar_botao.setText("Pesquisar");
        pesquisar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_botaoActionPerformed(evt);
            }
        });

        editar_botao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editar_botao.setText("Editar");
        editar_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_botaoActionPerformed(evt);
            }
        });

        tabela_botao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tabela_botao.setText("Tabela");
        tabela_botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabela_botaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(data_text))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(categoria_text)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(id_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(pesquisar_botao)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(tabela_botao)
                                            .addGap(18, 18, 18)
                                            .addComponent(cadastrar_botao)
                                            .addGap(18, 18, 18)
                                            .addComponent(editar_botao)))
                                    .addGap(18, 18, 18)
                                    .addComponent(limpar_botao))))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(data_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(categoria_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesquisar_botao)
                    .addComponent(id_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar_botao)
                    .addComponent(editar_botao)
                    .addComponent(cadastrar_botao)
                    .addComponent(tabela_botao))
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_botaoActionPerformed

        //Edição do filme

        int id_dados = Integer.parseInt(id_text.getText());
        String nome_dados = nome_text.getText();
        String data_dados = data_text.getText();
        String categoria_dados = categoria_text.getText();

        Dados dados = new Dados();

        //Adicionando novos dados
        dados.setId_filme(id_dados);
        dados.setNome_filme(nome_dados);

        //conversão TEXTO para LocalDate
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFilme =
        LocalDate.parse(getData_text().getText(), formatter);

        dados.setData_filme(dataFilme);

        dados.setCategoria(categoria_dados);

        FilmeDAO filmeDAO = new FilmeDAO();
        filmeDAO.Editar(dados);

        //limpando os campos
        id_text.setText("");
        nome_text.setText("");
        data_text.setText("");
        categoria_text.setText("");
    }//GEN-LAST:event_editar_botaoActionPerformed

    private void pesquisar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_botaoActionPerformed

        //pesquisa por meio do ID
        int idPesquisa = Integer.parseInt(id_pesquisa.getText());
        FilmeDAO filmeDAO = new FilmeDAO();
        Dados dados = filmeDAO.Pesquisa(idPesquisa);

        if (dados == null) {
            JOptionPane.showMessageDialog(this, "Curso não encontrado!");
        }
        else {
            id_text.setText(String.valueOf(dados.getId_filme()));
            nome_text.setText(dados.getNome_filme());
            data_text.setText(dados.getData_filme().toString());
            categoria_text.setText(dados.getCategoria());

        }
    }//GEN-LAST:event_pesquisar_botaoActionPerformed

    private void limpar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar_botaoActionPerformed

        Conexao conexao_banco = new Conexao();

        try{ // Excluindo filme
            conexao_banco.getConexao();
            JOptionPane.showMessageDialog(null,"Filme excluído com sucesso!");
            id_text.setText(""); // em branco
            nome_text.setText(""); // em branco
            data_text.setText(""); // em branco
            categoria_text.setText(""); // em branco
            limpar_botao.setEnabled(false);
            conexao_banco.excluir(id_text.getText());
            conexao_banco.excluir(nome_text.getText());
            conexao_banco.excluir(data_text.getText());
            conexao_banco.excluir(categoria_text.getText());

            // tratando o erro, caso ele ocorra
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"Erro na exclusão do filme!");
        }

        conexao_banco.desconectar();
    }//GEN-LAST:event_limpar_botaoActionPerformed

    private void cadastrar_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_botaoActionPerformed

        Conexao conexao_banco = new Conexao();
        FilmeDAO filmedao = new FilmeDAO();
        Dados dados_cadastro = new Dados();

        //Validações (espaço em branco)
        if (data_text.getText().isEmpty() && nome_text.getText().isEmpty() && categoria_text.getText().isEmpty() && id_text.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            return;

        } else { // Validação (Data errada)
            String txtdata = data_text.getText();
            boolean palavra = txtdata.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");
            //DATA ERRADA
            if(palavra==false){
                JOptionPane.showMessageDialog(null, "Data precisa ser no formato DD/MM/AAAA. Exemplo: 10/10/2010 ");
                return;
            }
        }

        //Identificação numérica
        dados_cadastro.setId_filme(Integer.parseInt(getId_text().getText()));

        //Nome
        dados_cadastro.setNome_filme(getNome_text().getText());

        //conversão TEXTO para LocalDate
        DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataFilme =
        LocalDate.parse(getData_text().getText(), formatter);        

        //Data
        dados_cadastro.setData_filme(dataFilme);

        //Categoria
        dados_cadastro.setCategoria(getCategoria_text().getText());

        filmedao.salvar(dados_cadastro);

        //Banco (conexão)
        conexao_banco = new Conexao();

        conexao_banco.getConexao();
        
        
        // Arrumando na tabela
        
        ListaFilmes lista_filmes = new ListaFilmes();
        Dados dados = new Dados();
        
        try {
            
            dados.setNome_filme(nome_text.getText());
            dados.setData_filme(dataFilme);
            dados.setCategoria(categoria_text.getText());
            int id = Integer.parseInt(id_text.getText());
            dados.setId_filme(id);
            
            lista_filmes.setDadosFilmes(dados);
            
            

            if (tabela != null) {
                tabela.atualizarTabela();                
            }
            
            //dispose();
            
            //tabela.atualizarTabela();
 
        } catch (Exception ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_cadastrar_botaoActionPerformed

    private void tabela_botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabela_botaoActionPerformed
        
        Tabela tabela = new Tabela();
        tabela.setVisible(true);
        
        
    }//GEN-LAST:event_tabela_botaoActionPerformed
      
    public JTextField getCategoria_text() {
        return categoria_text;
    }

    public void setCategoria_text(JTextField categoria_text) {
        this.categoria_text = categoria_text;
    }

    public JTextField getData_text() {
        return data_text;
    }

    public void setData_text(JTextField data_text) {
        this.data_text = data_text;
    }

    public JTextField getNome_text() {
        return nome_text;
    }

    public void setNome_text(JTextField nome_text) {
        this.nome_text = nome_text;
    }

    public JTextField getId_text() {
        return id_text;
    }

    public void setId_text(JTextField id_text) {
        this.id_text = id_text;
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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_botao;
    private javax.swing.JTextField categoria_text;
    private javax.swing.JTextField data_text;
    private javax.swing.JButton editar_botao;
    private javax.swing.JTextField id_pesquisa;
    private javax.swing.JTextField id_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar_botao;
    private javax.swing.JTextField nome_text;
    private javax.swing.JButton pesquisar_botao;
    private javax.swing.JButton tabela_botao;
    // End of variables declaration//GEN-END:variables

    
}
