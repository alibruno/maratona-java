package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio.Boleto;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio.CartaoCredito;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio.FormaPagamento;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio.Pix;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.servico.Pedido;

import java.util.Locale;

public class FormaPagamentoTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        FormaPagamento formaPagamentoBol = new Boleto();
        FormaPagamento formaPagamentoPix = new Pix();
        FormaPagamento formaPagamentoCartCred = new CartaoCredito();
        System.out.printf("Sua compra foi de: R$%.2f%n", Pedido.realizarCompra(formaPagamentoBol, 2000));
        System.out.printf("Sua compra foi de: R$%.2f%n", Pedido.realizarCompra(formaPagamentoPix, 2000));
        System.out.printf("Sua compra foi de: R$%.2f%n", Pedido.realizarCompra(formaPagamentoCartCred, 2000));

    }
}
