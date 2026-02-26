package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("Ç", "Letra Ç");
        map.put("Z", "Letra Z");
        map.put("X", "Letra X");
        map.put("W", "Letra W");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(map.headMap("Z").remove("W")); // Obs: está linkado com o map original
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(map.higherKey("Z"));
    }
}
