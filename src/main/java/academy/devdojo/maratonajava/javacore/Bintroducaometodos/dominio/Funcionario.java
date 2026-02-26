package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        if (salario == null) {
            System.out.println("Não há salário registrado.");
            return;
        }

        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salario " + (i + 1) + ": " + salario[i]);
        }
        imprimirMediaSalarial();
    }

    public void imprimirMediaSalarial() {
        if (salario == null) {
            System.out.println("Não há salário registrado.");
            return;
        }

        for (double renda : salario) {
            media += renda;
        }
        media /= salario.length;
        System.out.println("Média salarial: " + (media));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}
