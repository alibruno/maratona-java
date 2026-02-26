package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.map.ex02.dominio;

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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Estoque {
    Map<String, Produto> map = new HashMap<>();

    public void adicionarProduto(String cod, String nome, double preco, int quantidade) {
        Objects.requireNonNull(cod, "'codigo' não pode ser null.");
        map.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        for (Produto value : map.values()) {
            System.out.println(value);
        }
    }

    public double calcularValorTotalEstoque() {
        double somaTotal = 0;
        for (Produto value : map.values()) {
            somaTotal += value.getPreco() * value.getQuantidade();
        }
        return somaTotal;
    }

    public Produto obterProdutoMaisCaro(){
        double maiorPreco = 0;
        double precoTemp;
        String cod = null;
        for (Map.Entry<String, Produto> stringProdutoEntry : map.entrySet()) {
            precoTemp = stringProdutoEntry.getValue().getPreco();
            if (precoTemp > maiorPreco){
                maiorPreco = precoTemp;
                cod = stringProdutoEntry.getKey();
            }
        }
        if (cod == null){
            throw new RuntimeException("Aconteceu um erro na busca.");
        }
        return map.get(cod);
    }

}
