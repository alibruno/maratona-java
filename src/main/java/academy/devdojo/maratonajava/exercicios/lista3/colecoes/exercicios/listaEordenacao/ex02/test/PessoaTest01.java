package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex02.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex02.dominio.OrdenadorDePessoa;
import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex02.dominio.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoaTest01 {
    public static void main(String[] args) {
        List<Pessoa> pessoaList = new ArrayList<>(
                List.of(new Pessoa("Téo", 14, 1.70),
                        new Pessoa("Magnus", 34, 1.89),
                        new Pessoa("Lilian", 20, 1.65),
                        new Pessoa("Ana", 7, 1.30)));

        System.out.println("Ordenação via Comparable<> (idade)");
        Collections.sort(pessoaList);
        for (Pessoa pessoa : pessoaList) {
            System.out.println(pessoa);
        }

        System.out.println("----------------------------------");

        System.out.println("Ordenação via Comparator<> (altura)");
        pessoaList.sort(new OrdenadorDePessoa());
        for (Pessoa pessoa : pessoaList) {
            System.out.println(pessoa);
        }
    }

}
