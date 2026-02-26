package academy.devdojo.maratonajava.javacore.Tresourseboundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("mensagem", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        System.out.println(bundle.getString("hi"));

        bundle = ResourceBundle.getBundle("mensagem", new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));

        // Locale("fr", "CA");
        // mensagem_fr_CA.properties
        // mensagem_fr.properties
        // mensagem_pt_BR.properties (default)
        // mensagem_pt.properties (default)
        // mensagem.properties (default)

        System.out.println(bundle.getString("hi"));
    }
}
