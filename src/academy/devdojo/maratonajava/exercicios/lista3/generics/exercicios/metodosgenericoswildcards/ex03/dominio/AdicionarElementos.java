package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex03.dominio;

// Exercício 2.2.3: Adicionando Elementos com Lower Bounded Wildcard (? super T)
//
//    Descrição: Crie um metodo adicionarInteiros que aceite uma List<? super Integer>. Dentro do metodo, adicione os
//    números 1, 2 e 3 a essa lista. Teste seu metodo passando para ele uma List<Integer>, uma List<Number>
//    e uma List<Object>. Observe que todas essas chamadas são válidas. Agora, tente ler um elemento da lista
//    e atribuí-lo a uma variável do tipo Integer e observe o comportamento.
//
//    Objetivo: Compreender o uso de lower bounded wildcards. A sintaxe ? super Integer significa "uma lista de Integer
//    ou de um supertipo de Integer". Isso torna o metodo flexível para escrever dados. Você pode adicionar Integers a
//    uma List<Integer>, List<Number> ou List<Object> com segurança. Este exercício, em conjunto com o anterior,
//    solidifica o princípio PECS: Producer Extends, Consumer Super. Use extends quando você precisa ler de uma
//    estrutura (ela é uma produtora de dados). Use super quando você precisa escrever em uma estrutura (ela é uma
//    consumidora de dados).

import java.util.List;

public class AdicionarElementos {
    public void adicionarInteiros(List<? super Integer> list){
        list.add(1);
        Integer integer = 7;
        list.add(integer);
        list.add(3);
    }
}
