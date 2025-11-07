package academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio;

public class Car {
    private String name = "Audi";
    private String color;
    private int Year;

    public Car(String color, int year) {
        this.color = color;
        Year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", Year=" + Year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return Year;
    }
}
