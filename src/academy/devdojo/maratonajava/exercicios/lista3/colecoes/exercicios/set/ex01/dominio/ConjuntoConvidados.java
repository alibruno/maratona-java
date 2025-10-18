package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex01.dominio;

//        Descrição: Crie uma classe ConjuntoConvidados que gerencia uma lista de convidados para um evento.
//        Internamente, use um HashSet<String> para armazenar os nomes dos convidados. Implemente os métodos:
//
//            adicionarConvidado(String nome): Adiciona um convidado. O HashSet garantirá automaticamente que
//            não haja duplicatas.
//
//            removerConvidado(String nome): Remove um convidado do conjunto.
//
//            contarConvidados(): Retorna o número de convidados únicos.
//
//        Objetivo: Demonstrar o principal caso de uso de um Set: garantir a unicidade dos elementos de forma
//        extremamente eficiente, com operações de adição, remoção e verificação de existência em tempo médio
//        constante O(1).

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<String> nomesConvidados = new HashSet<>();

    public void adicionarConvidado(String nome){
        nomesConvidados.add(nome);
    }

    public void removerConvidado(String nome){
        if (!nomesConvidados.remove(nome)){
            throw new RuntimeException("Nome inválido ou não está presente na lista.");
        }
    }

    public void contarConvidados(){
        System.out.println("Total = " + nomesConvidados.size());
    }
}
