package academy.devdojo.maratonajava.exercicios.lista3.generics.desafio.test;

import academy.devdojo.maratonajava.exercicios.lista3.generics.desafio.dominio.Produto;
import academy.devdojo.maratonajava.exercicios.lista3.generics.desafio.dominio.Repositorio;
import academy.devdojo.maratonajava.exercicios.lista3.generics.desafio.dominio.Usuario;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio<Usuario, Integer> repUsuarios = new Repositorio<>();
        Repositorio<Produto, String> repProdutos = new Repositorio<>();

        System.out.println("Adicionando usuários...");
        repUsuarios.adicionar(new Usuario(123, "Yusuke"));
        repUsuarios.adicionar(new Usuario(234, "Midoriya"));
        repUsuarios.adicionar(new Usuario(345, "Goku"));
        repUsuarios.adicionar(new Usuario(456, "Kurama"));
        System.out.println("-------------------------------------");

        System.out.println("Adicionando produtos...");
        repProdutos.adicionar(new Produto("1A1", "p1"));
        repProdutos.adicionar(new Produto("1A2", "p2"));
        repProdutos.adicionar(new Produto("1A3", "p3"));
        repProdutos.adicionar(new Produto("1A4", "p4"));
        repProdutos.adicionar(new Produto("1A5", "p5"));
        System.out.println("-------------------------------------");

        System.out.println("Buscando usuários com id = 123 (existe):");
        System.out.println(repUsuarios.buscarPorId(123));
        System.out.println("-------------------------------------");

        System.out.println("Buscando usuários com id = 111 (não existe):");
        try {
            System.out.println(repUsuarios.buscarPorId(111));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------");

        System.out.println("Listando todos os produtos: ");
        for (Produto produto : repProdutos.listarTodos()) {
            System.out.println(produto);
        }
        System.out.println("-------------------------------------");

        System.out.println("Removendo produto com id = 1A1 (existe):");
        repProdutos.remover("1A1");
        System.out.println("-------------------------------------");

        System.out.println("Listando todos os produtos: ");
        for (Produto produto : repProdutos.listarTodos()) {
            System.out.println(produto);
        }
        System.out.println("-------------------------------------");

        System.out.println("Removendo produto com id = ION (existe):");
        try {
            repProdutos.remover("ION");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-------------------------------------");


    }
}
