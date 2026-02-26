package academy.devdojo.maratonajava.exercicios.lista2.exception.ex03.test;

//Crie um programa que simule duas operações arriscadas. Primeiro, tente acessar
// um elemento em um array em um índice que não existe (ex: arrayem um array de
// 5 posições), o que causa uma ArrayIndexOutOfBoundsException.Em seguida, tente
// dividir um número por zero, causando uma ArithmeticException.Use um único bloco
// try e múltiplos blocos catch para tratar cada uma dessas exceções de forma
// específica, com mensagens de erro distintas. Adicione umbloco finally que sempre
// será executado, independentemente de uma exceção terocorrido ou não, e que imprima
// a mensagem "Bloco de execução finalizado.".

public class MultiplosCatchEFinally {
    public static void main(String[] args) {
        char[] vasco = {'v', 'a', 's', 'c', 'o'};
        double dividendo = 7;
        double divisor = 0;
        try {
            System.out.println("Indice 5 de um array de 5 posições: " + vasco[5]);
            System.out.println("Resultado da divisão: " + dividir(dividendo, divisor));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Indice fora do escopo do array.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bloco de execução finalizado.");
        }
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
