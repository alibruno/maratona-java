package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("red", 2011), new Car("black", 2009), new Car("purple", 2015));

    public static void main(String[] args) {
        List<Car> purpleCars = filter(cars, car -> car.getColor().equals("purple"));
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2012);
        System.out.println(purpleCars);
        System.out.println(blackCars);
        System.out.println(yearBeforeCars);
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(nums, num -> num % 2 == 1));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
