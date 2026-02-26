package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio;

//Sistema de Pagamento
//    Interface FormaPagamento
//    Implementações: CartaoCredito, PIX, Boleto
//    Classe Pedido que aceita qualquer forma de pagamento

public interface FormaPagamento {
    double calcPagamento(double valor);
}
