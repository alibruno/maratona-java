package academy.devdojo.maratonajava.exercicios.lista1poo.intermediario.heranca.ex07.dominio;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Estagiario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    @Override
    public void calcSalario() {
        this.salario *= 1.1;
    }
}
