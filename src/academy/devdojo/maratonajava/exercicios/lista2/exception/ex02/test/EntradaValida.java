package academy.devdojo.maratonajava.exercicios.lista2.exception.ex02.test;

import java.util.InputMismatchException;
import java.util.Scanner;

// Utilizando a classe Scanner, peça ao usuário para digitar sua idade.
// O metodo nextInt() do Scanner lançará uma InputMismatchException se
// o usuário digitar algo que não seja um número inteiro (como "vinte").
// Envolva a chamada nextInt() em um bloco try-catch para capturar essa
// exceção e exibir a mensagem "Erro: Por favor, digite um número válido.".

public class EntradaValida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        try {
            int idade = scanner.nextInt();
            System.out.println("Sua idade é: " + idade);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um número válido.");
        }
    }
}
