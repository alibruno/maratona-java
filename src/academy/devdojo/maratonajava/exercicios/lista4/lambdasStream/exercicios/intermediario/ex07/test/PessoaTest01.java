package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex07.test;

import academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.intermediario.ex07.dominio.Pessoa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//     Contexto: Comparadores múltiplos.
//
//    Tarefa: Dada uma lista de Pessoa (nome, idade), ordene o stream primeiro por idade (decrescente) e,
//    em caso de empate, por nome (alfabético). Use Comparator.comparing(...).thenComparing(...).
public class PessoaTest01 {

    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<>(List.of(new Pessoa("Alis", 27), new Pessoa("Lincol", 25), new Pessoa("João Vitor", 23), new Pessoa("Manoel", 27)));
        lista.stream()
                .sorted(
                        Comparator.comparing(Pessoa::getIdade)
                                .reversed()
                                .thenComparing(Pessoa::getNome)
                )
                .forEach(System.out::println);

    }

}
