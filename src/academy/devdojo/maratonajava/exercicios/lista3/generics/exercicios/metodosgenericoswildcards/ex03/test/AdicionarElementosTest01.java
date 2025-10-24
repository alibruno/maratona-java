package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex03.test;

import academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex03.dominio.AdicionarElementos;

import java.util.ArrayList;
import java.util.List;

public class AdicionarElementosTest01 {
    public static void main(String[] args) {
        AdicionarElementos adicionarElementos = new AdicionarElementos();
        List<Integer> listaInteger = new ArrayList<>();
        List<Number> listaNumber = new ArrayList<>();
        List<Object> listaObject = new ArrayList<>();

        System.out.println("Adicionando inteiros a listaInteger...");
        adicionarElementos.adicionarInteiros(listaInteger);
        System.out.println("listaInteger: " + listaInteger);

        System.out.println("Adicionando inteiros a listaNumber...");
        adicionarElementos.adicionarInteiros(listaNumber);
        System.out.println("listaNumber: " + listaNumber);

        System.out.println("Adicionando inteiros a listaObject...");
        adicionarElementos.adicionarInteiros(listaObject);
        System.out.println("listaObject: " + listaObject);

    }
}
