package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4};

        System.out.println("Método .somaArrayInteiro");
        calculadora.somaArrayInteiro(numeros);
        calculadora.somaArrayInteiro(new int[] {1,2,3,4, 5});
        System.out.println("\nMétodo .somaVarargsInteiro");
        calculadora.somaVarargsInteiro(numeros);
        calculadora.somaVarargsInteiro(1,2,3,4,5);

        calculadora.somaVarargsInteiro02("Armazenou testString", 1.5,2,3,4,5);
    }
}
