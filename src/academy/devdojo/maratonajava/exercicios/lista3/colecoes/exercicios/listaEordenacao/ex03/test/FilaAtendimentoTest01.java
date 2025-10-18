package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex03.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.listaEordenacao.ex03.dominio.FilaAtendimento;

public class FilaAtendimentoTest01 {
    public static void main(String[] args) {
        FilaAtendimento filaAtendimento = new FilaAtendimento();
        filaAtendimento.adicionarCliente("Thiago");
        filaAtendimento.adicionarCliente("Mel");
        filaAtendimento.adicionarCliente("Corina");
        filaAtendimento.adicionarCliente("Paulo");
        System.out.println("Clientes na fila: " + filaAtendimento);

        System.out.println("------------------------------------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println("Chamando clientes... (" + filaAtendimento.chamarProximoCliente() + ")");
        }

        System.out.println("------------------------------------------------");

        System.out.println("Tentando chamar um cliente com fila vazia...");
        try {
            filaAtendimento.chamarProximoCliente();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
