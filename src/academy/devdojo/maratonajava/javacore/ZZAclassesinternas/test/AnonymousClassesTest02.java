package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class BarcoNameComparator implements Comparator<Barco> {
    @Override
    public int compare(Barco o1, Barco o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}

public class AnonymousClassesTest02 {
    // classes que existirao por um breve periodo.
    // ex: trocar o comportamento de um metodo de uma classe
    public static void main(String[] args) {
        List<Barco> barcoList = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Cruzeiro")));
//        barcoList.sort((o1, o2) -> 0);
        barcoList.sort(new Comparator<Barco>() { // Instancia uma classe anonima que implementa um Comparator<Barco>
            @Override
            public int compare(Barco o1, Barco o2) {
                return 0;
            }
        });
        System.out.println(barcoList);

    }
}
