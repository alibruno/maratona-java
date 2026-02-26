package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio;

public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcSalario() {
        this.salario *= 1.15;
    }

}
