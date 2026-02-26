package academy.devdojo.maratonajava.exercicios.lista2.exception.ex01.test;

import java.util.Scanner;

// Escreva um programa que peça ao usuário dois números inteiros e tente dividir
// o primeiro pelo segundo. Use um bloco try-catch para capturar a exceção
// ArithmeticException, que ocorre ao tentar dividir por zero. Se essa exceção
// ocorrer, em vez de o programa quebrar, ele deve exibir uma mensagem amigável
// como "Erro: Divisão por zero não é permitida.".
public class DivisaoSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o dividendo:");
        double dividendo = scanner.nextDouble();
        System.out.println("Insira o divisor:");
        double divisor = scanner.nextDouble();

        try {
            System.out.println("Resultado: " + dividir(dividendo, divisor));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }

}
