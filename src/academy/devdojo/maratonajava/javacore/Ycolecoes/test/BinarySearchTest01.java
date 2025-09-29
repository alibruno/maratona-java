package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(12);
        numeros.add(1);
        numeros.add(11);
        numeros.add(2);
        numeros.add(9);
        numeros.add(3);
        numeros.add(10);
        numeros.add(7);
        // (- (ponto de inserção) -1)
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 7));
    }
}
