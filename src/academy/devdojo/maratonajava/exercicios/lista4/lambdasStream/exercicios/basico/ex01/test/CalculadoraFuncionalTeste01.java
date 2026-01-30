package academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.basico.ex01.test;

import academy.devdojo.maratonajava.exercicios.lista4.lambdasStream.exercicios.basico.ex01.dominio.CalculadoraFuncional;

public class CalculadoraFuncionalTeste01 {
    public static void main(String[] args) {
        CalculadoraFuncional somar = (a, b) -> a + b;
        CalculadoraFuncional subtrair = (a, b) -> a - b;
        CalculadoraFuncional multiplicar = (a, b) -> a * b;
        CalculadoraFuncional dividir = (a, b) -> (b == 0) ? 0 : a / b;

        int num1 = 10;
        int num2 = 5;

        System.out.println("Soma: " + somar.operar(num1, num2));          // 15
        System.out.println("Subtração: " + subtrair.operar(num1, num2));  // 5
        System.out.println("Multiplicação: " + multiplicar.operar(num1, num2)); // 50
        System.out.println("Divisão: " + dividir.operar(num1, num2));
    }
}
