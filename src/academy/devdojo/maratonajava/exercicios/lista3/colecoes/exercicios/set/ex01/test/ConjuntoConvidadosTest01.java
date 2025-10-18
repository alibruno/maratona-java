package academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex01.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.exercicios.set.ex01.dominio.ConjuntoConvidados;

public class ConjuntoConvidadosTest01 {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Adicionando convidados...");
        conjuntoConvidados.adicionarConvidado("Otávio");
        conjuntoConvidados.adicionarConvidado("Lara");
        conjuntoConvidados.adicionarConvidado("Lincoln");
        conjuntoConvidados.adicionarConvidado("Manuel");
        conjuntoConvidados.adicionarConvidado("Sofia");

        conjuntoConvidados.contarConvidados();

        System.out.println("Removendo convidados...");
        conjuntoConvidados.removerConvidado("Otávio");
        conjuntoConvidados.removerConvidado("Lara");
        conjuntoConvidados.removerConvidado("Lincoln");
        conjuntoConvidados.removerConvidado("Manuel");
        conjuntoConvidados.removerConvidado("Sofia");

        conjuntoConvidados.contarConvidados();

        System.out.println("Tentando remover convidado que não está presente na lista...");
        try {
            conjuntoConvidados.removerConvidado("Katiane");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
