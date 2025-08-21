package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.wrappers.ex01.test;

// Crie um programa que recebe um número como um argumento de linha de comando (que
// é sempre uma String). Use o metodo Integer.parseInt() para converter essa String
// em um primitivo int. Realize um cálculo simples com este número (por exemplo,
// dobre seu valor) e imprima o resultado. Adicione um bloco try-catch para lidar
// com a NumberFormatException, que ocorrerá se o argumento fornecido não for um
// número válido.

import java.util.Scanner;

public class WrappersTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Insira um valor qualquer:");
            int numero = Integer.parseInt(scanner.next());
            System.out.println("O dobro desse valor: " + (numero*2));
        } catch (NumberFormatException e){
            System.out.println("Número inválido.");
        }
    }
}
