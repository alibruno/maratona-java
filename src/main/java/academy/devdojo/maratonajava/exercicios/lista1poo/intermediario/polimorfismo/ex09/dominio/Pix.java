package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio;

public class Pix implements FormaPagamento{
    private static final double TAXA_PIX = 0.05;

    @Override
    public double calcPagamento(double valor) {
        return valor * (1 + TAXA_PIX);
    }
}
