package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Yusuke";
    // B só existe por causa de A. A só poderá ser utilizada por B (B -> Classe interna)
    // Essa classe interna tem acesso a todos os objetos da classe mais externa.

    // Nested
    class Inner {
        public void printOuterClassAtribbute() {
            System.out.println(name);
            System.out.println(this); // faz refetencia ao objeto interno
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();
        Inner inner = outerClassesTest01.new Inner();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAtribbute();
        inner2.printOuterClassAtribbute();
    }
}
