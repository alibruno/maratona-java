package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Evento implements Serializable {
    @Serial
    private static final long serialVersionUID = -1346638804533115860L;

    private String nome;
    private String local;
    private LocalDateTime data;
    private Long capacidadeMaxima;
    private Set<Participante> participantesInscritos = new TreeSet<>();

    public Evento(String nome, String local, LocalDateTime data, Long capacidadeMaxima) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", data=" + data +
                ", capacidadeMaxima=" + capacidadeMaxima +
                ", participantesInscritos=" + participantesInscritos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Evento evento = (Evento) o;
        return Objects.equals(nome, evento.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Long getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(Long capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public Set<Participante> getParticipantesInscritos() {
        return participantesInscritos;
    }

    public void setParticipantesInscritos(Set<Participante> participantesInscritos) {
        this.participantesInscritos = participantesInscritos;
    }
}
