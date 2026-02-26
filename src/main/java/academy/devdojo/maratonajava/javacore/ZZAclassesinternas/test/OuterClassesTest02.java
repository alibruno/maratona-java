package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    private String name = "All";

//    {
//        class LocalClass{
//
//        }
//    }

    void print(final String param) {
        String lastName = "Might"; // Atributos -> Final ou efetivamente final (Java 8)
        //  Modificadores de acesso: abstract ou final
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
//        LocalClass localClass = new LocalClass();
//        localClass.printLocal();
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("test");
    }
}
