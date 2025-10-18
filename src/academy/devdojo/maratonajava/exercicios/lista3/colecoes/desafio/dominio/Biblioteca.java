package academy.devdojo.maratonajava.exercicios.lista3.colecoes.desafio.dominio;

import java.util.*;

public class Biblioteca {
    Map<String, Livro> acervo = new HashMap<>();
    Set<Livro> emprestados = new HashSet<>();
    Map<String, List<Livro>> emprestimosUsuario = new HashMap<>();

    public void adicionarLivro(Livro livro) {
        acervo.put(livro.getIsbn(), livro);
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro value : acervo.values()) {
            if (value.getTitulo().matches("(.*)" + titulo + "(.*)")) {
                livrosEncontrados.add(value);
            }
        }
        return livrosEncontrados;
    }

    public void emprestarLivro(String isbn, String idUsuario) {
        if (!acervo.containsKey(isbn)) {
            throw new LivroIndisponivelException("ISBN não encontrado.");
        }
        Livro livroQueSeraEmprestado = acervo.remove(isbn);

        emprestados.add(livroQueSeraEmprestado);
        List<Livro> livrosDoUsuario = emprestimosUsuario.get(idUsuario);
        if (livrosDoUsuario == null) {
            livrosDoUsuario = new ArrayList<>();
        }
        livrosDoUsuario.add(livroQueSeraEmprestado);
        emprestimosUsuario.put(idUsuario, livrosDoUsuario);
    }

    public void devolverLivro(String isbn) {
        Livro livroParaDevolver = null;
        for (Livro livroEmprestado : emprestados) {
            if (livroEmprestado.getIsbn().equals(isbn)) {
                livroParaDevolver = livroEmprestado;
                break;
            }
        }
        if (livroParaDevolver == null) {
            System.out.println("Erro: O livro com ISBN " + isbn + " não foi encontrado na lista de emprestados.");
            return;
        }
        emprestados.remove(livroParaDevolver);
        acervo.put(livroParaDevolver.getIsbn(), livroParaDevolver);
    }

    // Métodos para debug. Não estão nas especificações da questão.

    public void livrosDisponiveis() {
        for (Livro value : acervo.values()) {
            System.out.println(value);
        }
    }

    public void livrosEmprestados() {
        for (Livro emprestado : emprestados) {
            System.out.println(emprestado);
        }
    }

    public void historicoDosUsuarios() {
        for (Map.Entry<String, List<Livro>> stringListEntry : emprestimosUsuario.entrySet()) {
            System.out.println("--- Usuário: " + stringListEntry.getKey());
            for (Livro livro : stringListEntry.getValue()) {
                System.out.println("--------- " + livro);
            }
        }
    }

    public void historicoUsuarioEspecifico(String idUsuario) {
        for (Map.Entry<String, List<Livro>> stringListEntry : emprestimosUsuario.entrySet()) {
            if (stringListEntry.getKey().equals(idUsuario)) {
                for (Livro livro : stringListEntry.getValue()) {
                    System.out.println(livro);
                }
                return;
            }
        }
        System.out.println("idUsuario inválido.");
    }
}



