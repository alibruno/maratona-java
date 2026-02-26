package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex01.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex01.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Gunther", 17, "11100011100");
        Pessoa pessoa2 = new Pessoa("Bred", 19, "22200022200");
        System.out.println(pessoa1);
        pessoa1.isMaiorDeIdade();
        System.out.println("-----------------------------------");
        System.out.println(pessoa2);
        pessoa2.isMaiorDeIdade();
    }
}
