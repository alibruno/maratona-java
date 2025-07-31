package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio;

public class Boleto implements FormaPagamento{
    @Override
    public double calcPagamento(double valor) {
        return valor;
    }
}
