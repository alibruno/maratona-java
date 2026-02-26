package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex05.dominio;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException() {
        super("Senha incorreta.");
    }

    public SenhaInvalidaException(String message) {
        super(message);
    }
}
