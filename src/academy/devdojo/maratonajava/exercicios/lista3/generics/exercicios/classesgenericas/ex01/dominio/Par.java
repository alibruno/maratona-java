package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.classesgenericas.ex01.dominio;

//Exercício 2.1.1: Classe Par<T, U>
//
//    Descrição: Crie uma classe genérica chamada Par que possa armazenar um par de objetos de tipos potencialmente diferentes.
//    A classe deve ter dois parâmetros de tipo, T e U. Implemente um construtor que receba os dois objetos e
//    métodos getPrimeiro() (retornando T) e getSegundo() (retornando U) para recuperar os valores.
//
//    Objetivo: Entender a sintaxe básica de declaração de uma classe genérica com múltiplos parâmetros de tipo e criar uma estrutura
//    de dados genérica simples e reutilizável.

public class Par<T, U> {
    private T t;
    private U u;

    public Par(T t, U u) {
        this.t = t;
        this.u = u;
    }

    public T getPrimeiro(){
        return t;
    }

    public U getSegundo(){
        return u;
    }
}
