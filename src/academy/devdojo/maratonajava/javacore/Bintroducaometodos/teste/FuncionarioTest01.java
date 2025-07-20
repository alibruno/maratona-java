package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Waldir");
        funcionario.setIdade(43);
        funcionario.setSalario(new double[]{1512.0, 2500.0, 5321.0});

        funcionario.imprimirDados();
        System.out.println("-----------------------");
        funcionario.imprimirMediaSalarial();

        System.out.println("Média = " + funcionario.getMedia());
    }
}
