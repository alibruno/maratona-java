package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex02.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex02.dominio.AgendaContatos;

public class AgendaContatoTest01 {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        System.out.println("Adicionando contatos...");
        agendaContatos.adicionarContato("Yasmin", 30909090);
        agendaContatos.adicionarContato("Lucas", 90909090);
        agendaContatos.adicionarContato("Manie", 10909090);
        agendaContatos.adicionarContato("Roger", 20909090);

        System.out.println("---------------------------------------------");

        System.out.println("Pesquisando pelo nome Roger (existe)...");
        System.out.println(agendaContatos.pesquisarPorNome("Roger"));

        System.out.println("---------------------------------------------");

        System.out.println("Pesquisando pelo nome Maria (não existe)...");
        try {
            System.out.println(agendaContatos.pesquisarPorNome("Maria"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Atualizando o contato de Yasmin...");
        System.out.println("Antes da troca = " + agendaContatos.pesquisarPorNome("Yasmin"));
        agendaContatos.atualizarNumeroContato("Yasmin", 31919191);
        System.out.println("Depois da troca = " + agendaContatos.pesquisarPorNome("Yasmin"));
    }
}
