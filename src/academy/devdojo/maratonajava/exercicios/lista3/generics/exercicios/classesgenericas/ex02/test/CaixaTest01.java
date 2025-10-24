package academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.classesgenericas.ex02.test;

import academy.devdojo.maratonajava.exercicios.lista3.generics.exercicios.classesgenericas.ex02.dominio.Caixa;

public class CaixaTest01 {
    public static void main(String[] args) {
        Caixa<Integer> caixa = new Caixa<>(20);
        Double outroNumero = 10.9;
        System.out.println(caixa.soma(outroNumero));
    }
}
