package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex04.dominio;

//Classe Retangulo
//    Atributos: largura, altura
//    Métodos: calcularArea, calcularPerimetro, redimensionar
//    *Validações para valores positivos*

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            insercaoDeValorMenorOuIgualAZero();
        } else {
            this.largura = largura;
            this.altura = altura;
        }
    }

    private void insercaoDeValorMenorOuIgualAZero() {
        System.out.println("Não é possível criar um retângulo com valor menor ou igual a zero.");
        System.out.println("Todos os lados serão redimensionados para 1.");
        this.largura = 1;
        this.altura = 1;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public void redimencionar(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            insercaoDeValorMenorOuIgualAZero();
        } else{
            this.largura = largura;
            this.altura = altura;
        }
    }
}
