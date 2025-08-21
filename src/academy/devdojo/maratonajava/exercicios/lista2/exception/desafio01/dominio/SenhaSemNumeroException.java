package academy.devdojo.maratonajava.exercicios.lista2.exception.desafio01.dominio;

public class SenhaSemNumeroException extends RuntimeException{
    public SenhaSemNumeroException() {
        super("Senha sem número.");
    }

    public SenhaSemNumeroException(String message) {
        super(message);
    }

}
