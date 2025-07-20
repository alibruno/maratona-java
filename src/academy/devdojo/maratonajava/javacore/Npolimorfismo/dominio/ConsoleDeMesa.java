package academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio;

public class ConsoleDeMesa extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.15;

    public ConsoleDeMesa(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
