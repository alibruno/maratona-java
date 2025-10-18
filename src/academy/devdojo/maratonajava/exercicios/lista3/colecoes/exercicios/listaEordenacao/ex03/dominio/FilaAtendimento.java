package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex03.dominio;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

//    Descrição: Crie uma classe que simule uma fila de atendimento de um banco. Use um LinkedList<String>
//    para representar a fila de clientes (nomes).
//
//    Implemente os seguintes métodos:
//
//        adicionarCliente(String nome): Adiciona um cliente ao final da fila.
//
//        chamarProximoCliente(): Remove e retorna o primeiro cliente da fila.
//
//        O metodo chamarProximoCliente deve lidar graciosamente com o caso de a fila estar vazia,
//        talvez retornando null ou lançando uma exceção.
//
//    Objetivo: Compreender o uso de LinkedList como uma implementação eficiente de uma Queue (Fila).
//    Suas operações addLast() e removeFirst() têm complexidade de tempo constante O(1), tornando-a ideal para
//    este cenário, ao contrário de um ArrayList, onde remover do início seria uma operação custosa O(n).

public class FilaAtendimento {
    private List<String> clientes = new LinkedList<>();

    public void adicionarCliente(String nome) {
        clientes.addLast(nome);
    }

    public String chamarProximoCliente(){
        try {
            return clientes.removeFirst();
        }catch (NoSuchElementException e){
            throw new RuntimeException("ERRO: Não há clientes na lista.");
        }
    }

    @Override
    public String toString() {
        return "FilaAtendimento{" +
                "clientes=" + clientes +
                '}';
    }
}
