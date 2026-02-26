package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.regex.ex01.test;

// Escreva uma expressão regular (regex) para validar se uma String corresponde ao formato de um
// CEP brasileiro: cinco dígitos, um hífen e três dígitos (ex: "12345-678"). Use o metodo
// String.matches() para testar a regex com exemplos válidos e inválidos.

public class ValidacaoCEP {
    public static void main(String[] args) {
        String regex = "\\d{5}-\\d{3}";
        String txt = "12345-12t";
        boolean matches = txt.matches(regex);
        String resultado = matches ? "CEP válido" : "CEP inválido";
        System.out.println(resultado);
    }
}
