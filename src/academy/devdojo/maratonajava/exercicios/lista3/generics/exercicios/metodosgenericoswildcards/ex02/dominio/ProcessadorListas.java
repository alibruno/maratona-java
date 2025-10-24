package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex02.dominio;

// Exercício 2.2.2: Processador de Listas com Upper Bounded Wildcard (? extends T)
//
//    Descrição: Crie um metodo imprimirNumeros que aceite uma List<? extends Number>. O metodo deve iterar sobre a lista
//    e imprimir o valor de cada elemento. Teste seu metodo passando para ele uma List<Integer> e uma List<Double>.
//    Dentro do metodo, tente adicionar um novo elemento (por exemplo, new Integer(10)) à lista e observe o erro de
//    compilação que ocorre.
//
//    Objetivo: Entender o uso de upper bounded wildcards. A sintaxe ? extends Number significa "uma lista de algum tipo
//    desconhecido que é Number ou uma de suas subclasses". Isso torna o metodo mais flexível, pois ele pode aceitar
//    listas de vários tipos de números. O erro de compilação ao tentar adicionar um elemento demonstra uma regra
//    crucial: de uma estrutura com extends, você pode ler (produzir valores), mas não pode escrever (consumir valores),
//    pois o compilador não pode garantir o tipo exato da lista.

import java.util.List;

public class ProcessadorListas {
    public static void imprimirNumeros(List<? extends Number> list){
//        list.add(new Integer(10));
//        Integer num = 10;
//        list.add(num);
        for (Number number : list) {
            System.out.println(number);
        }
    }
}
