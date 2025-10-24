package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex01.dominio;

//Exercício 2.2.1: Metodo Genérico para Trocar Posições em uma Lista
//
//    Descrição: Em uma classe utilitária, escreva um metodo estático e genérico chamado trocar. Este metodo
//    deve receber uma List<T> e dois inteiros (índices) como argumentos. A função do metodo é trocar os elementos
//    que estão nessas duas posições dentro da lista.
//
//    Objetivo: Praticar a sintaxe de declaração de um metodo genérico (<T> void trocar(...)), que é útil para criar
//    algoritmos que operam em coleções de qualquer tipo, independentemente da classe em que o metodo está definido.

import java.util.List;

public class Trocar {
    public static <T> void trocar(List<T> lista, int indice1, int indice2) {
        T temp = lista.get(indice1);
        lista.set(indice1, lista.get(indice2));
        lista.set(indice2, temp);
    }
}
