package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

public class AnonymousClassesTest01 {
    // classes que existirao por um breve periodo.
    // ex: trocar o comportamento de um metodo de uma classe

    public static void main(String[] args) {
        Animal animal = new Animal() { // Subclasse de Animal, intancia somente naquela variavel de referencia
            @Override
            public void walk() {
                System.out.println("Walking on the shadows");
            }

            public void jump() { // nao pode ser acessado pois nao existe na superclasse

            }
        };
        animal.walk();
    }
}
