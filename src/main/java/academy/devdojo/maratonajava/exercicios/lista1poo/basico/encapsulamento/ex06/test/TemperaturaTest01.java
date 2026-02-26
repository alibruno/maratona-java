package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex06.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex06.dominio.Temperatura;

import java.util.Locale;

public class TemperaturaTest01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try {
//            Temperatura temperatura1 = new Temperatura(30);
            Temperatura temperatura1 = new Temperatura(-280);
            System.out.printf("%.2fºC equivale a %.2fºF%n", temperatura1.getCelsius(), temperatura1.celsiusParaFahrenheit());
            System.out.printf("%.2fºC equivale a %.2fK%n", temperatura1.getCelsius(), temperatura1.celsiusParaKelvin());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
