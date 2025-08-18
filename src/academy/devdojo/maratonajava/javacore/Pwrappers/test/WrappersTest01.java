package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    public static void main(String[] args) {
        // Regra: Bits.
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean boolenP = false;
        // Posso fazer o cast de int para long de forma IMPLÍCITA.

        // Objetos que encapsulam um determinado tipo primitivo;
        // Regra: Polimorfísmo;
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1; // Autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean boolenW = false;

        // Interger e Long não estão na mesma linha de herança, então não é permitido o cast IMPLÍCITO;
        Integer testInt = Integer.parseInt("1"); // Unboxing

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('?'));
        System.out.println(Character.isUpperCase('M'));
        System.out.println(Character.toLowerCase('M'));

    }
}