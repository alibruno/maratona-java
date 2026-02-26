package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex02.dominio;

//    Descrição: Crie uma classe Contato com atributos nome (String) e numeroTelefone (int). 
//    Em seguida, crie uma classe AgendaContatos que armazena os contatos em um TreeSet<Contato>. 
//    Para que o TreeSet funcione, a classe Contato deve implementar Comparable<Contato> e usar 
//    o nome como critério de comparação. Implemente os métodos:
//
//        adicionarContato(String nome, int numero)
//
//        pesquisarPorNome(String nome): Retorna o contato com o nome especificado.
//
//        atualizarNumeroContato(String nome, int novoNumero)
//
//    Objetivo: Utilizar TreeSet para manter uma coleção ordenada automaticamente. Este exercício 
//    reforça a necessidade de um objeto ser "comparável" para ser usado em estruturas de dados ordenadas.

public class Contato implements Comparable<Contato> {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public int compareTo(Contato o) {
        return this.nome.compareTo(o.nome);
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numeroTelefone=" + numeroTelefone +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
