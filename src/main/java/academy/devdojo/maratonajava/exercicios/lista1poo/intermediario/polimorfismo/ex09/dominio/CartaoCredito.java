package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio;

public class CartaoCredito implements FormaPagamento {
    private static final double TAXA_CARTAO_CREDITO = 0.1;

    @Override
    public double calcPagamento(double valor) {
        return valor * (1 + TAXA_CARTAO_CREDITO);
    }
}
