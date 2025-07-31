package academy.devdojo.maratonajava.exercicios.lista1poo.basico.classesobjetos.ex01.dominio;

//Classe Pessoa
//  Crie uma classe com atributos nome, idade, cpf
//  Implemente construtores, getters e setters
//  Adicione método para calcular se é maior de idade

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void isMaiorDeIdade() {
        if (this.idade > 17) {
            System.out.println("É maior de idade");
            return;
        }
        System.out.println("Não é maior de idade");
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
