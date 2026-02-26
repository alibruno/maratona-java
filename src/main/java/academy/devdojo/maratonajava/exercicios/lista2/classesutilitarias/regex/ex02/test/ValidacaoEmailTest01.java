package academy.devdojo.maratonajava.exercicios.lista2.classesutilitarias.regex.ex02.test;

// Crie uma regex para validar um formato de e-mail simples. A regex deve garantir que a string
// tenha um conjunto de caracteres (usuário), seguido por um @, seguido por outro conjunto de
// caracteres (domínio), um ponto, e um final (como "com" ou "br"). Exemplo: usuario@dominio.com.
// Teste sua regex.

public class ValidacaoEmailTest01 {
    public static void main(String[] args) {
        String regex = "[\\w\\.-]+@[\\w-]+\\.[\\w\\.-]+";
        String test1 = "usuario@dominio.com";
        String test2 = "usuario@dominio";
        String test3 = "usuario@dominio.com.br";
        String test4 = "usuario_ty.456@dominio.com.br";
        boolean matches1 = test1.matches(regex);
        boolean matches2 = test2.matches(regex);
        boolean matches3 = test3.matches(regex);
        boolean matches4 = test4.matches(regex);
        String resultado1 = matches1 ? "Email válido" : "Email inválido";
        String resultado2 = matches2 ? "Email válido" : "Email inválido";
        String resultado3 = matches3 ? "Email válido" : "Email inválido";
        String resultado4 = matches4 ? "Email válido" : "Email inválido";
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);

    }
}
