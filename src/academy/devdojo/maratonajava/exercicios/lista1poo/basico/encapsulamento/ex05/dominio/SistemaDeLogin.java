package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex05.dominio;

//Sistema de Login
//    Classe Usuario com senha privada
//    Métodos para alterar senha (validando senha atual)

// Algumas exceções são customizadas pois seguem regras de negócio. Dependendo da aplicação, podem ser tratadas de formas diferentes.

public class SistemaDeLogin {
    private String senha;

    public SistemaDeLogin(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String senha, String newSenha){
        if (!this.senha.equals(senha)){
            throw new SenhaInvalidaException("As senhas não coincidem.");
        }
        this.senha = newSenha;
        System.out.println("Senha alterada com sucesso!");
    }

    public String getSenha() {
        return senha;
    }
}
