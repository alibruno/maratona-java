package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex10.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex10.dominio.Animal;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex10.dominio.Cachorro;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex10.dominio.Gato;
import academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.polimorfismo.ex10.dominio.Passaro;

public class AnimalTest01 {
    public static void main(String[] args) {
        Animal animalC = new Cachorro();
        Animal animalG = new Gato();
        Animal animalP = new Passaro();
        Animal[] animais = {animalC, animalG, animalP};
        for (Animal animal : animais) {
            animal.som();
        }
    }
}
