package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Cláudio", 15000.0);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lázaro", 3500.0);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
