package academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.test;

import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio.Evento;
import academy.devdojo.maratonajava.exercicios.lista3.desafios.desafio2.dominio.SistemaEventos;

import java.time.LocalDateTime;
import java.util.Scanner;

public class SistemaEventosMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaEventos sistemaEventos = SistemaEventos.carregarSistema();
        int op = 0;
        System.out.println("Bem vindo ao Sistema de Eventos! Escolha uma das opções para continuar.");
        while (op != 4) {
            System.out.println("1. Criar Evento, 2. Inscrever Participante, 3. Listar Eventos, 4. Salvar e Sair.");
            try {
                op = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido.");
                continue;
            }
            switch (op) {
                case 1:
                    try {
                        System.out.println("Insira o nome do evento:");
                        String nome = scanner.nextLine();
                        System.out.println("Insira o local:");
                        String local = scanner.nextLine();
                        System.out.println("Insira a data e hora em que ocorrerá o evento " +
                                "(Ex: 2007-12-03, 19:30):");
                        String data = scanner.nextLine();
                        System.out.println("Insira a capacidade máxima:");
                        Long capacidadeMaxima = Long.parseLong(scanner.nextLine());

                        sistemaEventos.criarEvento(nome, local, data, capacidadeMaxima);
                        System.out.println("Evento criado com sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("Capacidade inválida. Deve ser um número.");
                    }
                    break;
                case 2:
                    System.out.println("Insira o nome do evento:");
                    String nomeEvento = scanner.nextLine();
                    System.out.println("Insira o nome do participante:");
                    String nomeParticipante = scanner.nextLine();
                    System.out.println("Insira o email do participante:");
                    String emailParticipante = scanner.nextLine();

                    sistemaEventos.inscreverParticipante(nomeEvento, nomeParticipante, emailParticipante);
                    System.out.println("Participante inscrito com sucesso!");
                    break;
                case 3:
                    for (Evento evento : sistemaEventos.listarEventos()) {
                        System.out.println(evento);
                    }
                    break;
                case 4:
                    System.out.println("Salvando dados...");
                    sistemaEventos.salvar();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}