package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio;

public class Circulo extends Forma {
    public static final double PI_APROXIMACAO_5_CASAS = 3.14159;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcArea() {
        return PI_APROXIMACAO_5_CASAS * (this.raio * this.raio);
    }


}
