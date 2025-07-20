package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

//import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void relatorioImposto(Produto produto) {
        System.out.println("Relátorio de imposto:");
        double imposto = produto.calcularImposto();
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.printf("Imposto a ser pago: %.2f%n", imposto);
        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataDeValidade());
//            System.out.println(((Tomate) produto).getDataDeValidade());
        }
    }

//    public static void calcularImpostoSobreComputador(Computador computador) {
//        System.out.println("Relátorio de imposto sobre computador:");
//        double imposto = computador.calcularImposto();
//        System.out.println("Nome: " + computador.getNome());
//        System.out.println("Valor: " + computador.getValor());
//        System.out.printf("Imposto a ser pago: %.2f%n", imposto);
//    }
//
//    public static void calcularImpostoSobreTomate(Tomate tomate) {
//        System.out.println("Relátorio de imposto sobre tomate:");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Nome: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.printf("Imposto a ser pago: %.2f%n", imposto);
//    }

}

