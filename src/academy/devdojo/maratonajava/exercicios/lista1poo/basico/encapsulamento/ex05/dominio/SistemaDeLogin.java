package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex05.dominio;

//Sistema de Login
//    Classe Usuario com senha privada
//    Métodos para alterar senha (validando senha atual)

public class SistemaDeLogin {
    private String senha;

    public SistemaDeLogin(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String senha, String newSenha){
        if (!this.senha.equals(senha)){
            System.out.println("Senha inválida. Tente novamente.");
            return;
        }
        this.senha = newSenha;
        System.out.println("Senha alterada com sucesso!");
    }

    public String getSenha() {
        return senha;
    }
}
