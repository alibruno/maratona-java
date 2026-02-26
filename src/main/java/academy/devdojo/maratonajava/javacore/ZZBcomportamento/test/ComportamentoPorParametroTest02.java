package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("red", 2011), new Car("black", 2009), new Car("purple", 2015));

    public static void main(String[] args) {
//        List<Car> purpleCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("purple");
//            }
//        });
        List<Car> purpleCars = filter(cars, car -> car.getColor().equals("purple"));
        List<Car> blackCars = filter(cars, car -> car.getColor().equals("black"));
        List<Car> yearBeforeCars = filter(cars, car -> car.getYear() < 2012);
        System.out.println(purpleCars);
        System.out.println(blackCars);
        System.out.println(yearBeforeCars);
    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
