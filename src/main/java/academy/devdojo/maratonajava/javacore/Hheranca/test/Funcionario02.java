package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Funcionario02 extends Pessoa {
    public Funcionario02(String nome) {
        super(nome);
    }

    public void imprime(){
        System.out.println(this.nome);
    }
}
