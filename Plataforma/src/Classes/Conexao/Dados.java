
package Classes.Conexao;

import java.time.LocalDate;

public class Dados { 
    
    private int id_filme;
    private String nome_filme;
    private LocalDate data_filme;
    private String categoria;

    public int getId_filme() {
        return id_filme;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    public String getNome_filme() {
        return nome_filme;
    }

    public void setNome_filme(String nome_filme) {
        this.nome_filme = nome_filme;
    }

    public LocalDate getData_filme() {
        return data_filme;
    }

    public void setData_filme(LocalDate data_filme) {
        this.data_filme = data_filme;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
