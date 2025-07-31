package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex02.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex02.dominio.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancariaTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria("Ramos", "Ramos", 9000);

        while (true) {
            System.out.println("O(a) senhor(a) deseja: 1. Depositar; 2. Sacar; 3. Consultar seu saldo; 0. Encerrar");
            byte operacao = input.nextByte();

            if (operacao == 0) break;
            switch (operacao) {
                case 1:
                    System.out.println("Digite a quantia do deposito:");
                    double deposito = input.nextDouble();
                    contaBancaria.depositar(deposito);
                    break;
                case 2:
                    System.out.println("Digite a quantia de saque:");
                    double saque = input.nextDouble();
                    contaBancaria.sacar(saque);
                    break;
                case 3:
                    System.out.println("O seu saldo é: " + contaBancaria.consultarSaldo());
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}
