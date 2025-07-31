package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex03.dominio;

//Classe Produto
//  Atributos: código, nome, preço, categoria
//  Métodos para aplicar desconto e calcular preço com impostos
//  Sobrecarga de construtores

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private String categoria;

    public Produto(String codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String codigo, String nome, double preco, String categoria) {
        this(codigo, nome, preco);
        this.categoria = categoria;
    }

    public void aplicarDesconto(double desconto) {
        this.preco *= (1 - desconto);
    }

    public void precoComImpostos(double imposto) {
        this.preco += imposto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
