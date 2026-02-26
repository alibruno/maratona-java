package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex05.test;

//     Contexto: Agregação de dados.
//
//    Tarefa: Dada uma lista de preços (Double), calcule o valor total usando reduce.
//    Tente também usando mapToDouble e sum (mais eficiente para primitivos).

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceTest01 {
    public static void main(String[] args) {
        List<Double> lista = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0));

        //Stream 1
        Double sum1 = lista.stream()
                .reduce(0.0, Double::sum);

        //Stream 2
        double sum2 = lista.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        System.out.println(sum1);
        System.out.println(sum2);
    }
}
