package academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex05.test;

import academy.devdojo.maratonajava.exercicios.lista1poo.basico.encapsulamento.ex05.dominio.SistemaDeLogin;

public class SistemaDeLoginTest01 {
    public static void main(String[] args) {
        SistemaDeLogin login1 = new SistemaDeLogin("Goku123456");
        System.out.println("Senha atual = " + login1.getSenha());
        login1.alterarSenha("123456", "Vegeta654321");
        login1.alterarSenha("Goku", "Vegeta654321");
        login1.alterarSenha("goku123456", "Vegeta654321");
        login1.alterarSenha("Goku123456", "Vegeta654321");
        System.out.println("Senha atual = " + login1.getSenha());
    }
}
