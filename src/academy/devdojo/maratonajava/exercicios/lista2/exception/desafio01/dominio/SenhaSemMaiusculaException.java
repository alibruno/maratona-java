package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio;

public class SenhaSemMaiusculaException extends RuntimeException{
    public SenhaSemMaiusculaException() {
        super("Senha sem letra maiúscula.");
    }

    public SenhaSemMaiusculaException(String message) {
        super(message);
    }
}
