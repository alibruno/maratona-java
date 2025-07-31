package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex03.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex03.dominio.Produto;

import java.util.Locale;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Produto produto1 = new Produto("123AB", "Bolacha", 3.75);
        Produto produto2 = new Produto("231CD", "Laranja", 5.25, "Fruta");
        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println("--------------------------------------------------------");
        produto1.aplicarDesconto(0.3);
        produto2.aplicarDesconto(0.4);
        System.out.println(produto1);
        System.out.println(produto2);

        System.out.println("--------------------------------------------------------");
        produto1.precoComImpostos(1.23);
        produto2.precoComImpostos(0.79);
        System.out.println(produto1);
        System.out.println(produto2);
    }
}
