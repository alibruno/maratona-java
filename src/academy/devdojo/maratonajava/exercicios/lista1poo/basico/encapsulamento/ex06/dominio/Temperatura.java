package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex06.dominio;

//Classe Temperatura
//    Atributo privado em Celsius
//    Métodos públicos para converter para Fahrenheit e Kelvin
//    *Validação de temperatura absoluta mínima*

public class Temperatura {
    private double celsius;
    private static final double TEMPERATURA_MINIMA_CELSIUS = -273.15;

    public Temperatura(double celsius) {
        if (celsius < TEMPERATURA_MINIMA_CELSIUS){
            System.out.println("Temperatura inválida.");
            System.out.println("Convertendo do valor para o \"zero absoluto\"(-273.15 ºC)...");
            this.celsius = TEMPERATURA_MINIMA_CELSIUS;
        } else{
            this.celsius = celsius;
        }
    }

    public double celsiusParaFahrenheit() {
        return (this.celsius * 9 / 5) + 32;
    }

    public double celsiusParaKelvin() {
        return this.celsius + 273.15;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
