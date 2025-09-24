package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes1 = new ArrayList<>(); // Array dinâmico; O tipo obrigatoriamente deve ser definido na variável de ref.
        List<String> nomes2 = new ArrayList<>();
        nomes1.add("Louro");
        nomes1.add("José");
        nomes1.add("José");
        nomes1.add("Louro");
        nomes2.add("Cristiano");
        nomes2.add("José");

        nomes1.addAll(nomes2);
//        nomes1.remove(1);
//        nomes1.remove("José");

        for (String nome : nomes1) {
            System.out.println(nome);
        }
        nomes1.add("Braga");
        System.out.println("---------------");

        for (int i = 0; i < nomes1.size(); i++) {
            System.out.println(nomes1.get(i));
        }

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);

        System.out.println("-----------------------------");
        System.out.println("Test remove:");

        int iteracoes = 1;
        while (nomes1.remove("José")){
            System.out.println("removeu " + iteracoes);
            iteracoes++;
        }

        System.out.println("--------------------------");
        for (String s : nomes1) {
            System.out.println(s);
        }
    }
}
