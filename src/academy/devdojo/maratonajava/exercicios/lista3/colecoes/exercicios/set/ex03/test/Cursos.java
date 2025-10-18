package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex03.test;

//    Descrição: Crie duas instâncias de HashSet<String>, uma representando alunos do curso de Java e outra,
//    alunos do curso de Python. Adicione alguns nomes a ambos os conjuntos, garantindo que alguns alunos
//    estejam matriculados em ambos os cursos. Escreva um código que calcule e exiba:
//
//        A união dos dois conjuntos (todos os alunos únicos de ambos os cursos).
//
//        A interseção dos dois conjuntos (apenas os alunos matriculados em ambos os cursos).
//
//    Objetivo: Aplicar operações de teoria de conjuntos (addAll para união, retainAll para interseção) para
//    resolver um problema prático de análise de dados, demonstrando o poder expressivo da API de Collections.

import java.util.HashSet;
import java.util.Set;

public class Cursos {
    public static void main(String[] args) {
        Set<String> alunosJava = new HashSet<>();
        alunosJava.add("Braulio");
        alunosJava.add("Jorgiano");
        alunosJava.add("Loiane");
        alunosJava.add("Kipper");

        Set<String> alunosPython = new HashSet<>();
        alunosPython.add("Antônio");
        alunosPython.add("Miguel");
        alunosPython.add("Loiane");
        alunosPython.add("Carol");

        Set<String> uniaoAlunos = new HashSet<>();
        uniaoAlunos.addAll(alunosJava);
        uniaoAlunos.addAll(alunosPython);
        System.out.println("União dos conjuntos = " + uniaoAlunos);

        Set<String> intersecaoAlunos = new HashSet<>();
        intersecaoAlunos.addAll(alunosJava);
        intersecaoAlunos.retainAll(alunosPython);
        System.out.println("Interseção dos conjuntos = " + intersecaoAlunos);

    }
}
