package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.classesgenericas.ex01.test;

import academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.classesgenericas.ex01.dominio.Par;

public class ParTeste01 {
    public static void main(String[] args) {
        Par<String, Integer> par = new Par<>("Teste", 7);
        System.out.println(par.getPrimeiro());
        System.out.println(par.getSegundo());
    }
}
