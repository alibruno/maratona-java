package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex01.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex01.dominio.ListaTarefas;

public class GerenciadorDeTarefas {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Adicionando tarefas...");
        listaTarefas.adicionarTarefa("Exercicios de Matemática");
        listaTarefas.adicionarTarefa("Exercicios de Inglês");
        listaTarefas.adicionarTarefa("Resolver leetcode");

        System.out.println("------------------------------------------");

        System.out.println("Listando tarefas...");
        listaTarefas.listarTarefas();

        System.out.println("------------------------------------------");

        System.out.println("Removendo tarefa (existente) - Exercicios de Inglês...");
        listaTarefas.removerTarefa("Exercicios de Inglês");

        System.out.println("------------------------------------------");

        System.out.println("Listando tarefas...");
        listaTarefas.listarTarefas();

        System.out.println("------------------------------------------");

        System.out.println("Removendo tarefa (não existente) - Exercicios de POO ...");
        listaTarefas.removerTarefa("Exercicios de POO");

        System.out.println("------------------------------------------");

        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

    }
}
