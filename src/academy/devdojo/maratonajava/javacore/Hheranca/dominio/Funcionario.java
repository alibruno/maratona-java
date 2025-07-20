package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    // Ordem de inicialização ao instanciar o objeto -> Bloco de inicialização estático > Alocar endereço de Memória > Atributos >
    //                                                  Bloco de inicialização > Construtores > Métodos

    static{
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionário 2");
    }

    public Funcionario(String nome){
        super(nome);
    }
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
