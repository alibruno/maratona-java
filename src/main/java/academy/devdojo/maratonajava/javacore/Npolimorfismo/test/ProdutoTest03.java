package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Ryzen 7", 8000);
        Tomate tomate = new Tomate("Meli", 5);
        tomate.setDataDeValidade("23/07/2025");
        CalculadoraImposto.relatorioImposto(tomate);
        System.out.println("------------------------------");

//      produto2.getDataDeValidade();

    }
}
