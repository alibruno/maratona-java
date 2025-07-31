package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex04.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex04.dominio.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Defina a largura do retângulo:");
        double largura = input.nextDouble();
        System.out.println("Defina a altura do retângulo:");
        double altura = input.nextDouble();
        Retangulo retangulo = new Retangulo(largura, altura);

        while (true) {
            System.out.println("O que você deseja fazer? 1. Calcular a área; 2. Calcular o perímetro; 3. Redimensionar; 0. Encerrar");
            byte operacao = input.nextByte();

            if (operacao == 0) break;
            switch (operacao) {
                case 1:
                    System.out.println("A área do retângulo é: " + retangulo.calcularArea());
                    break;
                case 2:
                    System.out.println("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
                    break;
                case 3:
                    System.out.println("Insira a nova largura: ");
                    double newLargura = input.nextDouble();
                    System.out.println("Insira a nova altura: ");
                    double newAltura = input.nextDouble();
                    retangulo.redimencionar(newLargura, newAltura);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}
