package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex06.dominio;

//Classe Temperatura
//    Atributo privado em Celsius
//    Métodos públicos para converter para Fahrenheit e Kelvin
//    *Validação de temperatura absoluta mínima*

public class Temperatura {
    private double celsius;
    private static final double TEMPERATURA_MINIMA_CELSIUS = -273.15;

    public Temperatura(double celsius) {
        verificarTemperatura(celsius);
        this.celsius = celsius;
    }

    private void verificarTemperatura(double celsius){
        if (celsius < TEMPERATURA_MINIMA_CELSIUS) {
            throw new IllegalArgumentException("Temperatura inválida. A menor temperatura em celsius é = " + TEMPERATURA_MINIMA_CELSIUS + "°C");
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
        verificarTemperatura(celsius);
        this.celsius = celsius;
    }
}
