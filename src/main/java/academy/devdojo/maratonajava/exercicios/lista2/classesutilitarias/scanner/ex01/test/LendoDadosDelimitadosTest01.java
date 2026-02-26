package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.scanner.ex01.test;

import java.util.Scanner;

// Crie uma String que contenha uma lista de itens separados por vírgula, por exemplo:
// "maçã,banana,laranja,morango". Em vez de usar String.split(), instancie um objeto
// Scanner passando essa String para seu construtor. Use o metodo useDelimiter(",") para
//  configurar o Scanner para tratar a vírgula como o separador. Em seguida, use um laço
//  while (scanner.hasNext()) para ler e imprimir cada item (token) em uma nova linha.
public class LendoDadosDelimitadosTest01 {
    public static void main(String[] args) {
        String test = "maçã,banana,laranja,morango";
        Scanner scanner = new Scanner(test);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
