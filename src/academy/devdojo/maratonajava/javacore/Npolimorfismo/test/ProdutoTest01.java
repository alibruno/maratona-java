package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.ConsoleDeMesa;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

import java.util.Locale;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Computador computador = new Computador("Macintosh", 25000.0);
        Tomate tomate = new Tomate("Tomate Najdorf", 15);
        ConsoleDeMesa console = new ConsoleDeMesa("Playstation 2", 500);

        CalculadoraImposto.relatorioImposto(computador);
        System.out.println("--------------------------------------------");
        CalculadoraImposto.relatorioImposto(tomate);
        System.out.println("--------------------------------------------");
        CalculadoraImposto.relatorioImposto(console);

    }
}
