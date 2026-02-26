package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]); // 0 <=> numeros.size()
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray); //A lista faz referência ao mesmo espaço de memória do array que foi convertido.
                                                                 // O desenvolvedor deverá ter cuidado com a manipulação dessa lista.
        arrayToList.set(0, 12);
//        arrayToList.add(19);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("----------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray)); // Dessa forma, será possível manipular a lista.
        numerosList.add(15);
        System.out.println(numerosList);

        // Outra forma de inicializar listas com valores personalizados.
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7);
    }
}
