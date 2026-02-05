
package Classes.Conexao;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
        
    Connection conn;
    PreparedStatement st;
    ResultSet rs;

    public Connection getConexao() {
        //Testando a conexão com o banco de dados
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/atividade1","root", "G@tinhos16");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) { // tratando o erro, caso ele ocorra
            System.out.println("Erro ao conectar: " + ex.getMessage());
            return null;
        }
    }
  
    public boolean excluir(String nome){
    // Método para EXCLUIR dados no banco de dados

        try {
            //Setando os parâmetros
            st = conn.prepareStatement("DELETE FROM filmes WHERE nome = ?");
            st.setString(1,nome);
            st.executeUpdate();
            return true;
            
            } catch (SQLException ex) { //tratando o erro, caso ele ocorra
                return false;
        }
    }    
        
    public void desconectar(){
        // Método para DESCONECTAR o banco de dados
        try {
        if (conn != null && !conn.isClosed()) {
            conn.close();
            System.out.println("Conexão encerrada.");
        }
    } catch (SQLException e) { //tratando o erro, caso ele ocorra
        System.out.println("Erro ao desconectar: " + e.getMessage());
        
        }
    
    }   
}
       