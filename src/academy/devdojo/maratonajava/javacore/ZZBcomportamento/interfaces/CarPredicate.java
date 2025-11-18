package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    // Regras para utilizar lambdsa:
    // 1. a interface deverá ser funcional. -> possui apenas um metodo ABSTRATO e PERMITE DEFAULT
    // 2. O metodo diz como a lambda funcionará -> contrato
        //  (parametro) -> <expressao>.
            // Sem parâmetro: () -> <expressão>
        // Nesse exemplo, retornará um boolean
        // (Car car) -> car.getColor().equals("green")

    // anonimas, funcoes (nao estao atreladas a uma classe), conciso
    boolean test(Car car);
}
