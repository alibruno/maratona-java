package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("red", 2011), new Car("black", 2009), new Car("purple", 2015));

    public static void main(String[] args) {
        System.out.println(filterBlackCar(cars));
        System.out.println(filterPurpleCar(cars));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("----------");
        System.out.println(filterByYearBefore(cars, 2012));
    }

    private static List<Car> filterBlackCar(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("black")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterPurpleCar(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("purple")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


}
