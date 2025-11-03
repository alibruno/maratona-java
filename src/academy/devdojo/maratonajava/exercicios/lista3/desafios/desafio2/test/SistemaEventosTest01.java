package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.test;

import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio.Evento;
import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio.SistemaEventos;

public class SistemaEventosTest01 {
    public static void main(String[] args) {
        SistemaEventos sistemaEventos = new SistemaEventos();

//        RuntimeException -> Não há eventos cadastrados.
//        for (Evento evento : sistemaEventos.listarEventos()) {
//            System.out.println(evento);
//        }

        sistemaEventos.criarEvento("nome1", "local1", "2010-01-01, 20:00:00", 3L);

        sistemaEventos.inscreverParticipante("nome1", "Luciano", "luciano@gmail.com");
        sistemaEventos.inscreverParticipante("nome1", "Lara", "lara@gmail.com");
//        sistemaEventos.inscreverParticipante("nome1", "Luciano", "luciano@gmail.com"); -> ParticipanteJaInscritoException
        sistemaEventos.inscreverParticipante("nome1", "Ruan", "ruan@gmail.com");
//        sistemaEventos.inscreverParticipante("nome1", "Verstappen", "verstappen@gmail.com"); -> EventoLotadoException
//        sistemaEventos.inscreverParticipante("nome7", "Verstappen", "verstappen@gmail.com"); -> EventoNaoEncontradoException

        for (Evento evento : sistemaEventos.listarEventos()) {
            System.out.println(evento);
        }
    }
}
