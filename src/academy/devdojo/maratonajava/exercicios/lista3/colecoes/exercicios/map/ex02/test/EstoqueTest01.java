package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.map.ex02.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.map.ex02.dominio.Estoque;

public class EstoqueTest01 {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        System.out.println("Adicionando produtos...");
        estoque.adicionarProduto("123A", "P1", 2.90, 70);
        estoque.adicionarProduto("123B", "P2", 25.9, 23);
        estoque.adicionarProduto("123C", "P3", 10.2, 50);
        estoque.adicionarProduto("123D", "P4", 90, 10);
        estoque.adicionarProduto("123E", "P5", 32, 39);

        System.out.println("----------------------------------------------");
        System.out.println("Exibindo produtos...");
        estoque.exibirProdutos();

        System.out.println("----------------------------------------------");
        System.out.println("Calculando o calor total em estoque...");
        System.out.println("O valor total em estoque é = " + estoque.calcularValorTotalEstoque());

        System.out.println("----------------------------------------------");
        System.out.println("Obtendo produto mais caro...");
        System.out.println(estoque.obterProdutoMaisCaro());

    }
}
