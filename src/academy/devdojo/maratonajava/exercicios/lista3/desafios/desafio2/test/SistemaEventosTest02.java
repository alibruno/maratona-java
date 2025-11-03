package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.test;

import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio.Evento;
import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio.SistemaEventos;

public class SistemaEventosTest02 {
    public static void main(String[] args) {
        SistemaEventos sistemaEventos = SistemaEventos.carregarSistema();

//        sistemaEventos.criarEvento("nome1", "local1", "2010-01-01, 20:00:00", 3L);
//
//        sistemaEventos.inscreverParticipante("nome1", "Luciano", "luciano@gmail.com");
//        sistemaEventos.inscreverParticipante("nome1", "Lara", "lara@gmail.com");
//        sistemaEventos.inscreverParticipante("nome1", "Ruan", "ruan@gmail.com");
//
//        sistemaEventos.salvar();

        for (Evento evento : sistemaEventos.listarEventos()) {
            System.out.println(evento);
        }
    }
}
