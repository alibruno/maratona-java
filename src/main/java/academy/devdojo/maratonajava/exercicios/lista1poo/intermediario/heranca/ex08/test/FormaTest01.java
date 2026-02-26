package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio.Circulo;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio.Forma;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio.Quadrado;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio.Triangulo;

import java.util.Locale;

public class FormaTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Forma formaQ = new Quadrado(5);
        Forma formaT = new Triangulo(4, 3);
        Forma formaC = new Circulo(10);

        System.out.printf("Área do quadrado: %.2f%n", formaQ.calcArea());
        System.out.printf("Área do triangulo:  %.2f%n", formaT.calcArea());
        System.out.printf("Área do círculo: %.2f%n", formaC.calcArea());
    }

}
