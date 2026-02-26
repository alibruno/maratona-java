package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex01.test;

import academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex01.dominio.Trocar;

import java.util.ArrayList;
import java.util.List;

public class TrocarTest01 {
    public static void main(String[] args) {
        List<String> test = new ArrayList<>(List.of("A", "B", "C", "D"));
        System.out.println(test);
        Trocar.trocar(test, 0, 3);
        System.out.println(test);

    }
}
