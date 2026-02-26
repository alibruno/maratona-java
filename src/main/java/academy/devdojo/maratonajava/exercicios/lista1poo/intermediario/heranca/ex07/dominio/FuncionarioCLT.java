package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio;

public class FuncionarioCLT extends Funcionario {
    public FuncionarioCLT(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "FuncionarioCLT{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcSalario() {
        this.salario *= 1.07;
    }
}
