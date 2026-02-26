package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked (É preciso validar para compilar) - Classe Exception
        // Unchecked (Não é preciso validar para compilar.) - Classe RuntimeException

        // exemplos de Unchecked:

//        Object object = null;
//        System.out.println(object.toString());
        char[] vogais = {'a','e','i','o','u'};
        System.out.println(vogais[5]);

    }
}
