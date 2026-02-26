package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Participante implements Comparable<Participante>, Serializable {
    @Serial
    private static final long serialVersionUID = -32953646604811597L;

    private String nome;
    private String email;

    public Participante(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public int compareTo(Participante o) {
        return this.email.compareTo(o.getEmail());
    }
}
