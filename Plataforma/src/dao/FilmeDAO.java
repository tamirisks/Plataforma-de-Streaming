
package dao;

import Classes.Conexao.Conexao;
import Classes.Conexao.Dados;
import Telas.Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FilmeDAO { // classe apenas para salvar no banco de dados (java.sql.Date)
    private Conexao conexao;
    private Connection conn;  
    PreparedStatement st;

    public FilmeDAO() {
    this.conexao = new Conexao();
    this.conn = this.conexao.getConexao();
}   
    public int salvar(Dados dado){
        
        // Método para SALVAR dados no banco de dados
        int status;
        try {
            
            //Setando os parâmetros
            st = conn.prepareStatement("INSERT INTO filmes VALUES(?,?,?,?)");
            st.setInt(1,dado.getId_filme());
            st.setString(2,dado.getNome_filme());
            st.setDate(3, java.sql.Date.valueOf(dado.getData_filme())); // converter de LocalDate para java.sql.Date
            st.setString(4,dado.getCategoria());        
            status = st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso!");
            return status;
            
        } catch (SQLException ex) { //tratando o erro, caso ele ocorra
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return ex.getErrorCode();
        }
    }

    //Método para EDITAR dados no banco de dados (UPDATE)
    public void Editar (Dados dados){
        Cadastro cadastro = new Cadastro();
        
        String sql = "UPDATE filmes SET nome=?, datalancamento=?, categoria=?  WHERE id=?";
        
        try {
            PreparedStatement stmt = conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE);
            //Setando os parâmetros
            stmt.setString(1, dados.getNome_filme());           
            stmt.setDate(2,java.sql.Date.valueOf(dados.getData_filme())); //conversão (LocalDate -> java.sql.Date)           
            stmt.setString(3, dados.getCategoria());  
            stmt.setInt(4, dados.getId_filme());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Filme editado com sucesso!");
            
        } catch (Exception e) { //tratando o erro, caso ele ocorra
            System.out.println("Erro ao editar filmes: " + e.getMessage());
        }
    }

    //Método para selecionar o filme pelo ID no banco de dados
    public Dados Pesquisa (int id){
      String sql = "SELECT * FROM filmes WHERE id = ?";
      
      try {
                  
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        Dados dados = new Dados();

        rs.next(); 
        
        //Setando os parâmetros
        dados.setId_filme(id);
        dados.setNome_filme(rs.getString("nome"));  
        java.sql.Date dataSql = rs.getDate("datalancamento"); //conversão
        dados.setData_filme(dataSql.toLocalDate());
        dados.setCategoria(rs.getString("categoria"));    

        return dados;
        
    //tratando o erro, caso ele ocorra     
    } catch (Exception e) {
        System.out.println("erro: " + e.getMessage());
        return null;
      }
      
  }
    
        //Método para filtrar o filme pelo nome no banco de dados

    public List<Dados> getFilmes (String categoriaFilme){
    
        String sql = "SELECT * FROM filmes WHERE categoria LIKE ?"; 
      
      try {
                  
        PreparedStatement stmt = this.conn.prepareStatement(sql);
        stmt.setString(1,"%" + categoriaFilme + "%");
        ResultSet rs = stmt.executeQuery();

        List<Dados> listaFilmes = new ArrayList<>();
        
        //Estrutura de repetição While                    
        while (rs.next()) {
        Dados dados = new Dados();

        //Setando os parâmetros
        dados.setId_filme(rs.getInt("id"));
        dados.setNome_filme(rs.getString("nome"));  
        java.sql.Date dataSql = rs.getDate("datalancamento"); //conversão
        dados.setData_filme(dataSql.toLocalDate());
        dados.setCategoria(rs.getString("categoria")); 
        
        listaFilmes.add(dados);
        
        }

        return listaFilmes;
        
    //tratando o erro, caso ele ocorra     
    } catch (Exception e) {
        System.out.println("erro: " + e.getMessage());
        return null;
      }
      
    }
}




