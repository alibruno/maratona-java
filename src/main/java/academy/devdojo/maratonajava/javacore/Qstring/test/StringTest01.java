package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome1 = "Haroldo"; // String constant pool
        String nome2 = "Haroldo";
        nome1 = nome1.concat(" Larry"); // nome += " Larry"
        System.out.println(nome1);
        System.out.println(nome1 == nome2); // Está comparando a 'referencia' dos objetos, não seu conteúdo (.equals()).
        String nome3 = new String("Haroldo"); // 1. variável de ref, 2. objeto do tipo String, 3. uma string na pool.
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
