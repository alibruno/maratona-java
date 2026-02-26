package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ZDR1", "Samsung");
        Smartphone s2 = new Smartphone("5TOP1", "Xiaomi");
        Smartphone s3 = new Smartphone("0INT7", "Positivo");
        List<Smartphone> smartphones = new ArrayList<>(6);
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.addFirst(s3);
//        smartphones.clear();
        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("5TOP1", "Xiaomi");
        smartphones.add(s4);

//        System.out.println(s4.equals(s2));
        System.out.println(smartphones.contains(s4));
        int indexS4 = smartphones.indexOf(s4);
        System.out.println(smartphones.get(indexS4));

    }
}
