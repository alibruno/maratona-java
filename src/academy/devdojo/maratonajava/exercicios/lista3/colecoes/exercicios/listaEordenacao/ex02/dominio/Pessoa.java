package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex02.dominio;

//     Descrição: Crie uma classe Pessoa com os atributos nome (String), idade (int) e altura (double). Crie uma lista de
//     objetos Pessoa. Em seguida, crie uma classe OrdenadorPessoa que tenha dois métodos:
//
//        Um metodo que ordena a lista por idade. Para isso, a classe Pessoa deve implementar a interface Comparable<Pessoa>,
//        definindo a idade como critério de ordenação natural.
//
//        Um segundo metodo que ordena a lista por altura. Este metodo deve receber a lista e um Comparator<Pessoa> como argumento,
//        que será implementado externamente para comparar as alturas.
//
//    Objetivo: Entender a diferença fundamental entre ordenação natural (Comparable) e ordenação customizada (Comparator). Comparable
//    define a ordem padrão de um objeto, enquanto Comparator oferece flexibilidade para múltiplas ordens, desacoplando a lógica de
//    ordenação do objeto em si. Este é um insight crucial de design de software.

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return Integer.compare(this.idade, outraPessoa.getIdade());
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
}
