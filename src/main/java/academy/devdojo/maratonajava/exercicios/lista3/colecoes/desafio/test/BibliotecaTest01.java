package academy.devdojo.maratonajava.exercicios.lista3.colecoes.desafio.test;

import academy.devdojo.maratonajava.exercicios.lista3.colecoes.desafio.dominio.Biblioteca;
import academy.devdojo.maratonajava.exercicios.lista3.colecoes.desafio.dominio.Livro;

import java.util.List;

public class BibliotecaTest01 {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        System.out.println("Adicionando livros...");

        biblioteca.adicionarLivro(new Livro("12A", "Memórias Póstumas de Brás Cubas", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("12B", "Vidas secas", "Graciliano Ramos"));
        biblioteca.adicionarLivro(new Livro("12C", "O Alienista", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("45A", "Admirável Mundo Novo", "Aldous Huxley"));
        biblioteca.adicionarLivro(new Livro("45B", "Fahrenheit 451", "Ray Bradbury"));
        biblioteca.adicionarLivro(new Livro("45C", "Laranja Mecânica", "Anthony Burgess"));
        biblioteca.adicionarLivro(new Livro("47A", "A Metamorfose", "Franz Kafka"));
        biblioteca.adicionarLivro(new Livro("30A", "A Menina que Roubava Livros", "Markus Zusak e Vera Ribeiro"));
        biblioteca.adicionarLivro(new Livro("50A", "The Walking Dead: A ascensão do Governador", "Jay Bonansinga e Robert Kirkman"));
        biblioteca.adicionarLivro(new Livro("50B", "The Walking Dead: O caminho para Woodbury", "Jay Bonansinga e Robert Kirkman"));

        System.out.println("-----------------------------------------------------");

        System.out.println("Livros disponíveis:");
        biblioteca.livrosDisponiveis();

        System.out.println("-----------------------------------------------------");

        System.out.println("Pesquisando por livros de \"The Walking Dead\"...");
        List<Livro> livrosTWD = biblioteca.pesquisarPorTitulo("The Walking Dead");
        for (Livro twd : livrosTWD) {
            System.out.println(twd);
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("Emprestando \"Vidas secas\" e \"Admirável Mundo Novo\" para o usuário \"20251014\"...");
        biblioteca.emprestarLivro("12B", "20251014");
        biblioteca.emprestarLivro("45A", "20251014");

        System.out.println("-----------------------------------------------------");

        System.out.println("Livros emprestados:");
        biblioteca.livrosEmprestados();

        System.out.println("-----------------------------------------------------");

        System.out.println("Livros disponíveis:");
        biblioteca.livrosDisponiveis();

        System.out.println("-----------------------------------------------------");

        System.out.println("Devolvendo \"Vidas secas\"...");
        biblioteca.devolverLivro("12B");

        System.out.println("-----------------------------------------------------");

        System.out.println("Livros disponíveis:");
        biblioteca.livrosDisponiveis();

        System.out.println("-----------------------------------------------------");

        System.out.println("Histórico de empréstimo dos usuários (no momento, só possui o usuário 20251014)");
        biblioteca.historicoDosUsuarios();

        System.out.println("-----------------------------------------------------");

        System.out.println("Histórico de empréstimo do usuário 20251014:");
        biblioteca.historicoUsuarioEspecifico("20251014");

    }
}
