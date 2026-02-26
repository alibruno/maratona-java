package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        // Type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Kleber");
        lista.add("Louro");
        for (String s : lista) {
            System.out.println(s);
        }

        add(lista, new Consumidor("Neto"));

        for (Object o : lista) {
            System.out.println(o);
        }
    }

    public static void add(List lista, Consumidor c) {
        lista.add(c);
    }
}
