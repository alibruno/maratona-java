package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // Ordem de inicialização ao instanciar o objeto -> 1. Bloco de inicialização estático (1.1 superclasse, 1.2.subclasse) >
    //                                                  2. SUPERCLASSE (Alocar endereço de Memória > Atributos >
    //                                                  Bloco de inicialização > Construtores > Métodos)
    //                                                  3. SUBCLASSE (Alocar endereço de Memória > Atributos >
    //                                                  Bloco de inicialização > Construtores > Métodos)

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Reinaldo");
    }
}
