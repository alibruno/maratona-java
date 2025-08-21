package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio;

public class SenhaCurtaException extends RuntimeException{
    public SenhaCurtaException() {
        super("Senha curta.");
    }

    public SenhaCurtaException(String message) {
        super(message);
    }

}
