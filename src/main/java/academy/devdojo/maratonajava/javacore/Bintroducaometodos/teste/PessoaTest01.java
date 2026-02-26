package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Pedro");
        pessoa.setIdade(-2);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
