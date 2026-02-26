package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.classesgenericas.ex02.dominio;

//Exercício 2.1.2: Classe Caixa<T> com Limite de Tipo (Bounded Type)
//
//    Descrição: Crie uma classe genérica Caixa<T> que pode armazenar um único item do tipo T.
//    Modifique a declaração da classe para que ela só possa armazenar objetos que sejam subtipos da classe
//    Number (como Integer, Double, BigDecimal, etc.). Crie um metodo dentro da classe que some o valor do
//    item armazenado com outro número qualquer (do tipo Number) e retorne o resultado como double.
//
//    Objetivo: Introduzir o conceito de bounded type parameters (<T extends Number>). Isso mostra como restringir
//    os tipos permitidos para um parâmetro genérico, garantindo que certos métodos (neste caso, operações matemáticas
//    como doubleValue()) possam ser invocados com segurança nos objetos do tipo T.

public class Caixa<T extends Number> {
    private T t;

    public Caixa(T t) {
        this.t = t;
    }

    public double soma(Number n){
        return this.t.doubleValue() + n.doubleValue();
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
