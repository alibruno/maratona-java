package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex04.dominio;

//Classe Retangulo
//    Atributos: largura, altura
//    Métodos: calcularArea, calcularPerimetro, redimensionar
//    *Validações para valores positivos*

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        verificarMedidas(largura, altura);
        this.largura = largura;
        this.altura = altura;
    }

    private void verificarMedidas(double largura, double altura){
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("As medidas dos lados de um retângulo não podem ser negativas ou iguais a zero.");
        }
    }
    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void redimensionar(double largura, double altura) {
        verificarMedidas(largura, altura);
        this.largura = largura;
        this.altura = altura;
    }
}
