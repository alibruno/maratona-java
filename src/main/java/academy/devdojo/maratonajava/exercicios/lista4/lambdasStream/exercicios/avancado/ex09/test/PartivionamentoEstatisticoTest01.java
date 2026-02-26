package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.avancado.ex09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

//     Contexto: Separação binária de dados.
//
//    Tarefa: Dada uma lista de números inteiros aleatórios, particione-os em dois grupos: Primos e Não-Primos.
//    O resultado deve ser Map<Boolean, List<Integer>>. Dica: Você precisará implementar um metodo auxiliar ou
//    predicado isPrime.
public class PartivionamentoEstatisticoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(ThreadLocalRandom.current().nextInt(0, 100));
        }

        Map<Boolean, List<Integer>> collect = numeros.stream()
                .collect(Collectors.partitioningBy(PartivionamentoEstatisticoTest01::ehPrimo));
        System.out.println(collect);
    }

    private static boolean ehPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
