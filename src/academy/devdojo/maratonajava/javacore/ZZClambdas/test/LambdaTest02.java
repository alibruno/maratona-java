package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Edward", "Alphonse");
        List<Integer> integers = map(strings, String::length);
        List<String> lowerCase = map(strings, String::toLowerCase);
        System.out.println(integers);
        System.out.println(lowerCase);
    }
    // Method reference: sintaxes que simplificam as lambdas
    // lambda com 1 metodo -> method reference

    // Function<T, R>
    // <T> – the type of the input to the function
    // <R> – the type of the result of the function
    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
