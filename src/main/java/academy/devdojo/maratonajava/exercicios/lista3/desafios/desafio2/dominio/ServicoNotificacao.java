package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio;

public class ServicoNotificacao<T extends Participante> {
    public String enviarConfirmacao(T t) {
        return "Olá, " + t.getNome() + "! sua presença foi confirmada!";
    }
}
