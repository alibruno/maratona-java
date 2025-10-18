package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.map.ex02.dominio;

//    Descrição: Crie uma classe Produto com atributos como nome, preço e quantidade.
//    Em seguida, crie uma classe EstoqueProdutos que gerencia o estoque de uma loja.
//    Use um HashMap<String, Produto> onde a chave é um código de produto único (String)
//    e o valor é o objeto Produto correspondente. Implemente os seguintes métodos:
//
//        adicionarProduto(String cod, String nome, double preco, int quantidade)
//
//        exibirProdutos(): Lista todos os produtos no estoque.
//
//        calcularValorTotalEstoque(): Retorna o valor total do estoque (soma de
//        preco * quantidade para cada produto).
//
//        obterProdutoMaisCaro(): Encontra e retorna o produto com o maior preço.
//
//    Objetivo: Modelar um cenário de negócio do mundo real usando Map para acesso rápido
//    a objetos complexos por meio de um identificador único, uma base para muitos sistemas
//    de gerenciamento.

import java.util.Objects;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        Objects.requireNonNull(nome, "'nome' não pode ser null.");
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
