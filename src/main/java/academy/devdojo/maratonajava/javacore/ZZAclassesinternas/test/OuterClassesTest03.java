package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Lukien";

    static class Nested { // a classe Nested só se comunicará com OuterClassesTest03
        private String lastName = "Oliveira";

        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }

    public static void main(String[] args) {
//        OuterClassesTest03.Nested nested = new OuterClassesTest03.Nested();
        Nested nested = new Nested();
        nested.print();
    }
}
