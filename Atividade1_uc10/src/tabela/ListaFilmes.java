
package tabela;

import Classes.Conexao.Dados;
import java.util.ArrayList;
import java.util.List;

public class ListaFilmes {
    
    // Declaração de variáveis
    private static List<Dados> DadosFilmes = new ArrayList<>();

    // Métodos para acessarmos a lista e adicionarmos novos itens
    public static List<Dados> Listar() {
        return DadosFilmes;
    }

    public static void setDadosFilmes(Dados dados) {
        DadosFilmes.add(dados);
    }
    
}
