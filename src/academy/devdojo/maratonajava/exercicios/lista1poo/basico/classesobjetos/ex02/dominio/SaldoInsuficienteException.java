package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex02.dominio;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente.");
    }

    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
