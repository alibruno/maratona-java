package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex06.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex06.dominio.Temperatura;

import java.util.Locale;

public class TemperaturaTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Temperatura temperatura1 = new Temperatura(30);

        System.out.printf("%.2fºC equivale a %.2fºF%n", temperatura1.getCelsius(), temperatura1.celsiusParaFahrenheit());
        System.out.printf("%.2fºC equivale a %.2fK%n", temperatura1.getCelsius(), temperatura1.celsiusParaKelvin());

        System.out.println("-------------------------------------------------------");

        Temperatura temperatura2 = new Temperatura(-280);

        System.out.printf("%.2fºC equivale a %.2fºF%n", temperatura2.getCelsius(), temperatura2.celsiusParaFahrenheit());
        System.out.printf("%.2fºC equivale a %.2fK%n", temperatura2.getCelsius(), temperatura2.celsiusParaKelvin());

    }
}
