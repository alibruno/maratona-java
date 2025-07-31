package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio;

public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcArea() {
        return (base * altura) / 2;
    }

}
