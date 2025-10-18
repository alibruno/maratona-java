package academy.devdojo.maratonajava.exercicios.lista3.colecoes.desafio.dominio;

public class LivroIndisponivelException extends RuntimeException{
    public LivroIndisponivelException() {
        super("Livro indispoível.");
    }

    public LivroIndisponivelException(String message) {
        super(message);
    }
}
