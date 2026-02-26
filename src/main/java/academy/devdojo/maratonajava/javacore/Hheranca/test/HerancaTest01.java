package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Vereador Pedro");
        endereco.setCep("123456-333");
        Pessoa pessoa = new Pessoa("Luigi");
        pessoa.setCpf("111.111.111-11");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Tenshin");
        funcionario.setCpf("333.111.222-44");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1512.05);

        System.out.println("----------------");
        funcionario.imprime();
    }
}
