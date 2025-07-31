package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex08.dominio;

public class Quadrado extends Forma{
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcArea() {
        return lado*lado;
    }

}
