package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio;

//Sistema de Funcionários
//    Classe base Funcionario (nome, salario)
//    Classes filhas: FuncionarioCLT, FuncionarioPJ, Estagiario
//    Cada uma com seu método específico de calcular salário

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calcSalario();
    }

    public abstract void calcSalario();
}
