package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Jackie";
        nome.concat(" Chan");
        nome.substring(0,3);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Jackie"); // StringBuilder NÃO É String; Construtor sem argumentos: 16, se ultrapassar dobra...
        sb.append(" Chan");
        // Métodos com retorno StringBuilder
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
