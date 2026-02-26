package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex01.dominio;
//    Descrição: Crie uma classe ListaTarefas que encapsula um ArrayList<String>. Implemente os seguintes métodos:
//
//        adicionarTarefa(String tarefa): Adiciona uma nova tarefa à lista.
//
//        removerTarefa(String tarefa): Remove uma tarefa da lista com base na sua descrição.
//
//        listarTarefas(): Exibe todas as tarefas presentes na lista.
//
//        obterNumeroTotalTarefas(): Retorna o número total de tarefas na lista.
//
//    Objetivo: Dominar as operações básicas de CRUD (Create, Read, Update, Delete) em uma List, encapsulando a
//    lógica dentro de uma classe, um princípio fundamental da Programação Orientada a Objetos.

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<String> lista = new ArrayList<>();

    public void adicionarTarefa(String tarefa) {
        lista.add(tarefa);
    }

    public void removerTarefa(String tarefa) {
        if (!lista.remove(tarefa)) {
            System.out.println("ERRO: Elemento [ " + tarefa + " ] não está presente na lista.");
        }
    }

    public void listarTarefas() {
        System.out.println(lista);
    }

    public int obterNumeroTotalTarefas() {
        return lista.size();
    }

}
