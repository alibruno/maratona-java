package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex02.dominio;

//        adicionarContato(String nome, int numero)
//
//        pesquisarPorNome(String nome): Retorna o contato com o nome especificado.
//
//        atualizarNumeroContato(String nome, int novoNumero)

import java.util.NavigableSet;
import java.util.TreeSet;

public class AgendaContatos {
    private NavigableSet<Contato> agenda = new TreeSet<>();

    public void adicionarContato(String nome, int numero) {
        agenda.add(new Contato(nome, numero));
    }

    public Contato pesquisarPorNome(String nome) {
        for (Contato contato : agenda) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        throw new RuntimeException("Nome inválido ou contato inexistente.");
    }

    public void atualizarNumeroContato(String nome, int novoNumero) {
        pesquisarPorNome(nome).setNumeroTelefone(novoNumero);
    }

}
