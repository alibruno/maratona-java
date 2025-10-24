package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex02.test;

import academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.metodosgenericoswildcards.ex02.dominio.ProcessadorListas;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorListasTest01 {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        List<Double> listDouble = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0));

        System.out.println("Lista de inteiros:");
        ProcessadorListas.imprimirNumeros(listInt);
        System.out.println("-----------------------------------");
        System.out.println("Lista de doubles:");
        ProcessadorListas.imprimirNumeros(listDouble);
    }
}
