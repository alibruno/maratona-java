package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.servico;


import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex09.dominio.FormaPagamento;


public class Pedido {
    public static double realizarCompra(FormaPagamento formaPagamento, double valor){
        return formaPagamento.calcPagamento(valor);
    }
}
