package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

public class SistemaEventos implements Serializable {
    @Serial
    private static final long serialVersionUID = -7340898094385185343L;

    private Map<Integer, Evento> integerEventoMap = new HashMap<>();
    private int proximoId = 1;
    private static final Path pathEventosdat = Paths.get("arquivos_exercicios/lista3/desafio2/eventos.dat");

    public void criarEvento(String nome, String local, String data, Long capacidadeMaxima) {
        String[] dataHora = data.split(", ");
        integerEventoMap.put(this.proximoId++, new Evento(nome, local, LocalDateTime.parse(dataHora[0] + "T" + dataHora[1]), capacidadeMaxima));
    }

    public void inscreverParticipante(String nomeEvento, String nomeParticipante, String email) {
        for (Map.Entry<Integer, Evento> entry : integerEventoMap.entrySet()) {
            Evento evento = entry.getValue();
            if (evento.getNome().equals(nomeEvento)) {
                inscreverParticipanteEmEvento(nomeParticipante, email, evento);
                return;
            }
        }
        throw new EventoNaoEncontradoException("Evento não encontrado.");
    }

    public List<Evento> listarEventos() {
        if (integerEventoMap.isEmpty()) {
            throw new RuntimeException("Não há eventos cadastrados.");
        }
        return new ArrayList<>(integerEventoMap.values());
    }

    public void salvar() {
        try {
            Files.createDirectories(pathEventosdat.getParent());
            try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(pathEventosdat))) {
                oos.writeObject(this);
            }
        } catch (IOException e) {
            throw new RuntimeException("Erro ao salvar eventos: " + e.getMessage(), e);
        }
    }

    public static SistemaEventos carregarSistema() {
        if (!Files.exists(pathEventosdat)) {
            return new SistemaEventos();
        }
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(pathEventosdat))) {
            return (SistemaEventos) ois.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.err.println("Erro ao carregar eventos do arquivo. Um novo sistema será iniciado. Erro: " + e.getMessage());
            return new SistemaEventos();
        }
    }

    private void inscreverParticipanteEmEvento(String nomeParticipante, String email, Evento evento) {
        Set<Participante> participantesSet = evento.getParticipantesInscritos();

        if (evento.getCapacidadeMaxima() < participantesSet.size() + 1) {
            throw new EventoLotadoException("Evento está lotado.");
        }

        Participante participante = new Participante(nomeParticipante, email);
        if (participantesSet.contains(participante)) {
            throw new ParticipanteJaInscritoException("Participante já está inscrito.");
        }

        participantesSet.add(participante);
    }

    public Map<Integer, Evento> getIntegerEventoMap() {
        return integerEventoMap;
    }
}
